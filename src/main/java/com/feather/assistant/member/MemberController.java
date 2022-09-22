package com.feather.assistant.member;

import com.feather.assistant.$Entity.MemberEntity;
import com.feather.assistant.$CommonFIle.FeatherApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.time.LocalDateTime.now;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    MemberRepository memberRepository;


    @FeatherApiResponse
    @GetMapping("/ls")
    public List<MemberEntity> getAllMember() {
        return memberRepository.findAll();
    }

    @FeatherApiResponse
    @PostMapping("/s")
    public void setMember(@RequestBody MemberEntity memberEntity) {
        memberRepository.save(memberEntity);
    }

    @DeleteMapping("/d")
    public void deleteMember(@RequestParam("id_member") Integer id_member) {
        memberRepository.deleteById(id_member);
    }
}
