import java.util.*;

public class Arrays {
    public static void main(String[] args) {

        // input of string in an array

        //   Scanner sc = new Scanner(System.in);
        //   String[] str = new String[4];
        //   for(int i=0 ; i < str.length; i++){
        //     str[i] = sc.next();
        //   }
        //   System.out.println(Arrays.toString(str));

        //   str[1] = "Meenakshi";
          
        //   System.out.println(Arrays.toString(str));

        //passing in function
        
    //     int[] nums = {10,20,30,40,50};
    //     System.out.println(Arrays.toString(nums));
    //     change(nums);
    //     System.out.println(Arrays.toString(nums));
    //     }
    // static void change(int[] arr){
    //     arr[0] = 100;
    //     System.out.println(Arrays.toString(arr));


        // two dimensional arrays

        /* 
            1 2 3 
            4 5 6 
            7 8 9
        */ 

        // int[][] arr = new int[3][];

        // int[][] arr2D={
        //     {1,2,3},//0 index
        //     {4,5},//1 index
        //     {7,8,9,6} // 2 index
        // };

        // System.out.println(Arrays.toString(arr2D[2]));
        

        //input

        // Scanner sc = new Scanner(System.in);
        // int[][] arr = new int[3][3];
        // System.out.println(arr.length);
        // for(int row=0; row<arr.length ; row++ ){
        //     for(int col=0; col< arr[row].length ; col++ ){
        //         arr[row][col] = sc.nextInt();
        //     }
        // }

        //output

        // for(int row=0; row<arr.length ; row++ ){
        //     //for(int col=0; col< arr[row].length ; col++ ){
               
        //         //this is to print the whole row and colum as an array
        //        // System.out.print(arr[row][col]+" ");

        //        //this is to print the arrays in row wise in matrix
        //        System.out.print(Arrays.toString(arr[row]));
        //    // }
        //     System.out.println();
        // }


        // enhanced for loop

        // for(int[] a :arr){
        //     System.out.println(Arrays.toString(a));
        // }


        int[][] arr = {
            {2,3,4},
            {4,5},
            {5,6,7,8}
        };

        for(int i=0 ; i<arr.length ; i++){//rows
            for(int j=0; j<arr[i].length ; j++){// column length based on each row
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        
    }

    public static int[] sort(int[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }




}

