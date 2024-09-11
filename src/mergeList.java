public class mergeList {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;
        int[] tem=new int[m];
        while(i<m){tem[i]=nums1[i];i++;}
        i=0;
        while(i<m&&j<n){
            if(tem[i]>nums2[j]){
                nums1[k]=nums2[j++];
            }
            else{
                nums1[k]=tem[i++];
            }
            k++;
        }
        while(i<m){
            nums1[k++]=tem[i++];
        }
        while(j<n){
            nums1[k++]=nums2[j++];
        }

    }
}
