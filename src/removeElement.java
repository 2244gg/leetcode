public class removeElement {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        int k=0,len=nums.length,j=len-1;
        while(k<j){
            if(nums[k]==val){
                while(k<j&&nums[j]==val)j--;
                if(k>=j)break;
                int tem=nums[k];
                nums[k]=nums[j];
                nums[j]=tem;
            }
            else{
                k++;
            }
        }
        if(nums[k]!=val){
            k++;
        }
        return k;
    }
}
