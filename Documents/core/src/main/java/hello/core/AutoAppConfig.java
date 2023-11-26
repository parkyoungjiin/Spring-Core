package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        //기존 AppConfig 파일과 같이 @Configuration을 반영하지 않기 위해 사용함. 등록되지 않도록 설정. (기존 코드 다 삭제하지 않기 위함.)
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
) //@Component가 붙은 클래스들을 스캔해서 스프링 빈으로 등록. (@Configuration도 같이 ! )
public class AutoAppConfig {
//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memberRepository(){
//        return new MemoryMemberRepository();
//    }
}
