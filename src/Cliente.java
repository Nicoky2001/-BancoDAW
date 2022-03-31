
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
public class Cliente implements CodigoSeguro {
    
    private String nombre;
    private String apellidos;
    private String dni;
    private String codigo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    

    @Override
    public String toString() {
        return nombre + " " + apellidos + " " + dni ;
    }
    
    
     
    public void altaCliente(){
        
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del Titular ");
        nombre = sc.nextLine();
        System.out.print("Apellidos del Titular ");
        apellidos = sc.nextLine();
        System.out.print("DNI del Titular ");
        dni = sc.nextLine();
        int miCodigo = (rnd.nextInt(99999-11111+1)+11111);
        codigo = String.valueOf(miCodigo);
        
    }

    @Override
    public String codigo() {
        
        return codigo;
       
    }
    
    
}
