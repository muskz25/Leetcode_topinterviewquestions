class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
     List<List<Integer>> list = new ArrayList<List<Integer>>();
         for(int i=0;i<n-2;i++){
           int find=-nums[i];
           int low=i+1;int high=n-1;
           while(low<high){
               int sum=nums[low]+nums[high];
               if(find==sum){
                List<Integer> arr=new ArrayList<>();
                   arr.add(nums[low]);
                   arr.add(nums[high]);
                   arr.add(nums[i]);
                   list.add(arr);
                   while(low<high && nums[low]==nums[low+1]) low++;
                   while(low<high && nums[high]==nums[high-1]) high--;
                    low++; high--;
               }    
               else if(sum<find) low++;
               else high--;            
               }
            while(i+1<n && nums[i]==nums[i+1]) i++;
           } 
        return list;
    }

     
}
