package com.soon.oopexam.service;

import com.soon.oopexam.domain.AuthResult;
import com.soon.oopexam.domain.Member;
import com.soon.oopexam.domain.PasswordDecoder;
import com.soon.oopexam.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final MemberRepository memberRepository;

    public AuthResult authenticate(String id, String pw) {
        Member mem = findOne(id);
        if (!isExistMember(id)) {
            return AuthResult.NO_MATCH;
        }
        if (!mem.isEmailVerified()) {
            return AuthResult.NO_EMAIL_VERIFIED;
        }
        if (mem.isPasswordValid(pw)) {
            return AuthResult.SUCCESS;
        }
        return AuthResult.NO_MATCH;
    }

    private Member findOne(String id) {
        return memberRepository.findByLoginId(id);
    }

    private boolean isExistMember(String id) {
        return memberRepository.existsByLoginId(id);
    }
}
