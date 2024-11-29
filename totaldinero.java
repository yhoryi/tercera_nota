
public class Main {
    public static void main(String[] args) {
     int saldoInicial=1000;
     int cantidadRetiradaPorSemana=200;
     int semanas=4;
     int saldoFinal=saldoInicial-(semanas*cantidadRetiradaPorSemana);
     System.out.println("saldo total al final de mes: $"+saldoFinal);
    }
}
