package inhatc.cse.yeonheeshop.item.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {

    @Id // primary key 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동증가

    private Long id;

    @Column(length = 15, nullable = false) // 길이랑 NotNull 설정하기
    private String itemNm;

    private int price;

    @Column(name = "stock")
    private int stockNumber;

    @Lob
    @Column(nullable = false)
    private String itemDetail;



}
