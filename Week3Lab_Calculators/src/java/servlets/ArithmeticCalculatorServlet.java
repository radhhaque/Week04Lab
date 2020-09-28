
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 829468
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").
                forward(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        
        int firstNumber = 0;
        int secondNumber = 0;
        int result;
        try {
        
            firstNumber = Integer.parseInt(first);
            secondNumber = Integer.parseInt(second);
        }
        catch (NumberFormatException e) {
            request.setAttribute("message", "invalid entry, please enter a number");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").
                forward(request, response);
        }
        
        if (request.getParameter("operation").equals("+")) {
            
            result = firstNumber + secondNumber;
            
            request.setAttribute("message", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").
                forward(request, response);
        }
        
        else if (request.getParameter("operation").equals("-")) {
            
            result = firstNumber - secondNumber;
            
            request.setAttribute("message", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").
                forward(request, response);
        }
        
        else if (request.getParameter("operation").equals("*")) {
            
            result = firstNumber * secondNumber;
            
            request.setAttribute("message", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").
                forward(request, response);
        }
        
        else if (request.getParameter("operation").equals("%")) {
            
            result = firstNumber / secondNumber;
            
            request.setAttribute("message", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").
                forward(request, response);
    }
    }
}



