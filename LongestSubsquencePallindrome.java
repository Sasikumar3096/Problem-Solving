
public class LongestSubsquencePallindrome {

	public static void main(String[] args) {
			System.out.println(lps("abaaba"));
	}
	static int lps(String s) {
		int i,j,cl, n = s.length();
		int matrix[][]=new int[n][n];
		
		for(i=0;i<s.length();i++)
			matrix[i][i]=1;
		
		for(cl=2;cl<=n;cl++)
			for(i=0;i<n-cl+1;i++)
			{
				j = i+cl-1;
	
				if(s.charAt(i) == s.charAt(j) && cl == 2)
					matrix[i][j] =2;
				else
					if(s.charAt(i) == s.charAt(j))
						matrix[i][j] = matrix[i+1][j-1]+2;
					else
						matrix[i][j] = max(matrix[i][j-1], matrix[i+1][j]);
			}		
		return matrix[0][n-1];
		
	}
	private static int max(int i, int j) {
		return i>j?i:j;
	}
}
