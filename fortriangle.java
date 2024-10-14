import java.util.Scanner;
public class fortriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("====================");
        System.out.println("'For' Logic Triangle");
        System.out.println("====================");

        int height, a, b;

        System.out.print("Input the height of triangle: ");
        height = input.nextInt();

        for(a=1 ; a<=height ; a++){
            for(b=1 ; b<=a ; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}