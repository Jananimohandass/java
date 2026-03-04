import java.util.*;
class passwordChecker{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Password: ");
        String password=sc.next();
        int upper_count=0,lower_count=0,num_count=0,special_count=0;
        for(int i= 0;i<password.length();i++){
            int ch=password.charAt(i);
            if(ch>='A' && ch<='Z'){
                upper_count++;
            }
            else if(ch>='a' && ch<='z'){
                lower_count++;
            }
            else if(ch>='0' && ch<='9'){
                num_count++;
            }
            else if(ch=='@' || ch=='&'|| ch=='!'){
                special_count++;
            }
           }
           int total=upper_count+lower_count+special_count+num_count;
           if((upper_count>=1 && lower_count>=1 && special_count>=1 && num_count>=1) && total>8){
            System.out.println("Strong password");
           }
           else{
            System.out.println("Weak Password");
           }
}
}