public class Ejercicio74 {

    public static void main(String[] args) {

        Articulo a1 = new Articulo("Pijama", 10, 21, 7);
        Articulo a2 = new Articulo(null, 10, 21, 7);
        Articulo a3 = new Articulo("Pijama", 0, 21, 7);
        Articulo a4 = new Articulo("Pijama", 9, -7, 5);
        Articulo a5 = new Articulo("Pijama", 9, 90, -12);
        float pvp = 0;

        pvp = a1.getPrecio() * (float)a1.getIVA() / 100f + a1.getPrecio();

        System.out.println(a1.getNombre() + " - Precio: " + a1.getPrecio() + " - IVA: " + a1.getIVA() + "% - PVP: " + pvp);

        a1.setPrecio(15);
        pvp = a1.getPrecio() * (float)a1.getIVA() / 100f + a1.getPrecio();

        System.out.println(a1.getNombre() + " - Precio: " + a1.getPrecio() + " - IVA: " + a1.getIVA() + "% - PVP: " + pvp);
        pvp = a2.getPrecio() * (float)a2.getIVA() / 100f + a2.getPrecio();
        System.out.println(a2.getNombre() + " - Precio: " + a2.getPrecio() + " - IVA: " + a2.getIVA() + "% - PVP: " + pvp);
        pvp = a3.getPrecio() * (float)a3.getIVA() / 100f + a3.getPrecio();
        System.out.println(a3.getNombre() + " - Precio: " + a3.getPrecio() + " - IVA: " + a3.getIVA() + "% - PVP: " + pvp);
        pvp = a4.getPrecio() * (float)a4.getIVA() / 100f + a4.getPrecio();
        System.out.println(a4.getNombre() + " - Precio: " + a4.getPrecio() + " - IVA: " + a4.getIVA() + "% - PVP: " + pvp);
        pvp = a5.getPrecio() * (float)a5.getIVA() / 100f + a5.getPrecio();
        System.out.println(a5.getNombre() + " - Precio: " + a5.getPrecio() + " - IVA: " + a5.getIVA() + "% - PVP: " + pvp);

    }

}
