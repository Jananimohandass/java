import java.util.*;
class rightDiamond{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=sc.nextInt();
        //upper
        for( int i=num;i>0;i--){
            for(int j=num;j>=i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //lower
        for(int i=num-1;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
                 }
            System.out.println(" ");
            }
           }
        }