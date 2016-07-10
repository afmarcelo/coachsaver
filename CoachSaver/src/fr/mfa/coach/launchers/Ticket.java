/**
 * 
 */
package fr.mfa.coach.launchers;

/**
 * @author marcelo
 *
 */
public class Ticket {
	
	private String adults="1";
	private String children="0";
	private String bikes="0";
	private String departureStation="";
	private String arrivalStation="";
	private String departureCity="2015";
	private int arrivalCity;
	private String rideDate="";
	private String backRide="";
	private String backRideDate="";
	private String adultsBack="";
	private String childrenBack="";
	private String bikesBack="";
	private String locale="es";
	private String form_build_id="";
	private String form_id="";
	private String _ga="";
	private String url="";
	
	public String getUrl() {
		url = "https://shop.flixbus.es/search?adults="+adults+"&children="+children+"&bikes="+bikes+"&departureStation="+departureStation+"&arrivalStation="+arrivalStation+"&departureCity="+departureCity+"&arrivalCity="+arrivalCity+"&rideDate="+rideDate;
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAdults() {
		return adults;
	}
	public void setAdults(String adults) {
		this.adults = adults;
	}
	public String getChildren() {
		return children;
	}
	public void setChildren(String children) {
		this.children = children;
	}
	public String getBikes() {
		return bikes;
	}
	public void setBikes(String bikes) {
		this.bikes = bikes;
	}
	public String getDepartureStation() {
		return departureStation;
	}
	public void setDepartureStation(String departureStation) {
		this.departureStation = departureStation;
	}
	public String getArrivalStation() {
		return arrivalStation;
	}
	public void setArrivalStation(String arrivalStation) {
		this.arrivalStation = arrivalStation;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public int getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(int arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public String getRideDate() {
		return rideDate;
	}
	public void setRideDate(String rideDate) {
		this.rideDate = rideDate;
	}
	public String getBackRide() {
		return backRide;
	}
	public void setBackRide(String backRide) {
		this.backRide = backRide;
	}
	public String getBackRideDate() {
		return backRideDate;
	}
	public void setBackRideDate(String backRideDate) {
		this.backRideDate = backRideDate;
	}
	public String getAdultsBack() {
		return adultsBack;
	}
	public void setAdultsBack(String adultsBack) {
		this.adultsBack = adultsBack;
	}
	public String getChildrenBack() {
		return childrenBack;
	}
	public void setChildrenBack(String childrenBack) {
		this.childrenBack = childrenBack;
	}
	public String getBikesBack() {
		return bikesBack;
	}
	public void setBikesBack(String bikesBack) {
		this.bikesBack = bikesBack;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getForm_build_id() {
		return form_build_id;
	}
	public void setForm_build_id(String form_build_id) {
		this.form_build_id = form_build_id;
	}
	public String getForm_id() {
		return form_id;
	}
	public void setForm_id(String form_id) {
		this.form_id = form_id;
	}
	public String get_ga() {
		return _ga;
	}
	public void set_ga(String _ga) {
		this._ga = _ga;
	}

}
