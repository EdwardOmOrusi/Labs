package lab3;

import java.util.Calendar;

public class Clock {

public static void main(String[] args)
			{
				
				// TODO Auto-generated method stub
				 int seconds = 0 ;
				
	                       // setting the objects in calender and time
				Calendar cal = Calendar.getInstance();
				Time t = new Time(cal.get(Calendar.HOUR_OF_DAY),cal.get(Calendar.MINUTE));
				
				// while loop if current time is biggest tha 10000
				while(true)
				if(System.currentTimeMillis() - seconds > 10000)
				{
					t.tick();
					System.out.println(System.currentTimeMillis());
					System.out.println(t.toString());
				
				// if get a minute is equal to 0 will break
				if(t.getMinute() == 00)
				{
					break;
				}

			
				}
			}

	}


