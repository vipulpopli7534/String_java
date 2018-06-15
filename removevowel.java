import java.util.Scanner;
public class removevowel {
public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	String s= sc.nextLine();
	StringBuffer str =new StringBuffer(s);
	 for(int i=0;i<str.length();){
		 if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
			 str=str.deleteCharAt(i);
		 }
		 else
			 i++;
	 }
System.out.print(str);
}
}
