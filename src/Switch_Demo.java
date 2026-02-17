import java.util.Scanner;

/*
     Switch Demo :

                   syntax :
                                switch(variable)
                                {
                                     case value :
                                                true part;
                                                statement;
                                      break;
                                      case value :
                                                    true part;
                                                    statement;
                                      break;
                                      ----------------------
                                      -------------------
                                      default :
                                                false part;
                                                statement;
                                      break;
                                   }

 */
public class Switch_Demo {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter No1:");
        int no1=scanner.nextInt();
        System.out.println("Enter No2:");
        int no2=scanner.nextInt();

        System.out.println("\n\t\t\t Calculator");
        System.out.println("\t\t Press 1 for Addition");
        System.out.println("\t\t Press 2 for Substraction");
        System.out.println("\t\t Press 3 for Multiplication");
        System.out.println("\t\t Press 4 for Division");

        System.out.println("Enter your option :");
        int option=scanner.nextInt();

        switch (option)
        {
            case 1:
                System.out.println("Addition :"+(no1+no2));
                //break;
            case 2:
                System.out.println("Substraction :"+(no1-no2));
                break;
            case 3:
                System.out.println("Multiplication :"+ (no1*no2));
                break;
            case 4:
                System.out.println("Division :"+(no1/no2));
                break;

            default :
                System.out.println("Wrong option selected ");
                break;


        }



    }

}
