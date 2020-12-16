public class CuentaBancaria {

    private String nombre;
    private String apellidos;
    private float saldo;
    private String iban;

    public CuentaBancaria(String nombre, String apellidos, String iban) {
        saldo = 0f;
        boolean prueba = true;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.iban = iban;

        //prueba = comprobarIBAN(iban);
        //System.out.println("Boolean = " + prueba);
    }

    //Esto es para comprobar que el iban es valido (por ahora no hay que hacerlo)
    /*private boolean comprobarIBAN(String s) {
        boolean err = true;
        char[] comprobante = s.toCharArray();;

        if (comprobante.length == 24) {
            for (int i = 0; i < comprobante.length; i++) {
                if (i < 2) {
                    if (comprobante[i] < 'A' || comprobante[i] > 'z') {
                        err = false;
                    }
                }
                else if (comprobante[i] < '0' || comprobante[i] > '9') {
                    err = false;
                }
            }
        }

        else {
            err = false;
        }

        return err;
    }*/

}
