package inhatc.cse.yeonheeshop.item.repository;

import inhatc.cse.yeonheeshop.item.entity.Item;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest //유닛테스트!?
class ItemRepositoryTest2 {
   @Autowired
    ItemRepository itemRepository;//필드를 갖다 붙임
    @Test
    @DisplayName("상품 저장 테스트")
    public void insertItemTest(){
        Item item = Item.builder()
                .itemNm("추가 상품")
                .itemDetail("추가 상품 상세 설명")
                .price(20000)
                .stockNumber(200) //DB는 stock 이라고 되어있는데 여기서는 그냥 이~렇~게~!
                .build();
        
        Item savedItem = itemRepository.save(item);
        assertEquals(savedItem.getId(), 3);
        //System.out.println(savedItem);
    }

    @Test
    public void findByItemNmTest(){
        List<Item> itemNmList = itemRepository.findByItemNm("추가 상품");
//        for (Item item : itemNm) { //iter
//            System.out.println(item);
        itemNmList.forEach(item -> System.out.println(item));

        itemNmList.forEach(System.out::println);
        }
    }
