// Project 4 5.21
// Author: Anthony Chipner
// Date: 09/13/18
public class PythagoreanTriple {
	
	

	public static void main(String[] args) {
		
		
	for (int sideOne = 1; sideOne <= 500; ++sideOne) { // Side 1 of Triangle
			
	
		
		for (int sideTwo = 1; sideTwo <= 500; ++sideTwo){ // Side 2 of Triangle
			
		
		
		for (int sideThree = 1; sideThree <= 500; ++sideThree) { // Side 3 = Hypotenuse
			
		
		boolean resultOne;
		if (resultOne = Math.pow(sideOne, 2) + Math.pow(sideTwo, 2) == Math.pow(sideThree, 2)){
			System.out.println("Test One Results:");
			System.out.printf("%-20s  %s%n", "Pythagorean Triple", "Side One,Two & Hypotenuse Results");
			System.out.printf("%-25b  %d    %d    %d%n", resultOne, sideOne, sideTwo, sideThree);
		}
		
		
		
		boolean resultTwo;
		if (resultTwo = Math.pow(sideThree, 2) + Math.pow(sideOne, 2) == Math.pow(sideTwo, 2)){
			System.out.println("Test Two Results:");
			System.out.printf("%-20s  %s%n", "Pythagorean Triple", "Side One,Two & Hypotenuse Results");
			System.out.printf("%-25b  %d    %d    %d%n", resultOne, sideOne, sideTwo, sideThree);
		}
		
		boolean resultThree;
		if (resultThree = Math.pow(sideTwo, 2) + Math.pow(sideThree, 2) == Math.pow(sideOne, 2)){
			System.out.println("Test Three Results:");
			System.out.printf("%-20s  %s%n", "Pythagorean Triple", "Side One,Two & Hypotenuse Results");
			System.out.printf("%-25b  %d    %d    %d%n", resultOne, sideOne, sideTwo, sideThree);
		}
			
			
			}
	
		
		}
		
	}

}
}