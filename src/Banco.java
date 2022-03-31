
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 888
 */
public class Banco {

    public static final int OPCION_NUEVO_CLIENTE = 1;
    public static final int OPCION_MOSTRAR_CLIENTES = 2;
    public static final int OPCION_CREAR_CUENTA = 3;
    public static final int OPCION_REALIZAR_OPERACION = 4;
    public static final int OPCION_MOSTRAR_INFO_CUENTA = 5;
    public static final int OPCION_MUESTRA_SALDO_TODAS_CUENTAS = 6;
    public static final int OPCION_MUESTRA_CODIGOS = 7;
    public static final int OPCION_SALIR = 8;

    public static void mostrarMenu() {
        System.out.println("==================================================");
        System.out.println(" BANCO DAW1 ");
        System.out.println("==================================================");
        System.out.println("1.-  NUEVO CLIENTE");
        System.out.println("2.-  MOSTRAR CLIENTES");
        System.out.println("3.-  CREAR CUENTA");
        System.out.println("4.-  REALIZAR OPERACIÓN");
        System.out.println("5.-  MOSTRAR INFO CUENTA");
        System.out.println("6.-  MOSTRAR SALDO TODAS LAS CUENTAS");
        System.out.println("7.-  MUESTRA CODIGOS");
        System.out.println("8.-  SALIR");
        System.out.println("==================================================");
        System.out.print("Introduce una opción: ");
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        ListaClientes clientes = new ListaClientes();
        ListaCuentas cuentas = new ListaCuentas();

        Scanner sc;

        Cliente clienteAux;
        Cuenta cuentaAux;
        Movimiento movimientoAux;

        int opcion;

        do {
            mostrarMenu();
            sc = new Scanner(System.in);
            opcion = sc.nextInt();
            switch (opcion) {
                case OPCION_NUEVO_CLIENTE -> {

                    System.out.println("************************************* Alta de cliente ************************************");
                    clienteAux = new Cliente();
                    clientes.nuevoCliente(clienteAux);

                }
                case OPCION_MOSTRAR_CLIENTES -> {

                    clientes.mostrarClientes();
                }
                case OPCION_CREAR_CUENTA -> {

                    System.out.println("***********************************  Alta Cuenta *****************************************");
                    cuentaAux = new Cuenta();
                    System.out.println("La nueva Cuenta es Black s/n");
                    String p = sc.next().toLowerCase();
                    if (p.equals("s")) {

                        cuentaAux = new CuentaBlack();

                    } else {
                        
                        cuentaAux = new Cuenta();

                    }

                    cuentaAux.altaCuenta(clientes);
                    cuentas.altaCta(cuentaAux);
                }

                case OPCION_REALIZAR_OPERACION -> {

                    System.out.println(" ***************************** Alta de Movimiento ************************************************");

                    cuentaAux = new Cuenta();
                    cuentas.mostrarCuentas();
                    System.out.println("Seleciione la cuenta ");
                    int op = sc.nextInt();
                    cuentaAux = cuentas.misCuentas.get(op);
                    movimientoAux = new Movimiento();
                    movimientoAux.altaM(cuentaAux);
                    cuentaAux.agregarMovimiento(movimientoAux);

                }
                case OPCION_MOSTRAR_INFO_CUENTA -> {
                    System.out.println(" ***************************** Informacion de cuentas ************************************************");

                    cuentas.mostrarCuentas();

                }
                case OPCION_MUESTRA_SALDO_TODAS_CUENTAS -> {

                    cuentas.mostrarSaldos();
                }
                case OPCION_MUESTRA_CODIGOS -> {

                    clientes.mostrarCodigo();

                    cuentas.mostarCodigo();

                }
                case OPCION_SALIR -> {
                    
                    System.out.println("Gracias por utilizar nuestros servicios ");

                }
                default -> {
                    System.out.println("Introduce una opción válida");
                }
            }

        } while (opcion != OPCION_SALIR);

    }
}
