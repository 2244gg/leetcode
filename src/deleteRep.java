public class deleteRep {
    public int removeDuplicates(int[] nums) {
        int i=0,k=0,counter=1,len=nums.length,dist=0;
        while(k<len){
            if(k==0||nums[k]!=nums[k-1]){
                dist=counter-2;
                if(counter-2>0){
                    i-=dist;
                }
                counter=1;
            }
            else{
                counter++;
            }
            nums[i++]=nums[k++];
        }
        dist=counter-2;
        if(counter-2>0){
            i-=dist;
        }
        return i;
    }
}
