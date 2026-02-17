package SunshineMart;

import java.util.ArrayList;
import java.util.Scanner;

public class Vendor extends Personal
{

    int billno;
    String billdate;

    ArrayList<Product> products=new ArrayList<>();
    float totalamount,discount,GST,billamount;

    void setVendor()
    {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter Bill No:");
        billno=scanner.nextInt();
        System.out.println("Enter Bill Date:");
        billdate=scanner.next();

        setPersonal("Vendor");
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

    void getVendor()
    {
        System.out.println("Bill No:"+billno);
        System.out.println("Bill Date:"+billdate);

        getPersonal("Vendor");

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
