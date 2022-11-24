//WAP to reverse numbers in java
package JavaInterviewPrograms;

import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        System.out.println("Enter numbers");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;

        }
        System.out.println("Reversed number is: " + reverse);
        sc.close();
    }
}
