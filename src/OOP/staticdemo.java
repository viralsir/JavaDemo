package OOP;

public class staticdemo
{
    static  int no=0;

     int no2=0;
    static void view()
    {
        System.out.println(no);
    }
    static
    {
        System.out.println("print ");
        System.out.println(no);
      //  System.out.println(no2);
    }


    public static void main(String[] args)
    {

        staticdemo s1=new staticdemo();
        staticdemo s2=new staticdemo();

        System.out.println("inside main ");


//        staticdemo s1=new staticdemo();
//        staticdemo s2=new staticdemo();
//        s2.no=45;
//        s1.no=34;
//        s2.no=555;
//
//        System.out.println(s1.no);
//        System.out.println(s2.no);
//        System.out.println(staticdemo.no);
//        System.out.println(no);
//        view();
        //System.out.println(no2);


    }
}
