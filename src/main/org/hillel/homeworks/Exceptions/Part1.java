package org.hillel.homeworks.Exceptions;

public class Part1 {

    public static void main(String[] args) {

    }

    public static void example1() {
        throw new Error(); // создаем экземпляр Error и "бросаем" его
    }
    // >> RUNTIME ERROR: Exception in thread "main" java.lang.Error

    public static double example2() {
        throw new RuntimeException();
    }
    // бросая RuntimeException, мы можем не возвращать из метода тип double,
    // т.к. бросаемое исключение - дополнительный возвращаемый тип

    public static int example3(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
        }
        return width * height;
    }
    // правильный путь - бросить исключение (чтобы пользователь не смог проигнорировать ошибку)
    // которое дает сообщение о причине сбоя, и возможность пофиксить ошибку

    public static void example4() {
        try {
            System.err.print(" 0");
            if (true) {
                throw new RuntimeException();
            }
            System.err.print(" 1");
        } catch (Exception e) { // catch по Exception ПЕРЕХВАТЫВАЕТ RuntimeException, поэтому значения "1" не будет в выводе
            System.err.print(" 2");
        }
        System.err.println(" 3");
    }
    // >> 0 2 3

    public static void example5() {
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                RuntimeException re = (RuntimeException) e;
                System.err.print("Это RuntimeException на самом деле!!!");
            } else {
                System.err.print("В каком смысле не RuntimeException???");
            }
        }
    }
    //в блоке catch мы будем иметь ссылку типа Exception на объект типа RuntimeException
    //>> Это RuntimeException на самом деле!!!

    public static void example6() throws Exception {
        try {
            System.err.print(" 0");
            if (true) {
                throw new Exception();
            }
            System.err.print(" 1");
        } catch (RuntimeException e) {
            System.err.print(" 2");
        }
        System.err.print(" 3");
    }
    //catch по потомку не может поймать предка! В выводе будет лишь "0"
    //>> 0
    //>> RUNTIME EXCEPTION: Exception in thread "main" java.lang.Exception

    public static void example7() {
        try {
            System.err.print(" 0");
            if (true) {
                throw new Error();
            }
            System.err.print(" 1");
        } catch (Exception e) {
            System.err.print(" 2");
        }
        System.err.print(" 3");
    }
    //catch по одному «брату» не может поймать другого «брата»
    //(Error и Exception не находятся в отношении предок-потомок, они из параллельных веток наследования от Throwable)
    //>> 0
    //>> RUNTIME EXCEPTION: Exception in thread "main" java.lang.Error

    public static void example8() {
        try {
            System.err.print(" 0");
            if (true) {
                throw new RuntimeException();
            }
            System.err.print(" 1");
        } catch (RuntimeException e) {     // перехватили RuntimeException
            System.err.print(" 2");
            if (true) {
                throw new Error();
            } // но бросили Error
            // (if (true) {throw e;}        // и бросили ВТОРОЙ раз ЕГО ЖЕ)
        }
        System.err.println(" 3");          // пропускаем - уже летит Error
    }
    //Если мы зашли в catch, и потом бросили исключение ИЗ catch,
    //выполнение метода тоже прерывается (не печатаем «3»). Новое исключение не имеет никакого отношения к try-catch
    //Также можно кинуть сам объект (закомментированный код в скобках, вместо предыдущей строчки)
    //>> 0 2
    //>> RUNTIME EXCEPTION: Exception in thread "main" java.lang.Error

    public static void example9() {
        try {
            System.err.print(" 0");
            if (true) {
                throw new RuntimeException();
            }
            System.err.print(" 1");
        } catch (RuntimeException e) {     // перехватили RuntimeException
            System.err.print(" 2");
            if (true) {
                throw new Error();
            } // и бросили новый Error
        } catch (Error e) { // хотя есть cath по Error "ниже", но мы в него не попадаем
            System.err.print(" 3");
        }
        System.err.println(" 4");
    }
    //Мы не напечатали «3», хотя у нас летит Error, а «ниже» расположен catch по Error.
    //catch имеет отношение исключительно к try-секции, но не к другим catch-секциям,
    //и мы не попадем в другие секции catch
    //>> 0 2
    //>> RUNTIME EXCEPTION: Exception in thread "main" java.lang.Error

    public static void example10() {
        try {
            System.err.print(" 0");
            if (true) {
                throw new RuntimeException();
            }
            System.err.print(" 1");
        } catch (RuntimeException e) { // перехватили RuntimeException
            System.err.print(" 2.1");
            try {
                System.err.print(" 2.2");
                if (true) {
                    throw new Error();
                } // и бросили новый Error
                System.err.print(" 2.3");
            } catch (Throwable t) {            // перехватили Error
                System.err.print(" 2.4");
            }
            System.err.print(" 2.5");
        } catch (Error e) { // хотя есть cath по Error "ниже", но мы в него не попадаем
            System.err.print(" 3");
        }
        System.err.println(" 4");
    }
    //можно строить вложенные конструкции try-catch
    //>> 0 2.1 2.2 2.4 2.5 4

    //    public static void main(String[] args) {
    //        try {
    //        } catch (Exception e) {
    //        } catch (RuntimeException e) {
    //        }
    //    }
    // Нельзя ставить потомка после предка! (RuntimeException после Exception)
    //>> COMPILATION ERROR: Exception 'java.lang.RuntimeException' has alredy been caught

    public static void example11() {
        try {
        } catch (Error e) {
        } catch (RuntimeException e) {
        }
    }
    // Но можно ставить брата после брата — RuntimeException после Error)

    public static void example12() {
        try {
            throw new Exception();
        } catch (RuntimeException e) {
            System.err.println("catch RuntimeException");
        } catch (Exception e) {
            System.err.println("catch Exception");
        } catch (Throwable e) {
            System.err.println("catch Throwable");
        }
        System.err.println("next statement");
    }
    //JVM идет сверху-вниз до тех пор, пока не найдет такой catch, что в нем указано
    //ваше исключение или его предок — туда и заходит. Ниже — не идет.
    //>> catch Exception
    //>> next statement

    public static void example13() {
        try {
            Throwable t = new Exception(); // ссылка типа Throwable указывает на объект типа Exception
            throw t;
        } catch (RuntimeException e) {
            System.err.println("catch RuntimeException");
        } catch (Exception e) {
            System.err.println("catch Exception");
        } catch (Throwable e) {
            System.err.println("catch Throwable");
        }
        System.err.println("next statement");
    }
    //Выбор catch осуществляется в runtime (а не в compile-time),
    //значит учитывается не тип ССЫЛКИ (Throwable), а тип ССЫЛАЕМОГО (Exception)
    //>> catch Exception
    //>> next statement

    public static void example14() {
        try {
            System.err.println("try");
        } finally {
            System.err.println("finally");
        }
    }
    //finally-секция получает управление, если:
    //1. try-блок завершился успешно;
    //2. если try-блок завершился исключением;
    //3. если try-блок завершился директивой выхода из метода (return).
    //>> try
    //>> finally

    public static void example15() {
        try {
            System.exit(42);
        } finally {
            System.err.println("finally");
        }
    }
    //finally-секция НЕ вызывается только если мы «прибили» JVM
    //>> Process finished with exit code 42

    public static void example16() {
        try {
            System.err.println("try");
            //  if (true) {return;}
            if (true) {
                throw new RuntimeException();
            }
        } finally {
            System.err.println("finally");
        }
        System.err.println("more");
    }
    //finally-секция не может «починить» try-блок завершившийся исключением,
    //также она не «предотвращает» выход из метода, если try-блок вызвал return
    //>> try
    //>> finally
    //>> Exception in thread "main" java.lang.RuntimeException

    public static int example17() {
        try {
            return 0;
            //throw new RuntimeException(); // >> 1
        } finally {
            return 1;  // >> 1
            //throw new RuntimeException(); // >> >> Exception in thread "main" java.lang.RuntimeException
        }
    }
    //finally-секция может «перебить» throw/return при помощи другого throw/return

    public static int example18() {
        try {
            throw new Error();
        } finally {
            throw new RuntimeException();
        }
    }
    //>> Exception in thread "main" java.lang.RuntimeException

    public static void example19() {
        try {
            System.err.print(" 0");
            // nothing
            System.err.print(" 1");
        } catch (Error e) {
            System.err.print(" 2");
        } finally {
            System.err.print(" 3");
        }
        System.err.print(" 4");
    }
    //Исключений нет, НЕ заходим в catch, поэтому не выводим "2"
    //>> 0 1 3 4

    public static void example20() {
        try {
            System.err.print(" 0");
            if (true) {
                throw new Error();  // бросаем исключение
            }
            System.err.print(" 1");
        } catch (Error e) {
            System.err.print(" 2");
        } finally {
            System.err.print(" 3");
        }
        System.err.print(" 4");
    }
    //есть исключение, и подходящий catch, поэтому не выводим 1
    //>> 0 2 3 4

    public static void example21() {
        try {
            System.err.print(" 0");
            if (true) {
                throw new RuntimeException();
            }
            System.err.print(" 1");
        } catch (Error e) {
            System.err.print(" 2");
        } finally {
            System.err.print(" 3");
        }
        System.err.print(" 4");
    }
    //есть исключение, но нет подходящего catch, поэтому не выводится "1",
    // из-за finally не выводится "4", выходим из метода без перехвата исключения
    //>> 0 3
    //>> RUNTIME ERROR: Exception in thread "main" java.lang.RuntimeException

    public static void example22() {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                // НИЧЕГО
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3"); // НЕ заходим - нет исключения
            } finally {
                System.err.print(" 4"); // заходим всегда
            }
            System.err.print(" 5");     // заходим - выполнение в норме
        } catch (Exception e) {
            System.err.print(" 6");     // НЕ заходим - нет исключения
        } finally {
            System.err.print(" 7");     // заходим всегда
        }
        System.err.print(" 8");         // заходим - выполнение в норме
    }
    //Вложенный try-catch-finally без исключения
    //>> 0 1 2 4 5 7 8

    public static void example23() {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                if (true) {
                    throw new RuntimeException();
                }
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3"); // ЗАХОДИМ - есть исключение
            } finally {
                System.err.print(" 4"); // заходим всегда
            }
            System.err.print(" 5");     // заходим - выполнение УЖЕ в норме
        } catch (Exception e) {
            System.err.print(" 6");     // не заходим - нет исключения, УЖЕ перехвачено
        } finally {
            System.err.print(" 7");     // заходим всегда
        }
        System.err.print(" 8");         // заходим - выполнение УЖЕ в норме
    }
    //Вложенный try-catch-finally с исключением, которое ПЕРЕХВАТИТ ВНУТРЕННИЙ catch
    //>> 0 1 3 4 5 7 8

    public static void example24() {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                if (true) {
                    throw new Exception();
                }
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3"); // НЕ заходим - есть исключение, но НЕПОДХОДЯЩЕГО ТИПА
            } finally {
                System.err.print(" 4"); // заходим всегда
            }
            System.err.print(" 5");     // не заходим - выполнение НЕ в норме
        } catch (Exception e) {
            System.err.print(" 6");     // ЗАХОДИМ - есть подходящее исключение
        } finally {
            System.err.print(" 7");     // заходим всегда
        }
        System.err.print(" 8");         // заходим - выполнение УЖЕ в норме
    }
    //Вложенный try-catch-finally с исключением, которое ПЕРЕХВАТИТ ВНЕШНИЙ catch
    //>> 0 1 4 6 7 8

    public static void example25() {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                if (true) {
                    throw new Error();
                }
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3"); // НЕ заходим - есть исключение, но НЕПОДХОДЯЩЕГО ТИПА
            } finally {
                System.err.print(" 4"); // заходим всегда
            }
            System.err.print(" 5");     // НЕ заходим - выполнение НЕ в норме
        } catch (Exception e) {
            System.err.print(" 6");     // не заходим - есть исключение, но НЕПОДХОДЯЩЕГО ТИПА
        } finally {
            System.err.print(" 7");     // заходим всегда
        }
        System.err.print(" 8");         // не заходим - выполнение НЕ в норме
    }
    //Вложенный try-catch-finally с исключением, которое НИКТО НЕ ПЕРЕХВАТИТ
    //>> 0 1 4 7
    //>> RUNTIME EXCEPTION: Exception in thread "main" java.lang.Error
}

/** throws: **/
// public static void main(String[] args) throws Throwable {} ---> OK

//public static void main(String[] args) throws String {} ---> NOT OK
//>> COMPILATION ERROR: Incompatible types: required 'java.lang.Throwable', found: 'java.lang.String'

/** catch: **/
// public static void main(String[] args) { ---> OK
//        try {
//        } catch (Throwable t) {}
//    }

// public static void main(String[] args) {  ---> NOT OK
//         try {
//         } catch (String s) {}
//     }
// >> COMPILATION ERROR:
//    Incompatible types:required 'java.lang.Throwable',found:'java.lang.String'

/** throw: **/
// public static void main(String[] args) { ---> OK
//        // Error - потомок Throwable
//        throw new Error();
//    }

//    public static void main(String[] args) { ---> NOT OK
//        throw new String("Hello!");
//    }
//>> COMPILATION ERROR: Incompatible types: required 'java.lang.Throwable', found: 'java.lang.String'




