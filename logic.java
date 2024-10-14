import java.util.Scanner;
public class logic {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a, b;
        while(true){
            System.out.println("Note: Please answer only 1/2");
            System.out.println("1. yes");
            System.out.println("2. no");
            System.out.print("Do you like her? ");
            a = in.nextInt(); 
            while(a<=2&&a>=1){
                System.out.println();
                System.out.print("Does she like me? ");
                b = in.nextInt();
                while(b<=2&&b>=1){
                    System.out.println();
                    if(a<1 && b>1){
                        System.out.println("jangan terlalu berharap");
                    }else{
                        System.out.println("bangun bro");
                    }
                    return;
                }
                return;
            }
        }
    }
}
