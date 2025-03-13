package com.sutaeng.spharos6th.member.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String memberUuid;

    @Comment("회원이름")
    @Column(nullable = false, length = 100)
    private String name;

    @Comment("회원 닉네임")
    @Column(nullable = false,unique = true, length = 100)
    private String email;
    private String password;
    private String phoneNumber;
    private String birth;

    @Builder
    public Member(Long id, String memberUuid,String name, String email, String password, String phoneNumber, String birth) {
        this.id = id;
        this.memberUuid =memberUuid;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.birth = birth;
    }

}
