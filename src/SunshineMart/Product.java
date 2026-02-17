package SunshineMart;

import java.util.Scanner;

public class Product
{
    int id;
    String name;
    int qty;
    float rate;
    float price;

    void setProduct()
    {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter Product Id:");
        setId(scanner.nextInt());
        System.out.print("Enter Product Name:");
        setName(scanner.next());
        System.out.print("Enter Product Qty :");
        setQty(scanner.nextInt());
        System.out.print("Enter Product Rate :");
        setRate(scanner.nextFloat());
        setPrice(getQty()*getRate());


    }

    void getProduct()
    {
        System.out.println(getId()+"\t"+getName()+"\t"+getQty()+"\t"+getRate()+"\t"+getPrice());
    }




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
}
