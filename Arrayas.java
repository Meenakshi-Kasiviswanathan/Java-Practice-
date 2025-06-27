package assignment;

import java.util.*; 

//------>>>>>  swaping of two numbers with the indexes

// public class Arrayas {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//          int[] arr = new int[5];
//          for(int i=0;i<5;i++){
//             arr[i]=sc.nextInt();
//          }
//         System.out.println(Arrays.toString(arr));
//          swap(arr,2,4);
//          System.out.println(Arrays.toString(arr));

//  }

//     static void swap(int[] arr, int index1, int index2){
//         int temp =arr[index1];
//         arr[index1] = arr[index2];
//         arr[index2] = temp;
//     }
    
// }


//----->>> maximum and minimum bin an array


// public class Arrayas {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//          int[] arr = new int[5];
//          for(int i=0;i<5;i++){
//             arr[i]=sc.nextInt();
//          }
//         System.out.println(Arrays.toString(arr));

//         int max = arr[0];
//         for(int i=1;i<5;i++){
//             if(max<arr[i]){
//                 max = arr[i];
//             }
//         }
        
//         int min = arr[0];
//         for(int j=1;j<5;j++){
//             if(min>arr[j]){
//                 min = arr[j];
//             }
//         }

//         System.out.println("The maximum in the array is: "+max);
//         System.out.println("The minimum in the arrray is :"+min);
//     }
// }

//------>>> Reversing an array


// public class Arrayas {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//          int[] arr = new int[5];
//          System.out.print("Enter no of elements:");
//          int n = sc.nextInt();
//          for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//          }
        
//         System.out.println(Arrays.toString(arr));
//         //swap(arr,0,5);
//         Reverse(arr);
//         System.out.println("The Reversed array : "+Arrays.toString(arr));


//     }

//     static void Reverse(int[] arr){
//         int start = 0;
//         int end = arr.length-1;

//         while(start<end){
//             swap(arr,start,end);
//             start++;
//             end--;
//         }
//     }
//     static void swap(int[] arr,int index1 ,int index2){
//         int temp =arr[index1];
//         arr[index1] = arr[index2];
//         arr[index2] = temp;
//         }
// }

