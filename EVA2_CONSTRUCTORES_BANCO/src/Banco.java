/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Aaron Almaraz Avalos
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banco1 micuenta = new Banco1();
        System.out.println("Nombre de cliente:" + micuenta.getNombrecliente());
        System.out.println("saldo del cliente:" + micuenta.getSaldo());
        Banco1 micuenta2 = new Banco1("Pablo Almaraz",5000);
        System.out.println("nombre del cliente: "+ micuenta2.getNombrecliente());
        System.out.println("saldo del cliente "+ micuenta2.getSaldo());
        
    }
    
}
class Banco1
{
    private String nombrecliente;
    private double saldo;
//sobre carga (override)
    public Banco1() {
        
        nombrecliente = "Pablo Aaron Almaraz Avalos";
        saldo = 100000;
        
    }
// sobre carga 
    public Banco1(String nombrecliente, double saldo) {
        this.nombrecliente = nombrecliente;
        this.saldo = saldo;
    }
    

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}