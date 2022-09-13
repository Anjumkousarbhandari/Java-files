class TVTest {
	public static void main (String [] args) {
	String name = new String ("Anjum");
	System.out.println(name);

	String [] features = {"HDR","HighDefinition","SmartTV"};

	TV samsung = new TV("samsung","NeoQled",'B',"smart","LED",features);
	System.out.println(samsung);
	samsung.print();
	}
}