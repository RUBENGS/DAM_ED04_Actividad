/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;


public class Main {

    public static void main(String[] args) {
        CCuenta cuentaDAM;
        double saldoActual;

        cuentaDAM = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuentaDAM.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operaciones_cuenta(cuentaDAM);
    }
    
    public static void operaciones_cuenta(CCuenta cuentaDAM){
        try {
            final float cantidad = 2300;
            cuentaDAM.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            final float cantidad = 695;
            cuentaDAM.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
