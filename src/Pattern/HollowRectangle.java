package Pattern;
public class HollowRectangle {
    public static void main(String[] args) {
        for(int i = 0;i<4;i++){
            for (int j = 0; j < 5; j++) {
                if((i<=2 && i>=1) && (j<=3 && j>=1)){
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
