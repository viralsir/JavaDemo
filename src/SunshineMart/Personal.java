package SunshineMart;

import java.util.Scanner;

public class Personal
{
    int id;
    String name;
    String Address;
    String Phno;


    void setPersonal(String title){

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter "+title +" id:");
        setId(scanner.nextInt());
        System.out.print("Enter "+title+" Name:");
        setName(scanner.next());
        System.out.print("Enter "+title+" Address:");
        setAddress(scanner.next());
        System.out.print("Enter "+title+" Phno:");
        setPhno(scanner.next());


    }

    void getPersonal(String title)
    {
        System.out.println(title+" Id:"+getId());
        System.out.println(title+" Name:"+getName());
        System.out.println(title+" Address:"+getAddress());
        System.out.println(title+" Phno:"+getPhno());

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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhno() {
        return Phno;
    }

    public void setPhno(String phno) {
        Phno = phno;
    }
}
