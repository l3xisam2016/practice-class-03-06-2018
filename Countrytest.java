import java.util.Scanner;
public class Countrytest {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Country's Name, Population, and Area");
	
	String nam1=scanner.nextLine();
	int Pop1=scanner.nextInt();
	double A1=scanner.nextDouble();
	
	scanner.nextLine();
	
	String nam2=scanner.nextLine();
	int Pop2=scanner.nextInt();
	double A2=scanner.nextDouble();
	
	Country Country1=new Country(nam1, Pop1,A1); 
	
	Country Country2=new Country(nam2,Pop2,A2);
	
	System.out.println(Country1.Population);
	System.out.println(Country2.Population);
	Country1.ComparePopulation(Pop1, Pop2);
	
	}

}
