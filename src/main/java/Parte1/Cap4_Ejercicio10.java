/*
Ejercicio resuelto Nº 10
Cierta universidad para liquidar el pago de matrícula de un estudiante le exige los
siguientes datos:
• Número de inscripción
• Nombres
• Patrimonio.
• Estrato social.
La universidad cobra un valor constante para cada estudiante de $50.000. Si el patrimonio
es mayor que $2´000.000 y el estrato superior a 3, se le incrementa un porcentaje del 3%
sobre el patrimonio. Hacer un algoritmo que muestre:
• Número de inscripción.
• Nombres.
• Pago de matrícula.
*/

package Parte1;
import javax.swing.JOptionPane;

/**
 * @author daniel_krauze
 */
public class Cap4_Ejercicio10 {
    public static void main(String[] args) {
        // Definimos las variables de acuerdo con los requerimientos del problema:
        int EST;
        double PAGMAT, PAT;
        String NOM, NI;
        //Solicitamos al usuario que ingrese los datos del estudiante:
        NI = JOptionPane.showInputDialog("Por favor ingrese el número de inscripción del estudiante: ");
        NOM = JOptionPane.showInputDialog("Por favor ingrese el nombre del estudiante: ");
        PAT = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el patrimonio declarado por el estudiante: "));
        EST = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el estrato socioeconómico del estudiante: "));
        //A continuación se hace el procesamiento de los datos ingresados por el usuario:
        PAGMAT = 50000;
        if((PAT>2000000) && (EST > 3)){
            PAGMAT = PAGMAT + 0.03*PAT;
            JOptionPane.showMessageDialog(null, "El estudiante con número de inscripción "+NI+" y nombre "+NOM+" debe pagar "+PAGMAT+" COP.");
        }
        else{
            JOptionPane.showMessageDialog(null, "El estudiante con número de inscripción "+NI+" y nombre "+NOM+" debe pagar "+PAGMAT+" COP.");
        }
    }
}
