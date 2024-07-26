package loops;
import java.util.Scanner;
public class Family {

	public static void main(String[] args) {
//		String agef = args[0];
//        int age = Integer.parseInt(agef);
		
		int bebek=0;
		int cocuk=0;
		int ergen=0;
		int genc=0;
		int ortaYasli=0;
		int yasli=0;
		
		// Bir ailede kaç kişinin olduğunu bilmediğimiz için while döngüsü kullanıyoruz ki kullanıcı istediği kadar sayı girebilsin
		boolean flag=true;
		while(flag) {
			
			Scanner s = new Scanner(System.in);
			System.out.println("Please enter the age, for quit press -1");
			int age =s.nextInt();
		
        
	        if (age <=3 && age >=0) {
	        	System.out.println("bebek");
	        	bebek++;
	        }
	        else if(age>=4 && age <=12) {
	        	System.out.println("çocuk");
	        	cocuk++;
	        }
	        else if (age>=13 && age<=19) {
	        	System.out.println("ergen");
	        	ergen++;
	        	
	        }
	        else if(age>=20 && age<=30) {
	        	System.out.println("genç");
	        }
	        else if(age>=31 && age <=59) {
	        	System.out.println("orta yaşlı");
	        	ortaYasli++;
	        }
	        else if(age>=60 && age <=120) {
	        	System.out.println("yaşlı");
	        	yasli++;
	        }	
	        else if ( (age <0) && age !=-1 || (age>120) ){
	        	System.out.println("Lütfen 0'dan büyük 120'den küçük bir değer giriniz!");
	        }
	        else if(age ==-1) {
	        	flag= false;
	        }
	}
		System.out.println();
		System.out.printf("bebek sayısı: %5d \n", bebek);
		System.out.printf("çocuk sayısı: %5d \n" , cocuk);
		System.out.printf("ergen sayısı: %5d \n" , ergen);
		System.out.printf("genç sayısı: %6d \n", genc);
		System.out.printf("orta yaşlı sayısı:%d \n", ortaYasli);
		System.out.printf("yaşlı sayısı: %5d", yasli);
}
}
