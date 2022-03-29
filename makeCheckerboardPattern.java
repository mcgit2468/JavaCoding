
/** This program prints a checkerboard pattern using the asterisk symbol (*) using
  * rows and columns sizes are given by the user
**/
import java.util.*; //Import it to use the Scanner class

public class makeCheckerboardPattern{
   public static void checkerboard(int row, int col){
       for(int i = 1; i<=row; i++){
	       if(i%2 ==0) {
		   System.out.print("  "); //Start with space on every other row
	       }
		for(int j=1; j<=col; j++) {
		    System.out.print(" * ");
		}
		System.out.println();
	}
  }

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter row size");
      int rowSize = input.nextInt();
      System.out.println("Please enter columnSize");
      int colSize = input.nextInt();
      System.out.println("Here is the checkerboard pattern\n");
      //makeCheckerboardPattern(rowSize, colSize); //call the method
   }
}
