package com.forecast;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class html  extends HttpServlet {

    @Override
    public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

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
            out.println("            <div class=\"divcolumn\">\n ");
            out.println("                <p> troll me not pls</p>\n ");
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

        } finally {
            out.close();
        }

    }
}
