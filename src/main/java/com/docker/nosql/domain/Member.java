package com.docker.nosql.domain;

import jakarta.validation.constraints.*;
import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("user")
public class Member {
    @Id
    private String _id;
    @NotBlank // null, "", '' empty string 모두 허용안한다.
    private String uid;
    @NotNull // null만 허용 안한다.
    @Pattern(regexp = "^[가-힣]{2,10}$",message = "이름은 한글 2~10자 입력")
    private String name;
    @Min(2) @Max(100)
    private Integer age;
    @Email
    private String email;
    @Builder
    public Member(String uid, String name, Integer age) {
        this.uid = uid;
        this.name = name;
        this.age = age;
    }
}
