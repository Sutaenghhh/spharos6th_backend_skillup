package com.sutaeng.spharos6th.member.application;

import com.sutaeng.spharos6th.member.dto.in.MemberAddDto;
import com.sutaeng.spharos6th.member.infrastructure.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

   @Override
    public void addMember(MemberAddDto memberAddDto) {
       log.info("memberAddDto : {}", memberAddDto.toString());
       log.info("memberAddDto.toEntity(UUID.randomUUID().toString()) : {}", memberAddDto.toEntity(UUID.randomUUID().toString()).toString());
        memberRepository.save(memberAddDto.toEntity(UUID.randomUUID().toString()));
    }
}
