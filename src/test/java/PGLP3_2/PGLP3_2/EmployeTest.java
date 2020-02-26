package PGLP3_2.PGLP3_2;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class EmployeTest {
	@Test
	public void Testsalaire() {
		vendeur v =new vendeur(10);
		vendeur v2= new vendeur(20);
		Employe e =new Employe(2010);
		Employe e2 =new Employe(2005);
		ArrayList<allEmploye> listEmploye = new ArrayList <allEmploye>();
		listEmploye.add(e);
		listEmploye.add(e2);
		listEmploye.add(v);
		listEmploye.add(v2);
		double salaireTotal=0;
		for(int i=0;i < listEmploye.size();i++) {
			salaireTotal += listEmploye.get(i).salaire();
		}
		System.out.println("salaire total :"+salaireTotal);
	}
	 
	 
	

}
