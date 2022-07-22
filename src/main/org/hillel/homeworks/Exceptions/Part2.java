package org.hillel.homeworks.Exceptions;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Part2 {
    public static void main(String[] args) {

    }

    //public static void main(String[] args) {
    //    throw new Exception(); // тут ошибка компиляции
    //}
    //Мы не можем бросать, но не предупредить
    //>> COMPILATION ERROR: unhandled exception: java.lang.Exception

    //    public static void main(String[] args) throws IOException {
    //        throw new Exception(); // тут ошибка компиляции
    //    }
    //Мы не можем бросать, но предупредить о «меньшем»
    //>> COMPILATION ERROR: unhandled exception: java.lang.Exception

    //    public static void main(String[] args) throws Exception { // предупреждаем о Exception
    //        throw new Exception(); // и кидаем Exception
    //    }
    //Мы можем предупредить точно о том, что бросаем

    //public static void main(String[] args) throws Throwable { // предупреждаем "целом" Throwable
    //        throw new Exception(); // а кидаем только Exception
    //    }
    //Мы можем предупредить о большем, чем мы бросаем

    //public static void main(String[] args) throws Exception { // пугаем
    //        // но ничего не бросаем
    //    }
    //Можем даже предупредить о том, чего вообще нет

    //    public static byte[] (String url) throws IOException {
    //        return "<html><body>Nothing! It's stub!</body></html>".getBytes();
    //    }
    // допустим, есть класс-утилита для скачивания из Интернета,
    // возможное исключение уже отрабатывается, хотя в реализации его нет

    public static void example1() throws EOFException, FileNotFoundException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }
    // пугаем ОБОИМИ исключениями

    public static void example2() throws IOException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }
    // пугаем ПРЕДКОМ исключений

    public static void example3() throws FileNotFoundException {
        try {
            if (System.currentTimeMillis() % 2 == 0) {
                throw new EOFException();
            } else {
                throw new FileNotFoundException();
            }
        } catch (EOFException e) {
            // ...
        }
    }
    // Если часть исключений перехвачено в методе, то ими пугать не нужно
    // EOFException перехватили catch-ом, им не пугаем

    //public static void main(String[] args) throws Exception {
    //    Throwable t = new Exception(); // и лететь будет Exception
    //    throw t; // но тут ошибка компиляции
    //}
    // пугаем Exception
    //>> COMPILATION ERROR: unhandled exception: java.lang.Throwable

    //    public static void main(String[] args) throws Exception {
    //        Object ref = "Hello!";  // ref указывает на строку
    //        char c = ref.charAt(0); // но тут ошибка компиляции
    //    }
    //Аналогия с предыдущим примером
    //>> COMPILATION ERROR: Cannot resolve method 'charAt(int)'

    //Компилятор не пропустит этот код, хотя метод main ГАРАНТИРОВАННО НЕ ВЫБРОСИТ ИСКЛЮЧЕНИЯ
    // пугаем Exception
    public static void example4() throws Exception {
        try {
            Throwable t = new Exception(); // и лететь будет Exception
            //throw t; // но тут ошибка компиляции
        } catch (Exception e) {
            System.out.println("Перехвачено!");
        }
    }
    //>> COMPILATION ERROR: unhandled exception: java.lang.Throwable

    // ТЕПЕРЬ пугаем Throwable
    public static void example5() throws Throwable {
        try {
            Throwable t = new Exception(); // а лететь будет Exception
            throw t;
        } catch (Exception e) { // и мы перехватим Exception
            System.out.println("Перехвачено!");
        }
    }
    //>> Перехвачено!

    //При переопределении (overriding) список исключений потомка не обязан совпадать с таковым у предка.
    //Но он должен быть «не сильнее» списка предка:
    //    import java.io.FileNotFoundException;
    //    import java.io.IOException;
    public class Parent {
        // предок пугает IOException и InterruptedException
        public void f() throws IOException, InterruptedException {
        }
    }

    class Child extends Parent {
        // а потомок пугает только потомком IOException
        @Override
        public void f() throws FileNotFoundException {
        }
    }
    //Можно только сужать тип, но НЕ расширять, т.к. те места, которые «ждут» предка,
    //а получают экземпляр «расширенного» потомка, могли бы неконтролируемо выбрасывать проверяемые исключения
}






