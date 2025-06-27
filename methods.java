import java.util.*;
public class methods {
    /*

    // Returning  a integer 
    public static void main(String[] args) {
        int answer = sum();
        System.out.println("The answer is :"+answer);
    }
    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thr 1st number:  ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        return sum;
        */

    // returning a string

    /* 
    public static void main(String[] args){

        String wish = greet();
        System.out.println(wish);

    }

    static String greet(){
        String greeting = "how are you?";
        return greeting;
    }

     */

     //with arguments/

        // static return_type (argumnets){
        //     body;
        //     return statment;
        // }


        //sum of numbers using arguments

        /* 
     public static void main(String[] args){

        int answer = sum1(20,34);
        System.out.println("The sume using arguments is : "+answer);
     }
    static int sum1(int a, int b){
        int sum = a+b;
        return sum;
    }

    */

    /* 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String nam = sc.next();
        String name = greet(nam);
        System.out.println(name);
    }

    static String greet(String nam){
        String greeting = "Hello " + nam +" !";
        return greeting;

    }

    */


    //primitive - int char String float cant be change the original value by another function class
    //example - it doesnt swap the number

    /*
    public static void main(String[] args) {
        int a =10;
        int b=20;
        swap(a,b);
        System.out.println(a+" "+b);
        
    }
    static void swap(int n1, int n2){
        int temp = n1;
        n1= n2;
        n2=temp;
        System.out.println(n1+" "+n2);
        }
    
     */    

    // change of the dafault value

    /* 
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void change(int[] nums){
        nums[3] = 88;
    }
        */

     // print the given number is prime number or not
    //public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int num = sc.nextInt();
    //     int num2 = sc.nextInt();
    //     int num3 = sc.nextInt();
    //     isPrinme(num);
    //     isPrinme(num2);
    //     isPrinme(num3);

    //  }

    // static void isPrinme(int num){
    //     int count =0;
    //     if(num>1){
    //         for(int i=1;i<=num;i++){
    //             if(num%i==0){
    //                 count++;
    //             }

    //         }
    //         if(count==2){
    //             System.out.println("the given number is prime number");
    //         }
    //         else{
    //             System.out.println("The given number is not a prime number");
    //         }
    //     }
    // }


    
    // print the armstrong number
    //  public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
        
    //     for(int i=100;i<1000;i++){
    //         if(isArmstrong(i)){
    //             System.out.print(i+" ");
    //         }  
            
    //     }
        
    // }

    // static boolean isArmstrong(int n){
    //     int org=n;
    //     int rem=0;
    //     int result=0;
    //     while(org>0){
    //         rem=org%10;
    //         result += rem*rem*rem;
    //         org /= 10;
    //     }
    //    return result==n;
       
    // }

    {
//     static int x = 20;
//     public static void main(String[] args) {
//         System.out.println(x);
//         int x = 40;
//         System.out.println(x);
//         fun();
//     }
//     static void fun(){
//         System.out.println(x);
//     }
// }


// Variable length arguments

// VarArgs - is the variable argument when no of input given is not known

// import java.util.Arrays;

// public class Main{
//     public static void main(String args[]){
//         fun(1,5,6,34,64,23,54);
//         mul(10,20,"Meen","nav","dheeps");
//     }
    
//     static void  mul(int a, int b, String ...name){
//         System.out.println(" "+a+" "+b);
//         System.out.println(Arrays.toString(name));
//     }
//     static void fun(int...v){
//         System.out.println(Arrays.toString(v));
//     }
// }

// function overloading
// if both the function have the same name then it is saod to be as the function overloading
// the function name can be same but the arguments should vary either by type or length

    
    // public static void main(String[] args) {
    //     fun(2,3,4);
    //     fun(34);
    // }
    // static void fun(int a){
    //     System.out.println(a);
    // }
    // static void fun(int a,int b,int c){
    //     System.out.println(a);
    // }

}


 
   

