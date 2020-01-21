package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.toLowerCase().contains("imperial")) {
            return "Imperial is a university";
        }
        else if (query.contains("what%20is%20your%20team%20name")) {
            return "Red Arrow";
        }
        return "";
    }
}
