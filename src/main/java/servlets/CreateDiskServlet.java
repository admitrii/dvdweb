package servlets;

import model.DiskImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by vasya on 05.04.2017.
 */
public class CreateDiskServlet extends HttpServlet {
    final List<DiskImpl> disks = new CopyOnWriteArrayList<DiskImpl>();

    {
        disks.add(new DiskImpl("game", "vasya"));
        disks.add(new DiskImpl("game1", "vasya1"));
        disks.add(new DiskImpl("game2", "vasya2"));
        disks.add(new DiskImpl("game3", "vasya3"));
        disks.add(new DiskImpl("game3", "vasya3"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("disks", disks);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/views/CreateDisk.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       disks.add(new DiskImpl("dsadsa", req.getParameter("diskname")));
       doGet(req, resp);
    }
}
