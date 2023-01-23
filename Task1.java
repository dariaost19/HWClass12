package homework10;

import java.util.Scanner;
import java.util.SortedMap;

public class Task1 {
    public static void main(String[] args) {


        //1) Create a String and if the String is not empty perform the following:
        //if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
        //For Example String str=hello =>l
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String subject = scan.nextLine();

        if (!subject.isEmpty()) {

        if (subject.length() > 3 && subject.length() % 2 != 0) {

                char character[] = subject.toCharArray();
                int middle = character.length / 2;
                System.out.println("Middle Character is: " + character[middle]);
            } else {
            System.out.println("invalid");

            }

        }
    }
}
