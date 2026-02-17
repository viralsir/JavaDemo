import java.util.Scanner;

/*
       control structure

       1)conditional control Structure
       2)Circular Control Structure


       1) Conditional Control Structure
             i)if
                    a)if else
                            syntax :
                                    if (condition)
                                    {
                                        true part;
                                        statement;
                                     }
                                     else
                                     {
                                        false part;
                                        statement;
                                      }
                    b)else if
                    c)nested if
             ii)switch

    Relational Operator
    Operator                    Symbol
    Grater than                     >
    Less than                       <
    equal to                        ==
    not equal to                    !=
    Grater than or equal to         >=
    less than or equal to           <=

    Logical operator
    Operator                symbol
    and                     &&
    or                      ||
    not                     !




 */
public class ifdemo
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter No1:");
        int no1=scanner.nextInt();
        System.out.println("Enter No2:");
        int no2=scanner.nextInt();
        System.out.println("Enter No3");
        int no3=scanner.nextInt();


        if (no1>no2 && no1>no3)
        {
            System.out.println(no1+" is a maximum number");
        }
        else if(no2>no1 && no2>no3)

        {
            System.out.println(no2+ " is a maximum number");
        }
        else
        {
            System.out.println(no3 +" is a maximum number");
        }


    }

}
