package edu.northeastern.XuanyingWang;

public class solution {
    public String addStrings(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        int carry = 0, sum = 0;
        int i = s1.length()-1, j= s2.length()-1;
        while(i >= 0 ||j >= 0){
            sum =carry;
            if(i>=0) sum += s1.charAt(i)-'0';
            if(j>=0) sum += s2.charAt(j)-'0';
            sb.append(sum % 10);
            carry = sum /10;
            i--;
            j--;
        }
        if (carry!=0) sb.append(carry);
        return sb.reverse().toString();
    }
}