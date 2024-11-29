import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("Ingrese su nombre");
     String nombre= sc.nextLine();
     System.out.println("Ingrese su edad");
     int edad= sc.nextInt();
     System.out.println("ingrese su altura");
     double altura= sc.nextDouble();
     System.out.println("hola "+nombre+" tienes "+edad+" años y mides "+altura+" metros");
    }
}
