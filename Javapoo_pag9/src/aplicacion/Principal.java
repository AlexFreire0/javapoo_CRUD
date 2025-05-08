package aplicacion;
import vista.VistaPrincipal;

public class Principal {

    public static void main(String[] args) {
        VistaPrincipal menu = new VistaPrincipal();
        int opcion;
        
        do {
            opcion = menu.mostrarMenuPrincipal();
            
            switch(opcion) {
                case 1:
                    System.out.println("Gestión de Clientes seleccionada");

                    break;
                case 2:
                    System.out.println("Gestión de Proveedores seleccionada");

                    break;
                case 3:
                    System.out.println("Gestión de Artículos seleccionada");

                    break;
                case 4:
                    System.out.println("Gestión de Facturas Recibidas seleccionada");

                    break;
                case 5:
                    System.out.println("Gestión de Ventas seleccionada");

                    break;
                case 6:
                    System.out.println("Informes de Ventas por Cliente seleccionado");

                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            
        } while(opcion != 0);
        
        System.out.println("Programa terminado.");
    }
}