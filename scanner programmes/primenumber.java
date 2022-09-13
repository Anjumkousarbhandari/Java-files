import java.util.Scanner;
class Primenumber {

	public static void main (String[] args){
	Scanner in = new Scanner (System.in);
	int num, count=0;
	System.out.println ("enter number");
	num=in.nextInt();
	for (int i=1;i<num;i++){
	
	count=0;
	for (int j=1; j<=i;j++){
	if (i%j==0)
	count++;
	}
	if(count==2)

	System.out.print(i+" ");
	
	}
     }
} 

