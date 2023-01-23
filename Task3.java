package homework10;

import java.util.Scanner;
import java.util.SortedMap;

public class Task3 {
    public static void main(String[] args) {


        //3) Write a program that reads two people's first
        //names and if they expecting boy or girl?
        //Based on the input suggests a name for a baby:
        //Example Output:
        //Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? boy
        //Suggested baby name: DANRY
        //
        //Example Output:
        //Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? girl
        //Suggested baby name: MAIEL
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter mothers name");
        String mothername= scan.next();
        System.out.println("Please enter fathers name");
        String fathername= scan.next();
        System.out.println("Are you expecting boy or girl?");
        String answer= scan.next();
        String babyname;

        if(answer.equalsIgnoreCase("girl")){
            babyname=(mothername.substring(0,2)+fathername.substring(3,6));

            System.out.println("suggested baby name is: " +babyname);
        }else{
            babyname=(fathername.substring(0,3)+mothername.substring(2,4));
            System.out.println("Suggested baby name is : " + babyname);
        }

    }
}

