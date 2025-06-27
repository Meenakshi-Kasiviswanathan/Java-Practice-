package assignment;
import java.util.*;

public class patterns {
    public static void main(String[] args) {
    
    /* question on patterns. 
     * * * *
     * * * *
     * * * *
     * * * *
    */

    // for(int i=0 ; i<4; i++){ 
    //     for(int j=0;j<4;j++){
    //         System.out.print("* ");

    //     }
    //     System.out.println(" ");
    // }

    /*

    desinging a pattern based onthe input given using methods
     
     */

//      Scanner sc = new Scanner(System.in);
//      int t = sc.nextInt();
//      for(int i=0;i<t;i++){
//         int num = sc.nextInt();
//         star(num);
//      }

     
    
   
// }

//     static void star(int num){
       
//         for(int i=0;i<num;i++){
//             for(int j=0;j<num;j++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }


        // printing the following pattern

        /*
         * 
         * *
         * * *
         * * * * 
         */
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        //  for(int i=0; i<n;i++){
        //     for(int j=0; j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println(" ");
        //  }

        // printing the following pattern
        /*
         1
         1 2
         1 2 3 
         1 2 3 4
         */

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        //  for(int i=0; i<n;i++){
        //     for(int j=1; j<=i+1;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println(" ");
        //  }

        //printing the following pattern

        /*
         1
         2 2
         3 3 3
         4 4 4 4
         */

         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

         for(int i=1; i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
         }




    }
}
