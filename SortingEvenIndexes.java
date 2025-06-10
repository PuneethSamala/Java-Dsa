package abc;
public class SortingEvenIndexes {
    public static void main(String[] args) {
        int [] arr = {5, 8, 3, 6, 1, 4};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[i]%2 ==0){
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
