public class Rectangulo {

    private int x1 = 0;
    private int x2 = 0;
    private int y1 = 0;
    private int y2 = 0;

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

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public void setX1(int nX1) {
        if (nX1 >= x2) {
            System.err.println("Error al tratar de cambiar los datos...");
        }
        else {
            x1 = nX1;
        }
    }

    public void setY1(int nY1) {
        if (nY1 >= y2) {
            System.err.println("Error al tratar de cambiar los datos...");
        }
        else {
            y1 = nY1;
        }
    }

    public void setX2(int nX2) {
        if (nX2 <= x1) {
            System.err.println("Error al tratar de cambiar los datos...");
        }
        else {
            x2 = nX2;
        }
    }

    public void setY2(int nY2) {
        if (nY2 <= y1) {
            System.err.println("Error al tratar de cambiar los datos...");
        }
        else {
            y2 = nY2;
        }
    }

}
