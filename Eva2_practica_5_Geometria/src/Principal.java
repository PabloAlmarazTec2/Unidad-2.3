/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Aaron Almaraz Avalos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*los metodos estaticos existen desde que el programa inicia, u solamentente
        se pueden usar a travéz de la clase a la que pertenecen. no son instanciables*/
        /* son utiles para crear librerias de constantes y funciones, para usarlas sin crear objetos*/
        Geometria.AreaDelCuadrado(100);
        Geometria.AreaDelRectangulo(5, 4);
        Geometria.AreaDelTriangulo(5, 10);
        Geometria.AreaDeuncirculo(5);
        Geometria.AreaDeunTrapecio(5, 10, 5);
        Geometria.AreaDeunRombo(7, 8);
    }
    
}
class Geometria
{
public static double AreaDelCuadrado(double lado)
{

return lado*lado;

}
public static double AreaDelTriangulo(double base, double altura)
{

    return (base*altura)/2;

}
public static double AreaDelRectangulo(double base, double altura)
{

    return base*altura;

}
public static double AreaDeuncirculo(double radio)
{

return (radio*radio)*(Math.PI);

}
public static double AreaDeunTrapecio(double baseChica, double basegrande, double altura)
{
return (basegrande+baseChica)/2*altura;

}
public static double AreaDeunRombo(double base, double altura)
{
return base*altura;

}
}
