/*
       datatype : type of data

       category of data type
       1) Primary Data type or inbuilt data type
       2) Derived Data type
       3) Abstract Data type


       1) Primary Data type or buit in data type


 keyword                             use                            byte                              range
 boolean                    true/false                          jvm                                 jvm
 byte                       numeric value                      1                                    -128 to 127
 short                      numeric value                       1                                      -128 to 127
 char                       single character                    2                                       -32768 to 32767
 String                     *multiple character                 2                                       -32768 to 32767
 int                        numeric value                       4
 long                       numeric value                       8
 float                      floating value                      8
 double                     real value                          16



 signed  and unsigned

  int

variable : is a name of  memory location where data is being stored.

naming rules of variable
1) first character must be alphabet or underscore
2) space , keyword and symbol are not allowed.

Asignment Operator -> =   -> it will copy the value from right to left.


 */


public class datatypedemo {

    public static void main(String[] args)
    {
             // declaration of variable
            // initialization of variable
            boolean mybol=true;
            byte y;
            char c='c';
            String msg="vimal";
            int myint=34;
            float myfl=4545.45f;
            double mydouble=454545.454;

            y=34;
            //myint=y;                        implicit type conversion
            y=(byte)myint;                  // explict type conversion

        System.out.println("boolean mybol :" +  mybol);
        System.out.println("Byte y:"+y);
        System.out.println("char c:"+c);
        System.out.println("String msg:"+msg);
        System.out.println("int myint :"+myint);
        System.out.println("float myfl :"+myfl);
        System.out.println("doule mydouble:"+mydouble);




    }


}
