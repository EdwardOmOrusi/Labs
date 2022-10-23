package lab3;

import java.util.Calendar;

public class Clock {

public static void main(String[] args)
			{
				
				// TODO Auto-generated method stub
				 int seconds = 0 ;
				
				Calendar cal = Calendar.getInstance();
				Time t = new Time(cal.get(Calendar.HOUR_OF_DAY),cal.get(Calendar.MINUTE));
				
				
				while(true)
				if(System.currentTimeMillis() - seconds > 10000)
				{
					t.tick();
					System.out.println(System.currentTimeMillis());
					System.out.println(t.toString());
				
				
				if(t.getMinute() == 00)
				{
					break;
				}

			
				}
			}

	}


