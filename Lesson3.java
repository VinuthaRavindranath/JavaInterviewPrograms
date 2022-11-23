//How to get using input using Scanner program in Java
package JavaInterviewPrograms;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();

        System.out.println("enter age");
        int age = sc.nextInt();

        System.out.println("enter height");
        float height = sc.nextFloat();

        System.out.println("My Name is " + name + " and my age is " + age + " and my height is " + height);
        sc.close();
    }
}
