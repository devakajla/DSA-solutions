import java.util.HashMap;
// Problem link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class twopairsum{
    public static int [] main(String args[])
    {
        int arr[]= new int[]{2,5,7,1,14};
        int target=9;
        //Brute: 
        // for(int i=0; i<arr.length;i++)
        // {
        //     for(int j=i+1;j<arr.length;j++)
        //     {
        //         if(arr[i]+arr[j]==target)
        //         {
        //             return new int []{i+1,j+1};
        //         }
        //     }
        // }
        // return new int[] {-1,-1};

        // Better: map each value to its index, then look for the complement as a key.
        // HashMap<Integer, Integer> h = new HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        //     int complement = target - arr[i];
        //     if (h.containsKey(complement)) {
        //         System.out.println("Pair found: index " + h.get(complement) + " and " + i + ", values " + complement + " + " + arr[i]);
        //         return;
        //     }
        //     h.put(arr[i], i);
        // }
        // System.out.println("No pair found");

        // Optimal:
        int i=0;
        int j=arr.length-1;

        while(i<j)
        {
            if(arr[i]+arr[j]<target)
            {
                i++;
            }
            else if(arr[i]+arr[j]>target)
            {
                j--;
            }
            else{
                return new int[]{i+1,j+1};
            }
        }
        return new int[]{-1,-1};
    }
}