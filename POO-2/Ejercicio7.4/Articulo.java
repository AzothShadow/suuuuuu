public class Articulo {
    //Como valores predeterminados inicializo todo a 0 y nombre a cadena vacia, de manera que en caso de error el producto se queda con estos valores

    String nombre = "";
    float precio = 0f;
    int iva = 0;
    int cuantosQuedan = 0;

    public Articulo(String nom, float pv, int iva, int cQuedan) {

        if (nom == null || iva <= 0 || pv <= 0 || cQuedan <= 0) {
            System.err.println("Error al intentar crear el articulo");
        }

        else {
            nombre = nom;
            precio = pv;
            this.iva = iva;
            cuantosQuedan = cQuedan;
        }

    }

}
