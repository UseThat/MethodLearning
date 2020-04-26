package app;

import java.sql.SQLOutput;

/*
1. Write a method that will return your current age.
2. Write a method that will return your name,
3. Enter the method, which is the argument of 2 numbers and prints their sum, difference and product,
4. Enter a method that represents the number as true and if the number is even,
5. Write a method that gives the number and true if the number is divided by 3 and 5,
6. Write a method which as an argument presents the number and functions of it raised to the 3rd power,
7. Write Write a method that takes a number as its argument and returns its square root
8. Write a method that will take three numbers as an argument. The method should be true
if a rectangular triangle can be built from the length segment given in the arguments.
 */
public class MethodsStarter {
    public static void main(String[] args) {
       returnAge(30);
       returnName("Mateusz");
       simpleCalculation(2,2.5);
       isEven(4);
       divideByThreeAndFive(15);
       powerNumber(2);
       sqrtNumber(9);
       rectangularTriangle(5,12,13);
    }

    //1. Write a method that will return your current age.
    public static void returnAge(int age){
        System.out.println("My age is "+age);
    }

    //2. Write a method that will return your name.
    public static void returnName(String name){
        System.out.println(name);
    }

    //3. Enter the method, which is the argument of 2 numbers and prints their sum, difference and product,
    public static void simpleCalculation(double a, double b){

        System.out.printf("%.2f + %.2f = %.2f%n",a,b,(a + b));
        System.out.printf("%.2f - %.2f = %.2f%n",a,b,(a - b));
        System.out.printf("%.2f * %.2f = %.2f%n",a,b,(a * b));
    }

    //4. Enter a method that represents the number as true and if the number is even,
    public static void isEven(int a){
        System.out.println("Is "+ a +" even? "+(a%2==0));
    }

    //5. Write a method that gives the number and true if the number is divided by 3 and 5,
    public static void divideByThreeAndFive(int number){
        System.out.println("Is number "+ number +" divided by 3 and 5? "+(number%3 == 0 && number%5 ==0));
    }

    //6. Write a method which as an argument presents the number and functions of it raised to the 3rd power,
    public static void powerNumber(double number){
        System.out.println(number+" ^ 3 = "+Math.pow(number,3));
    }

    //7. Write Write a method that takes a number as its argument and returns its square root
    public static void sqrtNumber(double number){
        System.out.println("Square root for "+number+" is "+Math.sqrt(number));
    }

    //8. Write a method that will take three numbers as an argument. The method should be true
    //if a rectangular triangle can be built from the length segment given in the arguments.
    public static void rectangularTriangle(double lengthA, double lengthB, double lengthC){
        System.out.println("Is possible to build triangle with lengthA = "+lengthA+", lengthB = "+lengthB
                +", lengthC = "+lengthC+ "? " +((Math.pow(lengthA,2) + Math.pow(lengthB,2)) == Math.pow(lengthC,2)));

    }
}
