package com.docker.nosql.service;

import com.docker.nosql.domain.Member;
import com.docker.nosql.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public Member createUser(Member member) {
        return memberRepository.save(member);
    }

}
