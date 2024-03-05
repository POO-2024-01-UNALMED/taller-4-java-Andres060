package classroom;

public class Tipo {
	public static final int DISCIPLINAR = 10;
	public static final int FUNDAMENTACION = 20;
	public static final int ELECTIVA = 30;
	
	public enum Tipo {
		private codigo;
		private String nombre;
		public Tipo(int codigo,String nombre) {
			this.codigo = codigo;
			this.nombre = nombre;
		}
}
}