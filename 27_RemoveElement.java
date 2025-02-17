class Solution
{
  public int removeElement(int nums[],int val)
  {
    int k=0;
    for(int i=0;i<nums.length;i++)
      {
      if (nums[i]!=val)
        {
         nums[i]=nums[k];
        k++;
        }
      }
    return k;
    }
  public static void main(String [] args)
  {
    Solution obj=new Solution();

    int arr1[]={3,2,2,3};
    int v=3;
    int m=obj.removeElement(arr1,v);

    int arr2[]={0,2,3,2,2,3,4,1,7};
    int w=2;
    int n=obj.removeElement(arr2,w);

    System.out.println(m);
    System.out.println(n);
    }
  }
    
