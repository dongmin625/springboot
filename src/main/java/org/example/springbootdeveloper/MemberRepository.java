package org.example.springbootdeveloper;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member , Long> {
    //인터페이스 - 인터페이스 상속

}
