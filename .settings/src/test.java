import java.util.*;

public class test {
public static void main(String args[]){
	Scanner sc= new Scanner(System.in);

	System.out.println("enter the values of a,b,c (mention values in neagtive (if any)");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	System.out.println("enter values of x,y,z (mention values in neagtive (if any)");
	int x=sc.nextInt();
	int y=sc.nextInt();
	int z=sc.nextInt();
	System.out.println("enter your output");
	
	int d=sc.nextInt();
	System.out.println(a+"x"+"+"+b+"y"+"+"+c+"z"+"="+d);
	solve s=new solve();
	s.calc(a,b,c,x,y,z,d);
}
}
