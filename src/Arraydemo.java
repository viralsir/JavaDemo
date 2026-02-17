import java.util.Scanner;
/*
    Derived Data type
     int no[]=new int[]
 */

public class Arraydemo
{
    public static void main(String[] args) {

//        int no[]={34,44,55,56,5,34,56};
//
//        System.out.println(no[4]);
//        System.out.println(no[2]);
//
//        int sum=0;
//        for (int index = 0; index < 7; sum=sum+no[index],index++)
//        {
//            System.out.println(no[index]);
//
//        }
//        System.out.println("Sum :"+sum);

        Scanner scanner=new Scanner(System.in);
//        int no[]=new int[5];
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print("Enter No:");
//            no[i]=scanner.nextInt();
//        }
//        System.out.println("output :");
//        for (int i = 0; i < 5; i++) {
//            System.out.println(no[i]);
//        }
//        no[5]=34;
//        System.out.println(no[5]);

        //two di array : array of array (each element is itself an array)
        //int no[][]={ {34,54},{4,5,67,7},{ 1,2,3,4,5,6,8}};

   //     System.out.println(no[2][4]);
        int no[][]=new int[2][3];  // {{},{}}


        for (int i = 0; i < 2; i++) {

            for (int j = 0; j <3; j++) {

                System.out.println("Enter No:");
                no[i][j]=scanner.nextInt();
            }
        }

        System.out.println("\n output :\n");
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j <3; j++) {

                System.out.print(no[i][j]);
            }
            System.out.println("");
        }



    }
}
