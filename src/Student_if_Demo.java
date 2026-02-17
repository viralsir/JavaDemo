import java.util.Scanner;

public class Student_if_Demo
{
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter Student Roll No:");
        int rollno=scanner.nextInt();
        System.out.print("Enter Student Name:");
        String name=scanner.next();
        System.out.print("Enter Maths Marks:");
        int maths=scanner.nextInt();
        while(maths<0 || maths>100)
        {
            System.out.println("invalid maths marks it should be between 0 to 100");
            System.out.print("Enter Maths Marks:");
            maths=scanner.nextInt();
        }
        System.out.print("Enter Science Marks:");
        int science=scanner.nextInt();
        while(science<0 || science>100)
        {
            System.out.println("invalid Science marks it should be between 0 to 100");
            System.out.print("Enter Science Marks:");
            science=scanner.nextInt();

        }
        System.out.println("Enter English Marks:");
        int english=scanner.nextInt();
        while(english<0 || english>100)
        {
            System.out.println("invalid English marks it should be between 0 to 100");
            System.out.print("Enter English Marks:");
            english=scanner.nextInt();

        }


        System.out.println("=output==");
        System.out.println("Roll No:"+rollno);
        System.out.println("Name :"+name);
        System.out.println("Maths :"+maths);
        System.out.println("Science :"+science);
        System.out.println("English :"+english);

        if(maths>=35 && science>=35 && english>=35)
        {
            System.out.println("You are Pass");
            int total=maths+science+english;
            double avg=total/3.0;

            System.out.println("Total :"+total);
            System.out.println("Avg :"+avg);

            if(avg >= 85)
            {
                System.out.println("Grade :A");
            }
            else if(avg>=65)
            {
                System.out.println("Grade :B");
            }
            else if (avg >=55)
            {
                System.out.println("Grade :C");
            }
            else {
                System.out.println("Grade :D");
            }

        }
        else
        {
            // System.out.println("You are Fail");
            if (maths<35)
            {
                System.out.println("you are fail in maths");
            }
            if(science<35)
            {
                System.out.println("You are Fail in Science");
            }
            if(english<35)
            {
                System.out.println("You are Fail in English");
            }

        }





    }
}
