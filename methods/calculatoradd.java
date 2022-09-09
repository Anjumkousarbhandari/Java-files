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

	static int addition (int a,int b,int c){
	int sum = a+b+c;
	return sum;
}	
	static int addition (int a,int b){
	int sum = a+b;
	return sum;	
}
	static double addition (double d, int e){
	double sum = d+e;
	return sum;
}
	public static void main(String [] args){
	int a = 100;
	int b = 150;
	int c = 50;
	int d = 120;
	int e = 40;
	int output = Calculator.addition(a , b , c);
	int result = Calculator.addition(a , b);
	double sum = Calculator.addition(d ,  e);
	System.out.println(output);
	System.out.println(result);
	System.out.println(sum);

 	}
}