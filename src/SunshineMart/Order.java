package SunshineMart;

import java.util.ArrayList;
import java.util.Scanner;

/*
          Order vendor=new Order();
          Order customer=new Order();
 */


public class Order extends Personal
{

    int billno;
    String billdate;

    ArrayList<Product> products=new ArrayList<>();
    float totalamount,discount,GST,billamount;

    void setOrder(String title)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter Bill No:");
        billno=scanner.nextInt();
        System.out.println("Enter Bill Date:");
        billdate=scanner.next();

        setPersonal(title);
        String option="";
        do {
            Product product=new Product();
            product.setProduct();
            totalamount = totalamount+ product.getPrice();
            products.add(product);
            System.out.print("Do you want to add another Product ?(Y/N):");
            option=scanner.next();

        }while(option.equalsIgnoreCase("y"));

        System.out.print("Enter Discount(%):");
        discount=scanner.nextFloat();
        discount=(totalamount*discount)/100;
        System.out.print("Enter GST(%):");
        GST=scanner.nextFloat();
        GST=(GST*totalamount)/100;

        billamount=totalamount-discount+GST;

    }

    void getOrder(String title)
    {
        System.out.println("Bill No:"+billno);
        System.out.println("Bill Date:"+billdate);

        getPersonal(title);

        System.out.println("ID \t Name \t Qty \t Rate \t Price ");
        System.out.println("=======================================");

        for (Product product:products)
        {
            product.getProduct();
        }

        System.out.println("Total Amount: "+totalamount);
        System.out.println("Discount :"+discount);
        System.out.println("GST :"+GST);
        System.out.println("Bill Amount :"+billamount);


    }


}
