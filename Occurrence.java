import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
    
        int arr[]={11,12,11,11};
        Arrays.sort(arr);
        int count=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[i-1])
            {
                count++;
            }else{
                 System.out.println(arr[i-1]+" Appears "+count +" Times");
                 count=1;
            }
                
         }

         System.out.println(arr[arr.length-1]+" Appears "+count+" Times");
        
    }
}
