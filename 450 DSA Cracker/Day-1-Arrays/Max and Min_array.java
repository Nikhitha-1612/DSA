import java.util.*;
public class Max_Min_Arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();	
			}
		Arrays.sort(a);
		System.out.println("Max is:"+a[n-1]);
		System.out.println("Min is"+a[0]);
	}

}
