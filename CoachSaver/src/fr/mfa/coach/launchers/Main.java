/**
 * 
 */
package fr.mfa.coach.launchers;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;



/**
 * @author marcelo
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
					
		String adults="1";
		String children="0";
		String bikes="0";
		String departureStation="";
		String arrivalStation="";
		String departureCity="2015";
		int arrivalCity;
		String rideDate="06.07.2016";
		String backRide="";
		String backRideDate="";
		String adultsBack="";
		String childrenBack="";
		String bikesBack="";
		String locale="es";
		String form_build_id="";
		String form_id="";
		String _ga="";

		// Temp values for writing the file
		String departure;
		String arrival;
		String finalPrice;
		String filePath="pascuas.txt";
		PrintWriter writer;
			
		// array of destinations
		int[] destination = new int[] {244,181,5338,6118,2248,2938,2498,3328,3778,4068,3868,5008,3878,5018,3888,5028,5868,6798,116,34,3788,941,261,2468,3268,1725,1885,3898,5038,1715,1895,3018,4028,3908,4978,2238,2948,3928,5058,255,1905,5048,5748,243,704,1314,1384,256,391,3958,5098,258,754,1164,1164,5058,5768,5858,6788,1735,1915,3968,5108,137,55,3978,5118,4028,5138,1244,974,3188,4078,2225,2905,800,3118,1184,1264,117,35,279,201,286,784,3818,4718,2378,3078,1464,1574,149,67,2258,2958,3048,4108,133,51,1044,4088,3238,5158,124,42,1715,4058,5178,1524,1624,157,77,121,39,122,40,1224,944,88,1,1224,481,471,2825,611,3288,3158,4188,4068,5188,861,271,2808,3748,3258,4248,3268,4258,302,1434,1204,954,6338,7558,5398,6948,1174,1254,307,3528,132,50,6048,7118,2998,3968,1675,1845,309,501,312,3518,791,3548,2508,3368,314,1074,4078,5208,4098,5228,3808,4568,1745,1975,1965,1955,7838,1364,1474,3308,4298,1021,681,169,89,319,1945,320,3738,2918,3858,1695,1855,4108,5238,4118,5248,321,6138,851,221,5018,5268,5538,6348,123,41,1785,2875,3258,5488,6298,1795,2015,1805,2025,3288,4288,6098,7178,5438,6238,6268,7388,1304,1364,138,56,4138,5288,4158,5318,5308,4178,7768,162,82,119,37,3338,4328,5368,6928,170,90,1685,1825,4248,5408,4188,5348,4218,5378,3138,4148,135,53,148,66,1494,1614,3358,4368,107,24,90,3,4,1444,1905,2186,2288,2988,97,13,343,1144,3378,4408,921,491,5038,5738,4268,5428,2478,3308,3398,4438,349,3918,1514,1604,131,49,795,351,355,251,241,200,794,4308,5468,2688,3458,108,25,6058,7128,5608,6428,5078,5788,361,1454,5708,6598,363,734,764,2848,3778,2448,3228,1835,2065,6828,5298,6048,150,301,160,80,134,52,106,23,1074,774,5418,6208,5718,6608,821,111,382,2075,6078,1845,2085,3038,4058,5848,6758,383,3088,384,4448,92,8,93,9,96,12,38,2735,389,2645,2568,3628,5808,6568,2738,3598,971,631,1865,2115,2858,3798,1144,1084,1084,804,407,694,408,3588,3298,4208,2978,3928,414,1054,2728,3538,128,46,808,3298,2578,3618,1605,1765,1755,2775,3418,4488,417,924,3668,3988,4968,1404,1554,6768,5458,6258,2898,3838,2298,2998,1875,2135,3118,3938,1264,984,3408,4468,429,3488,2308,3008,807,3218,7498,7888,7858,7848,235,1534,152,71,118,36,435,1244,436,1284,2698,3468,437,2146,146,64,163,83,98,14,444,171,110,27,2765,448,1194,5088,5798,2268,2968,455,1094,145,63,3438,4498,2388,3098,3058,3988,2658,3448,129,47,1574,1714,5758,6678,6668,1104,994,5388,6958,471,341,5098,5808,166,86,5518,6328,165,85,3458,6718,5998,7068,5968,7038,4408,5558,2458,3238,2768,3688,3468,4138,477,3208,1024,714,5628,6448,479,1674,1001,671,1875,5798,6558,1344,1464,484,121,486,441,6248,7348,3098,4118,174,95,5578,6388,961,551,5788,6548,6418,7578,5358,6918,109,26,6068,7138,491,401,2665,105,22,2328,3028,495,151,498,511,5548,6358,5558,6368,1895,2176,2878,3818,5318,6098,5918,6978,508,4508,6208,7288,2428,3188,509,1024,5308,6088,6198,7278,2888,3828,805,3138,1825,2045,3478,4518,1645,1805,522,371,523,4228,3148,4178,4438,5588,4448,5598,5498,6288,530,854,4458,5608,5728,6628,6618,5618,6438,6238,7318,536,1694,1935,2245,2215,2865,1114,4218,4468,5618,142,601,540,4538,541,7378,2225,113,30,1234,6148,7228,1925,2235,5468,6268,5288,6038,4478,5628,2748,3658,102,18,1484,1644,551,3568,172,92,93,3498,6198,4548,5678,6498,100,16,3488,4528,2588,3608,2758,3678,547,814,1945,2255,151,70,554,291,1064,2265,103,19,1454,1564,3088,4038,2438,3198,557,6938,1625,1785,881,421,3508,4558,8038,5818,6418,1274,1334,91,5,841,191,568,161,1684,3518,4588,1615,1775,3828,4708,571,1044,871,411,1965,2285,574,4678,3998,4958,1194,1304,5508,6308,4568,7338,3548,4638,1975,2305,4598,7998,4608,6848,1955,2275,4498,5658,217,591,94,10,4628,585,621,125,43,587,231,4618,6748,3568,4658,4628,8088,931,381,2908,3848,161,81,598,824,599,331,2338,3048,2368,3108,602,3038,2558,3638,4638,7988,6608,7778,2398,3158,3578,4688,154,73,153,72,147,65,608,3718,5428,6228,591,3648,1034,724,5408,6218,3838,4698,104,21,203,311,5768,6318,811,101,6518,5658,6478,617,844,168,88,5948,7018,891,431,3108,4128,4668,7328,621,211,6038,7098,7108,144,69,5978,7048,626,1424,2695,2005,2355,6308,7438,5928,6998,6288,7398,2015,2365,4168,4578,8008,7798,7918,628,1154,629,5958,3028,4048,632,884,2025,2375,635,361,5478,6278,3128,3958,3628,7828,6058,6168,7248,641,2855,1374,1494,6988,7848,8018,2528,3348,6188,7268,2045,2395,5958,7028,643,1174,4718,7418,5598,6408,653,894,7788,7898,651,1725,2055,2405,5448,6248,2608,3418,2638,3398,3638,4778,158,2845,662,3698,2075,2425,139,57,2435,2085,2445,4738,6178,2948,3888,3908,99,15,6138,7218,3008,4018,2548,4818,6838,3378,2598,2415,5748,6658,6648,3678,3878,4778,6808,4828,7448,4808,6158,4788,6888,1554,1664,676,2465,2105,2495,2115,2505,674,561,2348,3058,981,641,5698,6588,164,84,1544,1654,2628,3408,911,451,3688,4828,683,2475,686,1124,689,1324,690,834,2788,3708,991,651,5828,6538,692,1274,1154,1104,1254,964,1294,1354,694,541,6298,7408,2648,3438,2318,3018,1354,1484,2095,2485,2928,3868,4198,4158,701,141,6178,7258,6558,7618,227,6728,704,4848,5638,6458,5568,6378,7898,8078,709,3728,5988,7058,2125,2515,1214,934,716,3558,6018,7088,101,61,2785,17,1034,6008,7078,112,29,4848,7807,4838,6878,5688,6508,727,1524,6588,7748,3718,4868,2358,3068,95,31,4908,6778,3728,4878,4918,6578,4928,6168,3738,4888,2145,2545,6528,7628,173,94,2795,6598,7758,2618,3388,7818,7958,159,79,6088,7158,7168,731,3578,2958,3898,733,684,5668,6488,1414,1544,2278,2978,1324,1394,4948,6868,4958,6028,4988,7428,5328,6108,2155,2555,3758,5148,5858,2165,2565,7858,8028,1394,1745,1735,6708,2655,1504,2815,2615,7868,2988,2605,5888,6858,747,2575,1705,1865,4998,6898,6128,7208,6568,7738,1564,1704,757,3508,140,58,59,3078,4008,761,1114,1504,1634,2835,763,131,1124,1204,2185,2595,772,1184,2708,3478,5528,6338,3758,4928,2518,3338,779,581,167,87,1284,1344,3768,4938,2195,2625,2868,3808,901,461,130,48,7508,7878,171,91,111,28,2488,3318,2718,3498,6538,7638,2205,2635,5778,6528,1134,1214,5738,6638,5588,6398,2538,3358,6258,7358,3068,3998,796,904,2685,5168,5878,5938,7008,89,2,1334,2715,372,744,5648,6468,730,1414,6108,7188,7838,7968,7978,6078,7148,6498,7608,6158,7238,6118,7198};
		//int[] destination = new int[] {244};
		// Ida y vuelta 
		// String url = "https://shop.flixbus.es/search?adults="+adults+"&children="+children+"&bikes="+bikes+"&departureStation="+departureStation+"&arrivalStation="+arrivalStation+"&departureCity="+departureCity+"&arrivalCity="+arrivalCity+"&rideDate="+rideDate+"&backRide="+backRide+"&backRideDate="+backRideDate+"&adults="+adultsBack+"&children="+childrenBack+"&bikes="+bikesBack+"&_locale="+locale+"&form_build_id="+form_build_id+"&form_id="+form_id+"&_ga="+_ga;

		// solo ida
		//String url = "https://shop.flixbus.es/search?adults="+adults+"&children="+children+"&bikes="+bikes+"&departureStation="+departureStation+"&arrivalStation="+arrivalStation+"&departureCity="+departureCity+"&arrivalCity="+arrivalCity+"&rideDate="+rideDate;
		
		// prepare file
		File file = ensureFileExists(filePath);
		
		for(int i=0; i< destination.length;i++){
			writer = new PrintWriter(new FileOutputStream(file, true));	
		
		// Obtengo el HTML de la web en un objeto Document
			arrivalCity = destination[i];
			String url = "https://shop.flixbus.es/search?adults="+adults+"&children="+children+"&bikes="+bikes+"&departureStation="+departureStation+"&arrivalStation="+arrivalStation+"&departureCity="+departureCity+"&arrivalCity="+arrivalCity+"&rideDate="+rideDate;
			System.out.println(url);
			Document document = getHtmlDocument(url);
			
        // Busco todas las entradas que estan dentro de: 
         //Elements entradas = document.select("sr-row");
         //Elements entradas = document.select("div.sr-row.row.ride-avalable.unbooked").not("div.sr-row.row.booked");
         Elements entradas = document.select("[class^=\"sr-row row ride-available\"]");
        //Elements entradas = document.select("#station-block-2365-6198 > div:nth-child(2) > div > div.sr-row.row.ride-avalable.direct-21561908-2365-6198.unbooked > div.col-xs-6.time-transfer > div:nth-child(1) > div.col-sm-4.hidden-xs.hidden-md.col-lg-4.price > div > img");
        
        System.out.println("Número de entradas en la página inicial: "+entradas.size()+"\n");
       
       
     // Paseo cada una de las entradas
        for (Element elem : entradas) {
        	
        	//System.out.println("esta full: "+elem.getElementsByAttributeValueContaining("data-ride-data","\"status\":\"full"));
        	if (elem.getElementsByAttributeValueContaining("data-ride-data","\"status\":\"full").isEmpty())
        	{
        	
        		departure = elem.getElementsByClass("departure").text();
                arrival = elem.getElementsByClass("arrival").text();
                Elements price = elem.select("div.total");
                finalPrice = price.select("span.num").text();      
                
              
                if (!finalPrice.isEmpty()){
                	System.out.println(departureCity+","+arrivalCity+","+rideDate+","+departure+","+arrival+","+finalPrice);
                	
                	writer.println(departureCity+";"+arrivalCity+";"+rideDate+";"+departure+";"+arrival+";"+finalPrice+";"+url);
                	
            	}
                	
              
        	}
          
         }	
        writer.close();
	}
		  
	}

	/**
	 * Con este método devuelvo un objeto de la clase Document con el contenido del
	 * HTML de la web que me permitirá parsearlo con los métodos de la librelia JSoup
	 * @param url
	 * @return Documento con el HTML
	 */
	
	private static Document getHtmlDocument(String url) {	
		Document doc = null;
		int timeout = 100000;
		try {
		    doc = Jsoup.connect(url).userAgent("Mozilla/5.0").timeout(timeout).get();
		    } catch (IOException ex) {
			System.out.println("Exception getting the web page : " + ex.getMessage());
		    }
	    return doc;
		
	}
	
	public static File ensureFileExists(String pathname) throws IOException {
		File file = new File(pathname);
		if (!file.exists()) {
			// creation code after
			System.out.println("the file does not exists");
			File parent = file.getParentFile();
			if (!parent.exists()) {
				parent.mkdirs();
			}
			file.createNewFile();
			System.out.println("file was successfully created");
		} else {
			System.out.println("the file already exists");
		}
		return file;
	}
	

}
