package part1;

import part1.kr.tpc.BookDTO;

public class TPC13
{
    /*

    [ class, object, instance 상호관계 ]

객체를 부르는 용어들이 다를 수 있다.
(사실상 인스턴스를 만드는 과정)

- Class : 객체 설계 도구
- Object : 객체 변수들을 부르는 이름
- Instance : 객체가 생성된 다음, 객체가 구체적인 대상체를 가리키는 것
 ex) BookDTO b1;
     여기서 b1은 인스턴스

=> 인스턴스가 만들어져야 데이터를 넣고 뺄 수 있다.

class로 만든 새로운 자료형 = 바구니 = 이동
DTO : Data Transfer Object
VO : Value Object

     */

    public static void main(String[] args)
    {
        // 책 -> class(BookDTO) -> 객체 -> 인스턴스

        String title= "Spring";
        int price = 12000;
        String company = "comcom";
        int page= 890;
        // 이렇게만 선언한다면 Book이 아니다 => 담는 과정 필요

        BookDTO dto; // dto(=Object)
        dto = new BookDTO(title, price, company, page); // dto(=Instance)

        bookPrint(dto);
    }

    public static void bookPrint(BookDTO dto){
        System.out.println(dto.title);
        System.out.println(dto.price);
        System.out.println(dto.company);
        System.out.println(dto.page);
    }
}
