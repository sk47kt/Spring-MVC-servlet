package sk47kt.servlet.web.frontcontroller.v2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import sk47kt.servlet.domain.member.Member;
import sk47kt.servlet.domain.member.MemberRepository;
import sk47kt.servlet.web.frontcontroller.MyView;

import java.io.IOException;
import java.util.List;

public class MemberListControllerV2 implements ControllerV2
{
    private MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    public MyView process(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        List<Member> members = memberRepository.findAll();
        request.setAttribute("members",members);

        return new MyView("/WEB-INF/views/members.jsp");
    }
}
