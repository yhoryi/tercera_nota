import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
     System.out.println("Ingrese el primer numero");
     int numero1= sc.nextInt();
     System.out.println("Ingrese el segundo numero");
     int numero2= sc.nextInt();
     System.out.println("ingrese el tercer numero");
     int numero3= sc.nextInt();
     double mediaDeTresNumeros = (double)(numero1+numero2+numero3)/3;
     System.out.println("La media de los tres numeros es: "+mediaDeTresNumeros);
    }
}
