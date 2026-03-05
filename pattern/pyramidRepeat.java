class pyramidRepeat{
    public static void main(String[] args){
        int space=0;
        for(int i=1;i<5;i++){
            for(space=5;space>=i;space--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
            System.out.print(i+ " ");
            }
        System.out.println(" ");
    }
    }
}