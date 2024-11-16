package GestordePersonas;

import java.util.ArrayList;
import java.util.List;

public class GestorPersonas {
    private List<Persona> personas;

    public GestorPersonas() {
        this.personas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public List<Persona> obtenerPersonas() {
        return personas;
    }

    public Persona obtenerPersonaMayorPeso() {
        if (personas.isEmpty()) {
            return null;
        }
        Persona personaMayorPeso = personas.get(0);
        for (Persona persona : personas) {
            if (persona.getPeso() > personaMayorPeso.getPeso()) {
                personaMayorPeso = persona;
            }
        }
        return personaMayorPeso;
    }

    public Persona obtenerPersonaMenorEstatura() {
        if (personas.isEmpty()) {
            return null;
        }
        Persona personaMenorEstatura = personas.get(0);
        for (Persona persona : personas) {
            if (persona.getEstatura() < personaMenorEstatura.getEstatura()) {
                personaMenorEstatura = persona;
            }
        }
        return personaMenorEstatura;
    }

    public double calcularPromedioEdad() {
        if (personas.isEmpty()) {
            return 0;
        }
        double sumaEdades = 0;
        for (Persona persona : personas) {
            sumaEdades += persona.getEdad();
        }
        return sumaEdades / personas.size();
    }

    public int contarGeneroMasculino() {
        int contador = 0;
        for (Persona persona : personas) {
            if (persona.getGenero().equalsIgnoreCase("Masculino")) {
                contador++;
            }
        }
        return contador;
    }

    public int contarGeneroFemenino() {
        int contador = 0;
        for (Persona persona : personas) {
            if (persona.getGenero().equalsIgnoreCase("Femenino")) {
                contador++;
            }
        }
        return contador;
    }
}
