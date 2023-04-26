
import jdk.internal.org.jline.utils.Colors.s
import jdk.internal.org.jline.utils.Colors.s





class java {
    package demotest;

    import java.io.IOException;

    import javax.servlet.RequestDispatcher;
    import javax.servlet.ServletException;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;

    /**
     * Servlet implementation class guru_register
     */
    public class guru_register extends HttpServlet {
        private static final long serialVersionUID = 1L;


        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // TODO Auto-generated method stub
            String first_name = request.getParameter("first_name");
            String last_name = request.getParameter("last_name");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String address = request.getParameter("address");
            String contact = request.getParameter("contact");

            if(first_name.isEmpty() || last_name.isEmpty() || username.isEmpty() ||
                password.isEmpty() || address.isEmpty() || contact.isEmpty())
            {
                RequestDispatcher req = request.getRequestDispatcher("register_1.jsp");
                req.include(request, response);
            }

            else
            {
                RequestDispatcher req = request.getRequestDispatcher("register_2.jsp");
                req.forward(request, response);
            }
            if (!((password.length() >= 8)
                        && (password.length() <= 15))) {
                return false;
            }

            // to check space
            if (password.contains(" ")) {
                return false;
            }
            if (true) {
                int count = 0;

                // check digits from 0 to 9
                for (int i = 0; i <= 9; i++) {

                    // to convert int to string
                    String str1 = Integer.toString(i);

                    if (password.contains(str1)) {
                        count = 1;
                    }
                }
                if (count == 0) {
                    return false;
                }
                if (Colors.s == null) {
                    return false
                }
                if (s == null) {
                    return false;
                }
                if(alphabet == null){
                    return false;
                }
                for (int i = 0; i < s.length(); i++)
                {
                    char c = s.charAt(i);
                    if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
                        return false;
                    }
                    val pattern: Pattern = Pattern.compile("^\\d{10}$");
                    val matcher: Matcher = pattern.matcher("2055550125");
                    assertTrue(matcher.matches());
                }
                return true;

        }
}