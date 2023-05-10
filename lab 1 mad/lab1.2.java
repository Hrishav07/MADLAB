/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    for (int i=1;i<=5;i++){
	        for(int j=5;j>=i;j--){
	             System.out.println(" ");
	        }
	        for(int j=1;j<=i;j++){
	            System.out.println("* ");
	        }
	        System.out.println();
	    }
	        
	}
}
