import java.util.Scanner;

/*
    for loop
    syntax :
    for(intialization of variable; condition ; incrment/decrement of variable)
    {
        statement;
       }
 */
public class for_demo
{
    public static void main(String[] args)
    {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter No:");
        int no=scanner.nextInt();

        //int i=1,j=1;
        for(int i=1,j=1;i<=no;i++)
        {
            for(j=1;j<=10;j++)
            {
                System.out.println(i+" x "+ j +" = "+ (no*j));
            }
            System.out.println("===================================");

        }

    }
}
