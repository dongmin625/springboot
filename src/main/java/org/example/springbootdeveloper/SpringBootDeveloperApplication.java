package org.example.springbootdeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//이 애너테이션을 추가하면 스프링 부트 사용에 필요한 기본 설정을 해줌
public class SpringBootDeveloperApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringBootDeveloperApplication.class,args);
        //애플리케이션 실행 메서드 : run(메인 클래스로 사용할 클래스,커맨드 라인의 인수들)

    }
}
