import java.util.ArrayList;
import java.util.Scanner;

public class Student_Collection_Demo {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        ArrayList<Integer> rollno=new ArrayList<Integer>();
        ArrayList<String> name=new ArrayList<String>();
        ArrayList<Integer> maths=new ArrayList<Integer>();
        ArrayList<Integer> science=new ArrayList<Integer>();

        for(int i=0;i<=2;i++)
        {
            System.out.println("Enter Rollno :");
            rollno.add(scanner.nextInt());
            System.out.println("Enter Name:");
            name.add(scanner.next());

            System.out.println("Enter Maths:");
            maths.add(scanner.nextInt());

            System.out.println("Enter Science:");
            science.add(scanner.nextInt());

        }
        System.out.println("\n output :\n");
        for (int i = 0; i < rollno.size(); i++) {

            System.out.println("roll No:"+ rollno.get(i));
            System.out.println("name :"+name.get(i));
            System.out.println("Maths:"+maths.get(i));
            System.out.println("Science:"+science.get(i));


        }



    }
}
