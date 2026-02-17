package Inheritance;

/*
     Inheritance : is the proccess by which object of one class can access or get the properties of object of another class.

     Class A
     {
         int noA;
      }
      Class B (Sub class / child class /derived class ) extends A (super class / parent class / base class)
      {
          int noB;
        }
        A a1=new A();
        a1.noA
        a1.noB

        B b1=new B();
        b1.noB
        b1.noA

        category of Inheritance
        1) Single Inheritance : one object can access the only one object at a time.
             A
             |
             B
        2) Multilevel Inheritance : continous chain of single inheritance .
                         A
                         |
                         B
                         |
                         C
        3) Hyrarchical Inheritnace : more than object can access the properties of same object
                         A
                   |         |
                  B          C
        4) Multiple Inheritance : one object can access more than one object at a time
                            A                 B
                                     |
                                     C
                   in java one object can access or get the properties of only one object at a time.
                   not supported.

         5) hybrid Inheritance : combination of more than on inheritance

                        A
                        |
                        B
                        |
                        C
                  |          |
                  D           E


          ---------------------------------------------
          one object is a part of another object

 */

import java.util.ArrayList;
import java.util.Scanner;

public class InheritanceDemo
{
    public static void main(String[] args)
    {
        // single inheritance
//         Employee emp1=new Employee();
//         emp1.setPersonal_Info();
//         emp1.setSalary();
//         emp1.getPersonal_Info();
//         emp1.getSalary();

            // multilevel inheritance
//        DMart dMart=new DMart();
//        dMart.setPersonal_Info();
//        dMart.setSalary();
//        dMart.setLocation();
//
//        dMart.getPersonal_Info();
//        dMart.getSalary();
//        dMart.getLocation();

        // Hyrarchical Inheritance
        Employee emp1=new Employee();
        emp1.setPersonal_Info();
        emp1.setSalary();

        Customer customer=new Customer();
        customer.setCustomer();

        emp1.getPersonal_Info();
        emp1.getSalary();

        customer.getCustomer();


    }
}
class Personal_Info
{
    int id;
    String name;
    String address;
    String phno;

    void setPersonal_Info()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter ID");
        id=scanner.nextInt();
        System.out.println("Enter Name:");
        name=scanner.next();
        System.out.println("Enter Address:");
        address=scanner.next();
        System.out.println("Enter Phno:");
        phno=scanner.next();

    }

    void getPersonal_Info(){
        System.out.println("ID :"+id);
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);
        System.out.println("Phno:"+phno);
    }

}
class Employee extends Personal_Info
{
    int salary;

    void setSalary()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Salary :");
        salary=scanner.nextInt();
    }
    void getSalary()
    {
        System.out.println("Salary :"+salary);
    }
}
class Customer extends Personal_Info
{
    int billamount;
    void setCustomer()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("\tCustomer\n");
        setPersonal_Info();
        System.out.println("Enter Bill Amount ");
        billamount=scanner.nextInt();
    }
    void getCustomer()
    {
        System.out.println("==customer===");
        getPersonal_Info();
        System.out.println("bill Amount :"+billamount);
    }
}
class DMart extends Employee
{

  //  ArrayList<Employee> employeeArrayList=new ArrayList<>();
    String location;

         void setLocation()
         {
             Scanner scanner=new Scanner(System.in);
             System.out.println("Enter Location :");
             location=scanner.next();
         }
         void getLocation()
         {
             System.out.println("Location :"+location);
         }
}