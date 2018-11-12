/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_practica_6_memoria_y_objetos;

/**
 *
 * @author Pablo Aaron Almaraz Avalos
 */
public class Eva2_Practica_6_memoria_y_Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Referencias: Variable que guarda una direcccion en memoria
        //apuntadores
        Prueba oObjt = new Prueba();
        oObjt.iValor = 100;
        System.out.println("el valor es: "+oObjt.iValor);
        //copia
        int iAlgo = 70;
        int iCopia = iAlgo;
         System.out.println("iAlgo; "+iAlgo);
        System.out.println("iAlgo; "+iCopia);
        iAlgo = 1000;
          System.out.println("iAlgo; "+iAlgo);
        System.out.println("iAlgo; "+iCopia);
        //copia del objetos
        Prueba pCopiaObj = oObjt;
        System.out.println("el valor es: "+oObjt.iValor);
        System.out.println("el valor es: "+pCopiaObj.iValor);
        oObjt.iValor= 99999;
         System.out.println("el valor es: "+oObjt.iValor);
        System.out.println("el valor de la copia es : : "+pCopiaObj.iValor);
    }
    
}
class Prueba
{
int iValor; //4 BYTES

}