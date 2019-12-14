package array_manipulation;

public class FindSecondLargest {
    public static void main(String arg[]){

        int arr[]={22,33,44,66,77,82,85,73,25,30};
        int largest=arr[0];
        int secondLargest=arr[0];
        int thirdLargest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest){
                thirdLargest=secondLargest;
                secondLargest=arr[i];
            }
            else if(arr[i]>thirdLargest){
                thirdLargest=arr[i];
            }
        }
        System.out.println("Largest num:"+largest);
        System.out.println("Second Largest num:"+secondLargest);
        System.out.println("Third Largest num:"+thirdLargest);
    }
}
