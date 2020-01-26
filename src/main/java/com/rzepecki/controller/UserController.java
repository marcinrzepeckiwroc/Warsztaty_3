package com.rzepecki.controller;

import com.rzepecki.dao.SolutionDAO;
import com.rzepecki.dao.UserDAO;
import com.rzepecki.model.Solution;
import com.rzepecki.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/user")
public class UserController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer userId = Integer.parseInt(request.getParameter("id"));
        //getUser
        User user =new UserDAO().read(userId);
        request.setAttribute("user", user);
        //getUserSolution
        List<Solution> solutions = new SolutionDAO().findAllByUserId(userId);
        if(solutions!=null){
            request.setAttribute("solutions", solutions);
        }
        getServletContext().getRequestDispatcher("/user.jsp").forward(request, response);
    }
}
