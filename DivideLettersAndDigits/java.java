import java.util.ArrayList;
import java.util.Random;

class StringInfo{
	private String str;
	private String upperStr = new String();
	private String lowerStr = new String(); 
	private String digitStr = new String(); 

	public StringInfo(String str) {
		
		this.str = str;
		
		processString();
				
	}
	
	private boolean isDigit(char ch) {
		return (ch >= '0' && ch<= '9'); 
	}
	
	private boolean isUpper(char ch) {
		return (ch >= 'A' && ch<= 'Z'); 
	}
	
	private boolean isLower(char ch) {
		return (ch >= 'a' && ch<= 'z');
	}
	
	private void processString() {
		
		for(int i=0; i<str.length(); i++) {
			
			char ch =str.charAt(i);
			
			if(isDigit(ch))
				digitStr+= ch;
			else if (isUpper(ch))
				upperStr += ch;
			else lowerStr += ch;
		}
	}
	
	public void displayInfo() {
		System.out.printf("%-25s %-15s %-15s %-15s%n", str, upperStr, lowerStr, digitStr);
	}
}

public class JaewonChoi_ExamQ3 {
	
	private static char getChar() {
		Random r = new Random();
		
		char ch = 0;
		switch(r.nextInt(3)) {
		case 0 :  ch = (char) (r.nextInt(26) + 65);
		break;
		case 1 : ch = (char) (r.nextInt(26) + 97);
		break;
		case 2 : ch = (char) (r.nextInt(10) + 48);
		}
		return ch;
	}
	
	private static String getString() {
		
		String s = new String();
		for(int i=0; i<20; i++)
			s+=getChar();
		
		return s;
	}
	
	private static void constructList (ArrayList<StringInfo> alist) {
		
		for(int i=0; i<5; i++)
			alist.add(new StringInfo(getString()));
	}

	private static void processList(ArrayList<StringInfo> alist) {
		
		System.out.printf("%-25s %-15s %-15s %-15s%n", "Given String", "Uppercases", "Lowercases", "Dightis");
		
		for(StringInfo s : alist) {
			s.displayInfo();
		}
	}
	
	public static void main(String[] args) {
		ArrayList<StringInfo> alist = new ArrayList<StringInfo>();
		
		constructList(alist);
		processList(alist);
	}

}
