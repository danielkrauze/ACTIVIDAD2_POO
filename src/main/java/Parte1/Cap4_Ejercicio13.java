/*
Ejercicio resuelto Nº 13
Un almacén efectúa una promoción en la cual se hace un descuento sobre el valor de la
compra total, según el color de la bolita que el cliente saque al pagar en la caja. Si la bolita
es blanca no se le hará descuento alguno, si es verde se le hará un 10% de descuento, si es
amarilla un 25%, si es azul un 50% y si es roja un 100%. Hacer un algoritmo para determinar la cantidad final que un
cliente deberá pagar por su compra. Se sabe que sólo hay bolitas de los colores
mencionados.
 */
package Parte1;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel_krauze
 */
public class Cap4_Ejercicio13 {
   public static void main(String[] args) {
        // Definimos las variables de acuerdo con los requerimientos del problema:
        String COLOR;
        double VALCOMP, PDES = 0, VALPAG = 0;
        //Solicitamos al usuario que ingrese los datos del empleado:
        VALCOMP = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el valor de la compra: "));
        COLOR = JOptionPane.showInputDialog("Por favor ingrese el color de la balota sacada por el cliente en caja -Use sólo mayúsculas-: ");
       //A continuación se hace el procesamiento de los datos ingresados por el usuario:
       switch (COLOR) {
           case "VERDE" -> {
               PDES = 0.1;
               VALPAG = VALCOMP*(1-PDES);
               JOptionPane.showMessageDialog(null, "El valor de la compra es, $"+VALCOMP+".\nEl color de la balota fue: "+COLOR+".\nEl descuento es del "+PDES*100+"%.\nEl valor a pagar es: $"+VALPAG);
           }
           case "AMARILLO" -> {
               PDES = 0.25;
               VALPAG = VALCOMP*(1-PDES);
               JOptionPane.showMessageDialog(null, "El valor de la compra es, $"+VALCOMP+".\nEl color de la balota fue: "+COLOR+".\nEl descuento es del "+PDES*100+"%.\nEl valor a pagar es: $"+VALPAG);
           }
           case "AZUL" -> {
               PDES = 0.5;
               VALPAG = VALCOMP*(1-PDES);
               JOptionPane.showMessageDialog(null, "El valor de la compra es, $"+VALCOMP+".\nEl color de la balota fue: "+COLOR+".\nEl descuento es del "+PDES*100+"%.\nEl valor a pagar es: $"+VALPAG);
           }
           case "ROJO" -> {
               PDES = 1;
               VALPAG = VALCOMP*(1-PDES);
               JOptionPane.showMessageDialog(null, "El valor de la compra es, $"+VALCOMP+".\nEl color de la balota fue: "+COLOR+".\nEl descuento es del "+PDES*100+"%.\nEl valor a pagar es: $"+VALPAG);
           }
           default -> JOptionPane.showMessageDialog(null, "El valor de la compra es, $"+VALCOMP+".\nEl color de la balota fue: "+COLOR+".\nEl descuento es del "+PDES+"%.\nEl valor a pagar es: $"+VALPAG);
       }
    }
}
