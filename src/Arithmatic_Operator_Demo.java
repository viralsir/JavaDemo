
/*

    Arithmatic Operator

    Operator            symbol
    Addition            +
    Substraction        -
    Multiplication      *
    division            /
    Module              % - remainder


 */

import java.util.Scanner;

public class Arithmatic_Operator_Demo
{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        int no1=2;
        int no2=3;

        System.out.print("Enter No1:");
        no1=sc.nextInt();
        System.out.println("Enter No2:");
        no2=sc.nextInt();


//        System.out.println("Sum :"+ (no1+no2));
//        System.out.println("Sub :"+ (no1-no2));

        int total=no1+no2;
        System.out.println("total :"+total);
        System.out.println("Avg :"+(total/2));
        System.out.println("Multiplication :"+no1*no2);
        System.out.println("Division :"+no1/no2);
        System.out.println("module :"+(no1%no2));


    }

}
