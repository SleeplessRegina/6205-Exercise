package edu.northeastern.XuanyingWang;

public class IsUniqueChars_1 {

    public boolean solu(String s) {
        if (s.length() > 256)
            return false;
        boolean table[] = new boolean[256];
        for (int i = 0; i < s.length(); i++) {
            int ascii = (int) s.charAt(i);
            if (table[ascii])
                return false;
            else
                table[ascii] = true;
        }
        return true;
    }
}