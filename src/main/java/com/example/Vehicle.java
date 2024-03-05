package com.example;

import java.util.Calendar;
public class Vehicle {
    public String brand;
    public String model;
    public int year;
    public Vehicle(String brand, String model, int year) throws InvalidYearException {
        //validate year dengan kondisi year yg diinput kurang dari tahun sekarang
        Calendar cal = Calendar.getInstance();
        int tahunSekarang = cal.get(Calendar.YEAR);
        if (year > tahunSekarang) {
            throw new InvalidYearException("Year harus lebih kecil dari tahun sekarang");
        }
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String vehicleSound() {
        return "(" + this.brand + ", " + this.model + ", tahun vehicle harus di bawah "+ this.year +"): " +
                "Sound Vehicle ";
    }
}

class Car extends Vehicle {
    public int numOfDoors;
    public Car(String brand, String model, int year) throws InvalidYearException {
        super(brand, model, year);
    }
    @Override
    public String vehicleSound() {
        return "Car (" + this.brand + ", " + this.model + ", " + this.year + "): tuut tuut";
    }
}

class Motorcycle extends Vehicle {
    public String sideCar;
    public Motorcycle(String brand, String model, int year) throws InvalidYearException {
        super(brand, model, year);
    }

    @Override
    public String vehicleSound() {
        return "Motorcycle (" + this.brand + ", " + this.model + ", " + this.year + "): teet teet";
    }
}

class InvalidYearException extends Exception {
    public InvalidYearException(String errorMessage) {
        super(errorMessage);
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle vehicle = null;
        Car car = null;
        Motorcycle motorcycle = null;
        try {
            vehicle = new Vehicle("model", "brand", 2024);
            car = new Car("TOYOTA", "INNOVA", 2020);
            motorcycle = new Motorcycle("HONDA", "BEAT", 2021);
        } catch (InvalidYearException e) {
            System.out.println("Year harus lebih kecil dari tahun sekarang");
        } finally {
            if (vehicle != null) {
                Main.makeSound(vehicle);
            } else {
                System.out.println("Vehicle gagal dibuat");
            }

            if (car != null) {
                Main.makeSound(car);
            } else {
                System.out.println("Car gagal dibuat");
            }

            if (motorcycle != null) {
                Main.makeSound(motorcycle);
            } else {
                System.out.println("Motorcycle gagal dibuat");
            }
        }
    }
    public static void makeSound(Vehicle vehicle) {
        String result = vehicle.vehicleSound();
        System.out.println(result);
    }
}