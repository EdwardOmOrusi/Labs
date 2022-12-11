package lab9.carlow;

public class Hgv extends RoadVehicle implements ImportDuty{
	private int cargo;

	public Hgv(){ 	
		this(0,0,0);	
	}

	public Hgv(int c, int w, int p){ 
		super(w, p);
		setCargo(c);
	}

	public void setCargo(int size){
		cargo = size;
		}

	public int getCargo(){
		return cargo;
		}

// calculale duty
	public void  calculateDuty(int num) 
	{
		
		System.out.println("The tax taken is :" + HGVTAXRATE*num);
	}	
 }

