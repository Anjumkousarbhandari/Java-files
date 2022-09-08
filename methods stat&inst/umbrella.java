class Umbrella{

	int height;
	char color;
	String brandName;
	short price;
	
	Umbrella () {
		System.out.println ("it protect us from rain and sunlight");
}

	 void helpsInRain (){
	System.out.println ("it is a pink color");

	}
	public static void main(String [] args){
	Umbrella umbrella = new Umbrella ();
  	umbrella.helpsInRain();
}
}