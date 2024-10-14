import java.io.*;
import java.util.*;

public class Solution {
    public static int solveMeFirst(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        System.out.print("Input a = ");
        int a = in.nextInt();
        System.out.print("Input b = ");
        int b = in.nextInt();
        System.out.println("Result = " + solveMeFirst(a, b));
    }
}
