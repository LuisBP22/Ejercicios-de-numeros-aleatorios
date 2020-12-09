package ejercicios_6.pkg3;

public class Ejercicio_1 {

    public static void main(String[] args) {
        
        int sum=0,a;
        
        for (int i = 0; i < 3; i++) {
         a=(int) ((Math.random()*7)+1);
            
        sum=sum+a;
            System.out.println(a);
        }
        System.out.println("la suma de los dados son: "+sum);
        
        
        
    }
    
}

