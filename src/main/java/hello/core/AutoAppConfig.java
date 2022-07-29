package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type =
                FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
    //충돌 테스트 : 수동으로 설정한 빈과 자동으로 스캔한 빈의 이름이 같으면 충돌한다.
//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
}


