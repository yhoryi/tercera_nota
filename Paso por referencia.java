class Persona {
    String nombre;
}

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "yhoryi";
        cambiarPersona(persona);
        System.out.println("Después de cambiarPersona: " + persona.nombre); // Imprime Hamilton
    }

    public static void cambiarPersona(Persona persona) {
        persona.nombre = "carrascal";
        System.out.println("Dentro de cambiarPersona: " + persona.nombre);  // Imprime Hamilton
    }
}
