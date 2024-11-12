/**

 * Program to practice overloading,constants and or enums.

 *

 * @author Anthony Chipner

 * @version February 17, 2022

 */
package mini06;
import java.util.Scanner;
public class Flooring {
     /**
     * main - Program to practice overloading,constants and or enums.
     * 
     * @param       args command line arguments
     * @return      N/A
     */
    enum Type{ SQUARE, RECTANGLE, TRIANGLE}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double area;
        int type;
        double tiles;
        double total = 0.00;
        System.out.print("Floor Area? ");
        System.out.println();
        area = input.nextDouble();
        System.out.print("Tile Type (1-square, 2=rectangle, 3=triangle)? ");
        System.out.println();
        type = input.nextInt();
        
        switch(decide(type)){
            case SQUARE:
                double side;
                System.out.print("Side? ");
                System.out.println();
                side = input.nextDouble();
                System.out.printf("Area Per tile is %.2f square feet", calcAreaInTile(side, total));
                System.out.println();
                tiles = area / calcAreaInTile(side, total);
                System.out.printf("Num tiles is %.0f", tiles);
                break;
            case RECTANGLE:
                double length;
                double width;
                System.out.print("Length Width? ");
                System.out.println();
                length = input.nextDouble();
                System.out.println();
                width = input.nextDouble();
                System.out.printf("Area Per tile is %.2f square feet", calcAreaInTile(length, width, total));
                System.out.println();
                tiles = area / calcAreaInTile(length, width, total);
                System.out.printf("Num tiles is %.0f", tiles);
                break;
            case TRIANGLE:
                double leg1;
                double leg2;
                double hypot;
                System.out.print("Leg Leg Hypot? ");
                System.out.println();
                leg1 = input.nextDouble();
                System.out.println();
                leg2 = input.nextDouble();
                System.out.println();
                hypot = input.nextDouble();
                System.out.printf("Area Per tile is %.2f square feet",calcAreaInTile(leg1, leg2, hypot, total));
                System.out.println();
                tiles = area / calcAreaInTile(leg1, leg2, hypot, total);
                System.out.printf("Num tiles is %.0f", tiles);
                break;
        }
}
    public static Type decide(int type){
        if (type == 1) {
            return Type.SQUARE;
        } else if (type == 2){
            return Type.RECTANGLE;
        }
        return Type.TRIANGLE;
    }
    public static double calcAreaInTile(double side, double total){
        total = Math.pow(side,2);
        return total;
    }
    public static double calcAreaInTile(double length, double width, double total){
        total = (length * width);
        return total;
    }
    public static double calcAreaInTile(double leg1, double leg2, double hypot, double total){
        double tempLeg1 = Math.pow(leg1, 2);
        double tempLeg2 = Math.pow(leg2, 2);
        hypot = Math.pow(hypot, 2);
        if (hypot == tempLeg1 + tempLeg2){
            total = .5 * leg1 * leg2;
        }
        return total;
    }
    
}
