public class ejercicio2 {

    public static void main(String[] args) {
       String palo = "";
    String carta = "";
    
    int numeroPalo = (int)(Math.random()*4) + 1;
    
    switch(numeroPalo) {
      case 1:
        palo = "picas";
        break;;
      case 4:
        palo = "tréboles";
      
    }

    int numeroCarta = (int)(Math.random()*13) + 1;
    
    switch(numeroCarta) {
      case 1:
        carta = "As";
        break;
      case 11:
        carta = "J";
        break;
      case 12:
        carta = "Q";
        break;
      case 13:
        carta = "K";
        break;
      default:
        carta=numeroCarta+"";
    }
    
    System.out.println(carta + " de " + palo);
    }
}
