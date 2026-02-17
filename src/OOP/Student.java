package OOP;

import java.util.ArrayList;
import java.util.Scanner;

//public class Student
//{
//    // member variable
//    int rollno;
//    String name;
//    int maths,science,english;
//
//
//
//    public static void main(String[] args)
//    {
//        Scanner scanner=new Scanner(System.in);
//        //Student std[]=new Student[50];
//
//        ArrayList<Student> Student_List=new ArrayList<Student>();
//
//
//        for (int i = 0; i < 2; i++)
//        {
//            Student std=new Student();
//            System.out.println("Enter Student Roll No:");
//            std.rollno=scanner.nextInt();
//            System.out.println("Enter Student Name:");
//            std.name=scanner.next();
//            System.out.println("Enter Student Maths Marks:");
//            std.maths=scanner.nextInt();
//            System.out.println("Enter Student Science Marks:");
//            std.science=scanner.nextInt();
//            System.out.println("Enter Student English Marks:");
//            std.english=scanner.nextInt();
//
//            Student_List.add(std);
//
//        }
//
//        System.out.println(" output ");
//
//        for(Student std:Student_List)
//        {
//            System.out.println("Roll No:"+std.rollno);
//            System.out.println("Name:"+std.name);
//            System.out.println("Maths:"+std.maths);
//            System.out.println("Science:"+std.science);
//            System.out.println("English:"+std.english);
//
//        }
//
//
////        for (int i = 0; i <Student_List.size() ; i++) {
////
////            Student std=Student_List.get(i);
////            System.out.println("Roll No:"+std.rollno);
////            System.out.println("Name:"+std.name);
////            System.out.println("Maths:"+std.maths);
////            System.out.println("Science:"+std.science);
////            System.out.println("English:"+std.english);
////
////        }
//
//
//
//
//    }


    public class Student
    {
        // member variable
        int rollno;
        String name;
        int maths,science,english;
        final int PASSING_MARK=35;
        int total;
        // member function

        void setStudentData()
        {
            Scanner scanner=new Scanner(System.in);

            System.out.println("Enter Student Roll No:");
            rollno=scanner.nextInt();
            System.out.println("Enter Student Name:");
            name=scanner.next();
            System.out.println("Enter Student Maths Marks:");
            maths=scanner.nextInt();
            maths=checkMarks("Maths",maths);
            System.out.println("Enter Student Science Marks:");
            science=scanner.nextInt();
            science=checkMarks("Science",science);
            System.out.println("Enter Student English Marks:");
            english=scanner.nextInt();
            english=checkMarks("English",english);


        }

        int checkMarks(String subject,int marks)
        {
            Scanner scanner=new Scanner(System.in);

            while(marks<0 || marks>100)
            {
                System.out.println("Invalid "+subject+" Marks");
                System.out.println("Enter "+subject+" Marks");
                marks=scanner.nextInt();
            }
            return marks;

        }

        void Pass_Fail(){

            if(maths>PASSING_MARK && science>PASSING_MARK && english>PASSING_MARK)
            {
                System.out.println("You are Pass");
                total=maths+science+english;
                System.out.println("Total :"+total);
            }
            else{
                System.out.println("You are Fail");
            }

        }


        void getStudentData()
        {
            System.out.println("Roll No:"+rollno);
            System.out.println("Name:"+name);
            System.out.println("Maths:"+maths);
            System.out.println("Science:"+science);
            System.out.println("English:"+english);
            Pass_Fail();

        }


        public static void main(String[] args)
        {

            ArrayList<OOP.Student> Student_List=new ArrayList<OOP.Student>();


            for (int i = 0; i < 2; i++)
            {
                OOP.Student std=new OOP.Student();
                std.setStudentData();

                Student_List.add(std);

            }

            System.out.println(" output ");

            for(OOP.Student std:Student_List)
            {
                std.getStudentData();
                //std.Pass_Fail();
            }


        }






















    }
