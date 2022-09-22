package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        String lowerVerison = query.toLowerCase();
        if (lowerVerison.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (lowerVerison.contains("what is your name")) {
            return "teedy-is-tedious";
        }
        return "";
    }
}
