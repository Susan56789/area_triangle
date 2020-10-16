import java.util.Scanner;
public class AreaTriangle {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);

System.out.println("Enter the width of the triangle: ");
double base = scanner.nextDouble();
System.out.println("Enter the height of the triangle: ");
double height = scanner.nextDouble();

//Area= (width*height)/2
double Area= (base*height)/2;

System.out.println("Area of triangle of width " + base +" and height "+ height +" is "+ Area);
	}

}
