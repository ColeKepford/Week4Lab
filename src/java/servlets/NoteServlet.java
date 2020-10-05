/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author cocog
 */
public class NoteServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       String title = "";
       String contents = "";
       String line;
       String path = getServletContext().getRealPath("/WEB-INF/note.txt");
       // to read files
       BufferedReader br = new BufferedReader(new FileReader(new File(path)));
       
        title = br.readLine();
        while((line = br.readLine()) != null) 
        {
            contents = br.readLine();
        }
        br.close();

        Note note = new Note(title, contents);
        request.setAttribute("note", note);
        
        String page = request.getParameter("edit") != null ? "/WEB-INF/editnote.jsp" : "/WEB-INF/viewnote.jsp";
        getServletContext().getRequestDispatcher(page).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    { 
        String title = request.getParameter("titleBox");
        String contents = request.getParameter("contentBox");
        Note note = new Note(title, contents);
        request.setAttribute("note", note);
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        // to write to a file
       PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
       pw.print(title);
       pw.println(contents);
       pw.close();
       
       getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }
}
