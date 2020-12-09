mport java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        int A;
        int mayor=0; int menor=Integer.MAX_VALUE;
        int sumatorio=0;
        for (int i = 0; i < 50; i++) {
          A=(int) (Math.random()*100)+100;
           System.out.print(" "+A);
          if (A>mayor) {
              mayor=A;
          }
          if (A<menor) {
              menor=A;
         
          
          } 
         sumatorio+=A;
        }System.out.println("");
        System.out.println("El mayor es "+mayor);
        System.out.println("El menor es "+menor);
        System.out.println("La media es "+(sumatorio/50));
    }
    
}

