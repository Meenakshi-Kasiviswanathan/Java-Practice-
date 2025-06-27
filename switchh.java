import java.net.SocketPermission;
import java.util.*;
public class switchh {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        //  String fruit = sc.nextLine();

        //  switch(fruit){
        //     case "Mango":
        //     System.out.println("King of fruits");
        //     break;
        //     case "Apple":
        //     System.out.println("A red fruit");
        //     break;
        //     case "orange":
        //     System.out.println("A citrus fruit");
        //     break;
        //     case "grapes":
        //     System.out.println("A bunch of fruit");
        //     break;
        //     default:
        //     System.out.println("No fruit is entered");

        //  }


        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // char op = sc.next().trim().charAt(0);
        // if(op=='+'|| op == '-' || op=='*' || op=='/' || op=='%'){
        //     switch (op){
        //         case '+':
        //         System.out.println(a+b);
        //         break;
        //         case '-':
        //         System.out.println(a-b);
        //         break;
        //         case '*':
        //         System.out.println(a*b);
        //         break;
        //         case '/':
        //         if(b > 0)
        //         System.out.println(a/b);
        //         break;
        //         case '%':
        //         if(b>0)
        //         System.out.println(a%b);
        //         break;
        //         default:
        //         System.out.println("Enter a correct operator");
        //         break;
            

        //     }
        // }

        // Scanner sc = new Scanner(System.in);

        // first char is uppercase or lowercase

        // char ch = sc.next().trim().charAt(0);
        // if (ch >= 'a' && ch <= 'z'){
        //     System.out.println("lowercase");
        // }
        // else{
        //     System.out.println("uppercase");
        // }

        // fibonaaci series

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int a = 0;
        // int b = 1;
        // int sum = 0, count= 2;
        // while(count <= n){
        //     sum = a+b;
        //     a=b ;
        //     b=sum;
        //     count++;
        //     System.out.print(sum+" ");



        // calculator 
        Scanner sc= new Scanner(System.in);
        int ans=0;
        while(true){
            System.out.println("Enter the operator");
            char op = sc.next().trim().charAt(0);
            if(op=='+' || op=='-'|| op =='*' ||op =='/' || op=='%'){
                System.out.println("Enter the 1st number");
                int a = sc.nextInt();
                System.out.println("Enter the second number");
                int b = sc.nextInt();

                if(op=='+'){
                    ans=a+b;
                }
                if(op=='-'){
                    ans=a-b;
                }
                if(op=='*'){
                    ans= a*b;
                }
                if(op == '/'){
                    if(b != 0){
                        ans = a/b;
                    }
                }
                if(op == '%'){
                    ans = a%b;
                }
            }
            else if(op=='X' || op=='x'){
                break;
            }
            else{
                System.out.println("Enter a proper operator");
            }
            System.out.println("The answer is "+ans);
        }


        
        }

        
    }
    

