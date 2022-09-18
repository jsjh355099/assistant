package com.feather.assistant.Controller.member;

import com.feather.assistant.Repository.member.MemberRepository;
import com.feather.assistant.common.FeatherApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.feather.assistant.Entity.member.MemberEntity;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    MemberRepository memberRepository;

    @Autowired
    MemberEntity memberEntity;

    @FeatherApiResponse
    @GetMapping("/ls")
    public List<MemberEntity> getAllMember(){
        return  memberRepository.findAll();
    }

    @FeatherApiResponse
    @PostMapping("/s")
    public void setMember(@RequestBody MemberEntity memberEntity){
        if(memberRepository.existsById(memberEntity.getId_member())){
            memberRepository.updateById(memberEntity.getId_member(),memberEntity.getPermission(),memberEntity.getName());
        }else{
            memberRepository.save(memberEntity);
        }
    };
    @DeleteMapping("/d")
    public void deleteMember(@RequestParam("id_member") Integer id_member){
        memberRepository.deleteById(id_member);
    }
}
