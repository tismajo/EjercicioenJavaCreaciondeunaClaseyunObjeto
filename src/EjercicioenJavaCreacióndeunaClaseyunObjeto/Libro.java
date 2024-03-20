package EjercicioenJavaCreacióndeunaClaseyunObjeto;

public class Libro {
    // Atributos
    String titulo;
    String autor;
    double precio;
    String sinopsis;
    String ISBN;
    //TODO agrega más atributos de los libros relevantes para tienda 

    // Constructor sin parámetros
    public Libro() {
        // Inicializa los atributos con valores por defecto
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, double precio, String sinopsis, String ISBN) {
        // Inicializa los atributos con los valores dados
    	this.titulo = titulo;
    	this.autor = autor;
    	this.precio = precio;
    	this.sinopsis = sinopsis;
    	this.ISBN = ISBN;
    }
    
    //Getters y setters
    public String getTitulo() {
    	return titulo;
    }
    
    public void setTitulo(String titulo) {
    	this.titulo = titulo;
    }
    
    public String getAutor() {
    	return autor;
    }
    
    public void setAutor(String autor) {
    	this.autor = autor;
    }
    
    public double getPrecio() {
    	return precio;
    }
    
    public void setPrecio(double precio) {
    	this.precio = precio;
    }
    
    public String getSinopsis() {
    	return sinopsis;
    }
    
    public void setSinopsis(String sinopsis) {
    	this.sinopsis = sinopsis;
    }
    
    public String getISBN() {
    	return ISBN;
    }
    
    public void setISBN(String ISBN) {
    	this.ISBN = ISBN;
    }

    // Métodos
    public void mostrarDetalles() {
        // Implementa este método para mostrar los detalles del libro
    	System.out.println("Titulo: " + getTitulo() + " - Autor: " + getAutor() + " - Precio: " + getPrecio() + " - Sinopsis: " + getSinopsis() + " - ISBN: " + getISBN());
    }

    public void actualizarPrecio(double nuevoPrecio) {
        // Implementa este método para actualizar el precio del libro
    	setPrecio(nuevoPrecio);
    }
}
