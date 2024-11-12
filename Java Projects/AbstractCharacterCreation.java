// Program: CharacterCreation.java
// Programmer: Anthony Chipner
// Purpose: Demonstrate Polymorphic Arrays.
package abstractcharactercreation; // begin package
public class AbstractCharacterCreation { // begin main class.
    public static void main(String[] args) { // begin main method.
        Character myCharacter [] = new Character[5];
        
        myCharacter [0] = new Header();
        myCharacter [1] = new BodyType();
        myCharacter [2] = new SkinColor();
        myCharacter [3] = new EyeColor();
        myCharacter [4] = new HairColor();
        
        for(Character x: myCharacter){
            x.customize();
        }
    }
    
}
