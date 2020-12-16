import java.util.Scanner;

public class Ejercicio72 {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el DNI");
        persona1.dni = sc.nextLine();

        System.out.println("Introduce el nombre");
        persona1.nombre = sc.nextLine();

        System.out.println("Introduce los apellidos");
        persona1.apellidos = sc.nextLine();

        System.out.println("Introduce la edad");
        persona1.edad = sc.nextInt();
        sc.nextLine();      //Limpiando buffer de teclado

        System.out.println("Introduce el DNI");
        persona2.dni = sc.nextLine();

        System.out.println("Introduce el nombre");
        persona2.nombre = sc.nextLine();

        System.out.println("Introduce los apellidos");
        persona2.apellidos = sc.nextLine();

        System.out.println("Introduce el edad");
        persona2.edad = sc.nextInt();
        sc.nextLine();     //Limpiando buffer de teclado

        if (persona1.edad >= 18) {
            System.out.println(persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni + " es mayor de edad");
        }
        else {
            System.out.println(persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni + " no es mayor de edad");
        }
        if (persona2.edad >= 18) {
            System.out.println(persona2.nombre + " " + persona2.apellidos + " con DNI " + persona2.dni + " es mayor de edad");
        }
        else {
            System.out.println(persona2.nombre + " " + persona2.apellidos + " con DNI " + persona2.dni + " no es mayor de edad");
        }

    }

}
