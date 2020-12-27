package com.kl.tmp;

public class Sqrt {

    public int mySqrt(int x){
        if(x == 0){
            return 0;
        }
        int ans = (int)Math.exp(0.5*Math.log(x));
        return (long)(ans + 1) * (ans + 1) <= x ? ans + 1:ans;
    }

    public int mySqrtBinarySearch(int x){
        int l = 0, r = x ,ans = -1;
        while (l <= r){
            int mid = 1 + (r - 1) / 2;
            if((long)mid * mid <= x){
                ans = mid;
                l = mid + 1;

            }
            else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
