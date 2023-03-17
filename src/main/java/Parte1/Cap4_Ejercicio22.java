/*
22. Elaborar un algoritmo que, entre el nombre de un empleado, su salario básico por hora y el
número de horas trabajadas en el mes; escriba su nombre y salario mensual si éste es mayor
de $450.000, de lo contrario escriba sólo el nombre.
 */
package Parte1;
import javax.swing.JOptionPane;

/**
 * @author daniel_krauze
 */
public class Cap4_Ejercicio22 {
    public static void main(String[] args) {
        // Definimos las variables de acuerdo con los requerimientos del problema:
        String NOM;
        int HTM;
        double SBH, SM;
        //Solicitamos al usuario que ingrese los datos del empleado:
        NOM = JOptionPane.showInputDialog("Por favor ingrese el nombre del empleado: ");
        SBH = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el salario basico por hora del empleado "+NOM+": "));
        HTM = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la cantidad de horas trabajadas en el mes por "+NOM+": "));
        SM = SBH*HTM;
        //A continuación procesamos los datos:
        if (SM > 450000){
            JOptionPane.showMessageDialog(null, "El nombre del empleado es "+NOM+" y su salario mensual es "+SM);
        }
        else{
            JOptionPane.showMessageDialog(null, "El nombre del empleado es "+NOM+".");
        }
    }
}
