package com.forecast;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@RestController
public class html  extends HttpServlet {

    @Override
    @RequestMapping("/index.html")


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        WeatherAPI wth = new WeatherAPI();

        String latO = "59.913971";
        String lonO = "10.752260";


        try {
            out.println("<!DOCTYPE html>\n ");
            out.println("<html xmlns:font-size=\"http://www.w3.org/1999/xhtml\" xmlns:align=\"http://www.w3.org/1999/xhtml\">\n ");
            out.println("<head>\n ");
            out.println("    <script src=\"http://maps.google.com/maps/api/js?&sensor=false\" type=\"text/javascript\"></script>\n ");
            out.println("    <link rel=\"stylesheet\" href=\"style.css\"/>\n ");
            out.println("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\n ");
            out.println("    <meta charset=\"UTF-8\">\n ");
            out.println("    <title>Weatherforecast</title>\n ");
            out.println("    <header>\n ");
            out.println("        <h1> Weather forecast by Experis Academy</h1>\n ");
            out.println("        <h2> by Alexandra Bandarenka, Tonje Thøgersen og Bianca Eilertsen</h2>\n ");
            out.println("    </header>\n ");
            out.println("    <nav>\n ");
            out.println("        <ul>\n ");
            out.println("            <li><a href=\"#rows\">Icons</a></li>\n ");
            out.println("            <li><a href=\"#map\">Weather</a></li>\n ");
            out.println("            <li><a href=\"#\">Task</a></li>\n ");
            out.println("            <li><a href=\"#\">About</a></li>\n ");
            out.println("        </ul>\n ");
            out.println("    </nav>\n ");
            out.println("</head>\n ");

            out.println("<body>\n ");
            out.println("<div class=\"Task\">\n ");
            out.println("    <h3> The following is the task of which produced this website:</h3>\n ");
            out.println("    <p>Each group must produce a webpage (running as a server) that shows a map of Norway </br>\n  ");
            out.println("        with appropriate symbols for the predicted weather at major cities.</br>\n ");
            out.println("        Hint use <a href=\"https://api.met.no/\"> https://api.met.no </a>, Google Maps and possibly <a href=\"fontawesome.com\"> fontawesome.com </a>.</br>\n ");
            out.println("        The system needs only show a forecast for \"Today\" and \"Tomorrow\".</br>\n ");
            out.println("        The user must be able to browse locations in Norway and the map must reflect this.</br>\n ");
            out.println("        This task is fairly open ended, so I'm leaving it to individual groups to be creative.</br>\n ");
            out.println("        Hand in a complete archive (.war) that I can launch on my own computer. </p>\n ");
            out.println("    <div class=\"br2\"></div>\n ");


            out.println("    <div class=\"weathers\">\n ");
            out.println("        <h3> Weatherforecast of Norway </h3>\n ");
            out.println("        <p> This is the following weather types this application displays</p>\n ");

            out.println("        <div class=\"br\"></div>\n ");

            out.println("        <div class=\"rows\" name=\"rows\">\n ");
            out.println("            <div class=\"row\">\n ");
            out.println("                <div class=\"column\"><i class=\"fas fa-cloud\" style=\"font-size:60px;color:lightblue;\"></i></div>\n ");
            out.println("                <div class=\"column\"><i class=\"fas fa-umbrella\" style=\"font-size:60px;color:blue;\"></i></div>\n ");
            out.println("                <div class=\"column\"><i class=\"fas fa-certificate\" style=\"font-size:60px;color:orange;\"></i></div>\n ");
            out.println("                <div class=\"column\"><i class=\"fas fa-bolt\" style=\"font-size:60px;color:yellow;\"></i></div>\n ");
            out.println("                <div class=\"column\"><i class=\"fas fa-asterisk\" style=\"font-size:60px;color:lightgrey;\"></i></div>\n ");
            out.println("            </div>\n ");
            out.println("            <div class=\"br\"></div>\n ");

            out.println("            <div class=\"row\">\n ");
            out.println("                <div class=\"column\">Cloudy weather</div>\n ");
            out.println("                <div class=\"column\">Rainy weather</div>\n ");
            out.println("                <div class=\"column\">Sunny weather</div>\n ");
            out.println("                <div class=\"column\">Stormy weather</div>\n ");
            out.println("                <div class=\"column\">Snowy weather</div>\n ");
            out.println("            </div>\n ");
            out.println("        </div>\n ");


            out.println("        <div class=\"br\"></div>\n ");
            out.println("        <div id=\"divider\" name=\"divider\">\n ");
            out.println("            <div class=\"divcolumn\">\n ");
            out.println("                <div id=\"map\" style=\"height: 500px; align: center;\"></div>\n ");
            out.println("            </div>\n ");

            // UI BOX VED SIDEN AV MAP
                out.println("            <div class=\"divcolumn\">\n ");
            out.println("                <div class=\"divcolumn2\">\n ");
            out.println("                     <h1> Today</h1>\n ");
            out.println("                     <div class=\"divcolumn3\">\n ");
            out.println("                         <div class=\"column\"><i class=\"fas fa-umbrella\" style=\"font-size:60px;color:blue;align:center;\"></i></div>\n ");
            out.println("                         <p> Temperature" + "</p>\n ");
            out.println("                         <p> Weather type: " + "</p>\n ");
            out.println("                     </div>\n ");
            out.println("                </div>\n ");
            out.println("                <div class=\"divcolumn2\">\n ");
            out.println("                     <h1> Tomorrow</h1>\n ");
            out.println("                     <div class=\"divcolumn3\">\n ");
            out.println("                         <div class=\"column\"><i class=\"fas fa-umbrella\" style=\"font-size:60px;color:blue;align:center;\"></i></div>\n ");
            out.println("                         <p> Temperature: " + "</p>\n ");
            out.println("                         <p> Weather type: " + "</p>\n ");
            out.println("                     </div>\n ");
            out.println("                </div>\n ");
            out.println("            </div>\n ");
            out.println("        </div>\n ");
            out.println("    </div>\n ");
            out.println("</div>\n ");


            out.println("<div class=\"br\"></div>\n ");
            out.println("<div class=\"br\"></div>\n ");
            out.println("<div class=\"br\"></div>\n ");
            out.println("<div class=\"br\"></div>\n ");
            out.println("<div class=\"br\"></div>\n ");
            out.println("</div>\n ");

            out.println("<script type=\"text/javascript\">\n" +
                    "    var locations = [\n" +
                    "      ['Oslo', 59.913971, 10.752260, 1],\n" +
                    "      ['Bergen', 60.395810, 5.331776 , 2],\n" +
                    "      ['Stavanger', 58.974964, 5.733652 , 3],\n" +
                    "      ['Kristiansand', 58.164346, 8.020225, 4],\n" +
                    "      ['Trondheim', 63.4187958, 10.3685515, 5]\n" +
                    "\n" +
                    "\n" +
                    "    ];\n" +
                    "\n" +
                    "    var map = new google.maps.Map(document.getElementById('map'), {\n" +
                    "      zoom: 4,\n" +
                    "      center: new google.maps.LatLng (65.841125, 13.193200),\n" +
                    "      mapTypeId: google.maps.MapTypeId.ROADMAP\n" +
                    "    });\n" +
                    "\n" +
                    "    var infowindow = new google.maps.InfoWindow();\n" +
                    "\n" +
                    "    var marker, i;\n" +
                    "\n" +
                    "    for (i = 0; i < locations.length; i++) {\n" +
                    "      marker = new google.maps.Marker({\n" +
                    "        position: new google.maps.LatLng(locations[i][1], locations[i][2]),\n" +
                    "        map: map\n" +
                    "      });\n" +
                    "\n" +
                    "      google.maps.event.addListener(marker, 'click', (function(marker, i) {\n" +
                    "        return function() {\n" +
                    "          infowindow.setContent(locations[i][0]);\n" +
                    "<form action=\"${localhost:8081/WeatherAPI\" method=\"post\">\n" +
                            "    <input type=\"submit\" name=\"i\" value=\"Button 1\" />\n" +
                            "</form>" +
                    "          wth.information(locations[i][1].toString(),locations[i][2].toString());\n" +
                    "          infowindow.open(map, marker);\n" +
                    "        }\n" +
                    "      })(marker, i));\n" +
                    "    } </script>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n");

        } finally {
            out.close();
        }
    }
}