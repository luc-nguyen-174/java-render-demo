package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;

        while (choice != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. In hinh chu nhat.");
            System.out.println("2. In hinh tam giac vuong 1.");
            System.out.println("3. In hinh tam giac vuong 2.");
            System.out.println("4. In hinh tam can.");
            System.out.println("0. Thoat.");
            System.out.print("Nhap vao lua chon cua ban:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Ve hinh chu nhat.");
                    System.out.print("Nhap vao chieu dai:");
                    int width = scanner.nextInt();

                    System.out.print("Nhap vao do cao:");
                    int height = scanner.nextInt();

                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                }
                case 2 -> {
                    System.out.println("Ve hinh tam giac vuong,\nco canh goc vuong o bottom-left");

                    System.out.println("Nhap vao so dong`:");
                    int height = scanner.nextInt();

                    for (int i = 0; i <= height; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                }
                case 3 -> {
                    System.out.println("Ve hinh tam giac vuong,\nco canh goc vuong o top-left");

                    System.out.println("Nhap vao so dong");
                    int height = scanner.nextInt();

                    for (int i = height; i >= 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                }
                case 4 -> {
                    System.out.println("Ve hinh tam giac can.");

                    System.out.println("Nhap vao so dong.");
                    int height = scanner.nextInt();

                    for(int i = 0; i <= height; i++) {
                        for ( int j = 0; j <=height-i; j++ ){
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2*i-1; k++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                }
                case 0 -> System.exit(0);
                default -> System.out.println("Khong co lua chon nao, moi nhap lai!");
            }
        }

    }
}