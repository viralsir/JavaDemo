/*
      Class is a bunch of related data

      object is a unique medium to access or get the data which are binds together in a ref class


      class   is  collection of member variable and function

      class is a Abstract data type  or User Define Data type

      int no;
      int no[5]
      student(int rollno,char name,float avg,int total)  student1,student2

      class is a blueprint               every object is a copy of that blueprint

      variable which declared inside a class is called member variable
      function which declared inside a class is called member function

      every object is create a unique copy of all the member variable

      syntax of object is
      classname  refvariable = new classname();
                                ------------
                                object
                              0 ,"",0.0

       class
       {

              data

              beheviour proccess
             }

    function : is a subprogram which help the main program to get the output.
    function accept argument and return the value


     function accept argument and return value
     function acceprt argument and does not return value
     function does not accept argument and will return value
     function does not accept argument and does not return value

  syntax :
       defination
         return type functioname(argu1,argu2,---,argu3)
         {
                statement;
                return statement;
               }

        call
                functionname(parameter1,parameter2,----,parameterN)



 */
public class ObjectDemo
{
    // member variable
    int no;


    public static void main(String[] args) {

        ObjectDemo obj1=new ObjectDemo();
        ObjectDemo obj2=new ObjectDemo();
        ObjectDemo obj3=obj1;
        ObjectDemo obj4=obj2;
        obj1.no=23;
        obj1=obj2;
        obj2.no=45;
        obj3=obj4;
        System.out.println(obj3.no);
    }


}
