package com.example;

//library
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class TaskOne {
    Scanner scanner = new Scanner(System.in);

    public void asciiShape(int choice){
        switch (choice){
            case 1:
                System.out.println("Masukkan tinggi Trapesium yang diinginkan");
                int trapesiumHeight = scanner.nextInt();
                drawTrapesium(trapesiumHeight);
                break;
            case 2:
                System.out.println("Masukkan tinggi Persegi yang diinginkan");
                int boxHeight = scanner.nextInt();
                drawBox(boxHeight);
                break;
            case 3:
                break;
            default:
                System.out.println("masukan salah");
        }
    }

    public void drawTrapesium(int trapesiumHeight){
        for (int i = 1; i <=trapesiumHeight; i++) {
            for (int j = 1; j <= trapesiumHeight-i; j++) {
                System.out.print(" "); //untuk spasi di depan
            }
            for (int q = 1; q <= i*2+4; q++) {
                System.out.print("*"); //untuk bentuk trapesiumn
            }
            System.out.println("");
        }

    }
    public void drawBox(int boxHeight){
      for(int i=0;i<boxHeight;i++) //cetak baris paling atas
        {
            for(int j=0;j<boxHeight;j++) //cetak baris ke 2 dst dr atas ke bawah/perkolom
            {
                if(i==0||i==boxHeight-1||j==0||j==boxHeight-1) //cetak dari atas ke bawah/perkolom, kembali lg dari atas ke bawah
                {
                    System.out.print("# ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public void displaMenu(){
        System.out.println("selamat datang di ASCII gambar!");
        System.out.println("pilih gambar berikut:");
        System.out.println("1. Trapesium"); //nested loop
        System.out.println("2. Persegi"); //nested loop, tapi inner loop ada 2
        System.out.println("3. Exit");
    }
    public void run(){
        //loop while untuk aplikasi trx running sampai ada exit
        while (true){
            displaMenu();
            System.out.println("Masukan pilihan anda");
            int choice = scanner.nextInt();
            asciiShape(choice); //ini kondisional, bisa pake if else atau switch
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //inheritance (OOP)
        //untuk running
        TaskOne task = new TaskOne();
        task.run();

    }
}
