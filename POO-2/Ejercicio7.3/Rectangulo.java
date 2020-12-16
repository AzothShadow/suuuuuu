public class Rectangulo {

    int x1 = 0, x2 = 0, y1 = 0, y2 = 0;

    public Rectangulo(int x1, int y1, int x2, int y2) {
        if (x1 >= x2 || y1 >= y2) {
            System.err.println("Error al instanciar Rectangulo...");
        }
        else {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }

    public void coordenadas() {

        System.out.println("Las coordenadas de los cuatro puntos que forman este rectangulo son:");
        System.out.println("(" + x1 + ", " + y1 + ")" +  ", " + "(" + x1 + ", " + y2 + ")"
        +  ", " + "(" + x2 + ", " + y1 + ")" +  " y " + "(" + x2 + ", " + y2 + ")");

    }

    public void perimetro() {

        int perimetro = 0, alto = 0, largo = 0;
        largo = (x2 - x1);
        alto = (y2 - y1);
        perimetro = largo * 2 + alto * 2;
        System.out.println("El perimetro del rectangulo es " + perimetro);

    }

    public void area() {

        int area = 0;
        area = (x2 - x1) * (y2 - y1);
        System.out.println("El area del rectangulo es " + area);

    }

}
