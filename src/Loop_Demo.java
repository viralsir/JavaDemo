import java.util.Scanner;

/*
     Circular Control Structure

     loop :
     1)while
         syntax :
           initialization of variable
           while (condition)
           {
                true part;
                statement;
              increment / decrement of variable
             }

     2)do while
     3)for


 */
public class Loop_Demo
{
    public static void main(String[] args) {

//        int start=1;
//        while(start<=100)
//        {
//            System.out.println(start);
//            start=start+10;
//
//        }

        Scanner scanner=new Scanner(System.in);

//        System.out.println("Enter Starting value:");
//        int start=scanner.nextInt();
//        System.out.println("Enter Ending Value:");
//        int end=scanner.nextInt();
//
//        while(start<=end)
//        {
//            System.out.println(start);
//            start=start+10;
//
//        }
//        int sum=0;
//        int start=1;
//        while(start<=5)
//        {
//            System.out.println("Enter No:");
//            int no=scanner.nextInt();
//            sum = sum+no;
//            start++;
//        }
//        System.out.println("Sum : "+ sum);
//

//        System.out.println("Enter No:");
//        int no=scanner.nextInt();
//
//        int start=1;
//        while(start<=10)
//        {
//            System.out.println(no+" * "+start +" = "+ no*start);
//            start++;
//
//        }


//        System.out.println("Enter No:");
//        int no=scanner.nextInt();
//        System.out.println("divisor :");
//        int start=1;
//        while(start<=no)
//        {
//             if(no%start==0)
//             {
//                 System.out.print(start+" ");
//             }
//             start++;
//        }
//
       // prime no or not - logic -1
//        System.out.println("Enter No:");
//        int no=scanner.nextInt();
//
//        int start=1;
//        int divisor_count=0;
//        while(start<=no)
//        {
//            if(no%start==0)
//            {
//                divisor_count=divisor_count+1;
//            }
//            System.out.println(start);
//            start++;
//
//        }
//        if (divisor_count==2)
//        {
//            System.out.println(no+" is a prime no");
//        }
//        else {
//            System.out.println(no+" is not a prime no");
//        }


        // logic -2
//        System.out.println("Enter No:");
//        int no=scanner.nextInt();
//
//        int start=2;
//        int divisor_count=0;
//        while(start<no)
//        {
//            if(no%start==0)
//            {
//                divisor_count=divisor_count+1;
//            }
//            System.out.println(start);
//            start++;
//
//        }
//        if (divisor_count==0)
//        {
//            System.out.println(no+" is a prime no");
//        }
//        else {
//            System.out.println(no+" is not a prime no");
//        }


        // logic - 3
//        System.out.println("Enter No:");
//        int no=scanner.nextInt();
//
//        int start=2;
//        int divisor_count=0;
//        while(start<no)
//        {
//            System.out.println(start);
//            if(no%start==0)
//            {
//                divisor_count=divisor_count+1;
//                break;
//            }
//
//            start++;
//
//        }
//        if (divisor_count==0)
//        {
//            System.out.println(no+" is a prime no");
//        }
//        else {
//            System.out.println(no+" is not a prime no");
//        }

        int start=1;
        int sum=0;

        System.out.println("Enter Ending value :");
        int end=scanner.nextInt();

        while(start<=end)
        {
            System.out.println(start);
            sum=sum+start;
            start=start+1;
        }
        System.out.println("sum :"+sum);
        System.out.println("Sum:"+(end *(end+1))/2);





        System.out.println("\n while loop end");

    }

}
