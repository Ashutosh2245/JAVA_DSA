package Basics;
public class hierarchyOfOperators {
    public static void main(String[] args) {
        int a,b,c,d;
        a = 2+3-4; //o/p = 1
        b = 2*3/4; //o/p = 1
        c = 2+3*4; //o/p = 14
        d = 2-8/4; //o/p = 0
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
//Bracket > {Div(/) , Mul(*)} > {Add,Sub}
//If two operators of same precedence is occurred then move left to right.