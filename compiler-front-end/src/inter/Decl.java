package inter;

//alteracao
public class Decl extends Stmt {
	public Id id;
	
	public Decl(Id i) {
		id = i;
	}
	
	public void gen(int b, int a) {
		emit( "decl: "+ id.type +" "+ id.toString());
	}
}
