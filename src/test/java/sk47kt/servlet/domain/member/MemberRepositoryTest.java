package sk47kt.servlet.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


class MemberRepositoryTest {
    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void clear(){
        memberRepository.clearStore();
    }

    @Test
    void save(){
        Member member = new Member("hello", 20);
        Member savemember = memberRepository.save(member);

        Member findId = memberRepository.findById(savemember.getId());

        assertThat(findId).isEqualTo(savemember);
    }

    @Test
    void findAll(){
        Member member1 = new Member("hello1", 20);
        Member member2 = new Member("hello2", 25);

        memberRepository.save(member1);
        memberRepository.save(member2);

        List<Member> memberList = memberRepository.findAll();

        assertThat(memberList.size()).isEqualTo(2);
        System.out.println("MemberRepositoryTest.findAll");
        for (Member member : memberList) {
            System.out.println(member.getUsername());
        }
    }


}