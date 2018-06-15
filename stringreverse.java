import java.util.Scanner;


public class stringreverse {
 public static String strrev(String s){
	 String word="";
	 String result="";
	 for(int i=0;i<s.length();i++){
		
		 if(s.charAt(i)==32){
			 result=word+" "+result;
			 word="";
		 }
		 else{
			 word+=s.charAt(i);
		 }
	 }
	 result=word+" "+result;
	 return result;
 }
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		System.out.print(strrev(s));
	}
}
