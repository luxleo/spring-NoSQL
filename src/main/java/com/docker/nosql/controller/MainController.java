package com.docker.nosql.controller;

import com.docker.nosql.domain.Member;
import com.docker.nosql.request.UserCreate;
import com.docker.nosql.request.UserUpdate;
import com.docker.nosql.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MainController {
    private final MemberService memberService;
    @GetMapping("/user")
    public void user() {

    }
    @GetMapping("/user/{uid}")
    public void user(@PathVariable String uid) {

    }
    @PostMapping("/user")
    public ResponseEntity<Member> insertUser(UserCreate dto) {
        Member newMember = memberService.createUser(dto.toMember());
        return ResponseEntity.ok(newMember);
    }
    @PutMapping("/user")
    public void updateUser(UserUpdate dto) {

    }
    @DeleteMapping("/user/{uid}")
    public void deleteUser(@PathVariable String uid) {

    }
}
