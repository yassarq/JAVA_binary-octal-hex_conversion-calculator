// # Name:       Yassar Qureshi
// # Class:      CIS-2751
// # Assignment: Homework 5
// # File:       Unit4_YassarQureshi.java
// # Purpose:    calculate decimal to Binary Octal and Hexadecimal
package assignment;

public class NumberConverter {
	
	private int low = 0;
	private int high = 0;
	
	NumberConverter(int low, int high) {
		this.setLow(low);
		this.setHigh(high);
	}
// return lowest number
	public int getLow() {
		return low;
	}
// set lowest number
	public void setLow(int low) {
		this.low = low;
	}
// return highest number
	public int getHigh() {
		return high;
	}
// set highest number
	public void setHigh(int high) {
		this.high = high;
	}
	 public String convertToBinary(int num){
		 String result = "";
	     int binary[] = new int[40];
	     int index = 0;
	     while(num > 0){
	       binary[index++] = num%2;
	       num = num/2;
	     }
	     for(int i = index-1;i >= 0;i--){
	       result += Integer.toString((binary[i]));
	     }
	     return result;
	  }
	
	public String convertToHex(int num) {
	     // For storing remainder
	     int rem;
	        
	     // For storing result
	     String str2=""; 
	 
	     // Digits in hexadecimal number system
	     char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	 
	     while(num>0)
	     {
	       rem=num%16; 
	       str2=hex[rem]+str2; 
	       num=num/16;
	     }
	     return str2;
	}
	
	public String convertToOct(int num) {

	    String octal = "";
	    for (int i = num; i > 0; i /= 8) {
	    	octal = i % 8 + octal;
	    }
	    return octal;
	}
	// generate a table from a range of numbers from lowest to highest for binary, octal and hexadecimal
	public void printTable() {
		System.out.println("Decimal   Binary   Octal   Hexadecimal");
		int i = this.getLow();
		
		do {
			System.out.print(Integer.toString(i));
			System.out.print("        ");
			System.out.print(this.convertToBinary(i));
			System.out.print("        ");
			System.out.print(this.convertToOct(i));
			System.out.print("        ");
			System.out.println(this.convertToHex(i));
			i++;
		} while(i <= this.getHigh());
	}

}
