package org.hillel.homeworks.lesson8.URL;

import java.io.*;
import java.util.*;

public class AppLogic {

    //Method, from which we get list of URLs from the file
    public List<String> urlToList(String urlFile) throws FileNotFoundException {
        File file = new File(urlFile);
        Scanner scanner = new Scanner(file);
        List<String> urlsList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            urlsList.add(scanner.nextLine());
        }
        scanner.close();
        return urlsList;
    }

    //Method, from which we get list of domens of URLs from the urlList
    public List<String> getDomens(List<String> urlList) throws FileNotFoundException {
        List<String> urlDomens = new ArrayList<>();
        for (String line : urlList) {
            urlDomens.add(line.split("/")[0]);
        }
        return urlDomens;
    }

    //Method, where we put all domens in Map and count the number of entries
    public Map<String, Integer> putDomensInMap(List<String> urlDomens) throws FileNotFoundException {
        Map<String, Integer> urlMap = new HashMap<>();
        for (String urlKey : urlDomens) {
            if (!urlMap.containsKey(urlKey))
                urlMap.put(urlKey, 1);
            else {
                int counter = urlMap.get(urlKey);
                urlMap.replace(urlKey, counter + 1);
            }
        }
        return urlMap;
    }

    //Method, from which we get TreeMap, sorted by values
    public TreeMap<String, Integer> getSortedMap(Map<String, Integer> urlMap) throws FileNotFoundException {
        CompareValue comparator = new CompareValue(urlMap);
        TreeMap<String, Integer> sortedMap = new TreeMap<>(comparator);
        sortedMap.putAll(urlMap);
        return sortedMap;
    }

    //Method, from which we get top-10 most frequently domens
    public void getTopTenDomens(TreeMap<String, Integer> sortedMap) throws FileNotFoundException {
        int counter = 0;
        System.out.println("List of Top-10 URLs:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            if (counter < 10) {
                Integer key = entry.getValue();
                System.out.println((counter + 1) + ". " + entry.getKey() + " - " + key + " times");
                counter++;
            }
        }
    }
}