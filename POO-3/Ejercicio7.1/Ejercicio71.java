public class Ejercicio71 {

    public static void main(String[] args) {

        Punto punto1 = new Punto(5, 0);
        Punto punto2 = new Punto(10, 10);
        Punto punto3 = new Punto(-3, 7);

        System.out.println("\nLa coordenada x del punto 1 es: "+ punto1.getX());
        System.out.println("La coordenada y del punto 1 es: "+ punto1.getY());
        System.out.println("La coordenada x del punto 2 es: "+ punto2.getX());
        System.out.println("La coordenada y del punto 2 es: "+ punto2.getY());
        System.out.println("La coordenada x del punto 3 es: "+ punto3.getX());
        System.out.println("La coordenada y del punto 3 es: "+ punto3.getY());

        punto1.setX(punto1.getX() + 3);
        punto1.setY(punto1.getY() + 3);

        System.out.println("\nLa coordenada x del punto 1 ahora es: "+ punto1.getX());
        System.out.println("La coordenada y del punto 1 ahora es: "+ punto1.getY());
        //Los valores se incrementan en 3

        punto2.setX(punto2.getX() * 2);
        punto2.setY(punto2.getY() * 2);

        System.out.println("\nLa coordenada x del punto 2 ahora es: "+ punto2.getX());
        System.out.println("La coordenada y del punto 2 ahora es: "+ punto2.getY());
        //Los valores se duplican

        punto3.setX(punto3.getX() - 2);
        punto3.setY(punto3.getY() - 3);

        System.out.println("\nLa coordenada x del punto 3 ahora es: "+ punto3.getX());
        System.out.println("La coordenada y del punto 3 ahora es: "+ punto3.getY() + "\n");
        //Los valores disminuyen en funcion de la resta realizada

    }

}
