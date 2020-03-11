package PGLP3_2.PGLP3_2;

public class vendeur extends allEmploye{
	final private int salaire=1500;
	
	private int commission;
	public vendeur(int commission){
	this.commission=commission;
	}

	public double salaire(){
	
	return salaire+commission;
}
}
