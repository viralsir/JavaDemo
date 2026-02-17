import java.util.ArrayList;

public class CollectionClassDemo {


    public static void main(String[] args) {

        ArrayList studentlist=new ArrayList();


//        studentlist.add(12);
//        studentlist.add(34.33);
//        studentlist.add("vimal");
//
//
//        int total=(int) studentlist.get(0)+12;
//
//        System.out.println(studentlist.get(0));
//        System.out.println(studentlist.get(1));

        ArrayList<Integer> maths=new ArrayList<Integer>();

        maths.add(23);
        maths.add(33);
        maths.add(55);

        ArrayList<Integer> science=new ArrayList<Integer>();

        science.add(23);
        science.add(33);
        science.add(55);

        int total=maths.get(0)+ maths.get(1);

//        for (int i = 0; i < maths.size(); i++) {
//            System.out.println(maths.get(i));
//
//        }
        for(int value:maths )
        {
            System.out.println(value);
        }



    }

}
