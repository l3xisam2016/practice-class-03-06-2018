
public class Country {

	String Name;
	int Population;
	double Area;
	
	
	public Country(String Name2, int Population2, double Area2) {
		
		Name=Name2;
		Population= Population2;
		Area=Area2;
	}
public void ComparePopulation(double a, double b) {
	if(a > b) {
		System.out.println(a);
		
	}else {
		System.out.println(b);
	}
	
	
}
}
