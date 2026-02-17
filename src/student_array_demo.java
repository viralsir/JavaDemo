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


public class student_array_demo
{

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        final int PASSING_MARK=35;

        int rollno[]=new int[50];
        String name[]=new String[50];
        int maths[]=new int[50];
        int science[]=new int[50];
        int english[]=new int[50];
        int index=0;
        String isContiue="yes";



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
                    do
                    {

                        System.out.println("Enter Roll No:");
                        rollno[index] = scanner.nextInt();

                        System.out.println("Enter Name :");
                        name[index] = scanner.next();

                        do {
                            System.out.println("Enter Maths Mark (0-100):");
                            maths[index] = scanner.nextInt();

                        } while (maths[index] < 0 || maths[index] > 100);


                        do {
                            System.out.println("Enter Science Mark (0-100):");
                            science[index] = scanner.nextInt();

                        } while (science[index] < 0 || science[index] > 100);


                        do {
                            System.out.println("Enter English Mark (0-100):");
                            english[index] = scanner.nextInt();

                        } while (english[index] < 0 || english[index] > 100);

                        System.out.println("Do you want to Add Another Student ?(y/n):");
                        isContiue=scanner.next();

                        index=index+1;
                    }while(isContiue.equalsIgnoreCase("y") );

                    break;
                case 2:
                    System.out.println("\n output :\n");

                    for(int start=0;start<index;start++) {
                        System.out.println("Roll No:" + rollno[start]);
                        System.out.println("Name :" + name[start]);
                        System.out.println("Maths :" + maths[start]);
                        System.out.println("Science :" + science[start]);
                        System.out.println("English :" + english[start]);

                        if (maths[start] >= PASSING_MARK && science[start] >= PASSING_MARK && english[start] >= PASSING_MARK) {
                            System.out.println("You are Pass");
                            int total = maths[start] + science[start] + english[start];
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
