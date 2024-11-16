package GestordePersonas;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorPersonas gestor = new GestorPersonas();

        System.out.print("Ingrese la cantidad de personas a capturar: ");
        int cantidadPersonas = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("\nIngrese los datos de la persona " + (i + 1) + ":");
            
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); 
            
            System.out.print("Género (Masculino/Femenino): ");
            String genero = scanner.nextLine();
            
            System.out.print("Estatura (cm): ");
            double estatura = scanner.nextDouble();
            
            System.out.print("Peso (kg): ");
            double peso = scanner.nextDouble();
            scanner.nextLine();

            Persona persona = new Persona(nombre, apellido, edad, genero, estatura, peso);
            gestor.agregarPersona(persona);
        }

        // Mostrar todas las personas
        System.out.println("\nPersonas capturadas:");
        for (Persona p : gestor.obtenerPersonas()) {
            System.out.println(p);
        }

        // Mostrar persona con mayor peso
        Persona mayorPeso = gestor.obtenerPersonaMayorPeso();
        System.out.println("\nPersona con mayor peso:");
        System.out.println(mayorPeso);

        // Mostrar persona con menor estatura
        Persona menorEstatura = gestor.obtenerPersonaMenorEstatura();
        System.out.println("\nPersona con menor estatura:");
        System.out.println(menorEstatura);

        // Mostrar promedio de edad
        System.out.printf("\nPromedio de edad: %.2f\n", gestor.calcularPromedioEdad());

        // Mostrar conteo por género
        System.out.println("\nCantidad de personas por género:");
        System.out.println("Masculino: " + gestor.contarGeneroMasculino());
        System.out.println("Femenino: " + gestor.contarGeneroFemenino());

        scanner.close();
    }
}




