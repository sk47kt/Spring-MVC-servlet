package sk47kt.servlet.web.servletmvc;

import jakarta.servlet.DispatcherType;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sk47kt.servlet.domain.member.Member;
import sk47kt.servlet.domain.member.MemberRepository;

import java.io.IOException;
import java.util.List;

@WebServlet(name="mvcMemberListServlet",urlPatterns = "/servlet-mvc/members")
public class MvcMemberListServlet extends HttpServlet {
    private MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Member> members = memberRepository.findAll();
        request.setAttribute("members",members);

        String viewPath = "/WEB-INF/views/members.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(viewPath);
        requestDispatcher.forward(request,response);
    }
}
