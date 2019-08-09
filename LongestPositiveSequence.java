
public class LongestPositiveSequence {
	public static void main(String[] args) {
		int []arr= {-2,-1,-4,-6,2,7,8,3,-6,-3,-7,1,2,-2,9,10,11,13,20,23,-11,-12};
		int n=arr.length;
		int max_count=0,count=0,start=-1,end=-1,temp_start=-1,temp_end=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]>0) {
				count++;
				if(temp_start==-1) {
					temp_start=temp_end= i;
					}
				else
					temp_end++;
			}
			else {
				if(count>max_count) {
					max_count = count;
					start=temp_start;
					end = temp_end;	
				}
				temp_start = temp_end =-1;
				count=0;
			}
		}
		for(int i=start;i<=end;i++)
				System.out.print(arr[i]+" ");
//		System.out.println(arr[start] + " "+ arr[end] +" "+max_count);
	}
}
/*
OUTPUT
9 10 11 13 20 23 

*/
