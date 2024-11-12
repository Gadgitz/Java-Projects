
package recursion.example;
public class RecursionExample {
    public static void main(String[] args) {
        countingRecursion(3);
    }
    private static void countingRecursion(int count){
        System.out.println(" Hello, this is a recursion");
        if (count <= 1){
            return;
        }
        countingRecursion(count - 1);
    }
        }
    
