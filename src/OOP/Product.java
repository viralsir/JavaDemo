package OOP;
/*
    Constructor :  is a special function which is being used to intialize the member variable
              constructor name and class name should be same.
              it is by default called when the object of the same class is created.
              it does not have any return type.

    POJO : PLAIN OLD JAVA OBJECT

    polmorphisam : same name with multiple use.

        constructor overloading
 */

import java.util.Scanner;

public class Product
{
      int id=20;
      String name;
      int qty;
      float rate;
      private  float price;
      float discount=0.0f;

    public Product() {
    }

    public Product(float discount) {
        this.discount = discount;
    }

    public Product(int id, String name, int qty) {
        this.id = id;
        this.name = name;
        this.qty = qty;
    }
    // DEFAULT CONSTRUCTOR OR NON PRAMATERISE CONSTRUCTOR
//      Product()
//      {
//          id=10;
//          qty=0;
//          rate=0.0f;
//          price=0.0f;
//          name="";
//          discount=0.0f;
//          System.out.println("Product() is called");
//      }
//    Product(float discount)
//    {
//        id=10;
//        qty=0;
//        rate=0.0f;
//        price=0.0f;
//        name="";
//        this.discount=discount;
//        System.out.println("Product(discount) is called");
//
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }



        void Entry()
        {
            Scanner scanner=new Scanner(System.in);

            System.out.println("Enter Product Id:");
            setId(scanner.nextInt());
            System.out.println("Enter Product Name:");
            setName(scanner.next());
            System.out.println("Enter Product Qty:");
            setQty(scanner.nextInt());
            System.out.println("Enter Product Rate:");
            setRate(scanner.nextFloat());
            setPrice(rate*qty);

        }

        void view()
        {
            System.out.println("Product Id:"+ getId());
            System.out.println("Product Name:"+ getName());
            System.out.println("Product Qty :"+ getQty());
            System.out.println("Product Rate :"+ getRate());
            System.out.println("Product Price :"+ getPrice());
        }




    public static void main(String[] args)
    {

//        Product product1=new Product();
//        Product product2=new Product(23.33f);

//        System.out.println(product1.discount);
//        System.out.println(product2.discount);

        Product product=new Product();
        product.Entry();
        product.view();





    }



}
