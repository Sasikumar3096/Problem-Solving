//swap upper diagonal elements with lower diagonal elements of matrix
public class SwapUpperWithLowerDiagonalElements {

	static void swap(int[][] arr,int n) {
		int i,j;
		for(i=0;i<n;i++)
			for(j=i+1;j<n;j++)
			{	
				if(i+j==n-1) {
					int temp = arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i] = temp;
				}
			}
	}
	public static void main(String args[]) {
				
		  int arr[][] = { { 2, 3, 5, 6 }, 
				  		  { 4, 5, 7, 9 }, 
				  		  { 8, 6, 4, 9 }, 
                          { 1, 3, 5, 6 } }; 
		  swap(arr,arr.length);
		  for(int i=0;i<arr.length;i++) {
			  for(int j=0;j<arr.length;j++)
				  System.out.print(arr[i][j]+" ");
			  System.out.println();
		  }
	}
}
/*OUTPUT
2 3 5 1 
4 5 6 9 
8 7 4 9 
6 3 5 6 
*/
