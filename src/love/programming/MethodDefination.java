package love.programming;

public class MethodDefination {

    public static void main(String[] args) {

        int result1;

        MethodDefination myMethodDefination= new MethodDefination();

        result1=myMethodDefination.mySum(1,2);

        System.out.println("Sum of two Digits :" +result1);



        int result2;


        result2=myMethodDefination.mySum(1,2,3);

        System.out.println("Sum of Three  Digits :" +result2);

        String result3;


        result3=myMethodDefination.mySum(1,2,3,"Raghav");

        System.out.println("Sum of Three  Digits and Character  :" +result3);


    }


    public int mySum(int a, int b) {

        return a+b;


    }

    public int mySum(int a, int b,int c) {

        return a+b+c;


    }

    public String mySum(int a, int b,int c, String name) {

        return a+b+c+name;


    }


}
