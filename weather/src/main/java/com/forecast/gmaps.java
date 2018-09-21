package com.forecast;

public class gmaps {


    public String appender() {

        StringBuilder stringBuilder = new StringBuilder();
        String line = "http://maps.google.com/maps/api/js?&sensor=false" +
                " var locations = [\n" +
                "                                   ['Oslo', 59.913971, 10.752260, 1],\n" +
                "                                   ['Bergen', 60.395810, 5.331776 , 3],\n" +
                "                                   ['Stavanger', 58.974964, 5.733652 , 4],\n" +
                "                                   ['Kristiansand', 58.164346, 8.020225, 5],\n" +
                "                                   ['Trondheim', 63.4187958, 10.3685515, 2]\n" +
                "\n" +
                "                                ];\n" +
                "\n" +
                "        var map = new google.maps.Map(document.getElementById('map'), {\n" +
                "                zoom: 4,\n" +
                "                center: new google.maps.LatLng (65.841125, 13.193200),\n" +
                "                mapTypeId: google.maps.MapTypeId.ROADMAP\n" +
                "                                 });\n" +
                "\n" +
                "        var infowindow = new google.maps.InfoWindow();\n" +
                "        var marker, i;\n" +
                "        for (i = 0; i < locations.length; i++) {\n" +
                "            marker = new google.maps.Marker({\n" +
                "                    position: new google.maps.LatLng(locations[i][1], locations[i][2]),\n" +
                "                    map: map\n" +
                "                                   });\n" +
                "            google.maps.event.addListener(marker, 'click', (function(marker, i) {\n" +
                "                return function() {\n" +
                "                    infowindow.setContent(locations[i][0]);\n" +
                "                    infowindow.open(map, marker);\n" +
                "                }\n" +
                "            })(marker, i));\n" +
                "        }";

        String maps = stringBuilder.append(line).toString();
        return(maps);



    }
}
