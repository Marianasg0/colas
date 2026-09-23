import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        ObjPedido o = new ObjPedido();

        Queue<ObjPedido> cola = new LinkedList<>();

        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese la opcion que desea realizar");
            System.out.println("1) Agregar pedido");
            System.out.println("2) Atender pedido");
            System.out.println("3) Mostrar pedidos");
            System.out.println("4) Mostrar pedidos pendientes");
            System.out.println("5) Mostrar pedidos atendidos");
            System.out.println("6) Salir");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    cola = m.agregar(cola, sc);
                    break;
                case 2:
                    m.mostrar(cola);
                    break;
                case 3:
                    cola = m.atenderPedido(cola, sc);
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    System.out.println("Gracias por visitarnos");
                    continuar = false;
                    break;
                default:
                    System.out.println("Esa opcion no existe");
                    break;
            }
        }
    }
}