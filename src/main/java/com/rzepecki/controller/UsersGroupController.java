package com.rzepecki.controller;

import com.rzepecki.dao.UserDAO;
import com.rzepecki.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/servlet2")
public class UsersGroupController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer groupId = Integer.parseInt(request.getParameter("id"));
        List<User> user = loadAllByGroupId(groupId);
        System.out.println(user.size());
        request.setAttribute("users", user);
        getServletContext().getRequestDispatcher("/users.jsp").forward(request, response);
    }

    private List<User> loadAllByGroupId(Integer groupId) {
        UserDAO userDAO = new UserDAO();
        List<User> users =userDAO.findAllByGroupId(groupId);
        return users;
    }
}
