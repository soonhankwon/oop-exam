package com.soon.oopexam.domain;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String loginId;

    private String pw;

    private String token;

    private int verificationEmailStatus;

    public boolean isEmailVerified() {
        return this.verificationEmailStatus == 2;
    }

    public boolean isPasswordValid(String pw) {
        PasswordDecoder passwordDecoder = new PasswordDecoder();
        return passwordDecoder.decode(this.pw).equals(pw);
    }

    public void verifyEmail() {
        if (isEmailVerified()) {
            throw new IllegalArgumentException();
        } else {
            this.verificationEmailStatus = 2;
        }
    }
}
