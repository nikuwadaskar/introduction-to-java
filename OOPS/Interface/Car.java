package Interface;

public class Car extends  Vehical implements VehicalInterface, CarInterface{

	@Override
	public boolean isMotorised() {

		return true;
	}

	@Override
	public String getCompany() {

		return null;
	}

	@Override
	public int numGewars() {

		return 6;
	}
	void print () {
		System.out.println(PI);
	}
}
