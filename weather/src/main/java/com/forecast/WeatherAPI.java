package com.forecast;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

@RestController
public class WeatherAPI extends HttpServlet {

    String values;
    String ids;
    String idst;
    String valuest;
    @RequestMapping("/weatherAPI/{lat}/{long}")

    public WeatherData information(String lat, String lon) throws IOException {

        URLConnection connection = new URL("https://api.met.no/weatherapi/locationforecast/1.9/?lat=" + lat + "1&lon=" + lon + "").openConnection();
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
        connection.connect();

        BufferedReader buffer = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        StringBuilder stringBuilder = new StringBuilder();
        String line;

        while ((line = buffer.readLine()) != null) {
            stringBuilder.append(line);
        }
        JSONObject jsondata = XML.toJSONObject(stringBuilder.toString());
        JSONObject jsondata1 = XML.toJSONObject(stringBuilder.toString());

        jsondata = (JSONObject) jsondata.get("weatherdata");
        jsondata = (JSONObject) jsondata.get("product");
        JSONArray array2 = jsondata.getJSONArray("time");

        jsondata1 = (JSONObject) jsondata1.get("weatherdata");
        jsondata1 = (JSONObject) jsondata1.get("product");
        JSONArray array = jsondata1.getJSONArray("time");

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'");

        String todaytime = dateFormat.format(new Date()) + "20:00:00Z";

        JSONObject weatherToday = new JSONObject();
        JSONObject weatherToday2 = new JSONObject();
        for (int i = 0; i < array.length(); i++){
            if (array.getJSONObject(i).get("from").equals(todaytime) && array.getJSONObject(i).get("to").equals(todaytime)) {
                weatherToday= array.getJSONObject(i);
                weatherToday2= array2.getJSONObject(i + 1);
                break;
            }
        }
        System.out.println("PRINTER " + todaytime);
        System.out.println(weatherToday);

            weatherToday = (JSONObject) weatherToday.get("location");
            weatherToday = (JSONObject) weatherToday.get("temperature");
            Double value = (Double) weatherToday.get("value");

        //JSONObject weatherToday2 = new JSONObject();
        /*for (int i = 0; i < array.length(); i++){
            if (array.getJSONObject(i).get("from").equals(todaytime)) {
                weatherToday2= array2.getJSONObject(i);
                break;
            }
        }*/

            //jsondata1 =  array2.getJSONObject(1);
            weatherToday2 = (JSONObject)weatherToday2.get("location");
            weatherToday2 = (JSONObject)weatherToday2.get("symbol");
            String id = (String)weatherToday2.get("id");
            values = value.toString();
            ids = id;


        JSONObject jsondata3 = XML.toJSONObject(stringBuilder.toString());
        JSONObject jsondata4 = XML.toJSONObject(stringBuilder.toString());

        jsondata3 = (JSONObject) jsondata3.get("weatherdata");
        jsondata3 = (JSONObject) jsondata3.get("product");
        JSONArray array3 = jsondata3.getJSONArray("time");

        jsondata4 = (JSONObject) jsondata4.get("weatherdata");
        jsondata4 = (JSONObject) jsondata4.get("product");
        JSONArray array4 = jsondata4.getJSONArray("time");



        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        c.add(Calendar.DATE, 1);
        dt = c.getTime();

        String tomorrowtime = dateFormat.format(dt) + "20:00:00Z";

        JSONObject weatherTomorrow = new JSONObject();
        JSONObject weatherTomorrow1 = new JSONObject();
        for (int i = 0; i < array.length(); i++){
            if (array.getJSONObject(i).get("from").equals(tomorrowtime) && array.getJSONObject(i).get("to").equals(tomorrowtime)) {
                weatherTomorrow= array3.getJSONObject(i);
                weatherTomorrow1= array4.getJSONObject(i + 1);
                break;
            }
        }

            weatherTomorrow = (JSONObject) weatherTomorrow.get("location");
            weatherTomorrow = (JSONObject) weatherTomorrow.get("temperature");
            Double value1 = (Double) weatherTomorrow.get("value");

        /*JSONObject weatherTomorrow1 = new JSONObject();
        for (int i = 0; i < array.length(); i++){
            if (array.getJSONObject(i).get("from").equals(tomorrowtime)) {
                weatherTomorrow1= array4.getJSONObject(i);
                break;
            }
        }*/

            weatherTomorrow1 = (JSONObject)weatherTomorrow1.get("location");
            weatherTomorrow1 = (JSONObject)weatherTomorrow1.get("symbol");
            String id1 = (String)weatherTomorrow1.get("id");
            valuest = value1.toString();
            idst = id1;

        return new WeatherData(values, ids, valuest, idst);
    }
}
