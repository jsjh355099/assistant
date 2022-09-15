package com.feather.assistant.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    MemberRepository memberRepository;

    @GetMapping("/ls")
    public List<MemberEntity> getAllMember(){
        return  memberRepository.findAll();
    }
    @GetMapping("/ls-p")
    public List<MemberEntity> getByPermission(@RequestParam(value = "permission", required = false)Integer permission){
       return  memberRepository.getByPermission(permission);
    }
    @PostMapping("/s")
    public void setMemberRepository(@RequestBody MemberEntity memberEntity){
        if(memberRepository.existsById(memberEntity.getId_member())){
            
        }else{
            memberRepository.save(memberEntity);
        }
    };
}
