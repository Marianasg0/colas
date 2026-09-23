import java.util.Queue;
import java.util.Scanner;

public class metodos {
    
    public Queue<ObjPedido> agregar (Queue<ObjPedido> cola, Scanner sc){
        boolean continuar = true;
        int turno = 1;
        while (continuar) {
            ObjPedido o = new ObjPedido();
            o.setTurno(turno);
            System.out.println("Ingrese que desea: 1)perro 2)Hamburguesa");
            o.setComida(sc.nextInt());
            System.out.println("Ingrese la cantidad ");
            o.setCantidad(sc.nextInt());
            System.out.println("Ingrese el precio");
            o.setPrecio(sc.nextDouble());
            System.out.println("Ingrese el cliente");
            o.setCliente(sc.next());
            o.setEstado(false);
            cola.offer(o);
            System.out.println("Desea ingresar otro registro 1)Si 2)No");
            int opt = sc.nextInt();
            if (opt==2) {
                continuar= false;
            }else{
                turno ++;;
            }
        }
        return cola;
    }

    public void mostrar(Queue<ObjPedido> cola){
        for (ObjPedido o : cola) {
            System.out.println("Turno:" + o.getTurno());
            System.out.println("Comida: " + o.getComida());
            System.out.println("Cantidad: " + o.getCantidad());
            System.out.println("Precio: " + o.getPrecio());
            System.out.println("Cliente: " + o.getCliente());
            if (o.isEstado() == false) {
                System.out.println("Estado: Pendiente");
            }
            else{
                System.out.println("Estado: Atendido");
            }
            System.out.println("---------------------------------------");
        }
    }

    public Queue<ObjPedido> atenderPedido (Queue<ObjPedido> cola, Scanner sc){
        System.out.println("Ingrese el turno que desea atender");
        int turno = sc.nextInt();
        for (ObjPedido o : cola) {
            if (!cola.isEmpty()) {
                if (o.getTurno()==turno) {
                o.setEstado(true);
                System.out.println("Pedido atendido");
            }
            else{
                System.out.println("No se encuentra ese turno");
            }
            }
            else{
                System.out.println("No hay turnos por atender");
            }
        }
        return cola;
    }


}
