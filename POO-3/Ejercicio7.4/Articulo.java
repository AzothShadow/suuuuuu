public class Articulo {
    //Como valores predeterminados inicializo todo a 0 y nombre a cadena vacia, de manera que en caso de error el producto se queda con estos valores

    private String nombre = "";
    private float precio = 0f;
    private int iva = 0;
    private int cuantosQuedan = 0;

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

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public int getIVA() {
        return iva;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setNombre(String nNombre) {
        if (nNombre == null) {
            System.err.println("Error al intentar cambiar el nombre");
        }

        else {
            nombre = nNombre;
        }
    }

    public void setPrecio(float nPrecio) {
        if (nPrecio <= 0) {
            System.err.println("Error al intentar cambiar el precio");
        }

        else {
            precio = nPrecio;
        }
    }

    public void setIVA(int nIVA) {
        if (nIVA <= 0) {
            System.err.println("Error al intentar cambiar el precio");
        }

        else {
            iva = nIVA;
        }
    }

    public void setCuantosQuedan(int nCantidad) {
        if (nCantidad <= 0) {
            System.err.println("Error al intentar cambiar la cantidad de articulos");
        }

        else {
            cuantosQuedan = nCantidad;
        }
    }

}
