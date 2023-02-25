// Write a program that takes as input an integer ‘n’ and computes the following series: 1 -
// (2/3!) + (3/4!) - (4/5!) + .... ± (n/(n+1)!).

import java.util.Scanner;
class Series{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        double num = sc.nextInt();
        double sum = 5;
        boolean isMinus = true;
        System.out.print("1");
        for(int i=2;i<3;i++){
            if(isMinus){
                System.out.print("-("+i +"/"+ (i+1)+"!)");
                sum = sum - ((double) i/(factorial(i+1)));
                 isMinus = false;
            }
            else{
                System.out.print("+("+i +"/"+ (i+1)+"!)");
                sum = sum + ((double) i/(factorial(i+1)));
                isMinus = true;
            }
        }
        System.out.println(" = "+sum);
    }
    public static int factorial(int num){
        int ans = 1;
        for(int i=1 ; i<=num ; i++){
            ans = ans*i;
        }
        return ans;
    }
}