import java.io.File;
import java.util.Scanner;

public class AAPL {
	private File f1;
	private Scanner sc1=null;
	private String line = "";
	private String date = "";
	private String open = "";
	private String high = "";
	private String low = "";
	private String close = "";
	private String adjClose = "";
	private String volume = "";
	
	public AAPL() {
		f1 = new File("C:\\Users\\alexa\\Desktop\\stocks\\AMZN.csv");
	}
	
	public void printLowPrices() {
		
		try {
			sc1 = new Scanner(f1);
		}
		catch(Exception e){
			System.out.println("Error");
		}
		do  {
			line = sc1.nextLine();
			date = line.substring(0, line.indexOf(","));
			line = line.substring(line.indexOf(",")+1,line.length());
			line = line.substring(line.indexOf(",")+1,line.length());
			line = line.substring(line.indexOf(",")+1,line.length());
			low = line.substring(0, line.indexOf(","));
			System.out.println("Date: "+date+", low of the day: "+low);
		}while(sc1.hasNextLine());
		sc1.close();
	}
	
	public void printLowPricesMonth() {
		
		try {
			sc1 = new Scanner(f1);
		}
		catch(Exception e){
			System.out.println("Error");
		}
		do  {
			line = sc1.nextLine();
			if (line.charAt(8)=='0' && line.charAt(9)=='1') {
				date = line.substring(0, line.indexOf(","));
				line = line.substring(line.indexOf(",")+1,line.length());
				line = line.substring(line.indexOf(",")+1,line.length());
				line = line.substring(line.indexOf(",")+1,line.length());
				low = line.substring(0, line.indexOf(","));
			System.out.println("Date: "+date+", low of the day: "+low);
			}
		}while(sc1.hasNextLine());
		sc1.close();
	}
	
	public void printHighPrices() {
		
		try {
			sc1 = new Scanner(f1);
		}
		catch(Exception e){
			System.out.println("Error");
		}
		do  {
			line = sc1.nextLine();
			date = line.substring(0, line.indexOf(","));
			line = line.substring(line.indexOf(",")+1,line.length());
			line = line.substring(line.indexOf(",")+1,line.length());
			high = line.substring(0, line.indexOf(","));
			System.out.println("Date: "+date+", high of the day: "+high);
		}while(sc1.hasNextLine());
		sc1.close();
	}
	
	public void printHighPricesMonth() {
		
		try {
			sc1 = new Scanner(f1);
		}
		catch(Exception e){
			System.out.println("Error");
		}
		do  {
			line = sc1.nextLine();
			if (line.charAt(8)=='0' && line.charAt(9)=='1') {
				date = line.substring(0, line.indexOf(","));
				line = line.substring(line.indexOf(",")+1,line.length());
				line = line.substring(line.indexOf(",")+1,line.length());
				high = line.substring(0, line.indexOf(","));
			System.out.println("Date: "+date+", high of the day: "+high);
			}
		}while(sc1.hasNextLine());
		sc1.close();
	}
	
	public void print() {
		
		try {
			sc1 = new Scanner(f1);
		}
		catch(Exception e){
			System.out.println("Error");
		}
		String line = "";
		do  {
			line = sc1.nextLine();			
			date = line.substring(0, line.indexOf(","));
			line = line.substring(line.indexOf(",")+1,line.length());
			open = line.substring(0, line.indexOf(","));
			line = line.substring(line.indexOf(",")+1,line.length());
			high = line.substring(0, line.indexOf(","));
			line = line.substring(line.indexOf(",")+1,line.length());
			low = line.substring(0, line.indexOf(","));
			line = line.substring(line.indexOf(",")+1,line.length());
			close = line.substring(0, line.indexOf(","));
			line = line.substring(line.indexOf(",")+1,line.length());
			adjClose = line.substring(0, line.indexOf(","));
			line = line.substring(line.indexOf(",")+1,line.length());
			volume = line.substring(0, line.length());
			System.out.println("Date: "+date+", open: "+open+", high of the day: "+high+", low of the day: "+low+", close: "+close+", adj close: "+adjClose+", volume: "+volume);
		}while(sc1.hasNextLine());
		sc1.close();
	}
	
	public void printmonth() {
		
		try {
			sc1 = new Scanner(f1);
		}
		catch(Exception e){
			System.out.println("Error");
		}
		do  {
			line = sc1.nextLine();	
			if (line.charAt(8)=='0' && line.charAt(9)=='1') {
				date = line.substring(0, line.indexOf(","));
				line = line.substring(line.indexOf(",")+1,line.length());
				open = line.substring(0, line.indexOf(","));
				line = line.substring(line.indexOf(",")+1,line.length());
				high = line.substring(0, line.indexOf(","));
				line = line.substring(line.indexOf(",")+1,line.length());
				low = line.substring(0, line.indexOf(","));
				line = line.substring(line.indexOf(",")+1,line.length());
				close = line.substring(0, line.indexOf(","));
				line = line.substring(line.indexOf(",")+1,line.length());
				adjClose = line.substring(0, line.indexOf(","));
				line = line.substring(line.indexOf(",")+1,line.length());
				volume = line.substring(0, line.length());
				System.out.println("Date: "+date+", open: "+open+", high of the day: "+high+", low of the day: "+low+", close: "+close+", adj close: "+adjClose+", volume: "+volume);
			}
		}while(sc1.hasNextLine());
		sc1.close();
	}
	
	
	public static void main(String args[]) {
		AAPL stock1 = new AAPL();
		stock1.print();
		stock1.printHighPrices();
		stock1.printmonth();
		stock1.printLowPricesMonth();
		
	}

}
