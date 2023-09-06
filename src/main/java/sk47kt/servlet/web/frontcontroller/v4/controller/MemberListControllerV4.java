package sk47kt.servlet.web.frontcontroller.v4.controller;

import sk47kt.servlet.domain.member.Member;
import sk47kt.servlet.domain.member.MemberRepository;
import sk47kt.servlet.web.frontcontroller.ModelView;
import sk47kt.servlet.web.frontcontroller.v3.ControllerV3;
import sk47kt.servlet.web.frontcontroller.v4.ControllerV4;

import java.util.List;
import java.util.Map;

public class MemberListControllerV4 implements ControllerV4 {
    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        List<Member> members = memberRepository.findAll();
        model.put("members", members);

        return "members";
    }
}
