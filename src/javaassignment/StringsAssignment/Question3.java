package javaassignment.StringsAssignment;

import java.util.HashMap;

public class Question3 {
    static char get2ndMostFreq(String pattern) {
        pattern = pattern.toLowerCase();
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();
        int max1 = 0, max2 = 0;
        if (pattern.length() > 2) {
            max1 = 1;
            max2 = 0;
        }
//        else if (pattern.length() == 2) {
//            return pattern.charAt(1);
//        }
        else {
            return '\0';
        }

        for (int itr = 0; itr < pattern.length(); itr += 1) {
            int val = m.getOrDefault(pattern.charAt(itr), -1);

            if (val == -1) {
                Integer integer = m.putIfAbsent(pattern.charAt(itr), 1);
            } else {
                Integer integer = m.get(pattern.charAt(itr));
                integer++;
                m.put(pattern.charAt(itr), integer);

                if (integer >= max1) {
                    max2 = max1;
                    max1 = integer;
                }
            }
        }

        for (int itr = 0; itr < pattern.length(); itr += 1) {
            Integer integer = m.get(pattern.charAt(itr));
            if (integer == max2) {
                return pattern.charAt(itr);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String str1 = "Elephants";
        System.out.println("The given string is: " + str1);
        char res = get2ndMostFreq(str1);
        if (res != '\0')
            System.out.println("The second most frequent char in the string is: " + res);
        else
            System.out.println("No second most frequent character found in the string.");
    }
}
