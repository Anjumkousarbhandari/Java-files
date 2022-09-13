import java.util.Scanner;
class Factorial {

	public static void main (String[] args){
	Scanner in = new Scanner (System.in);
	int i, factor=1;
 	int num;

	System.out.println ("enter");
	num=in.nextInt();

	for (i=1;i<num;i++){
	factor = factor*i;

	}
	System.out.println("factorial of 5 "+num+"is "+factor);
	
     }
} 