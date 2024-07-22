package org.example.pretice.dto.board;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class BoardDTO {

    private String subject; //제목
    private String comment; //내용
    private String user;    //작성자

    
}
