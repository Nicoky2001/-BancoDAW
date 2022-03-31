
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 888
 */
public class ListaCuentas {

    public ArrayList<Cuenta> misCuentas;

    public ListaCuentas() {

        misCuentas = new ArrayList<>();
    }
    
     @Override
    public String toString() {
        
        return misCuentas + "\n";
    }
    
    public void altaCta(Cuenta c){
        
        misCuentas.add(c);
        
    }
    
    public void mostrarCuentas(){
        int c = 0;
        for (Cuenta misCuenta : misCuentas) {
            
            System.out.println(c + " "+ misCuenta);
            c++;
        }
    }
    
    public void mostrarSaldos(){
        
        for (Cuenta miCuenta : misCuentas) {
            
            System.out.println("Titular "+miCuenta.getTitular().getNombre()+" Cuenta Nº " +miCuenta.miNumeroCuenta+" Saldo Actual "+miCuenta.getSaldo());
            
        }
    }
    
    public void mostarCodigo(){
        
        for (Cuenta misCuenta : misCuentas) {
            
            System.out.println("Cuenta Nº "+misCuenta.getMiNumeroCuenta()+" Codigo "+misCuenta.getCodigo());
            
        }
    
    
}

}
