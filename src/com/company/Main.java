package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        if ((A >= x && B >= y) || (A >= y && B >= x)|| (A>= x && B >= z) ||(A>= z && B >= x) || (A>= y && B >= z) ||
                (A>= z && B >= y)) System.out.println("Кирпич пройдет в отверстие");
        else System.out.println("Кирпич не пройдет в отверстие");

    }
}
