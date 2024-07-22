package org.example.pretice.dto.member;

import lombok.*;

@Getter @Setter @ToString
@AllArgsConstructor @NoArgsConstructor
@Builder
public class MemberDTO {

    private String uname;
    private String userid;
    private String userpw;
    private String tel;
    private String address;

}
