public class ObjPedido {
    
    int Turno;
    int Comida;
    int Cantidad;
    Double Precio;
    String Cliente;
    boolean Estado;
    
    public ObjPedido() {
    }

    public ObjPedido(int turno, int comida, int cantidad, Double precio, String cliente, boolean estado) {
        Turno = turno;
        Comida = comida;
        Cantidad = cantidad;
        Precio = precio;
        Cliente = cliente;
        Estado = estado;
    }

    public int getTurno() {
        return Turno;
    }

    public void setTurno(int turno) {
        Turno = turno;
    }

    public int getComida() {
        return Comida;
    }

    public void setComida(int comida) {
        Comida = comida;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
        Estado = estado;
    }


   
    

}
