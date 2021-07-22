class Solution {
    public int[] replaceElements(int[] arr) {
        int k=0;
        if(arr.length==1)
        {
            arr[0]=-1;
            return arr;
        }
        int max=arr[1];
            for(int i=0;i<arr.length-1;i++)
            {
                if(i==k)
                {
                    max=Integer.MIN_VALUE;
                    for(int j=i+1;j<arr.length;j++)
                    {
                        if(max<arr[j])
                        {
                            max=arr[j];
                            k=j;
                        }
                    }
                    arr[i]=max;
                }
                else
                {
                    arr[i]=max;
                }
            }
        arr[arr.length-1]=-1;
        return arr;
        
    }
}
