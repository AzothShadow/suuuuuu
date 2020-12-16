public class Rectangulo {

    int x1 = 0, x2 = 0, y1 = 0, y2 = 0;

    public void coordenadas() {
        
        System.out.println("Las coordenadas de los cuatro puntos que forman este rectangulo son:");
        System.out.println("(" + x1 + ", " + y1 + ")" +  ", " + "(" + x1 + ", " + y2 + ")"
        +  ", " + "(" + x2 + ", " + y1 + ")" +  " y " + "(" + x2 + ", " + y2 + ")");

    }

    public void perimetro() {

        int perimetro = 0, alto = 0, largo = 0;
        largo = (x2 - x1);
        alto = (y2 - y1);
        largo = (largo < 0)? Math.abs(largo):largo;
        alto = (alto < 0)? Math.abs(alto):alto;
        perimetro = largo * 2 + alto * 2;
        System.out.println("El perimetro del rectangulo es " + perimetro);

    }

    public void area() {

        int area = 0;
        area = (x2 - x1) * (y2 - y1);
        System.out.println("El area del rectangulo es " + area);

    }

}
