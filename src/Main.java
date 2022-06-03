import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List <Productos> lista = new LinkedList<Productos>();
    private static Scanner teclado = new Scanner(System.in);

    //fifo First In First Out
    // LIFO Last In First Out

    public static void main(String[] args) {


        byte opcion;
        int opcionf = 0;
        do {

            System.out.println("MENU");    //Menu principal
            System.out.println("1. Agregar producto");
            System.out.println("2. Ver carrito");
            System.out.println("3. Eliminar producto");
            System.out.println("4. pagar");
            System.out.print("Selecciona una opcion: ");
            System.out.println("\n-----------------------\n");
            opcion = teclado.nextByte();
            switch (opcion){
                case 1:
                    agregarProducto();

                    break;
                case 2: imprimirCarrito();
                    break;
                case 3:
                    borrarProducto();
                    break;
                case 4:
                    hacerCobro();
                    System.out.println("Gracias por su preferencia\n\n Desea repetir el sistema? \n 1. Si  2. No");  //Ciclo para que otro cliente vuelva a comprar
                    opcionf = teclado.nextInt();
                    if (opcionf == 1){
                        lista.clear();


                    break;
                    }
                    else
                        opcion=5;
                    System.out.println("Cerrando programa");



            }
        } while (opcion<5);


    }
    public static void agregarProducto(){
        byte opcion;
        System.out.println("PRODUCTOS");
        System.out.println("1. Cafe");
        System.out.println("2. Shampoo");
        System.out.println("3. Jabon");
        System.out.println("4. Leche");
        System.out.println("5. Pan integral");
        opcion = teclado.nextByte();
        if (opcion==1)
            lista.add(new Productos(1531 , "cafe" , 20 ));

        if (opcion==2)
            lista.add(new Productos(3521 , "shampoo" , 35 ));

        if (opcion==3)
        lista.add(new Productos(5424 , "Jabon" , 16 ));

        if (opcion==4)
            lista.add(new Productos(8253 , "Leche" , 26 ));

        if (opcion==5)
            lista.add(new Productos(7523 , "Pan integral" , 40 ));
        if(opcion>5) {
            System.out.println("Esa opcion no esta disponible");
        }



    }

    public static void imprimirCarrito(){

        for(Productos Productos:lista){

            System.out.print("Codigo de barras: "+ Productos.getCodigo());
            System.out.print(" | Producto: "+ Productos.getProducto());
            System.out.print(" | Precio: $"+ Productos.getPrecio());
            System.out.println("");
        }

    }
    public static void borrarProducto(){
        int buscarId;
        System.out.println("Ingrese el ID del producto que desea borrar: ");
        buscarId = teclado.nextInt();
        for (Productos Productos: lista) {
            if (buscarId==lista.get(0).getCodigo()){
                lista.remove(Productos);
                System.out.println("El producto fue eliminado de su carrito");
                break;
            }




        }


    }
    public static void hacerCobro(){


        int acumulador=0;
        System.out.println("*******************************");
        System.out.println("TICKET :");

        for(Productos Productos:lista){
            System.out.print("Producto: "+ Productos.getProducto());
            System.out.print(" | Precio: $"+ Productos.getPrecio());
            System.out.println("");
            acumulador+= Productos.getPrecio();
        }


         System.out.println("El total es: $" + acumulador);
         System.out.println("*******************************");

    }


}
