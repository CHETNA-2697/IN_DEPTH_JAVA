package carPriceEstimatorApplication;
import java.time.LocalDate;

public class CarPriceEstimator {
	public double getSalePrice(String makeAndModel, int yearManufactured, double milesDriven, int airBagsCount, 
			boolean hasAbs, boolean hasEbd, boolean hasRearViewCamera, boolean hasSunRoof, boolean hasAutoAC,
			boolean hasAccidentHistory)
	{
		double salePrice=getPrice(makeAndModel, yearManufactured);
		int currentYear=LocalDate.now().getYear();
		int ageOfCar = currentYear - yearManufactured + 1;
		System.out.println("AGE OF CAR :: "+ageOfCar);
		//Computer depriciation
		if(ageOfCar<=10)
		{
			//double dep= salePrice-(salePrice*95)/100;
		    //double depriciationAmout= salePrice- ageOfCar*dep;
		   // System.out.println("DEPRICIATION AMOUNT :: "+depriciationAmout);
		    //salePrice=salePrice-depriciationAmout;
			salePrice = salePrice -(ageOfCar * ( 0.05 * salePrice));

		}
		else {
			salePrice*=0.1;
		}
		System.out.println("Sale Price after Depriciation :: "+salePrice);
//Security Features
		if(!(airBagsCount>=2 && hasAbs && hasEbd))
		{
			salePrice-=1000;
		}
		System.out.println("salePrice after accounting for security features :: " + salePrice);
//Comfort Features

	if(hasRearViewCamera && (hasSunRoof || hasAutoAC)) {
		salePrice+=500;
	}
	System.out.println("salePrice after accounting for comfort features :: " + salePrice);
	
//Past accidents
	if(hasAccidentHistory) {
		salePrice-=500;
	}
	System.out.println("salePrice after accounting for past accidents :: " + salePrice);
	
//Based on additional miles driven
	double expectedMilesDriven=ageOfCar*10000.0; //averageMilesDrivenInAYear
	double additionalMilesDriven =  milesDriven-expectedMilesDriven;
	if(additionalMilesDriven>1000 && milesDriven<=10000) {
		salePrice-=500;
	}
	else if(additionalMilesDriven>10000 && additionalMilesDriven<30000){
		salePrice-=1000;
	}
	else if(additionalMilesDriven>30000)
	{
		salePrice-=1500;

	}
	System.out.println("salePrice after accounting for miles driven :: " + salePrice);
	System.out.println("FINAL SALE PRICE :: "+salePrice);
	return salePrice;
	}
	private double getPrice(String makeAndModel, int yearManufactured) {
		if (makeAndModel.equalsIgnoreCase("ford ecosport")) {
			return 20000.0;
		} else if (makeAndModel.equalsIgnoreCase("honda city")) {
			return 25000.0;
		} else if (makeAndModel.equalsIgnoreCase("toyota camry hybrid")) {
			return 30000.0;
		}
		return 20000.0;
	}

public static void main(String args[]) {
	CarPriceEstimator c1=new CarPriceEstimator();
	 c1.getSalePrice("ford ecosport", 2018, 60000.0, 2, true,false, true, false, false, true);
	
	
}
}



























