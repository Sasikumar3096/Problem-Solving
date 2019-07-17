
public class SpiralPrint_Matrix {

	public static void main(String[] args) {
		 int a[][] = { { 1, 2, 3, 4 }, 
                 { 5, 6, 7, 8 }, 
                 { 9, 10, 11, 12 }, 
                 { 13, 14, 15, 16 } }; 
		 spiralPrint(4,4,a);
	}
	public static void spiralPrint(int m,int n,int a[][]) {
		int row=0,col=0,i;
		
		while(row<m && col<n) 
		{
    //PRINT THE TOP ROW
			for(i=row;i<n;i++)
				System.out.print(" "+ a[row][i]);

			row++;
      //PRINT THE RIGHT SIDE
			for(i=col+1;i<n;i++)
				System.out.print(" "+ a[i][m-1]);
			n--;
 
			 if(row<m) { //CHECK THERE IS A BOTTOM
					for(i=n-1;i>=row;i--)//PRINT THE BOTTOM
						System.out.print(" "+ a[m-1][i]);
			 }
			 m--;
			 if(col<n) { //CHECK THERE IS A LEFT SIDE
					for(i=m;i>=row;i--) //PRINT HTE LEFT SIDE
						System.out.print(" "+ a[i][col]);
			 }
			 col++;
			
		}
	}

}
