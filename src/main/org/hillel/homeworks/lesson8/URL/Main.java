package org.hillel.homeworks.lesson8.URL;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        String urlFile = "src/main/org/hillel/homeworks/lesson8/URL/urls.txt";

        AppLogic appLogic = new AppLogic();

        //Initial List of all URLs from txt file
        List<String> urlsList = appLogic.urlToList(urlFile);

        //List of URL-domens
        List<String> urlDomens = appLogic.getDomens(urlsList);

        //Map with domens (key) and their amount (value)
        Map<String, Integer> urlMap = appLogic.putDomensInMap(urlDomens);

        //TreeMap, sorted by value from urlMap
        TreeMap<String, Integer> sortedMap = appLogic.getSortedMap(urlMap);

        //Getting Top-10 domens
        appLogic.getTopTenDomens(sortedMap);
    }
}

