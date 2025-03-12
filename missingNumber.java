import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
    
        int arr[]={11,12,14,15,16};
        int min=arr[0];
        int max=arr[arr.length-1];
        int expectSum=0;
        
        for(int i=min;i<=max;i++)
        {
            expectSum +=i;
        }
        
        int actualSum=0;
        for(int num:arr)
        {
            actualSum +=num;
        }
        int missing=expectSum-actualSum;
        System.out.println("  Missing number is :"+missing);
    }
}
