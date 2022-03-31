
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 888
 */
public class ListaClientes {
    
    public ArrayList<Cliente> clientes;
    
    public ListaClientes(){
        
        clientes = new ArrayList<>();
    }
    
    public void nuevoCliente(Cliente c){
        c.altaCliente();
        clientes.add(c);
        
    }
    
    public void mostrarClientes(){
        
        int pos = 0;
        
        for (Cliente cliente : clientes) {
            
            System.out.println(pos+" "+cliente);
            pos++;
        }
        
    }
    public void mostrarCodigo(){
        
        for (Cliente cliente : clientes) {
            
            System.out.println("Ciente " + cliente.getNombre()+ " Codigo " +cliente.getCodigo());
            
        }
    }
    
}
