package Loops;
public class forWhileDoWhile {
   public static void main(String[] args) {
//
//        for(int i=11;i<=10;i++){
//            System.out.println(i);
//        }

//        int i = 11;
//        while(i<=10){
//            System.out.println(i);
//            i++;
//        }
//
        int i = 11;
        do{
            System.out.println(i);
            i++;
        } while(i<=10);
    }
}
// For and while loop will not print anything,
// because condition will not(i is initializing with 12)

// do while loop print only 11 because print will occur before increment and condition.

// do while loop is used in the case if we have to print anything but the condition is false.