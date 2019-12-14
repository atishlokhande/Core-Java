package array_manipulation;

public class FindDuplicates {
    public static  void main(String args[]){

        int arr[]={10,20,30,44,22,30,66,10,77};
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]) {
                    System.out.println("Duplicate elements of array are:"+arr[i]);
                }
            }
        }
    }
}
