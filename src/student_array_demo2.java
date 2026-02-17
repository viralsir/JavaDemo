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


       level 0:  add pass / fail logic
       level 1: add search by roll no option in main menu
       level 2: add view only pass student  and view only fail student
       level 3: update student subject mark : ( ask div , rollno ,subject )
       level 4: add Starndard option


 */


public class student_array_demo2
{

    public static void main(String[] args)
    {

        Scanner scanner=new Scanner(System.in);
        final int PASSING_MARK=35;

        String subject[]={"Maths","Science","English","Phy"};
        int student_count[]={0,0,0};
        int rollno[][]=new int[3][50];
        String name[][]=new String[3][50];
        int marks[][][]=new int[3][50][4];
        int index=0;
        String isContiue="yes";
        int divoption=0;


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
                        System.out.println("\n Select Division :");
                        System.out.println("\t Press 0 for A div");
                        System.out.println("\t Press 1 for B div");
                        System.out.println("\t Press 2 for C div");


                        System.out.println("Enter Your option :");
                        divoption=scanner.nextInt();

                        System.out.println("Enter Roll No:");
                        rollno[divoption][student_count[divoption]] = scanner.nextInt();

                        System.out.println("Enter Name :");
                        name[divoption][student_count[divoption]] = scanner.next();

                        for(int subjectindex=0;subjectindex<4;subjectindex++)
                        {
                            do
                            {
                                System.out.println("Enter "+subject[subjectindex] +" Mark(0-100):");
                                marks[divoption][student_count[divoption]][subjectindex]=scanner.nextInt();
                            }while(marks[divoption][student_count[divoption]][subjectindex]<0 || marks[divoption][student_count[divoption]][subjectindex]>100);
                        }


                        System.out.println("Do you want to Add Another Student ?(y/n):");
                        isContiue=scanner.next();

                        student_count[divoption]++;

                    }while(isContiue.equalsIgnoreCase("y") );

                    break;
                case 2:
                    System.out.println("\n output :\n");

                    System.out.println("\n Select Division :");
                    System.out.println("\t Press 0 for A div");
                    System.out.println("\t Press 1 for B div");
                    System.out.println("\t Press 2 for C div");


                    System.out.println("Enter Your option :");
                    divoption=scanner.nextInt();


                    for(int start=0;start<student_count[divoption];start++) {
                        System.out.println("Roll No:" + rollno[divoption][start]);
                        System.out.println("Name :" + name[divoption][start]);

                        for (int subjectindex = 0; subjectindex < 4; subjectindex++) {
                            System.out.println(subject[subjectindex] + ": " + marks[divoption][start][subjectindex]);
                        }


//                        if (maths[start] >= PASSING_MARK && science[start] >= PASSING_MARK && english[start] >= PASSING_MARK) {
//                            System.out.println("You are Pass");
//                            int total = maths[start] + science[start] + english[start];
//                            float avg = total / 3.0f;
//                            if (avg >= 70)
//                                System.out.println("Grade : A");
//                            else if (avg >= 50)
//                                System.out.println("Grade :B");
//                            else
//                                System.out.println("Grade :C");
//
//                        } else {
//                            System.out.println("You are Fail");
//                        }
                    }
                    break;
                case 3:
                    System.out.println("you are exit ");
                    break;
                default :
                    System.out.println("Wrong option Entered try again !");
                    break;

                    }




        }while(option !=3);

    }

}
