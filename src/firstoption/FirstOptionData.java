package firstoption;



public class FirstOptionData
{
     private int pr=34;
     protected int pro=34;
     int d=34;
     public int no=34;

     /*public void setdata()
     {

     }*/

    public static void main(String[] args)
    {
        FirstOptionData firstOptionData=new FirstOptionData();

        System.out.println("private int :"+firstOptionData.pr);
        System.out.println("proctected int :"+firstOptionData.pro);
        System.out.println("default int d:"+firstOptionData.d);
        System.out.println("public int  no:"+firstOptionData.no);
    }


}
class SecondOptionDemo  //extends FirstOptionData
{
    public static void main(String[] args)
    {
        FirstOptionData firstOptionData=new FirstOptionData();
        //SecondOptionDemo firstOptionData=new SecondOptionDemo();

       // System.out.println("private int :"+firstOptionData.pr);
        System.out.println("proctected int :"+firstOptionData.pro);
        System.out.println("default int d:"+firstOptionData.d);
        System.out.println("public int  no:"+firstOptionData.no);
    }
}
