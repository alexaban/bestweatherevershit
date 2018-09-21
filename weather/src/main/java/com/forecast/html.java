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

        boolean sunny = false;
        boolean cloudy = false;
        boolean rainy = false;
        boolean stormy = false;
        boolean snowy = false;


    /* if (oslo == sunny){
            sunny == true;
            cloudy == false;
            rainy == false;
            stormy == false;
            snowy == false;
        }*/

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
            out.println("                         <p> today is  a drizzling fucking day!!! Woopdie fucking do</p>\n ");
            out.println("                         <p>probably a good time to kms</p>\n ");
            out.println("                     </div>\n ");
            out.println("                </div>\n ");
            out.println("                <div class=\"divcolumn2\">\n ");
            out.println("                     <h1> Tomorrow</h1>\n ");
            out.println("                     <div class=\"divcolumn3\">\n ");
            out.println("                         <div class=\"column\"><i class=\"fas fa-umbrella\" style=\"font-size:60px;color:blue;align:center;\"></i></div>\n ");
            out.println("                         <p> tomorrow is also a drizzling fucking day!!! Woopdie fucking do</p>\n ");
            out.println("                         <p>which confirms my previous theory</p>\n ");
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
                    "      ['Bergen', 60.395810, 5.331776 , 3],\n" +
                    "      ['Stavanger', 58.974964, 5.733652 , 4],\n" +
                    "      ['Kristiansand', 58.164346, 8.020225, 5]\n" +
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
                    "\n" +
                    "\n" +
                    "          infowindow.open(map, marker);\n" +
                    "        }\n" +
                    "      })(marker, i));\n" +
                    "    }\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n");


            out.println("function FontAwesomeMarker(latlng, map, args) {\n" +
                    "\tthis.latlng = latlng;\t\n" +
                    "\tthis.args = args;\t\n" +
                    "\tthis.setMap(map);\t\n" +
                    "}\n" +
                    "\n" +
                    "FontAwesomeMarker.prototype.draw = function() {\n" +
                    "\tvar self = this,\n" +
                    "  \tpanes = this.getPanes(),\n" +
                    "  \tmarker = this.marker;\n" +
                    "\t\n" +
                    "\tif (!marker) {\n" +
                    "\t  marker = this.marker = document.createElement('div');\n" +
                    "\t\tmarker.className = 'marker';\n" +
                    "\t\t\n" +
                    "    var icon = document.createElement('i');\n" +
                    "    icon.className = 'fa fa-' + this.args.icon;\n" +
                    "    icon.style.fontSize = this.args.fontSize;\n" +
                    "    icon.style.color = this.args.color;\n" +
                    "    marker.appendChild(icon);\n" +
                    "    \n" +
                    "    var point = this.getProjection().fromLatLngToDivPixel(this.latlng);\n" +
                    "    if (point) {\n" +
                    "      marker.style.left = (point.x - 25) + 'px';\n" +
                    "      marker.style.top = (point.y - 25) + 'px';\n" +
                    "    }\n" +
                    "    \n" +
                    "\t\t//google.maps.event.addDomListener(marker, \"click\", function(event) {\n" +
                    "\t\t\t//alert('You clicked on a custom marker!');\t\t\t\n" +
                    "\t\t\t//google.maps.event.trigger(self, \"click\");\n" +
                    "\t\t//});\n" +
                    "\n" +
                    "\t\tpanes.overlayImage.appendChild(marker);\n" +
                    "\t}\n" +
                    "};\n" +
                    "\n" +
                    "FontAwesomeMarker.prototype.remove = function() {\n" +
                    "\tif (this.marker) {\n" +
                    "\t\tthis.marker.parentNode.removeChild(this.marker);\n" +
                    "\t\tthis.marker = null;\n" +
                    "\t}\t\n" +
                    "};\n" +
                    "\n" +
                    "FontAwesomeMarker.prototype.getPosition = function() {\n" +
                    "\treturn this.latlng;\t\n" +
                    "};\n" +
                    "\n" +
                    "function initialize() {\n" +
                    "\tvar myLatlng = new google.maps.LatLng(-33.9,151.2),\n" +
                    "    mapOptions = {\n" +
                    "      zoom: 15,\n" +
                    "      center: myLatlng,\n" +
                    "      disableDefaultUI: true\n" +
                    "    };\n" +
                    "\t\n" +
                    "\tvar map = new google.maps.Map(document.getElementById('map'), mapOptions);\n" +
                    "  var markers = [\n" +
                    "  \t{\n" +
                    "      latLan: new google.maps.LatLng(-33.9,151.2),\n" +
                    "      icon: 'cloud',\n" +
                    "      color: '#346698',\n" +
                    "      fontSize: '35px'\n" +
                    "    },\n" +
                    "    {\n" +
                    "     \tlatLan: new google.maps.LatLng(-33.8939,151.207333),\n" +
                    "      icon: 'asterisk',\n" +
                    "      color: 'lightblue',\n" +
                    "      fontSize: '35px'\n" +
                    "    },\n" +
                    "    {\n" +
                    "      latLan: new google.maps.LatLng(-33.895,151.195),\n" +
                    "      icon: 'umbrella',\n" +
                    "      color: '#39A00F',\n" +
                    "      fontSize: '35px'\n" +
                    "    },\n" +
                    "    {\n" +
                    "      latLan: new google.maps.LatLng(-33.905,151.195),\n" +
                    "      icon: 'bolt',\n" +
                    "      color: 'yellow',\n" +
                    "      fontSize: '35px'\n" +
                    "    },\n" +
                    "     {\n" +
                    "     \tlatLan: new google.maps.LatLng(-33.9039,151.207333),\n" +
                    "      icon: 'certificate',\n" +
                    "      color: 'orange',\n" +
                    "      fontSize: '35px'\n" +
                    "    },\n" +
                    "  ]\n" +
                    "  \n" +
                    "  markers.forEach(function(item) {\n" +
                    "    new FontAwesomeMarker(\n" +
                    "      item.latLan, \n" +
                    "      map,\n" +
                    "      {\n" +
                    "        icon: item.icon,\n" +
                    "        color: item.color,\n" +
                    "        fontSize: item.fontSize\n" +
                    "      }\n" +
                    "    );\n" +
                    "  });\n" +
                    "}");
            out.println("</script>");

        } finally {
            out.close();
        }
    }
}