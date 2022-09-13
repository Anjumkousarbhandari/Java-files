class TV {

	String brandName;
	String modelName;
	char color;
	String typeOfTV;
	String screen;
	String [] features;
	 



	TV (String brandName){
	this.brandName = brandName;
	}
	
	TV(String brandName,String modelName,char color,String typeOfTV,String screen,String [] features){
	this.brandName = brandName;
	this.modelName = modelName;
	this.color = color;
	this.typeOfTV = typeOfTV;
	this.screen = screen;
	this. features = features;

	}

	void print () {
	System.out.println(brandName+ "\t" +modelName+ "\t" +color+"\t" +typeOfTV+"\t"+screen+"\t");
	if (features != null){
	       for (int i=0;i<features.length; i++){
		System.out.print(features[i]+"\t");
	}
	System.out.println();
	}
}
}