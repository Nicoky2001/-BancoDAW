
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 888
 */
public class CuentaBlack extends Cuenta {
    
    private double porcentajeOculto;
    
    public CuentaBlack() {
        super();
    }
    
    public double getPorcentajeOculto() {
        return porcentajeOculto;
    }
    
    public void setPorcentajeOculto(double porcentajeOculto) {
        this.porcentajeOculto = porcentajeOculto;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Porcentaje Oculto=" + porcentajeOculto + " Cuenta Black";
    }
    
    public void altaCuenta(ListaClientes c) {       
        
       
        Scanner sc = new Scanner(System.in);        
        super.altaCuenta(c);        
        System.out.println("Porcentaje Oculto ");
        porcentajeOculto = sc.nextDouble();
        super.saldo = super.saldo-((super.saldo*porcentajeOculto)/100) ;
        
    }
    
}
