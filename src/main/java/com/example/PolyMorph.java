package com.example;

//library
import java.util.Scanner;
import java.util.InputMismatchException;

interface Shape{ //implementation of polymorphism
    void draw(int height);
}

class drawTrapesium implements Shape {
    @Override //(replace paksa content dari function dalam polymorphism)
    public void draw(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" "); //untuk spasi di depan
            }
            for (int q = 1; q <= i * 2 + 4; q++) {
                System.out.print("*"); //untuk bentuk trapesiumn
            }
            System.out.println("");
        }

    }
}
    class drawBox implements Shape {
        @Override
        public void draw(int height){
            for(int i=0;i<height;i++) //cetak baris paling atas
            {
                for(int j=0;j<height;j++) //cetak baris ke 2 dst dr atas ke bawah/perkolom
                {
                    if(i==0||i==height-1||j==0||j==height-1) //cetak dari atas ke bawah/perkolom, kembali lg dari atas ke bawah
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
    }

public class PolyMorph {
    Scanner scanner = new Scanner(System.in);

    public void asciiShape(int choice) {
        try {
            switch (choice) {
                case 1:
                    System.out.println("Masukkan tinggi Trapesium yang diinginkan");
                    int trapesiumHeight = scanner.nextInt();
                    new drawTrapesium().draw(trapesiumHeight);
                    break;
                case 2:
                    System.out.println("Masukkan tinggi Persegi yang diinginkan");
                    int boxHeight = scanner.nextInt();
                    new drawBox().draw(boxHeight);
                    break;
                case 3:
                    System.exit(0);
                    break;
//            default:
//                System.out.println("masukan salah");
            }
        }
        catch (InputMismatchException ime) {
            System.out.println("masukkan angka yang benar!");
            scanner.next();
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
            try {
                int choice = scanner.nextInt();
                asciiShape(choice); //ini kondisional, bisa pake if else atau switch
                System.out.println();
            }
            catch (InputMismatchException ime){
                System.out.println("pilihan yang diinput tidak ada");
                scanner.next();
            }
        }
    }
    public static void main(String[] args) {
        //inheritance (OOP)
        //untuk running
        PolyMorph task = new PolyMorph();
        task.run();

    }
}
