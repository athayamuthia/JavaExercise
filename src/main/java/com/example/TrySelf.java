package com.example;

public class TrySelf {
    public static void main(String[] args)
    {
        //2 for pertama membuat kotak 10x10
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                //kondisi untuk baris/kolom pertama dan terakhir
                //cetak baris pertama dan terkahir, kolom pertama dan terakhir
                if(i==0||i==9||j==0||j==9)
                {
                    System.out.print("# ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
