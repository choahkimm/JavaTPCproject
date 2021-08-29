package part1;

import part1.kr.tpc.BooKVO;

public class TPC12
{
    /*

생성자 메서드 : 객체 생성+초기화

1. 객체를 생성할 때 사용되는 메서드
2. 객체 생성 후 객체의 초기화 하는 역할 수행
3. 특징
  - 클래스 이름과 동일한 메서드
  - 메서드의 return type 이 없다 ( void 아님)
  - public 접근 권한을 가진다. (private도 있긴 함)
  - 생성자가 없을 때는 기본 생성자가 만들어 진다.
  - 중복정의 가능

     */
    public static void main(String[] args)
    {
        BooKVO b1= new BooKVO();
        b1.title="oracle";
        System.out.println(b1.title + "\t" + b1.price+ "\t"+ b1.company + "\t"+ b1.page);

        BooKVO b2= new BooKVO();
        System.out.println(b2.title + "\t" + b2.price+ "\t"+ b2.company + "\t"+ b2.page);

        BooKVO b3= new BooKVO("python", 18000, "daerim", 980);
        System.out.println(b3.title + "\t" + b3.price+ "\t"+ b3.company + "\t"+ b3.page);

    }
}
