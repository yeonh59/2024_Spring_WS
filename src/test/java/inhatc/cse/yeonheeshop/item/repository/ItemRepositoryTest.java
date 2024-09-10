package inhatc.cse.yeonheeshop.item.repository;

import inhatc.cse.yeonheeshop.item.entity.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest //1
class ItemRepositoryTest {

    @Autowired //2
    ItemRepository itemRepository; //3
    @Test
    void findByItemNm() {
    }

    @Test
    void findByItemNmLike() {
        List<Item> itemList = itemRepository.findByItemNmLike("%1%"); //% 안 넣으면 Like 못 찾음
        itemList.forEach(System.out::println);
    }

    @Test
    public void findByPriceLessThanOrderByPriceDescTest(){
        List<Item> itemList = itemRepository.findByPriceLessThanOrderByPriceDesc(30000);
        itemList.forEach(System.out::println);
    }
}