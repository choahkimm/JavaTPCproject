package Part2;

import Part2.poly.RemoCon;
import Part2.poly.TV;

public class TPC27 {
    public static void main(String[] args) {
        // 추상 클래스와 인터페이스 (다형성을 보장하기 위함 - 재정의 반드시)

        // 추상 클래스 : 서로 기능이 비슷한 클래스의 공통부분을 묶을 때, 구현 메서드와 추상 메서드를 함께 가질 수 있다.
        // 인터페이스 : 서로 기능이 다른 클래스의 공통부분을 묶을 때, 100% 추상 메서드로 이루어진다. *다중상속!!

        RemoCon r = new TV();
        for(int i=0; i<40; i++){
            r.chUp();
        }
        r.chDown();
        r.internet();
    }
}
