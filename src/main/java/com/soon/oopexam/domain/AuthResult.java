package com.soon.oopexam.domain;

import lombok.Getter;

@Getter
public enum AuthResult {
    NO_MATCH("No match"), NO_EMAIL_VERIFIED("No email"), SUCCESS("Success");

    private String msg;

    AuthResult (String msg) {
        this.msg = msg;
    }
}
