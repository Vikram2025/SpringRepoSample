package in.vikram.test;

import java.util.Date;

import in.vikram.comp.WishMessageGenerator;

public class UsingCoreJavaInjectionSetter {

	public static void main(String[] args) {
		//Creating  a Object of the class  
		WishMessageGenerator WMG=new WishMessageGenerator();
		
		//Creating Object of The Date to set in Using SetterInjection
		Date date = new Date();
		
           WMG.setDate(date);
           System.out.println(WMG);
           //Check the Date and Execute The Method 
           String Result= WMG.generateMessage("Vikram");
           
           System.out.println(Result);
	}

}
