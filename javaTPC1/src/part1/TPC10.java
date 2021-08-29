package part1;

import part1.kr.tpc.BookDTO;

public class TPC10 {
    public static void main(String[] args) {
        // 기본 자료형 VS 사용자정의 자료형
        // 객체 생성 과정 : 생성자 메서드(new)에 의해 객체로써 heap 메모리에 생성된다.

        // ex) BookDTO b = new BookDTO(); 가 있을 때
        // b, this도 이 객체를 가리킨다. (this 라는 이 클래스를 가리키는 객체가 만들어지는 것)
      int a;
      a=10;
      // 책(BookDTO) 라는 자료형을 써보자 -> class
        BookDTO b; // 객체
        b= new BookDTO(); // 객체 생성 -- 생성자 메서드가 객체 생성 작업

        // 값을 넣는 작업
        b.title = "자바의 정석";
        b.price = 27000;
        b.company = "a출판사";

        b.page = 1200;

        System.out.println(b.title);
        System.out.println(b.price);
        System.out.println(b.company);
        System.out.println(b.page);
    }
}
