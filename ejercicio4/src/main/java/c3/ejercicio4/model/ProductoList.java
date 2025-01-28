package c3.ejercicio4.model;

import java.util.ArrayList;
import java.util.List;

public class ProductoList {
    private static List<Producto> productos = new ArrayList<>();

    public static void guardarProducto(Producto producto) {
        productos.add(producto);
    }

    public static List<Producto> getLista() {
        return productos;
    }
}