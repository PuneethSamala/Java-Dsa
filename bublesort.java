package abc;
public class bublesort {
    public static void main(String [] args){
        int [] arr = {4,5,3,1,2,9};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                        int temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                }

            }

        }
        for( int num:arr){
            System.out.print(num+" ");

        }
    }
}
