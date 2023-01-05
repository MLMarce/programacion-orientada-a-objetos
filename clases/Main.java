package clases;

public class Main {
    public static void main() {
        Persona persona = new Persona();
        persona.setEdad(25);
        persona.setNombre("Marcelo");
        persona.setTelefono(324512313);
        int edad = persona.getEdad();
        String nombre = persona.getNombre();
        int telefono = persona.getTelefono();

        System.out.println(edad);
        System.out.println(nombre);
        System.out.println(telefono);
    
    }
    
}


class Persona {
    private int edad;
    private String nombre;
    private int telefono;
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return this.telefono;
    }
}