
public class solve {
void calc(int a, int b, int c, int x, int y, int z, int d){
	int sum1=a*x;
	int sum2=b*y;
	int sum3=c*z;
	int output=sum1+sum2+sum3;
	int compare=d;
	System.out.println("your output:"+compare);
	System.out.println("calculated output:"+ output);
	if (compare==output){
		System.out.println("LHS=RHS");
		
	}
	else{
		System.out.println("not equal");
	}
}
}
