import java.util.Arrays;
import java.util.*;

//left rotation of an array by one 
//1 2 3 4 5
//2 3 4 5 1

/* 
public class Arraypra {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n ;i ++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        rotate(arr, n);
    }

    static void rotate(int[] arr, int n){
        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        
        System.out.println(Arrays.toString(arr));

    }

    
}

*/


// left rotation of array by n times


// public class Arraypra{
//     public static void main(String[] args) {

//         int[] arr = {1,2,3,4,5,6,7};
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter how many rotation: ");
//         int d = sc.nextInt();
//         nrotation(arr, d);
//     }

//      static void nrotation(int[] arr, int d){
//         int[] temp = new int[d];
//         for(int i=0;i<d ; i++){
//             temp[i]=arr[i];
//         }

//         for(int i=d; i< arr.length;i++){
//             arr[i-d] =arr[i]; 
//         }
//         int j=0;
//         for(int i=arr.length-d; i<arr.length ; i++){
//             arr[i]=temp[j];
//             j++;
//         }

//         System.out.println(Arrays.toString(arr));
       
//      }
     
// }


// right rotation of an array

// public class Arraypra{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6,7};
//         int n= arr.length;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of rotations : ");
//         int k=sc.nextInt();
//         RightRotate(arr,n,k);
//         System.out.println(Arrays.toString(arr));
//     }

//     static void RightRotate(int[] arr , int n, int k){
//         if (n==0){
//             return ; 
//         }
//         k= k%n;
//         int[] temp = new int[k];
//         int j=0;
//         for(int i=n-k;i<n;i++){
//             temp[j]=arr[i];
//             j++;
//         }

//         for(int i=n-k-1; i >=0 ;i--){
//             arr[i+k] = arr[i];
//         }

//         for(int i=0;i<k;i++){
//             arr[i]=temp[i];
//         }

//         // System.out.println(Arrays.toString(arr));

//     }
// }


//reversing a whole array

// public class Arraypra{
//     public static void main(String[] args) {
//         int[] arr  = {1,2,3,4,5,6,7,8};
//         resverse(arr);
//         System.out.println(Arrays.toString(arr));

//     }
//     static void resverse(int[] arr){
//         int start = 0;
//         int end = arr.length-1;
//         while(start<end){
//             swap(arr,start,end);
//             start++;
//             end--;
//         }
//     }

//     static void swap(int[] arr, int ind1,int ind2){
//         int temp = arr[ind1];
//         arr[ind1] = arr[ind2];
//         arr[ind2]= temp;
//     }
// }

// optimal solution for recersing an left array

// public class Arraypra{
//     public static void main(String[] args) {
//         int[] arr= {1,2,3,4,5,6,7};
//         int n= arr.length;
//         int k= 3;
//         RightRotate(arr, n, k);
//         System.out.println(Arrays.toString(arr));
//     }

//     static void Reverse(int[] arr,int start,int end){
//         while(start<=end){
//             int temp=arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }

//     static void RightRotate(int[] arr,int n, int k ){
//         Reverse(arr, 0, n-k-1);
//         Reverse(arr, n-k, n-1);
//         Reverse(arr, 0, n-1);
//     }
// }


public class Arraypra{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Nzeros(arr, n);

    }
    static void Nzeros(int[] arr, int n){
        //we dont know the size of temp so wee are storing it in arraylist

        ArrayList<Integer> temp = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                temp.add(arr[i]);
            }
        }

        int nz = temp.size();

        for(int i=0;i< nz;i++){
            arr[i] = temp.get(i);
        }

        for(int i=nz;i<n;i++){
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}