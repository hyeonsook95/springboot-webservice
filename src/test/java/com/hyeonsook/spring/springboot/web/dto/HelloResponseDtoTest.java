package com.hyeonsook.spring.springboot.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬북_기능_테스트() {
        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // then
        assertThat(dto.getName()).isEqualTo(name);
        // assertj라는 테스트 검증 라이즈러리의 검증 메소드.
        //                          assertj의 동등 비교 메소드.
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
