/*
 * Esta clase define objetos de tipo Trapecio con un lado como atributo.
 */
package Parte2;

/**
 *
 * @author daniel_krauze
 */
public class Trapecio {
    
    //Atributo que definen la base mayor, base menor y altura del trapecio.
    double baseMayor, baseMenor, altura;
    
    
    //Definimos el constructor de la clase Trapecio y los parámentros:
    Trapecio(double baseMayor, double baseMenor, double altura){
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }
    
    //Método que calcular el área del trapecio:
    double calcularArea(){
        return altura*(baseMayor + baseMenor)/2;
    }
    
    //Método que calcular el perímetro del trapecio:
    double calcularPerimetro(){
        return baseMayor+baseMenor+2+Math.sqrt(Math.pow(altura,2)+Math.pow(((baseMayor-baseMenor)/2), 2));
    }
}
