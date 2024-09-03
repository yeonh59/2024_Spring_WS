package inhatc.cse.yeonheeshop.hello.dto;

public class Main {
    public static void main(String[] args) {
        HelloDto helloDto = new HelloDto();
        helloDto.setName("홍길동");
        helloDto.getName();
        System.out.println(helloDto);

    }
}
