package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double med = 0;
        int m = nums1.length;
        int n = nums2.length;
        List<Integer> s = new ArrayList<>();
        for(int i = 0; i < m; ++i) s.add(nums1[i]);
        for(int i = 0; i < n; ++i) s.add(nums2[i]);
        Collections.sort(s);
        if(s.size() == 1) med = s.get(0);
        else if(s.size() % 2 == 0) {
            med = (double)((s.get(s.size() / 2) + s.get(s.size() / 2 - 1)) / 2.0);
        }
        else {
            med = s.get(s.size() / 2);
        }
        return med;
    }
}
