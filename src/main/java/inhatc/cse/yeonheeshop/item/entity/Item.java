package inhatc.cse.yeonheeshop.item.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {

    @Id //기본키 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement, 자동증가
    @Column(name="item_id")
    private long id;
    @Column(nullable = false, length = 50)
    private String itemNm;

    private int price;

    @Column(name = "stock")
    private int stockNumber;

    @Lob
    @Column(nullable = false)
    private String itemDetail;



}
