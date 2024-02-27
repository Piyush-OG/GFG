class Solution
{
    //Function to find the smallest positive number missing from the array.
   static int missingNumber(int arr[], int size) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            if (arr[i] >= 1) {
                set.add(arr[i]);
            }
        }

        for (int i = 1; i <= set.size(); i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return set.size() + 1;
    }
}
