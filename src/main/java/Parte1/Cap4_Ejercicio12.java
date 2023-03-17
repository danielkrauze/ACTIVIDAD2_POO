/*
12. Determinar la cantidad de dinero recibida por un trabajador por concepto de las horas semanales trabajadas en una empresa, sabiendo que cuando las horas de trabajo exceden de 40, el resto se considera horas extras y se pagan al doble de una hora normal, cuando no exceden de 8; si las horas extras exceden de 8, se pagan las primeras 8 al doble de lo que se paga una hora normal y el resto al triple. Del trabajador se conocen los siguientes datos: nombres, número de horas trabajadas en la semana y valor recibido por una hora normal de trabajo.
 */
package Parte1;
import javax.swing.JOptionPane;

/**
 * @author daniel_krauze
 */
public class Cap4_Ejercicio12 {
    public static void main(String[] args) {
        // Definimos las variables de acuerdo con los requerimientos del problema:
        String NOM;
        int NHT, HET, HEE8;
        Double VHN, SALARIO;
        //Solicitamos al usuario que ingrese los datos del empleado:
        NOM = JOptionPane.showInputDialog("Por favor ingrese el nombre del trabajador: ");
        NHT = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el número de horas trabajadas por "+NOM+": "));
        VHN = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el valor de la hora de trabajo para "+NOM+": "));
        SALARIO = NHT*VHN;
        //A continuación se hace el procesamiento de los datos ingresados por el usuario:
        if(NHT > 40){
            HET = NHT - 40;
            if(HET > 8){
                HEE8 = HET - 8;
                SALARIO = 40*VHN+16*VHN+HEE8*3*VHN;
                JOptionPane.showMessageDialog(null, "El trabajador, "+NOM+" devengó: $"+SALARIO);
                }
            else {
                SALARIO = 40*VHN+HET*2*VHN;
                JOptionPane.showMessageDialog(null, "El trabajador, "+NOM+" devengó: $"+SALARIO);
                }
            }
        else{
            JOptionPane.showMessageDialog(null, "El trabajador, "+NOM+" devengó: $"+SALARIO);
        }
    }
}
