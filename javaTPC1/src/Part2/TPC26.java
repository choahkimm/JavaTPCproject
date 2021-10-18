package Part2;

import Part2.kr.poly.Radio;
import Part2.kr.poly.RemoCon;
import Part2.kr.poly.TV;

public class TPC26 {
    public static void main(String[] args) {
        // 인터페이스의 활용 (100% 다형성 보장)

        // 서로 기능이 다른 클래스 - 인터페이스
        // 인터페이스는 100퍼센트 불완전한 메서드로 이루어져야 함

        RemoCon r = new TV();
        r.chDown();
        r.chUp();
        r.internet();

        r = new Radio();
        r.chUp();
        r.chDown();
        r.internet();
    }
}
