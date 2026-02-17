package SunshineMart;

import java.util.ArrayList;
import java.util.Scanner;

/*
 level 0:
         add Search by billno Menu in sub menu of purchase and sales
 level 1:
         add update and delete by bill no in sub menu of purchase and sales
 level 2:
           add discount and tax product wise
 level 3:
          combine vendor and customer class into order class
 level 4:
           add stock option in main menu (view)
 level 5:
          add validation logic whereever required.


 */



public class Sunshine
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Order> vendors=new ArrayList<>();
        ArrayList<Order> customers=new ArrayList<>();
        int option1=0,option2=0;
        do {
            System.out.println("\n\t\t SunShine Mart ");
            System.out.println("\t\t Press 1 for Purchase");
            System.out.println("\t\t Press 2 for Sales");
            System.out.println("\t\t Press 3 for Exit ");

            System.out.println("Enter Your option :");
            option1=scanner.nextInt();

            switch (option1)
            {
                case 1:
                    do{
                        System.out.println("\t\t\t Purchase ");
                        System.out.println("\t\t Press 1 for Entry");
                        System.out.println("\t\t Press 2 for View");
                        System.out.println("\t\t Press 3 for Main Menu");

                        System.out.println("Enter Your option:");
                        option2=scanner.nextInt();

                        switch (option2)
                        {
                            case 1:
                                String option3="";
                                do {
                                    System.out.println("\t\t Entry ");
                                    Order vendor=new Order();
                                    vendor.setOrder("Vendor");
                                    vendors.add(vendor);
                                    System.out.println("Do you want to add another Bill ?(Y/N):");
                                    option3=scanner.next();

                                }while(option3.equalsIgnoreCase("Y"));
                                break;
                            case 2:
                                System.out.println("\t\t\t View ");
                                for(Order vendor:vendors)
                                {
                                    vendor.getOrder("Vendor");
                                    System.out.println("-------------------------------------");
                                }
                                break;
                            case 3:
                                System.out.println("Back to Main Menu");
                                break;
                            default:
                                System.out.println("Wrong option selected try again !!!");
                                break;
                        }

                    }while(option2!=3);
                    break;
                case 2:

                    do{
                        System.out.println("\t\t\t Sales ");
                        System.out.println("\t\t Press 1 for Entry");
                        System.out.println("\t\t Press 2 for View");
                        System.out.println("\t\t Press 3 for Main Menu");

                        System.out.println("Enter Your option:");
                        option2=scanner.nextInt();

                        switch (option2)
                        {
                            case 1:
                                String option3="";
                                do {
                                    System.out.println("\t\t Entry ");
                                    Order customer=new Order();
                                    customer.setOrder("Customer");
                                    customers.add(customer);
                                    System.out.println("Do you want to add another Bill ?(Y/N):");
                                    option3=scanner.next();

                                }while(option3.equalsIgnoreCase("Y"));
                                break;
                            case 2:
                                System.out.println("\t\t\t View ");
                                for(Order customer:customers)
                                {
                                    customer.getOrder("Customer");
                                    System.out.println("-------------------------------------");
                                }
                                break;
                            case 3:
                                System.out.println("Back to Main Menu");
                                break;
                            default:
                                System.out.println("Wrong option selected try again !!!");
                                break;
                        }

                    }while(option2!=3);
                    break;
                case 3:
                    System.out.println("you are exited");
                    break;
                default:
                    System.out.println("Wrong option selected try again !!");
                    break;

            }


        }while(option1!=3);

    }
}
