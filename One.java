package assignment;

import java.util.*;

// Define two methods to print the maximum 
//and the minimum number respectively among three numbers
// entered by the user.

/* 
public class One {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int max = maximun(n1,n2,n3);
        int min = minimum(n1,n2,n3);
        System.out.println("The maximum is:"+max+ "\nThe minimum is:"+min);
    }
    
    static int maximun(int a,int b,int c){
        int max =a;
        if(a<b){
            max=b;
        }
        if(a<c){
            max=c;
        }
       
        return max;
    }
    static int minimum(int m,int n,int o){
        int min=m;
        if(min>n){
            min=n;
        }
        if(min>o){
            min=o;
        }
        return min;
    }
    
}

*/

//2.Define a program to find out whether a given number is even or odd.

/* 

public class One{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        OddorEven(num);
    }

    static void OddorEven(int n){
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}

*/


//3.A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.

/* 
public class One{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        Vaild(age);

    }
    
    static void Vaild(int age){
        if (age >= 18) {
            System.out.println("The cadidate is eligible for voting" );
        }
        else{
            System.out.println("The candiate is not eligible.");
        }
    }
}
*/


//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:


// Marks        Grade 
// 91-100         AA 
// 81-90          AB 
// 71-80          BB 
// 61-70          BC 
// 51-60          CD 
// 41-50          DD 
// <=40          Fail 

public class One{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of subjects: ");
        int n = sc.nextInt();
        float marks,totmak=0,per;
        for(int i=0;i<n ; i++){
            System.out.print("Enter the marks of "+(i+1)+"Subject : ");
            marks = sc.nextInt();
            totmak += marks;
        }
        System.out.println("The total marks is : "+totmak);
        per = (totmak/(n*100)) *100;
        System.out.println("The Perrcentage is : "+per);
        Score(per);
    }
    static void Score(float per){
        float scr = per;
        System.out.print("Your overall grade is: ");
        if(scr >=90){
            System.out.print("A+");
        }
        else if(scr>= 70 && scr <= 89){
            System.out.print("A");
        }
        else if(scr >= 60 && scr <= 69){
            System.out.print("B");
        }
        else if(scr >= 50 && scr <= 59){
            System.out.println("C");
        }
        else{
            System.out.print("D");
        }
    }

    
}
