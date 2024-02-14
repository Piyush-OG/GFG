class Solution {
    int binarysearch(int arr[], int n, int k) {
        int start = 0;
        int end =n-1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            if(k==arr[mid]){
                return mid;
            }
            if(k>arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

}
