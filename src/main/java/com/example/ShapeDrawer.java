package com.example;

import java.util.Scanner;

public class ShapeDrawer {

    Scanner scanner = new Scanner(System.in);

    public void drawshape(int choice){
        switch (choice){
            case 1:
                System.out.println("Masukkan berapa tinggi segitiga siku2"); //segitiga siku2
                int triangleHeight = scanner.nextInt();
                drawTriangleSS(triangleHeight);
                break;
            case 2:
                System.out.println("Masukkan berapa tinggi segitiga sama kaki"); //segitiga sama kaki
                int triangleHeight2 = scanner.nextInt();
                drawTriangleSK(triangleHeight2);
                break;
            case 3:
                break;
            default:
                System.out.println("invalid input"); //segitiga sama kaki
        }
    }

    public void drawTriangleSS(int triangleHeight){
        //nested loop
        //outer loop
        for(int i=1; i <=triangleHeight;i++){
            //inner loop (take care the columns)
            for(int j=1;j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void drawTriangleSK(int triangleHeight){
        //nested loop
        //outer loop
        for(int i=1; i <=triangleHeight;i++){
            //inner loop (take care the columns)
            for(int j=1;j <= triangleHeight - i;j++){
                System.out.print(" ");
            }
            for(int k=1;k <=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void displaMenu(){
        System.out.println("selamat datang di ASCII gambar!");
        System.out.println("pilih gambar berikut:");
        System.out.println("1. Segitiga siku-siku"); //nested loop
        System.out.println("2. segitiga sama kaki"); //nested loop, tapi inner loop ada 2
        System.out.println("3. Exit");
    }
    public void run(){
        //loop while untuk aplikasi trx running sampai ada exit
        while (true){
            displaMenu();
            System.out.println("masukan pilihan anda");
            int choice = scanner.nextInt();
            drawshape(choice); //ini kondisional, bisa pake if else atau switch
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //inheritance (OOP)
        //untuk running
        ShapeDrawer drawer = new ShapeDrawer();
        drawer.run();

    }
}
