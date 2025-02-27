class Solution {
    public int mySqrt(int x) {
        int left = 1;
        int right = x;

        while(left <= right) {
            int mid = left+(right-left)/2;

            if(mid <= x/mid) {
                left = mid+1;
            } else if(mid > x/mid) {
                right = mid-1;
            } else {
                return mid;
            }
        }
        return right;
    }
}
