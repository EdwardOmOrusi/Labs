package labB;

public class Rectangle
{
private int lenghtRec ;
private int widthRec ;

public Rectangle()
{
	lenghtRec = 1;
	widthRec = 1;
}

public void setLenght(int lenght)
{
	if((lenghtRec > 0.0) && (lenghtRec <= 40.0))
	lenghtRec = lenght;
	
	
}

public int getLenght()
{
	return  lenghtRec;
}

public void setWidth(int width)
{

	if((widthRec > 0.0) && (widthRec<= 40.0))
	widthRec = width;
}

public int getWidth()
{
	return  widthRec;
}

public String toString()
{
	return "Lenght: " + lenghtRec + "  Width: " + widthRec ;
}

public double getArea()
{
	return lenghtRec * widthRec ;

	
	
}
public double getPerimeter()
{
	return 2*(lenghtRec * widthRec);
}

 public void printRectangle()
 {
	
	for(int i= 1 ; i<= widthRec; i++)
	{
		for(int j = 1 ; j<= lenghtRec ; j++)
		{	
		
                System.out.print("* ");	
			
		}
		System.out.print("\n");	
	
	}
 }
}