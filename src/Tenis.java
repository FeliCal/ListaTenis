public class Tenis {
    private int id;
    private String nombre;
    private char genero;
    private double precio;
    private double talla;
    private String color;

    private static int numeroListaTenis = 0;

    public Tenis() {
        this.id = ++Tenis.numeroListaTenis;
    }

    public Tenis(String nombre, char genero, double precio, double talla, String color) {
        this();
        this.nombre = nombre;
        this.genero = genero;
        this.precio = precio;
        this.talla = talla;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Tenis{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                ", precio=" + precio +
                ", talla=" + talla +
                ", color='" + color + '\'' +
                '}';
    }

    /*
    public static void main(String[] args) {
        Tenis listaTenis = new Tenis("Air Jordan 1 Low SE", 'M', 2999.0, 26.0, "Sombrío apagado/Blanco/Negro/Negro");
        System.out.println(listaTenis);
    }
    */
}
