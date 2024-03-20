package EjercicioenJavaCreacióndeunaClaseyunObjeto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro nuevoLibro = new Libro("El alquimista : los secretos del inmortal Nicolas Flamel", "Michael Scott", 20, "Cuando Sophie y Josh Newman(...)", "9788496791770");
		nuevoLibro.mostrarDetalles();
		nuevoLibro.actualizarPrecio(50.6);
		nuevoLibro.mostrarDetalles();
	}

}
