package com.develogical;

import java.lang.Math;

public class QueryProcessor {

    public String process(String query) {
        String lowerVersion = query.toLowerCase();
        if (lowerVersion.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (lowerVersion.contains("what is your name")) {
            return "teedy-is-tedious";
        }

        if (lowerVersion.contains("which of the following numbers is the largest:")) {
            String[] sections = lowerVersion.split(":");
            String suffix = sections[sections.length - 1];
            Integer best = 0;
            for (String x : suffix.split(",")) {
                Integer num = Integer.parseInt(x);
                best = Integer.max(best, num);
            }
            return String.valueOf(best);
        }

        if (lowerVersion.contains("which of the following numbers is both a square and a cube:")) {
            String[] sections = lowerVersion.split(":");
            String suffix = sections[sections.length - 1];
            Integer best = 0;
            for (String x : suffix.split(",")) {
                Integer num = Integer.parseInt(x);
                double sq = Math.sqrt(num);
                double cb = Math.cbrt(num);
                if ((sq == Math.floor(sq))&& (cb == Math.floor(cb))) {
                    best = num;
                }
            }
            return String.valueOf(best);
        }
        return "";
    }
}
