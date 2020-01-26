package com.rzepecki.controller;

import com.rzepecki.dao.SolutionDAO;
import com.rzepecki.model.Solution;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/")
public class HomePage extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Solution solution = new Solution();
        Integer numberSolution = Integer.parseInt(getServletContext().getInitParameter("number-solutions"));
        SolutionDAO solutionDAO =  new SolutionDAO();
        List<Solution> recent = solutionDAO.findRecent(numberSolution);
        if(recent==null){
            System.out.println("Brak danych");
        }else{
            request.setAttribute("solutions", recent);
            getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);

        }
    }
}
