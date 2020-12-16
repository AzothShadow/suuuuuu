import java.util.Scanner;

public class Ejercicio72 {

    public static void main(String[] args) {
        //Para usar los dos constructores de la clase persona voy a poner que los menores de 7 no tienen DNI

        String dni = "";
        String nombre = "";
        String apellidos = "";
        int edad = 0;
        Persona persona1;
        Persona persona2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre de la persona 1");
        nombre = sc.nextLine();

        System.out.println("Introduce los apellidos de la persona 1");
        apellidos = sc.nextLine();

        System.out.println("Introduce la edad de la persona 1");
        edad = sc.nextInt();
        sc.nextLine();      //Limpiando buffer de teclado
        if (edad < 7) {
            persona1 = new Persona(nombre, apellidos, edad);
        }
        else {
            System.out.println("Introduce el DNI de la persona 1");
            dni = sc.nextLine();
            persona1 = new Persona(dni, nombre, apellidos, edad);
        }

        System.out.println("Introduce el nombre de la persona 2");
        nombre = sc.nextLine();

        System.out.println("Introduce los apellidos de la persona 2");
        apellidos = sc.nextLine();

        System.out.println("Introduce el edad de la persona 2");
        edad = sc.nextInt();
        sc.nextLine();     //Limpiando buffer de teclado
        if (edad < 7) {
            persona2 = new Persona(nombre, apellidos, edad);
        }
        else {
            System.out.println("Introduce el DNI de la persona 2");
            dni = sc.nextLine();
            persona2 = new Persona(dni, nombre, apellidos, edad);
        }

        if (persona1.getEdad() >= 18) {
            System.out.println(persona1.getNombre() + " " + persona1.getApellidos() + " con DNI " + persona1.getDNI() + " es mayor de edad");
        }
        else {
            if (persona1.getDNI().equals("")) {
                System.out.println(persona1.getNombre() + " " + persona1.getApellidos() + " aun no tiene DNI por ser menor de 7");
            }
            else {
                System.out.println(persona1.getNombre() + " " + persona1.getApellidos() + " con DNI " + persona1.getDNI() + " no es mayor de edad");
            }
        }
        if (persona2.getEdad() >= 18) {
            System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + " con DNI " + persona2.getDNI() + " es mayor de edad");
        }
        else {
            if (persona2.getDNI().equals("")) {
                System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + " aun no tiene DNI por ser menor de 7");
            }
            else {
                System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + " con DNI " + persona2.getDNI() + " no es mayor de edad");
            }
        }

    }

}
