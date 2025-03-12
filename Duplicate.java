import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[]=new int[5];
    System.out.println("Enter element in array is :");
    for(int i=0;i<5;i++)
    {
        arr[i]=sc.nextInt();
    }
       
       for(int i=0;i<5-1;i++)
       {
           for(int j=0;j<5-i-1;j++)
           {
               if(arr[j]<arr[j+1])
               {
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   
               }
           }
       }
       
       int j=0;
       for(int i=0;i<5-1;i++)
       {
       if(arr[i]!=arr[i+1])
       {
           arr[j++]=arr[i];
       }
       }
       arr[j++]=arr[5-1];
    System.out.println("element in array is");
    for(int i=0;i<j;i++)
    {
    System.out.println(" "+arr[i]);
    }
    }
}
