import java.util.*;
// Problem: Find the number of unique elements in an sorted array 
//Link:
    //Easy: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
    //Medium: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
public class uniqueElementNo{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //Taking input from the user
        int len=sc.nextInt();
        int []arr=new int[len];
        for (int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }

        //printing array
        for (int i:arr)
        {
            System.out.print(i+" ");
        }
        int uni_el=1;
        int i=0;
        int j=i+1;

        //finding no of unique elements
        
            // while(j<len)
            // {
            //     if(arr[i]!=arr[j])
            //     {
            //         arr[i+1]=arr[j];
            //         i++;
            //         uni_el++;
            //         j++;
            //     }
            //     else
            //         j++;
            // }
            // System.out.println("\nNumber of unique elements is "+uni_el);


        // another approach: using previous element of j to check duplicate or not
        while(j<len)
        {
            if(arr[j]==arr[j-1])
            {
                j++;
                continue;
            }
            uni_el++;
            i++;
            j++;
        }
        System.out.println("\nNumber of unique elements is "+uni_el);
    }
}