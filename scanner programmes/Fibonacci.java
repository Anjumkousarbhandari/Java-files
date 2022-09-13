import java.util.Scanner;
class Fibonacci {

	public static void main (String[] args){
	Scanner in = new Scanner (System.in);
	int a=0,b=1, c=0,no;
	System.out.println ("enter");
	no=in.nextInt();
	for (int i=1;i<no;i++){
	System.out.print(c+" ");
	a=b;
	b=c;
	c=a+b;
	}
     }
} 

