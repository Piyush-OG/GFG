class Solution {
    long find(int n,int k,int[][] arr,int x,int y){
        if(x>=n || y>=n || k<0) return 0;
        if(x==n-1 && y==n-1 && k-arr[x][y]==0) return 1; 
        long a=find(n,k-arr[x][y],arr,x+1,y);
        long b=find(n,k-arr[x][y],arr,x,y+1);
        return a+b;
    }
    long numberOfPath(int n, int k, int [][]arr) {
        return find(n,k,arr,0,0);
    }
}
