import pac1.FirstDemo;
import SunshineMart.Personal;
import pac1.pac2.SecondDemo;

/*
 classpath
  d:\tanish\java_program\pac1\firstdemo.java


  d:\aryan\java_demo\pac2\secondemo.java
                  import pac1.firstdemo

     package

  set classpath=d:\tanish\java_program;


 */

import java.util.Scanner;

public class PackageDemo
{
    public static void main(String[] args)
    {

        Scanner scanner=new Scanner(System.in);

        FirstDemo f1=new FirstDemo();

        f1.setPno1(23);
        System.out.println(f1.getPno1());
        Personal personal=new Personal();
        personal.setId(1);
        personal.setName("amit");
        personal.setAddress("naranpura");

        System.out.println(personal.getId());
        System.out.println(personal.getName());
        System.out.println(personal.getAddress());

        SecondDemo secondDemo=new SecondDemo();
        secondDemo.setPno2(12);
        System.out.println(secondDemo.getPno2());

    }
}
