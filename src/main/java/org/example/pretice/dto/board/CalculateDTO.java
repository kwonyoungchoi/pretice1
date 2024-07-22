package org.example.pretice.dto.board;

import lombok.*;

@Getter @Setter @ToString
@AllArgsConstructor @NoArgsConstructor
@Builder
public class CalculateDTO {
    private Integer number1;    //수1
    private Integer number2;    //수2
    private String operator;    //연산자
    private Integer result;     //결과
}
