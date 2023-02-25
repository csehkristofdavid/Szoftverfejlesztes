package org.example;
import java.util.Scanner;
import static MathMethodsService.Methods.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("Please Enter Two Integers!");

        System.out.println(add(x, y));
        System.out.println(substract(x, y));
        System.out.println(multiply(x, y));
        System.out.println(divide(x, y));
    }
}