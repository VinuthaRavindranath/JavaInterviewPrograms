//WAP to compare two Srings in Java
package JavaInterviewPrograms;

import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        String s1, s2;
        System.out.println("Enter First String");
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        System.out.println("Enter Second String");
        s2 = sc.nextLine();

        if (s1.compareTo(s2) > 0) {
            System.out.println("First String is greater than second string");
        } else if (s1.compareTo(s2) < 0) {
            System.out.println("Second String is greater than First string");
        } else {
            System.out.println("Both Strings are same");
        }
        sc.close();

    }

}
