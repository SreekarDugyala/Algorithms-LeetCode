package src.main.arrays;

import java.util.Scanner;

public class Palindrome {
    public boolean palindrome(String givenString) {
        char[] chararray = givenString.toCharArray();
        int start = 0;
        int end = chararray.length-1;
        while(start < end) {
            if(chararray[start] != chararray[end]) {
                return false;
            }
            start++;
            end --;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        Scanner sc = new Scanner(System.in);
        String givenString = sc.next();
        System.out.println((p.palindrome(givenString) ? "is Palindrome" : "not palindrome"));
    }
}
