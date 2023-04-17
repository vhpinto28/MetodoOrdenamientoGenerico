
public class Golosinas implements Comparable<Golosinas> {
  private String nombre;
  private int precio;

  public Golosinas(String nombre, int precio) {
    this.nombre = nombre;
    this.precio = precio;
  }

  public String getNombre() {
    return nombre;
  }

  public int getPrecio() {
    return precio;
  }

  @Override
  public int compareTo(Golosinas otra) {
    return Integer.compare(this.precio, otra.precio);
  }

  @Override
  public String toString() {
    return nombre + " $" + precio;
  }
}

