import java.util.*;
class Temp{ 

static int MatrixChainOrder(int p[], int n) 
{ 
	int [][]dp=new int[n][n]; 
	for (int i=1; i<n; i++) 
		dp[i][i] = 0;
	for (int L=1; L<n-1; L++) {
	for (int i=1; i<n-L; i++)	 
		{
		dp[i][i+L] = Math.min(dp[i+1][i+L] + p[i-1]*p[i]*p[i+L], 
						      dp[i][i+L-1] + p[i-1]*p[i+L-1]*p[i+L]);	 
/*	
	  System.out.print(i + " " + (i+L)+"--");
		System.out.println("\t"+(i+1) + " " +(i+L) +" "+ (i-1) + " " + i +" " +(i+L));
		System.out.println("\t"+ i+ " "+(i+L-1) + " " + (i-1) + " "+(i+L-1) + " "+(i+L));
	//	System.out.println("-----" + dp[i][i+L]);
*/		
		}
	
	}
	/*
	System.out.println(Arrays.toString(dp[0]));
	System.out.println(Arrays.toString(dp[1]));
	System.out.println(Arrays.toString(dp[2]));
	System.out.println(Arrays.toString(dp[3]));
	System.out.println(Arrays.toString(dp[4]));
*/
	return dp[1][n-1]; 
} 

// Driver code 
public static void main(String args[]) 
{ 
	int arr[] = {10, 20, 30, 40, 30} ; 
	int size = arr.length; 

	System.out.print("Minimum number of multiplications is "+ 
					MatrixChainOrder(arr, size)); 

} 
} 
