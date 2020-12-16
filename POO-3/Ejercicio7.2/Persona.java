public class Persona {

    private String dni = "";
    private String nombre = "";
    private String apellidos = "";
    private int edad = -1;

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

    public String getDNI() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setDNI(String nDNI) {
        dni = nDNI;
    }

    public void setNombre(String nNom) {
        nombre = nNom;
    }

    public void setApellidos(String nApe) {
        apellidos = nApe;
    }

    public void setEdad(int nEdad) {
        edad = nEdad;
    }

}
