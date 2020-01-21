package com.develogical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QueryProcessor {

    public String process(String query) {

        query = query.replace("%20", " ");

        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.toLowerCase().contains("imperial")) {
            return "Imperial is a university";
        }
        else if (query.contains("team")) {
            return "Red Arrow";
        }
        else if (query.contains("largest")) {
            int index = query.indexOf("largest:");
            query = query.substring(index + 9);
            String[] list = query.split(",");
            List<Integer> intList = new ArrayList<>();
            for (String s: list) {
                intList.add(Integer.valueOf(s.trim()));
            }
            int max = Collections.max(intList);
            return String.valueOf(max);
        }
        else if (query.contains("Theresa")) {
            return "2016";
        }
        else if (query.contains("minus")) {
            int index = query.indexOf("minus");
            int indexOfIs = query.indexOf("is");
            int firstNum = Integer.valueOf(query.substring(indexOfIs + 3, index).trim());
            int secondNum = Integer.valueOf(query.substring(index + 6));
            return String.valueOf(firstNum - secondNum);
        }

        return "";
    }
}
