/**
 * 
 */
package fr.mfa.coach.launchers;
import java.io.IOException;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/**
 * 
 * @author marcelo
 *
 */

public class Webpage {
	
	private String url;
	private String pathToTicket = "[class^=\"sr-row row ride-available\"]";
	private int timeout = 5000;
	
	
	/**
	 * Get the page from a given url. 
	 * @param url
	 * @param timeout
	 * @return Web Page.
	 */
	
	private Document getHtmlDocument(String url, int timeout) {	
		
		Document doc = null;
		try {
		    doc = Jsoup.connect(url).userAgent("Mozilla/5.0").timeout(timeout).get();
		    } catch (IOException ex) {
			System.out.println("Exception getting the web page : " + ex.getMessage());
		    }
	    return doc;	
	}
	
	public String getTickets(String departureCity, int arrivalCity, String rideDate){
		
		Ticket searchedTicket = new Ticket();
		searchedTicket.setDepartureCity(departureCity);
		searchedTicket.setArrivalCity(arrivalCity);
		searchedTicket.setRideDate(rideDate);
		url = searchedTicket.getUrl();
		
		Document document = getHtmlDocument(url,timeout);
		Elements Tickets = document.select(pathToTicket);
		
		return validateTickets(Tickets, departureCity, arrivalCity, rideDate, url);
		
	}
	
	private String validateTickets( Elements Tickets, String departureCity, int arrivalCity, String rideDate, String url ){
		
		String validatedTickets ="";
		
		for (Element elem : Tickets) {
       
			if (elem.getElementsByAttributeValueContaining("data-ride-data","\"status\":\"full").isEmpty())
        	{
       
        		String departureTime = elem.getElementsByClass("departure").text();
                String arrivalTime = elem.getElementsByClass("arrival").text();
                
                Elements price = elem.select("div.total");
                String finalPrice = price.select("span.num").text();          
              
                if (!finalPrice.isEmpty()){
                	
                	validatedTickets = validatedTickets+departureCity+";"+arrivalCity+";"+rideDate+";"+departureTime+";"+arrivalTime+";"+finalPrice+";"+url+"\n";
                	            	
            	} // EndIF
                	      
        	}// EndIF
          
         }// EndFor
		
		return validatedTickets;
		
	}// EndMethod validate Tickets
	
	
}
