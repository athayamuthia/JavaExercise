package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//      test
        System.out.printf("Hello and welcome!");
        System.out.println("Hello and welcome!");
        System.out.println("Hello and welcome!");

//      DATA TYPE
        int a = 10;
        int b = 2;
        float c = 3;
        String nama = "tia";
        char q = 'Y';
        boolean flag = false;
        int result = (int) (a / c); //10 dibagi 3
        System.out.println(result);
        float result2;
        result2 = a/b;
        System.out.println(result2);

//      IF ELSE MODULE
        int timeStart = 8;
        int timeFinish = 17;
        int waktuSaya = 10;
        int waktuPulang = 18;
        if (waktuSaya <= timeStart && waktuPulang <= timeFinish) {
            System.out.println("datang dan pulang tepat waktu");
            System.out.println("Anda datang "+ (timeStart - waktuSaya) +" jam lebih cepat");
            System.out.println("Anda pulang "+ (waktuPulang - timeFinish) +"jam lebih lama");
        } else if (waktuSaya <= timeStart && waktuPulang <= timeFinish) {
            System.out.println("dateng awal");
        } else if (waktuSaya >=timeStart && waktuPulang >= timeFinish) {
            System.out.println("dimaafian datang telatnya");
        } else {
            System.out.println("telat");
            System.out.println("anda telat "+ (waktuSaya - timeStart) +" jam");
            System.out.println("anda pulang duluan"+ (timeFinish - waktuPulang) + " jam lbh cepat");
        }

//      SWITCH MODULE
        int day = 3;
        switch (day){
            case 1:
                System.out.println("wfo");
                break;
            case 2:
                System.out.println("cuti");
                break;
            case 3:
                System.out.println("wfh");
                break;
            case 4:
                System.out.println("wiken");
                break;
        }
        System.out.println("hehehhehe");
//    WHILE LOOP MODULE

    }
}