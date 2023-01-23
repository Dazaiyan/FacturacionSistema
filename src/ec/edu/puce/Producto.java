package ec.edu.puce;

public class Producto {
	private String Codigo;
    private float Cantidad;
    private String Descripcion;
    private float Precio;
    private float Total;
    public Producto(String Codigo, float Cantidad, String Descripcion, float Precio, float Total){
        this.Codigo = Codigo;
        this.Cantidad = Cantidad;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.Total = Total;
    }

    public Producto() {};

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public float getCantidad() {
        return Cantidad;
    }

    public void setCantidad(float Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }
    
    public float getTotal() {
        return Total;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }

}


