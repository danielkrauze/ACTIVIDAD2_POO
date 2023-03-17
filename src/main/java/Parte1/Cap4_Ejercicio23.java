/*
23. Dados los valores A, B y C que son los parámetros de una ecuación de segundo grado,
elaborar un algoritmo para hallar las posibles soluciones de dicha ecuación.
 */
package Parte1;
import javax.swing.JOptionPane;

/**
 * @author daniel_krauze
 */
public class Cap4_Ejercicio23 {
    public static void main(String[] args) {
        // Definimos las variables de acuerdo con los requerimientos del problema:
        double A, B, C, D, SU, S1, S2;
        //Solicitamos al usuario que ingrese los datos del empleado:
        A = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el valor de A: "));
        B = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el valor de B: "));
        C = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el valor de C: "));
        //A continuación se hace el procesamiento de los datos ingresados por el usuario:
        D = Math.sqrt(Math.pow(B, 2)-4*A*C);
        if(D >= 0){
            if(D != 0){
                S1 = (-B+Math.sqrt(Math.pow(B, 2)-4*A*C))/(2*A);
                S2 = (-B-Math.sqrt(Math.pow(B, 2)-4*A*C))/(2*A);
                JOptionPane.showMessageDialog(null, "La ecuación cuadrática tiene dos soluciones en los reales.\nLa primera solución es S1 = "+S1+".\nLa segunda solución es S2 = "+S2);
                }
            else {
                SU = -B/(2*A);
                JOptionPane.showMessageDialog(null, "La ecuación cuadrática tiene solución única, igual a "+SU);
                }
            }
        else{
            JOptionPane.showMessageDialog(null, "La ecuación de segundo grado no tiene soluciones en los reales.");
        }
    }
}
