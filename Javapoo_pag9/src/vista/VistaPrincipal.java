package vista;
import java.util.*;

public class VistaPrincipal {
    private Scanner sc = new Scanner(System.in);
    
    public int mostrarMenuPrincipal() {
        System.out.println("=== Menú Principal JAVAPOO ===");
        System.out.println("1. Gestión de Clientes");
        System.out.println("2. Gestión de Proveedores");
        System.out.println("3. Gestión de Artículos");
        System.out.println("4. Gestión de Facturas Recibidas");
        System.out.println("5. Gestión de Ventas");
        System.out.println("6. Informes de Ventas por Cliente");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
        
        try {
            int opcion = Integer.parseInt(sc.nextLine());
            return opcion;
        } catch (NumberFormatException e) {
            System.out.println("Error: Debes ingresar un número válido.");
            return -1; 
        }
    }
}