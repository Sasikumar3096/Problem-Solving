
public class MatrixRotation {

	public static void main(String[] args) {
	    // Test Case 1 
	   int R=4,C=4;
	   int a[][] = { {1,  2,  3,  4}, {5,  6,  7,  8},  {9,  10, 11, 12},  {13, 14, 15, 16}  }; 
	  
	    rotatematrix(R, C, a); 
		System.out.println("THE RESULTANT MATRIX IS ");
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}

	private static void rotatematrix(int m, int n, int[][] a) {
		int row=0,col=0,prev,i,cur;
		while(row<m && col<n) {		
			prev = a[row+1][col];
			for(i=col;i<m;i++) //ROTATE TOP ROW ELEMENTS 
			{
				cur = a[row][i];
				a[row][i]=prev;
				prev=cur;
			}row++; //INCREASING THE ROW BY 1
			
			for(i=row;i<n;i++) //ROTATING THE RIGHT CORNER ELEMENTS
			{
				cur = a[i][n-1];
				a[i][n-1]=prev;
				prev=cur;
			}n--; //REDUCE THE COLUMN BY 1
			if(row<m) {  //CHECK IF THERE ARE ELEMENTS TO ROTATE
				for(i=n-1;i>=col;i--) //ROTATE THE ELEMENTS IN HTE BoTTOM
				{
					cur = a[m-1][i];
					a[m-1][i]=prev;
					prev=cur;
				
				}
			}m--;
			if(col<n) {//CHECK IF THERE ARE ELEMENTS IN THE LEFT SIDE TO ROTATE
				for(i=m-1;i>=row;i--) //ROTATE THE ELEMENTS IN IN THE LEFT SIDE
				{
					cur = a[i][col];
					a[m-1][i]=prev;
					prev=cur;
				}
			}col++;
		}	
	}

}
