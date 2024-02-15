class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        long tWater=0;
        int tower=arr[0];
        int size=n-1;
        int tower_index=0;
        //temp is used to store the temporary value of the twater
        long temp=0;
        for(int i=1;i<n;i++){
            if(arr[i]>=tower){
                tower=arr[i];
                tower_index=i;
                //bigger tower value found
                temp=0;
            }
            else{
                //if arr[i] is smaller
                tWater+=(tower-arr[i]);
                //if we dont find a any number larger than
                //tower we subtract temp from twater
                temp+=(tower-arr[i]);
            }
        }
        //if arr[n-1]>=tower then tower_index must be equal to size
        //else tower_index must be lower than size
        if(tower_index<size){
            //if no larger tower is found this will remove excess water from twater
            tWater-=temp;
            //we start from the end to locate the right biggest tower
            tower=arr[size];
            for(int i=size;i>=tower_index;i--){
                //right tower will definetly be smaller than the tower
                if(arr[i]>=tower)tower=arr[i];
                else
                tWater+=tower-arr[i];
            }
        }
        return tWater;
    } 
}
