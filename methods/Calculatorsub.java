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

	static int substraction (int a,int b,int c){
	int result = a-b-c;
	return result;
}	
	static int substraction (int a,int b){
	int result = a-b;
	return result;	
}
	static double substraction (double d, int e){
	double result= d-e;
	return result;
}
	public static void main(String [] args){
	int a = 500;
	int b = 250;
	int c = 50;
	int d = 120;
	int e = 40;
	int output = Calculator.substraction(a , b , c);
	int result = Calculator.substraction(a , b);
	double sum = Calculator.substraction(d ,  e);
	System.out.println(output);
	System.out.println(result);
	System.out.println(sum);

 	}
}