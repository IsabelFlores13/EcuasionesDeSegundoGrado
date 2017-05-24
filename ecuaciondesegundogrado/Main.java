/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuaciondesegundogrado;
import modelo.EcuacionDeSegundoGrado;
/**
 *
 * @author isabel flores :3
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    EcuacionDeSegundoGrado ecuacion1 = new EcuacionDeSegundoGrado(15, 1, -12);
        System.out.println("Ecuacion de 2do grado:" + ecuacion1.getDiscriminante());
        System.out.println("Raiz cuadrada = " + ecuacion1.getNumeroDeSoluciones());
        System.out.println("Caso 1.a = " + ecuacion1.getRaiz1());
        System.out.println("Caso 1.b = " + ecuacion1.getRaiz2());
    EcuacionDeSegundoGrado ecuacion2 = new EcuacionDeSegundoGrado(10, -48, -900);
        System.out.println("Ecuacion de 2do grado: " + ecuacion2.getDiscriminante());
        System.out.println("RaicesCuadradas: " + ecuacion2.getNumeroDeSoluciones());
        System.out.println("Caso 2.a = " + ecuacion2.getRaiz1());
        System.out.println("Caso 2.b = " + ecuacion2.getRaiz2());
    EcuacionDeSegundoGrado ecuacion3 = new EcuacionDeSegundoGrado(18, -3, -25);
        System.out.println("Ecuacion de 2do grado: " + ecuacion3.getDiscriminante());
        System.out.println("Raiz cuadrada = " + ecuacion3.getNumeroDeSoluciones());
        System.out.println("Caso 3.a = " + ecuacion3.getRaiz1());
        System.out.println("Caso 3.b = " + ecuacion3.getRaiz2());
    }
    
}


