package SetAndHashMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            set2.add(num);
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for(int num : set1){
            if(!set2.contains(num)){
                res.add(num);
            }
        }
        ans.add(res);
        res = new ArrayList<>();
        for(int num : set2){
            if(!set1.contains(num)){
                res.add(num);
            }
        }
        ans.add(res);
        return ans;
    }
}
