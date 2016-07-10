package fr.mfa.coach.launchers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class TestDates {


	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		String startDate="14.07.2016";
		String endDate="20.07.2016";
		
		DateFormat formatter ; 

		formatter = new SimpleDateFormat("dd.MM.yyyy");
		
			

		List<Date> dates = getDaysBetweenDates((Date)formatter.parse(startDate), (Date)formatter.parse(endDate));
		
		for(int i=0;i<dates.size();i++){
		    Date lDate =(Date)dates.get(i);
		    String ds = formatter.format(lDate);    
		    System.out.println(" Date is ..." + ds);
		}
		
		
	}
	
	public static List<Date> getDaysBetweenDates(Date startdate, Date enddate)
	{
	    List<Date> dates = new ArrayList<Date>();
	    Calendar calendar = new GregorianCalendar();
	    calendar.setTime(startdate);

	    while (calendar.getTime().before(enddate))
	    {
	        Date result = calendar.getTime();
	        dates.add(result);
	        calendar.add(Calendar.DATE, 1);
	    }
	    return dates;
	}

}
