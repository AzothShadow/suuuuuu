public class Ejercicio74 {

    public static void main(String[] args) {

        Articulo a1 = new Articulo("Pijama", 10, 21, 7);
        Articulo a2 = new Articulo(null, 10, 21, 7);
        Articulo a3 = new Articulo("Pijama", 0, 21, 7);
        Articulo a4 = new Articulo("Pijama", 9, -7, 5);
        Articulo a5 = new Articulo("Pijama", 9, 90, -12);
        float pvp = 0;

        pvp = a1.precio * (float)a1.iva / 100f + a1.precio;

        System.out.println(a1.nombre + " - Precio: " + a1.precio + " - IVA: " + a1.iva + "% - PVP: " + pvp);

        a1.precio = 15;
        pvp = a1.precio * (float)a1.iva / 100f + a1.precio;

        System.out.println(a1.nombre + " - Precio: " + a1.precio + " - IVA: " + a1.iva + "% - PVP: " + pvp);
        pvp = a2.precio * (float)a2.iva / 100f + a2.precio;
        System.out.println(a2.nombre + " - Precio: " + a2.precio + " - IVA: " + a2.iva + "% - PVP: " + pvp);
        pvp = a3.precio * (float)a3.iva / 100f + a3.precio;
        System.out.println(a3.nombre + " - Precio: " + a3.precio + " - IVA: " + a3.iva + "% - PVP: " + pvp);
        pvp = a4.precio * (float)a4.iva / 100f + a4.precio;
        System.out.println(a4.nombre + " - Precio: " + a4.precio + " - IVA: " + a4.iva + "% - PVP: " + pvp);
        pvp = a5.precio * (float)a5.iva / 100f + a5.precio;
        System.out.println(a5.nombre + " - Precio: " + a5.precio + " - IVA: " + a5.iva + "% - PVP: " + pvp);

    }

}
