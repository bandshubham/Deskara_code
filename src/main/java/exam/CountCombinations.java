package exam;

public class CountCombinations {
    
  public int getNumberOfWays(final int total, final int k) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
  
    int count=0;
    int s=0;
    int flag=0;
    
    for(int i=1;i<=k;i++)
    {
        flag=0;
        count=i;
        while(count!=total)
        {
            count=count+1;
            flag=1;
        }
        if(flag==1)
        {
            count++;
        }
        
    }
    
    return count+1;
  }

}
