import java.util.Scanner;
public class whiletriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("'While' Logic Triangle");
        System.out.println("======================");

        int height, a, b;

        System.out.print("Input the height of triangle: ");
        height = input.nextInt();

        a = 1;
        while(a<=height){
            b = 1;
            while(b<=a){
                System.out.print("*");
                b++;
            }
            System.out.println();
            a++;
        }
    }
}
