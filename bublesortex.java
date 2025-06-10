public class bublesortex {
    public static void main(String[] args) {
        int n = 0;
        int []arr =  {5, 8, 3, 6, 1, 4};
        int [] even = new int[arr.length];
        // ectracting the even numbres
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 ==0){
                even[n++] = arr[i];
            }
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(even[j]>even[j+1]){
                    int temp = even[j+1];
                    even[j+1] = even[j];
                    even[j] = temp;
                }
            }
        }
        // setting the all odd numbers in their place
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr[i] = even[k++];
            }

        }
        for(int nums:arr){
            System.out.print(nums+" ");
        }

        
    }
}
