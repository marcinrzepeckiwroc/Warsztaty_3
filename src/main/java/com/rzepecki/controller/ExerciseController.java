package com.rzepecki.controller;

import com.rzepecki.dao.ExcerciseDAO;
import com.rzepecki.dao.SolutionDAO;
import com.rzepecki.model.Exercise;
import com.rzepecki.model.Solution;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/servlet1")
public class ExerciseController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        Exercise exercise = loadById(id);
        System.out.println(exercise.getId());
        System.out.println(exercise.getTitle());
        System.out.println(exercise.getDescription());
        request.setAttribute("exercise", exercise);
        getServletContext().getRequestDispatcher("/solution.jsp").forward(request, response);
    }

    private Exercise loadById(int id) {
        SolutionDAO solutionDAO = new SolutionDAO();
        Solution solution = solutionDAO.read(id);
        int ex_id = solution.getExercise_id();
        ExcerciseDAO excerciseDAO = new ExcerciseDAO();
        Exercise exercise = excerciseDAO.read(ex_id);
        return exercise;
    }
}
