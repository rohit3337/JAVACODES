import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Search
{
  public static int getComparision(List num,int n,int target)
    { 
        int start=0;
        int end=n-1;
        int mid,count=0;
        while(start<end)
        
        {
            mid=start+(end-start)/2;

            if(target==(Integer)num.get(mid))
            {
                return count;
            }
            else if(target<(Integer)num.get(mid))
            {
                end=mid-1;
                count++;
            }
            else
            {
                start=mid+1;
                count++;
            }

       }

            return -1;
    }
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        List <Integer>num =new ArrayList<Integer>();
        int roll,n,target;
        System.out.print("Enter Number of Student :");
        n=sc.nextInt();
       
        for(int i=0;i<n;i++)
        { 
            System.out.print("Enter Roll no. "+(i+1)+" :");
             roll=sc.nextInt();
              num.add(roll); 
        }
        
        for(int i=0;i<n;i++)
        {
           System.out.print (num.get(i)+" ");
        }
        System.out.print("Enter Target :");
        target =sc.nextInt();
      System.out.println(getComparision(num, n, target));
        System.out.println(num.get(n-1));
       
    }
}
