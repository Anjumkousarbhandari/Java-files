class Satellite {

	String satelliteName;
	String inventer;
	String type; 
	String reflects; 
	String material;
	



	Satellite (String satelliteName){
	this.satelliteName = satelliteName;
	}
	
	Satellite(String satelliteName ,String inventer,String type,String reflects,String material){
	this.satelliteName = satelliteName;
	this.inventer = inventer;
	this.type = type;
	this.reflects = reflects;
	this.material = material;
	
	}

	void print () {
	System.out.println(satelliteName + "\t" +inventer+ "\t" +type+"\t" +reflects+"\t"+material+"\t");
	System.out.println();
	}
}