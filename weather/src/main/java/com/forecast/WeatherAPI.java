package com.forecast;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
@RestController
public class WeatherAPI extends HttpServlet {

    String values;
    String ids;
    String idst;
    String valuest;
    @RequestMapping("/weatherAPI/{lat}/{long}")


    public void information(@PathVariable String lat, @PathVariable String lon) throws IOException {
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

        jsondata = array.getJSONObject(0);
        jsondata = (JSONObject) jsondata.get("location");
        jsondata = (JSONObject) jsondata.get("temperature");
        Double value = (Double) jsondata.get("value");

        jsondata1 =  array2.getJSONObject(1);
        jsondata1 = (JSONObject)jsondata1.get("location");
        jsondata1 = (JSONObject)jsondata1.get("symbol");
        String id = (String)jsondata1.get("id");
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

        jsondata3 = array4.getJSONObject(110);
        jsondata3 = (JSONObject) jsondata3.get("location");
        jsondata3 = (JSONObject) jsondata3.get("temperature");
        Double value1 = (Double) jsondata3.get("value");

        jsondata4 =  array3.getJSONObject(111);
        jsondata4 = (JSONObject)jsondata4.get("location");
        jsondata4 = (JSONObject)jsondata4.get("symbol");
        String id1 = (String)jsondata4.get("id");
        valuest = value1.toString();
        idst = id1;


        System.out.println(value.toString() + id);
        System.out.println(value1.toString() + id1);


    }
}
