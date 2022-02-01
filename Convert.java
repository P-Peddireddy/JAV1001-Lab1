/*
Date" 29 jan 2022

Name: Prathyusha Peddireddy
Student Number: A00245208
*/

/***************************************************************************/
/*Program to convert Centimeters to Meters, Kilometers, Miles and Vice Versa*/
/***************************************************************************/

package metrics;
import java.util.Scanner;
public class Convert {

	public static void main(String[] args) {

		//Define and declare variables for unit conversions
		double centimeter, mtrs, kms, miles;
		final double cmsPerMtr = 100.0;
		final double cmsPerKms = 100000.0;
		final double cmsPerMile = 160934.0;

		//Scanner to read the user input and based on the input IF conditions will be executed
		String input ="";
		Scanner myscannerin = new Scanner(System.in);
		System.out.println("Enter the current unit of measure::");
		input = myscannerin.next();

		//Condition to print Centimeters to Meters
		if(input.equals("CMs_To_Mtrs")) {

			//Code read the input from user
			System.out.println("Enter Centimeters to convert into Meters::");
			centimeter = myscannerin.nextDouble();

			//Logic to convert Centimeter to Meters
			mtrs = centimeter / cmsPerMtr;

			//Print results
			System.out.printf("Centimeters to Meters="+mtrs);
		}
		//Condition to print Centimeters to KMs
		else if(input.equals("CMs_To_KMs")){

			//Code read the input from user
			System.out.println("Enter Centimeters to convert into Kilometers::");
			centimeter = myscannerin.nextDouble();

			//Logic to convert Centimeter to Meters
			kms = centimeter / cmsPerKms;

			//Print results
			System.out.printf("Centimeters to KMs="+kms);
		}
		//Condition to print Centimeters to Miles
		else if(input.equals("CMs_To_Miles")) {
			//Code read the input from user
			System.out.println("Enter Centimeters to convert into Miles::");
			centimeter = myscannerin.nextDouble();

			//Logic to convert Centimeter to Meters
			miles = centimeter / cmsPerMile;

			//Print results
			System.out.printf("Centimeters to Miles="+miles);
		}
		//Condition to print Meters to Centimeters
		else if(input.equals("Meters_To_CMs")) {
			//Code read the input from user
			System.out.println("Enter Meters to convert into Centimeters::");
			centimeter = myscannerin.nextDouble();

			//Logic to convert Meters to Centimeters
			mtrs = centimeter*cmsPerMtr;

			//Print results
			System.out.printf("Meters to Centimeters="+mtrs);
		}
		//Condition to print Kilometers to Centimeters
		else if(input.equals("KMs_To_CMs")) {
			//Code read the input from user
			System.out.println("Enter Kilometers to convert into Centimeters::");
			centimeter = myscannerin.nextDouble();

			//Logic to convert Kilometers to Centimeters
			kms = centimeter*cmsPerKms;

			//Print results
			System.out.printf("Kilometers to Centimeters="+kms);
		}
		//Condition to print Miles to Centimeters
		else if(input.equals("Miles_To_CMs")) {
			//Code read the input from user
			System.out.println("Enter Miles to convert into Centimeters::");
			centimeter = myscannerin.nextDouble();

			//Logic to convert Miles to Centimeters
			miles = centimeter*cmsPerMile;

			//Print results
			System.out.printf("Miles to Centimeters="+miles);
		}
		else {
			System.out.printf("We are completed everything here!!!");
		}
	}
}
