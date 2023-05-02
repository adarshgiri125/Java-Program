package com.company.javalib;

//import package.name.class;//import the particular class
//import package.name.*; //importing the whole class or package by this package;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){

        int a = 10;
        int b = 12;
        int c = a + b;

        String name = "Adarsh";

        boolean check = true;
        if(a>b){
            check = true;
        }
        else{
            check = false;
        }

        char temp = 'a';


        //Type casting
       // widening Casting - convert a smaller type to a larger type size
        //Narrowing casting - convert a larger type to a smaller type size

        int f = 10;
        double ff = f; // automating casting to from int to double

        double dd = 17.5d;
        int d = (int)dd; // manual casting

        String[] cars = {"Ferrari","Audi","Ford"};

        for(String i : cars){
            System.out.println(i);
        }

        int[] numbers = {10,20,30,40};

        int[][] twoD = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(twoD[1][2]);

        System.out.println(c);
        System.out.println(name +" " + c);
        System.out.println(check);
        System.out.println(temp);
        System.out.println(cars[2]);
        System.out.println(numbers[2]);

        say();

        //class & object

//        car obj  = new car();
//        obj.drive();
//        System.out.println(obj.color);

        car.sayHello();

        car obj = new car("Blue",2003);
        System.out.println(obj.getModelYear());
        obj.setColor("Black");
        System.out.println(obj.getColor());

        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        System.out.println("Username" + " " + username);

        car mercedes = new car("Red",2023);
        mercedes.horn();


        // Abstraction (in abstraction we can use no body function and body function both
        // but in implements have only no body function but
        // for implement you have to use implement rather than extend;
        Animal dog = new dog();
        Animal cat = new cat();

        dog.sound();
        cat.sound();



    }

    public static void say(){
        System.out.println("this is function call");
    }
}