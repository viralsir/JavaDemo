package firstoption;

public class FourthOptionDemo //extends FirstOptionData
{
    public static void main(String[] args)
    {
        FirstOptionData firstOptionData=new FirstOptionData();
        //FourthOptionDemo firstOptionData=new FourthOptionDemo();

       // System.out.println("private int :"+firstOptionData.pr);
        System.out.println("proctected int :"+firstOptionData.pro);
        System.out.println("default int d:"+firstOptionData.d);
        System.out.println("public int  no:"+firstOptionData.no);
    }

}
