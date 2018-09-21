package com.forecast;

import org.json.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.net.*;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;


@SpringBootApplication
public class WeatherForecast {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(WeatherForecast.class, args);
		String str = "";
		URLConnection connection = new URL("https://api.met.no/weatherapi/locationforecast/1.9/?lat=59.913971&lon=10.752260").openConnection();
		connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
		connection.connect();

		BufferedReader buffer = new BufferedReader(new InputStreamReader(connection.getInputStream()));

		StringBuilder stringBuilder = new StringBuilder();
		String line;

		while ((line = buffer.readLine()) != null) {
			stringBuilder.append(line);
		}
		JSONObject jsondata = XML.toJSONObject(stringBuilder.toString());
		System.out.println(jsondata);

		String jsondata1 = jsondata.toString();

		int i = jsondata1.indexOf("{");
		jsondata1 = jsondata1.substring(i);

		JSONObject winfo = new JSONObject(jsondata1);
		Object result = winfo.get("weatherdata");

		//String next2 = winfo.toString();
		//checkKey(jsondata, "from");
		System.out.println(checkKey(jsondata, "from"));







		/*JSONObject finfo = new JSONObject(jsondata.getString("from"));
		String jsonDate = finfo.toString();

		JSONArray info2 = new JSONArray(jsondata.getString("location"));

		Date date = new Date();

		String date2 = date.toString();

		if(date2.equals(jsonDate)){
			JSONArray info3 = new JSONArray(jsondata.getString("location"));


			System.out.println(next2);
		}*/


	}

	 /*static Object find(JSONObject jObj, String k) throws JSONException {
		Iterator<?> keys = jObj.keys();

		while (keys.hasNext()) {
			String key = (String) keys.next();
			if (key.equals(k)) {
				System.out.println(jObj.get(key));
				return jObj.get(key);
			}

			if (jObj.get(key) instanceof JSONObject) {
				System.out.println(jObj.get(key));
				return find((JSONObject) jObj.get(key), k);
			}

			if (jObj.get(key) instanceof JSONArray) {
				JSONArray jar = (JSONArray) jObj.get(key);
				for (int i = 0; i < jar.length(); i++) {
					JSONObject j = jar.getJSONObject(i);
					find(j, k);
				}
			}
		}
		return null;
	}*/

	public static Object checkKey(JSONObject object, String searchedKey) {
		boolean exists = object.has(searchedKey);
		Object obj = null;
		if(exists){
			obj = object.get(searchedKey);
		}
		if(!exists) {
			Set<String> keys = object.keySet();
			for(String key : keys){
				if ( object.get(key) instanceof JSONObject ) {
					obj = checkKey((JSONObject)object.get(key), searchedKey);
				}
			}
		}
		return obj;
	}
}
