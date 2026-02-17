import java.util.Scanner;

/*
 while , for (exit) -> condition first , statement second
 do while (entry)  -> statement first , condition second
 entry loop
    Syntax : -
    do while
          inititalization of variable
          do
          {
               statement;
               increment/decrement of variable

           }while(condition);
 */
public class do_while_loop_Demo {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter No:");
        int no=scanner.nextInt();

        int start=1;
        do
        {
            int j=1;
            do
            {
                System.out.println( start +" x " + j +" = "+ ( j*start));
                j=j+1;

            }while(j<=10);
            System.out.println("================");

            start=start+1;
        }while(start<=no);



    }

}
