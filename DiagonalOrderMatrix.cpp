#include<bits/stdc++.h> 
#define R 5
#define C 4
using namespace std; 
void diagonalOrder(int arr[][C]) 
{ 
    int i,j,t=1;
        for(i=0;i<R;i++)
            {
                j=0;
                int temp=i;
                int col_count=0;   
                while(j<=i and col_count<C){
                    col_count++;
                    //cout<<temp--<<","<<j<<" ";
                    cout<<arr[temp--][j++]<<"  ";
                }
                cout<<"\n";
            }
        for(i=1;i<R;i++)
            {
                j=i;
                int temp=R-1;
                while(j<=C-1){
                    //cout<<arr[i][j]<<"";
                    cout<<arr[temp--][j]<<"  ";
                   //cout<<temp--<<","<<j<<" ";
                    j++;
                }
                cout<<"\n";
            }   
        }
// Driver program to test above 
int main() 
{
	int arr[][C] = {{1, 2, 3, 4}, 
		{5, 6, 7, 8}, 
		{9, 10, 11, 12}, 
		{13, 14, 15, 16}, 
		{17, 18, 19, 20}, 
	}; 
	diagonalOrder(arr); 
	return 0; 
}
