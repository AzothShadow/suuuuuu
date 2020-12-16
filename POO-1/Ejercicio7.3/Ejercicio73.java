public class Ejercicio73 {

    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo();

        r1.x1 = 0;
        r1.y1 = 0;
        r1.x2 = 5;
        r1.y2 = 5;

        r1.coordenadas();
        r1.perimetro();
        r1.area();

        r2.x1 = 7;
        r2.y1 = 9;
        r2.x2 = 2;
        r2.y2 = 3;

        r2.coordenadas();
        r2.perimetro();
        r2.area();

        r1.x1 = r1.x1 + 2; // Aunmentamos en dos el valor de "x" del primer punto
        r1.y1 = r1.y1 - 4; // Disminuimos en 4 el valor de "x" del primer punto
        r1.x2 = r1.x2 * 3; // Multiplicamos por 3 el valor de "x" del segundo punto
        r1.y2 = r1.y2 / 2; // Dividimos entre 2 el valor de "y" del segundo punto

        r1.coordenadas();
        r1.perimetro();
        r1.area();

    }

}
