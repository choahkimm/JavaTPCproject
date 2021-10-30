package Part2;

import Part2.kr.inflearn.MyClass;

public class TPC33 {
    public static void main(String[] args) {
        // package (패키지)
        // 1. 기능이 비슷한 클래스를 모아서 관리하기 쉽게 하기 위함. 꾸러미
        // 2. package 외부에서 접근하는 것을 막을 때 사용
        // (패키지 내부에 있는 클래스의 접근권한이 생략되면 -> default 접근권한을 가짐)


        // 접근 방법
        // class full name, 접근 권한을 알아야 한다.

        // MyClass에 접근하기
        kr2.inflearn.MyClass my = new kr2.inflearn.MyClass();
        int v = my.sum(10, 100);
        System.out.println(v);

        // 아니면 import 해주기
    }
}