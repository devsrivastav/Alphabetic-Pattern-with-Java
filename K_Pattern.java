package Basics_Programming.PatternsProgrammin;

public class K_Pattern {
    public static void main(String[] args) {
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                if (j==1 || (j==6-i)|| (i==2+j)) {
                    System.out.print("*");                  
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
