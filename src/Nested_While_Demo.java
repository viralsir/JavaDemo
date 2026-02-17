import java.util.Scanner;

/*
    Nested While loop :-
           while   -> while
*/
public class Nested_While_Demo
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter No:");
        int no=scanner.nextInt(); // , 3-> 5, 5  -> 9 , 6 -> 11 ,7 -> 13

          int i=1,k=1;
          while (i<= 2*no-1 )
          {
              int j=no+1;
              while( j >= 1)
              {
                  if ( j> k)
                  {
                      System.out.print(" ");
                  }
                  else {
                      System.out.print(  "* " );
                  }

                  j=j-1;
              }
              if(i<no)
              {
                  k=k+1;
              }
              else{
                  k=k-1;
              }
              System.out.println("");
              i=i+1;
          }

    }

}
/*
1
2
3



 */