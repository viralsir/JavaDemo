import java.util.Scanner;

/*

    Array : multiple memorroy block shared a same name
                or
           collection of same type of data.


             rollno1,rollno2,rollno3,--- , rollno50

             rollno[50]=>  rollno[0],rollno[1],---,rollno[49]

             syntax :
             datatype  arrayname[]=new datatype[size];

             two di array : each elements is itself an array.



 */


public class student_loop_demo
{

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        final int PASSING_MARK=35;

        System.out.println("Enter No of Student :");
        int no_of_student=scanner.nextInt();System.out.println("\n output :\n");
        System.out.println("\n output :\n");

        int rolllno=0,maths=0,science=0,english=0;
        String name="";


        int option=0;
        do
        {
            System.out.println("\n\t\t Tanish School ");
            System.out.println("\t\t Press 1 for Entry");
            System.out.println("\t\t Press 2 for View");
            System.out.println("\t\t Press 3 for Exit");

            System.out.println("Enter Your option :");
            option=scanner.nextInt();

            switch(option)
            {
                case 1:
                    for(int start=1;start<=no_of_student;start++)
                    {

                        System.out.println("Enter Roll No:");
                        rolllno = scanner.nextInt();

                        System.out.println("Enter Name :");
                        name = scanner.next();

                        do {
                            System.out.println("Enter Maths Mark (0-100):");
                            maths = scanner.nextInt();

                        } while (maths < 0 || maths > 100);


                        do {
                            System.out.println("Enter Science Mark (0-100):");
                            science = scanner.nextInt();

                        } while (science < 0 || science > 100);


                        do {
                            System.out.println("Enter English Mark (0-100):");
                            english = scanner.nextInt();

                        } while (english < 0 || english > 100);
                    }
                    break;
                case 2:
                    System.out.println("\n output :\n");

                    for(int start=1;start<=no_of_student;start++) {
                        System.out.println("Roll No:" + rolllno);
                        System.out.println("Name :" + name);
                        System.out.println("Maths :" + maths);
                        System.out.println("Science :" + science);
                        System.out.println("English :" + english);

                        if (maths >= PASSING_MARK && science >= PASSING_MARK && english >= PASSING_MARK) {
                            System.out.println("You are Pass");
                            int total = maths + science + english;
                            float avg = total / 3.0f;
                            if (avg >= 70)
                                System.out.println("Grade : A");
                            else if (avg >= 50)
                                System.out.println("Grade :B");
                            else
                                System.out.println("Grade :C");

                        } else {
                            System.out.println("You are Fail");
                        }

                    }

            }


        }while(option !=3);








    }

}
