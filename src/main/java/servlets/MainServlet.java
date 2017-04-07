package servlets;

import model.Disk;
import model.DiskImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by vasya on 05.04.2017.
 */
public class MainServlet extends HttpServlet{

    final List<Disk> disks = new CopyOnWriteArrayList<Disk>();

    {
        disks.add(new DiskImpl("game", "vasya"));
        disks.add(new DiskImpl("game1", "vasya1"));
        disks.add(new DiskImpl("game2", "vasya2"));
        disks.add(new DiskImpl("game3", "vasya3"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.append(
                        "<!DOCTYPE html>"
                        +				"<html>"
                        +				"<head>"
                        +				"     <title>Clinic Pets</title>"
                        +				"</head>"
                        +				"<body>"
                                +"<form action='"+req.getContextPath()+"/' method='post'>"
                                +"         Name : <input type='text' name='name'>"
                                +"         <input type='submit' value='Submit'>"
                        + "     <form>"
                                + viewDisks()
                        +				"</body>"
                        +				"</html>"
        );
        writer.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        disks.add(new DiskImpl("12", req.getParameter("name")));
        doGet(req, resp);
    }

    private String viewDisks(){
        StringBuilder sb = new StringBuilder();
        sb.append("<p>Disks</p>");
        sb.append("<table style='border : 1px solid black'>");
        for (Disk disk:disks){
            sb.append("<tr><td style='border : 1px solid black'>").append(disk.getName()).append("</td></tr>");
        }
        sb.append("</table>");
        return sb.toString();
    }
}
