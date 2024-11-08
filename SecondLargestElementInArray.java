import java.util.Scanner;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] arr=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Second Largest Element In Array:"+getSecondLargest(arr));
        sc.close();
    }
    public static int getSecondLargest(int[] arr){
        int largest=Integer.MIN_VALUE,secondLargest=Integer.MIN_VALUE;
        for(int a:arr){
            if(a>largest){
                secondLargest=largest;
                largest=a;
            }else if(a>secondLargest && a<largest){
                secondLargest=a;
            }
        }
        return secondLargest==Integer.MIN_VALUE?-1:secondLargest;
    }
    
}
