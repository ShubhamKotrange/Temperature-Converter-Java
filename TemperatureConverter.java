import java.util.Scanner;
class TemperatureConverter
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" *****Temperature Converter *****");
		System.out.println();
		System.out.print("Eneter the Temperature in °C : ");
		float cel=sc.nextFloat();
		System.out.println();
		System.out.println("1.kelvin 2.Fahrenhiet 3.Rankine 4.Reaumur");
		System.out.print("Enter your option:");
		int option=sc.nextInt();

		if (option==1)
		{
			float kelvin=cel+273.15f;
			System.out.println("Celcious" + "=" +kelvin + "K" );
		}
		elseif (option==2)
		{
			float fah=cel*(9/5f) + 32f;
			System.out.println("Celcious" + "=" +fah + "F    " );
		}
		elseif (option==3)
		{
			float rankine=cel*(9/5f) + 491.67f;
			System.out.println("Celcious" + "=" +rankine + "R" );
		}
		elseif (option==4)
		{
			float reaumur=cel* 4/5f;
			System.out.println("Celcious " +  cel  + "=" +reaumur + "Re" );
		}
		else{
			System.out.println("Wrong option Entered");
		}
	}
}
