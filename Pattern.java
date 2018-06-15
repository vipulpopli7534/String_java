import java.util.Scanner;


public class Pattern {

public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	for(int i=1;i<=n;i++){
		int a=97;
		for(int j=1;j<i;j++){
			System.out.print((char)a);
			a++;
		}System.out.println();
		
	}
}
}
