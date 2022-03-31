
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 888
 */
public class Movimiento {
    
    public enum operaciones {
        
        INGRESO, RETIRO
    }
    
    private String descripcion;
    private double importe;
    private LocalDate fecha;
    private operaciones tipo;
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public double getImporte() {
        return importe;
    }
    
    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }
    
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    public operaciones getTipo() {
        return tipo;
    }
    
    public void setTipo(operaciones tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return "Movimiento{" + "descripcion=" + descripcion + ", importe=" + importe + ", fecha=" + fecha + ", tipo=" + tipo + '}';
    }
    
    public void altaM(Cuenta n) {
        
        Cuenta p;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Tipo de movimiento Ingreso / Retiro");
        tipo = operaciones.valueOf(sc.nextLine().toUpperCase());
        System.out.println("descripcion ");
        descripcion = sc.nextLine();
        System.out.println("Fecha del movimiento dd/MM/yyyy ");
        String m = sc.nextLine();
        System.out.println("Importe ");
        importe = sc.nextDouble();
        
        if (tipo.equals(operaciones.INGRESO)) {
            
           importe = importe;
        } else {
           importe = importe*-1;
        }
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        fecha = LocalDate.parse(m, dtf);
        
        
    }
    
}
