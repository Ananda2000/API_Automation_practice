package designPattern_FactoryMethod;

abstract class Plan 
{
	protected double rate;
	abstract void getrate();
	
	public void calculateBill(int units)
	{
		System.out.println(units*rate);
	}
	

}
