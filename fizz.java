public class fizz {
    public static void fizz(int n){
        int i = 1;
        while(i<=n){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("Fizz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
            i++;
        }
    }
    public static void main(String[] args){
        fizz(15);
    }
}
