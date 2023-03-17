/*
 18. Se tiene la siguiente información de un empleado:
· código del empleado,
· nombres,
· número de horas trabajadas al mes,
· valor hora trabajada,
· porcentaje de retención en la fuente.
Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto.
*/
package Parte1;
import javax.swing.JOptionPane;
/**
 * @author daniel_krauze
 */
public class Cap3_Ejercicio18 {
    public static void main(String[] args) {
        // Definimos las variables de acuerdo con los requerimientos del problema:
        int horasTrabajadas;
        double valorHora, reteFuente, salarioBruto, salarioNeto;
        String nombreEmpleado, codEmpleado;
        //Solicitamos al usuario que ingrese los datos del empleado:
        codEmpleado = JOptionPane.showInputDialog("Por favor ingrese el código del empleado: ");
        nombreEmpleado = JOptionPane.showInputDialog("Por favor ingrese el nombre del empleado: ");
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese las horas laboradas en el mes por el empleado: "));
        valorHora = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el de la hora laborada para el empleado: "));
        reteFuente = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el porcentaje de la retención en la fuente para el empleado: "));
        //A continuación se hace el procesamiento de los datos ingresados por el usuario:
        salarioBruto = valorHora*horasTrabajadas;
        salarioNeto = salarioBruto*(1-reteFuente*0.01);
        //Ahora mostramos la salida de datos solicitada por el enunciado del problema:
        JOptionPane.showMessageDialog(null, "El código del empleado es "+codEmpleado+".\nSu nombre es "+nombreEmpleado+".\nSu salario bruto es "+salarioBruto+" COP.\nSu salario neto es "+salarioNeto+" COP.");
    }
}
