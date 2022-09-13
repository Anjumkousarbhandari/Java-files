class Earphone {

	String brandName;
	String modelName;
	char color;
	short price;
	String sensor;
	String owner; 



Earphone (String brandName){
	this.brandName = brandName;
	}
	
	Earphone(String brandName,String modelName,char color,short price,String sensor,String owner){
	this.brandName = brandName;
	this.modelName = modelName;
	this.color = color;
	this.price = price;
	this.sensor = sensor;
	this.owner = owner;
	}

	void print () {
	System.out.println(brandName+ "\t" +modelName+ "\t" +color+"\t" +price+"\t"+sensor+"\t"+owner);
	System.out.println();
	}
}