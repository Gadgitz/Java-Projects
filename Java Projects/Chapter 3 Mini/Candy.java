/**

 * Program to create a Candy Object and test its various methods.

 *

 * @author Anthony Chipner

 * @version January 27, 2022

 */
package mini03;

public class Candy {
    private String name;
    private Double price;
    private int quantity;
    private Double Cost;
    
    Candy(String name, Double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getname() {
        return name;
    }
    
    public void setname(String name) {
        this.name = name;
    }
    public Double getprice(){
        return price;
    }
    
    public void setprice(Double price) {
        this.price = price;
    }
    
    public int getquanity() {
        return quantity;
    }
    public void setquanity(int quanity) {
        this.quantity = quanity;
        if(quanity < 0) {
            System.out.print("Sorry no negative quantities -- setting to 1");
            this.quantity = 1;
        }
    }
    
    public Double getCost(){
        return Cost = price * quantity;
    }
     public void display(){
        System.out.printf("%s - %d at %.2f", name, quantity, price);
    }
}
