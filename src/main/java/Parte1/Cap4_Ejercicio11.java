/*
11. Escribir un algoritmo que acepte tres números enteros diferentes y muestre el mayor de
ellos.
 */

package Parte1;
import javax.swing.JOptionPane;

/**
 * @author daniel_krauze
 */
public class Cap4_Ejercicio11 {
    public static void main(String[] args) {
        // Definimos las variables de acuerdo con los requerimientos del problema:
        int N1, N2, N3;
        //Solicitamos al usuario que ingrese los datos del empleado:
        N1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un número entero: "));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un segundo número entero diferente al anterior: "));
        N3 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un tercer número entero diferentes a los dos anteriores: "));
        //A continuación se hace el procesamiento de los datos ingresados por el usuario:
        if((N1 != N2) && (N1 != N3) && (N2 != N3)){
            if((N1 > N2) && (N1 > N3)){
                JOptionPane.showMessageDialog(null, "El número mayor es "+N1);
                }
            else if((N2 > N1)&&(N2 > N3)) {
                JOptionPane.showMessageDialog(null, "El número mayor es "+N2);
                }
            else if((N3 > N1)&&(N3 > N2)) {
                JOptionPane.showMessageDialog(null, "El número mayor es "+N3);
                }
            }
        else{
            JOptionPane.showMessageDialog(null, "Error: Los números no pueden ser iguales entre sí.");
        }
    }
}
