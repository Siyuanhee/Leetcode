import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {

        System.out.println(majorityElement(new int[]{3,2,3}));

    }

//    Given an array of size n, find the majority element. The majority
//    element is the element that appears more than ⌊ n/2 ⌋ times.

    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (!counter.containsKey(nums[i])){
                counter.put(nums[i],1);
            }else {
                Integer count = counter.get(nums[i]);
                counter.put(nums[i],count + 1);
            }
        }
       // System.out.println(counter.size());
        Iterator<Map.Entry<Integer, Integer>> entries = counter.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            if (entry.getValue() > nums.length/2){
                return entry.getKey();
            }
        }
        return 0;

    }
}
