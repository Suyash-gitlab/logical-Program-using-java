import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arrr[]=new int[5];
    System.out.println("Enter element in array is :");
    for(int i=0;i<5;i++)
    {
        arrr[i]=sc.nextInt();
    }
        int largest=arrr[0];
        for(int i=1;i<arrr.length;i++)
        {
            if(arrr[i]>largest)
            {
                largest=arrr[i];
            }
        }
    System.out.println("largest element in array is :"+largest);
    }
}
