import java.util.Scanner;
public class LargestElementInArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] arr=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Largest Element In Array:"+maxElement(arr));
        sc.close();
    }
    public static int maxElement(int[] arr){
        int max=arr[0];
        for(int a:arr){
            max=Math.max(a, max);
        }
        return max;
    }
}