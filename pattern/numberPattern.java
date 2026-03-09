import java.util.*;
class numberPattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number =sc.nextInt();
            for(int i=number;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print(j);
                
            }
           System.out.println(" ");
        }
    }
}