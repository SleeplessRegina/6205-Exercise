package edu.northeastern.XuanyingWang;

public boolean CheckPermutation(String s1, String s2) {
        if (s1 == null || s2 == null) {
        return s1 == null && s2 == null;
        }
        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();
        int a = 0;
        int b = 0;
        for (char s1Char : s1Chars) {
        a = a ^ s1Char;
        }
        for (char s2Char : s2Chars) {
        b = b ^ s2Char;
        }
        return a == b;
        }


