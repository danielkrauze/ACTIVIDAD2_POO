/*
24. Se tienen tres esferas (A, B, C) de diferente peso, elaborar un algoritmo que determine cuál es
la esfera de mayor peso.
 */
package Parte1;
import javax.swing.JOptionPane;

/**
 * @author daniel_krauze
 */
public class Cap4_Ejercicio24 {
        public static void main(String[] args) {
        // Definimos las variables de acuerdo con los requerimientos del problema:
        int PEA, PEB, PEC;
        //Solicitamos al usuario que ingrese los datos del empleado:
        PEA = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese peso de la esfera A: "));
        PEB = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese peso de la esfera B: "));
        PEC = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese peso de la esfera C: "));
        //A continuación se hace el procesamiento de los datos ingresados por el usuario:
        if((PEA != PEB) && (PEA != PEC) && (PEB != PEC)){
            if((PEA > PEB) && (PEA > PEC)){
                JOptionPane.showMessageDialog(null, "La esfera de mayor peso es A.");
                }
            else if((PEB > PEA)&&(PEB > PEC)) {
                JOptionPane.showMessageDialog(null, "La esfera de mayor peso es B.");
                }
            else if((PEC > PEA)&&(PEC > PEB)) {
                JOptionPane.showMessageDialog(null, "La esfera de mayor peso es C.");
                }
            }
        else{
            JOptionPane.showMessageDialog(null, "Error: Los números no pueden ser iguales entre sí.");
        }
    }
}
