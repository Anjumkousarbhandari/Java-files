class Calculator {

	String bName;
	char color;
	short price;
	short height;
	boolean isGoodForOperate;
 
	Calculator (String bName,char color,short price,short height,boolean isGoodForOperate) {
 	this.bName = bName;
	this.color = color;
	this.price = price;
	this. height = height;
	this.isGoodForOperate = isGoodForOperate;
}

	static int Multiplication (int a,int b,int c){
	int result = a*b*c;
	return result;
}	
	static int Multiplication(int a,int b){
	int result = a*b;
	return result;	
}
	static double Multiplication(double d, int e){
	double result= d*e;
	return result;
}
	public static void main(String [] args){
	int a = 25;
	int b = 2;
	int c = 5;
	int d = 12;
	int e = 40;
	int output = Calculator.Multiplication(a , b , c);
	int result = Calculator.Multiplication(a , b);
	double sum = Calculator.Multiplication(d ,  e);
	System.out.println(output);
	System.out.println(result);
	System.out.println(sum);

 	}
}