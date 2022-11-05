package com.example.interview;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String firstVersion = "1.3";
        String secondVersion = "1.2.0.0.3";
        String thirdVersion = "4.4.3";
        String fourthVersion = "4.4.2.4.0";

        System.out.println("The most up to date version is (1 is one, -1 is two): " + compareVersions(firstVersion, secondVersion));
        System.out.println("The most up to date version is (1 is one, -1 is two): " + compareVersions(thirdVersion, fourthVersion));

    }

    static public int compareVersions(String one, String two) {
        int answer = 0;
        List versionOne = Arrays.asList(one.split("."));
        List versionTwo = Arrays.asList(two.split("."));

        if (versionOne.size() < 5) {
            for (int i = versionOne.size(); i < 5; i++) {
                versionOne.add("0");
            }
        }

        if (versionTwo.size() < 5) {
            for (int i = versionTwo.size(); i < 5; i++) {
                versionTwo.add("0");
            }
        }

        for (int j = 0; j <5; j++) {
            String temp1 = versionOne.get(j);
            String temp2 = versionTwo.get(j);
            if (Integer.parseInt(temp1) > Integer.parseInt(temp2)) answer = 1;
            else if (Integer.parseInt(temp1) < Integer.parseInt(temp2)) answer = -1;
            else answer = 0;
        }

        return answer;
    }
}
