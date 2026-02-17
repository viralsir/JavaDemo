package OOP;
/*
    function overloading
 */

public class functionoverloadingdemo
{
    // member function
    int total(int no1,int no2)
    {
       return no1+no2;
    }


    int total(int no1,int no2,int no3){
        return no1+no2+no3;
    }

    public static void main(String[] args)
    {
        functionoverloadingdemo fno=new functionoverloadingdemo();
        //System.out.println(fno.total(23));
        System.out.println(fno.total(23,23));
        System.out.println(fno.total(23,33,44));


    }
}
