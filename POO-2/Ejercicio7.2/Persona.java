public class Persona {

    String dni, nombre, apellidos;
    int edad;

    public Persona(String id, String nom, String ape, int age) {
        dni = id;
        nombre = nom;
        apellidos = ape;
        edad = age;
    }

    public Persona(String nom, String ape, int age) {
        dni = "";
        nombre = nom;
        apellidos = ape;
        edad = age;
    }

}
