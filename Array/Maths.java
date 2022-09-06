class Mathematics {
	public static void main(String[]args) {
	int [] digits = { 1, 8, 14, 15, 18, 20, 14, 9, 29, 26, 13, 7 };
	System.out.println( "size of the array" +digits.length );
	for ( int No = 0; No < digits.length; No++ ) {
         if (digits [No] % 2 ==0 ){
	System.out.println( digits [No] + "is even number");

	}else {
		System.out.println( digits [No] + "is odd number"); 
		}
	 
	    }
	 
	}
}
