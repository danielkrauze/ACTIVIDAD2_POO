/*
 * Esta clase define objetos de tipo Rombo con un lado como atributo.
 */
package Parte2;

/**
 * @author daniel_krauze
 */
public class Rombo {
    
    //Definimos el atributo diagonal mayor y menor del rombo.
    double mayor, menor;
    
    
    //Definimos el constructor del método rombo.
    Rombo(double mayor, double menor){
        this.mayor = mayor;
        this.menor = menor;
    }
    
    //Definimos el método que calcula el área del rombo.
    double calcularArea(){
        return(mayor*menor)/2;
    }
    
    //Definimos el método que calcula el perímetro del rombo.
    double calcularPerimetro(){
        return 2*Math.sqrt(Math.pow(mayor,2) + Math.pow(menor,2));
    }
}
