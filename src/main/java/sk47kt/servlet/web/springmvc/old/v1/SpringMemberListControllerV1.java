package sk47kt.servlet.web.springmvc.old.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sk47kt.servlet.domain.member.Member;
import sk47kt.servlet.domain.member.MemberRepository;
import sk47kt.servlet.web.frontcontroller.ModelView;

import java.util.List;
import java.util.Map;

@Controller
public class SpringMemberListControllerV1 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @RequestMapping("/springmvc/v1/members")
    public ModelAndView process() {

        List<Member> members = memberRepository.findAll();

        ModelAndView mv = new ModelAndView("members");
        mv.getModel().put("members",members);

        return mv;
    }
}
