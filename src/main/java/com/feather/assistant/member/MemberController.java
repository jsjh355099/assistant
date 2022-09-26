package com.feather.assistant.member;

import com.feather.assistant.$Entity.MemberEntity;
import com.feather.assistant.$CommonFIle.AssistantApiResponse;
import com.feather.assistant.member.MemberDto.MemberDto;
import com.feather.assistant.member.MemberService.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.time.LocalDateTime.now;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    MemberService memberService;


    @AssistantApiResponse
    @GetMapping("/ls")
    public List<MemberEntity> getAllMember() {
        return memberRepository.findAll();
    }

    @AssistantApiResponse
    @GetMapping("/lsd")
    public List<MemberDto> getAllMemberDto() {
        return memberService.findAll();
    }


    @AssistantApiResponse
    @PostMapping("/s")
    public void saveMember(@RequestBody MemberEntity memberEntity) {
        memberRepository.save(memberEntity);
    }

    @DeleteMapping("/rm")
    public void deleteMember(@RequestParam("id_member") Integer id_member) {
        memberRepository.deleteById(id_member);
    }
}
