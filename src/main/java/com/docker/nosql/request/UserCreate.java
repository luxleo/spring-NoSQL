package com.docker.nosql.request;

import com.docker.nosql.domain.Member;
import lombok.Data;

@Data
public class UserCreate {
    private String uid;
    private String name;
    private Integer age;

    public Member toMember() {
        return Member.builder()
                .uid(uid)
                .name(name)
                .age(age)
                .build();
    }
}
