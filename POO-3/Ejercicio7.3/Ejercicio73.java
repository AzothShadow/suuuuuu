public class Ejercicio73 {

    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo(0, 0, 5, 5);
        Rectangulo r2 = new Rectangulo(7, 9, 2, 3);

        r1.coordenadas();
        r1.perimetro();
        r1.area();

        r2.coordenadas();
        r2.perimetro();
        r2.area();

        r1.setX1(r1.getX1() + 2); // Aunmentamos en dos el valor de "x" del primer punto
        r1.setY1(r1.getY1() - 4); // Disminuimos en 4 el valor de "x" del primer punto
        r1.setX2(r1.getX2() * 3); // Multiplicamos por 3 el valor de "x" del segundo punto
        r1.setY2(r1.getY2() / 2); // Dividimos entre 2 el valor de "y" del segundo punto

        r1.coordenadas();
        r1.perimetro();
        r1.area();

        r1.setX1(300); //Ha de dar error al ser un numero mayor que el de la coordenada x2
        r1.setY2(-100); //Ha de dar error al ser un numero menor que el de la coordenada y1

    }

}
