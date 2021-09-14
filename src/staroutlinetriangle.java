import java.util.Scanner;

public class staroutlinetriangle {
    public static void main(String args[]){
        int j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit");
        int limit=sc.nextInt();
        char array[]=new char[limit];
        for(int i=0;i<=limit-1;i++){
            array[i]='*';
        }
        for(j=0;j<limit;j++){
            for(k=0;k<=j;k++){
                if(k==0||k==j) {
                    System.out.print(array[j] + " ");
                }
                else if(j==limit-1){
                    System.out.print(array[k]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
