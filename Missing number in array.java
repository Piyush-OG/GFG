class Solution {
    int missingNumber(int array[], int n) {
         int r = 0;
        int p = 0;
        for (int x = 0; x < n; x++) {
            if (x < array.length) r += array[x];
            p += x + 1;
        }
        return Math.abs(r - p);
    }
}
