import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        int[] result=new int[2];
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                result[0] = hm.get(target-nums[i]);
                result[1]=i;
                return result;
            }
            hm.put(nums[i],i);
        }
        return result;
    }

    public static void main(String args[]){
        TwoSum ts =new TwoSum();
        int target=9;
        int[] arr=new int[4];
        arr=new int[]{2,11,7,9};
        int[] res=ts.twoSum(arr,target);
        System.out.print("[" + res[0]+ "," +res[1] +"]");
    }
}
