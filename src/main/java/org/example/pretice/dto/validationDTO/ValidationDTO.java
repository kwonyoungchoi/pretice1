package org.example.pretice.dto.validationDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter @Setter @ToString
@AllArgsConstructor @NoArgsConstructor
@Builder
public class ValidationDTO {
    @NotBlank(message = "이름은 필수 입력 항목입니다.")
    private String uname; //이름

    @NotBlank(message = "아이디는 필수 입력 항목입니다.")
    private String userid;

    @Size(min = 8, message = "비밀번호는 최소 8자 이상이어야 합니다.")
    private String userpw;

    @Pattern(regexp = "^\\d{10,11}$", message = "전화번호는 10자 또는 11자의 숫자로 입력해주세요.")
    private String tel;

    @NotBlank(message = "주소는 필수 입력 항목입니다.")
    private String address;
}
