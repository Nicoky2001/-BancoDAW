

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 888
 */
public class Cuenta implements CodigoSeguro {

    protected double saldo;
    protected static int NCUENTA = 0000;
    protected Cliente titular;
    protected ArrayList<Movimiento> movimientos;
    protected int miNumeroCuenta;
    protected ListaCuentas cuentas;
    protected String codigo;
    

    public Cuenta() {

        titular = new Cliente();
        movimientos = new ArrayList<>();
        cuentas = new ListaCuentas();
        miNumeroCuenta = NCUENTA;
        NCUENTA++;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    

    public ListaCuentas getCuentas() {
        return cuentas;
    }

    public void setCuentas(ListaCuentas cuentas) {
        this.cuentas = cuentas;
    }
    
    

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getNCUENTA() {
        return NCUENTA;
    }

    public static void setNCUENTA(int NCUENTA) {
        Cuenta.NCUENTA = NCUENTA;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    public int getMiNumeroCuenta() {
        return miNumeroCuenta;
    }

    public void setMiNumeroCuenta(int miNumeroCuenta) {
        this.miNumeroCuenta = miNumeroCuenta;
    }    
    
  
   public void agregarMovimiento(Movimiento m) {        
      
        this.saldo = saldo + m.getImporte();
        movimientos.add(m);
    }


    @Override
    public String toString() {
        return "Cuenta " + miNumeroCuenta + " Titular " + titular.getNombre() + " " + titular.getApellidos() + " Saldo " + saldo +" Moviminetos " +movimientos;
    }

    public void altaCuenta(ListaClientes c) {
        
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        c.mostrarClientes();
        System.out.print("Elija el Titular  para la cuenta ");
        int t = sc.nextInt();

        Cliente n;

        if (t < c.clientes.size()) {
            n = c.clientes.get(t);
            titular = n;

        } else {

            System.out.println("Introduce un número de Titular válido ");

        }
        System.out.println("Digite el importe inicial  ");
        saldo = sc.nextDouble();
        
        int miCodigo = (rnd.nextInt(99999-11111+1)+11111);
        codigo = String.valueOf(miCodigo);

    }

    @Override
    public String codigo() {
        
        return codigo;
    }

}
