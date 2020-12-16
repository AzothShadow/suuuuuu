public class Ejercicio74 {
    
    public static void main(String[] args) {
    
        Articulo a1 = new Articulo();

        a1.nombre = "Pijama";
        a1.precio = 10;
        a1.cuantosQuedan = 7;
        float pvp = 0;

        pvp = a1.precio * (float)a1.iva / 100f + a1.precio;

        System.out.println(a1.nombre + " - Precio: " + a1.precio + " - IVA: " + a1.iva + "% - PVP: " + pvp);
        
        a1.precio = 15;
        pvp = a1.precio * (float)a1.iva / 100f + a1.precio;
        
        System.out.println(a1.nombre + " - Precio: " + a1.precio + " - IVA: " + a1.iva + "% - PVP: " + pvp);
        
    }

}
