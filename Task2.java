package homework10;

import java.util.Scanner;

public class Task002 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = scan.next();
        String reverse = "";

        for(int i =0;i<word.length(); i++) {
            reverse = word.charAt(i)+reverse;
        }

        System.out.println(reverse);
    }
}
