package com.soon.oopexam.repository;

import com.soon.oopexam.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByLoginId(String id);

    boolean existsByLoginId(String id);
}
