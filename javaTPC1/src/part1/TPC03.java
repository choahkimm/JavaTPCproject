package part1;

import part1.kr.bit.Book;
import part1.kr.bit.PersonVO;

public class TPC03
{
    public static void main(String[] args)
    {
        // 관계를 이해하라. 기본자료형 PDT vs 사용자 정의 자료형 UDDT
        // 정수 1개를 저장하기 위한 변수를 선언하시오
        int a;  // a는 10이 객체가 아니기 때문에 변수
        a=10;

        // 책 1권을 저장하기 위한 변수를 선언하시오
        Book b;
        b = new Book();  // () : 생성자 함수  // b 는 객체다

        // 데이터의 실체 : 인스턴스

        b.title = "자바";
        b.price = 15000;
        b.company = "한빛미디어";
        b.page = 700;

        System.out.println(b.title);
        System.out.println(b.price);
        System.out.println(b.company);
        System.out.println(b.page);

        PersonVO p;
        p = new PersonVO();   // ㅁㅁㅁㅁ 이렇게 구조가 생성되겠지
        p.name = "김자바";
        p.age = 40;
        p.weight = 64.8f;
        p.height = 175.5f;

        System.out.println(p.name +"\t" + p.age +"\t" + p.weight +"\t" + p.height);
    }
}
