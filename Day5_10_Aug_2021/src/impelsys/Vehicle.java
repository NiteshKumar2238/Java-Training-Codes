package impelsys;

public interface Vehicle
{
  public void speedUp();
  public void speedDown();
  public void changeDirection(int val);
}
 interface BSV
{
	public void standardEmmision();
	
}

class CarMaruti implements Vehicle,BSV
{
	int speed=0;
	final int maxSpeed=180;
	public void speedDown()
	{
		if(this.speed<10 )
			this.speed=0;
		else if(this.speed>=10)
			this.speed=this.speed-10;
		
	}
	public void speedUp()
	{
		if(this.speed<=(this.maxSpeed-10))
			this.speed=this.speed+10;
		else 
			this.speed=this.maxSpeed;
	}
	public void showSpeed()
	{
		System.out.println("Car Maruti Speed is:"+this.speed);
	}
	public void changeDirection(int val)
	{
		
	}
	public void standardEmmision()
	{
		
	}
}

class CarHonda implements Vehicle
{
	int speed=0;
	final int maxSpeed=230;
	public void speedDown()
	{
		if(this.speed<20 &&  this.speed>0)
			this.speed=0;
		else if(this.speed>=20)
			this.speed=this.speed-20;
		
	}
	public void speedUp()
	{
		if(this.speed<=(this.maxSpeed-20))
			this.speed=this.speed+20;
		else 
			this.speed=this.maxSpeed;
	}
	public void showSpeed()
	{
		System.out.println("Car Honda Speed is:"+this.speed);
	}
	public void changeDirection(int val)
	{
		
	}
}

