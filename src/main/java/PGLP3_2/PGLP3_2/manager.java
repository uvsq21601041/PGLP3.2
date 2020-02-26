package PGLP3_2.PGLP3_2;

public class manager extends allEmploye {
	private final int base=1500;
	private int NombresEmployes;
	public manager(int NombresEmployes) {
		this.NombresEmployes=NombresEmployes;
	}


	@Override
	public double salaire() {
		// TODO Auto-generated method stub
		return base+(NombresEmployes*100);
	}
}
