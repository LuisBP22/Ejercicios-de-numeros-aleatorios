package ejercicios6_3;
public class Ejercicio_3 {

    public static void main(String[] args) {
        int p, c;
        p = (int) (Math.random() * 4);
        c = (int) (Math.random() * 10) + 1;
        switch (p) {
            case 0:
                System.out.println("Espadas");
                break;

            case 1:
                System.out.println("Bastos");
                break;

            case 2:
                System.out.println("Oros");
                break;

            case 3:
                System.out.println("Copas");
                break;
        }
        switch (c) {
            case 1:
                System.out.println("As");
                break;
            case 2, 3, 4, 5, 6, 7:
                System.out.println(c);
                break;
            case 8:
                System.out.println("Sota");
                break;
            case 9:
                System.out.println("Caballo");
                break;
            case 10:
                System.out.println("Rey");
                break;
        }

    }
}
