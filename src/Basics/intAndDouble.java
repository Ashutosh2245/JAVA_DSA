package Basics;
public class intAndDouble {
    public static void main(String[] args) {
        System.out.println(5/2); //Int/Int = Int
        System.out.println(5.0/2.0); //Double / Double = Double
        System.out.println(5.0/2); //Double / Int = Double
        System.out.println(5/2.0); //Int / Double = Double
    }
}

//double x = 5;
//double y =2;
//sout(x/y); //It will print 2.5 because double/Double gives Double.

//double x = 5/2;
//sout(x); //It will print 2.0 because first the int/int division happens
//        // Which gives 2 and then that 2 stores in double data type and returns 2.5.