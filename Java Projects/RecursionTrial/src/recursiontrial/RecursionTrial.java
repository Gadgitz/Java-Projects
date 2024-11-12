package recursiontrial;
import java.util.Scanner;
public class RecursionTrial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an Integer");
        int m = input.nextInt();
        System.out.println("Please enter an Integer");
        int n = input.nextInt();
        euclid(m,n);
    }
    private static void euclid(int m,int n){
        if(m>0){
            euclid(n%m,m);
            return;
        } else{
            System.out.print(n);
            return;
        }
        
    }
    
}
