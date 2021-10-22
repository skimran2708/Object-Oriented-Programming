public class BikeObject
{
	//states
	int speed;
	int gear;
	String color;
	String enginecc;
	int maxgear;

	//constructor
	BikeObject()
	{
		this.maxgear=6;
		this.speed=100;
		this.color="red";
	}
	BikeObject(int maxgear)
	{
		this.maxgear=maxgear;
	}
	BikeObject(int maxgear,String color)
	{
		this.maxgear=maxgear;
		this.color=color;
	}

	//behaviours
	void changeGearUp()
	{
		if(this.gear>this.maxgear)
		{
			System.out.println("Can't change the gear, already in max possible gear\n");
		}
		else
		{
			this.gear+=1;
			System.out.println("Gear changed! present in "+this.gear+" gear\n");
		}
	}
	void changeGearDown()
	{
		if(this.gear<1)
		{
			System.out.println("Can't change the gear, already in lowest possible gear\n");
		}
		else
		{
			this.gear-=1;
			System.out.println("Gear changed! present in "+this.gear+" gear\n");
		}
	}
	void displaySpeed()
	{
		System.out.println("Speed : "+this.speed+" kmph");
	}

	//main method
	public static void main(String args[])
	{
		BikeObject honda=new BikeObject();
		honda.changeGearUp();
		honda.displaySpeed();
	}
}
