 import java.util.*;
 import java.util.Arrays;
// public class kthsmallest {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the number of elements in array");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter the array elements");
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Enter the kth smallest value");
//         int k = sc.nextInt();
//         System.out.println("Enter the kth largest value");
//         int s = sc.nextInt();

//         Arrays.sort(arr);
//         System.out.println("The smallest element");
//         System.out.println(arr[k-1]);
//         System.out.println("The largest element");
//         System.out.println(arr[n-k]);

//     }
// }


// second largest 

/* 
public class kthsmallest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
       int[] arr = new int[n];
        for(int i=0;i< n ; i++){
            arr[i] = sc.nextInt();     
        }
        Arrays.sort(arr);
        int large = seclarge(arr , n);
        System.out.println("The second largest number in array: "+large);
        }

        static int seclarge(int[] arr, int n){
            int largest = arr.length-1;
            int second=0;
           
            for(int i =n-2 ; i>=0 ; i-- ){
                if(arr[i] != largest){
                    second = arr[i];
                    break;
                }
            }
            return second;
        }
}

*/

public class kthsmallest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int seclarge= large(arr, n);
        System.out.println(seclarge);
    }
    static int large(int[] a,int n){
        int lar = a[0];
        int slar = -1;

        for(int i=0;i<n;i++){
            if(a[i] > lar){
                slar = lar;
                lar = a[i];
            }
            else if(a[i]< lar && a[i] > slar){
                slar = a[i];
            }
            }
            return slar;
        }

    }

