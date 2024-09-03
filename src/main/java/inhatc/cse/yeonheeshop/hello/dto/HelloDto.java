package inhatc.cse.yeonheeshop.hello.dto;

import lombok.*;

@Setter //ART+INT 해서 게터세터 안만들어도됨, 롬복! 어노테이션으로
@Getter
@ToString
//@Data //이게 더 개이득, 인자가 없는 기본생성자를 만듦, 오류뜰때 있어서 위에거쓰는게 일반적
@NoArgsConstructor
@AllArgsConstructor
@Builder //순서?
public class HelloDto {
    private String name;
    private int grade;
    private String dept;



}
