package com.feather.assistant.member.MemberService;

import com.feather.assistant.$Entity.MemberEntity;
import com.feather.assistant.member.MemberDto.MemberDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface  MemberService extends JpaRepository<MemberDto,Integer> {
    List<MemberDto> findAll();
}
