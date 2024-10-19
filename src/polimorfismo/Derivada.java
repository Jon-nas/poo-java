public class Base {
	protected int var_base;
	public Base ( ){
		var_base = -1;
	}
	protected void atualizarVarBase ( int valor ) {
		this.var_base = valor;
	}
	protected void imprimirVarBase ( ) {
		System.out.println ("O valor de var_base eh " + this.var_base );
	}
	protected void atualizarVarSub ( int valor ) {
		((Derivada)this).var_der = valor;
	}
	protected void imprimirVarSub ( ) {
		System.out.println ("O valor de var_der na subclasse eh " + ((Derivada)this).var_der );
	}
}

public class Derivada extends Base {
	protected int var_der;
	public Derivada ( ){
		System.out.println ("O valor de var_base antes da instanciacao da classe Derivada eh " + this.var_base );
		this.var_base = this.var_der = -2;
	}
	public void atualizarVarDer ( int valor ) {
		this.var_der = valor;
	}
	public void imprimirVarDer ( ) {
		System.out.println ("O valor de var_der eh " + this.var_der );
	}
}

public class Principal {
	//Atributos
	private static Derivada ref;
	//Métodos
	public static void main (String args[]) {
		ref = new Derivada ( ); //instancia objeto do tipo Derivada
		System.out.println ( "=> Imprime o valor de var_base");
		ref.imprimirVarBase();
		System.out.println ( "=> Atualiza o valor de var_der com downcasting (var_der = 1000)");
		ref.atualizarVarSub(1000);
		System.out.println ( "=> Imprime o valor de var_der com downcasting");
		ref.imprimirVarSub();
		System.out.println ( "=> Imprime o valor de var_der");
		ref.imprimirVarDer();
	}
}