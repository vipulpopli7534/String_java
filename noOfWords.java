import java.util.Scanner;


public class noOfWords {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		String s= sc.nextLine();
		//StringBuffer str =new StringBuffer(s);
		int count=1;
for(int i=0;i<s.length();i++){

	if(s.charAt(i)==32)
		count++;
}
System.out.print(count);
}
}
