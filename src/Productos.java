public class Productos {
    private int codigo;
    private String Producto;
    private int precio;
    private int total;

    public Productos(int codigo , String Producto , int precio){
        this.codigo= codigo;
        this.Producto= Producto;
        this.precio= precio;


    }



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String producto) {
        Producto = producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


}
