// Write programs to print the following structure:
//      *
//    * * *
//   * * * * *
// * * * * * * *

class Pattern1{
    public static void main(String[] args){
        for(int i=0;i<=4;i++){
            for(int j = 0; j<4-i ;j++){
                System.out.print("  ");
            }
            for(int j=0; j<i*2-1 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}