package oop_Interface;

public class FortisHospital implements UKMedical, USMedical {

	@Override
	public void orthoService() {
		System.out.println("Fortis OrthoServices");
		
	}

	@Override
	public void generalService() {
		System.out.println("Fortis generalService");
		
	}

	@Override
	public void physioServices() {
		System.out.println("Fortis physioServices");
		
	}

	
	public void gynacServices() {
		System.out.println("gynacServices");
		
	}
	

}
