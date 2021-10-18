package Part2;

import Part2.kr.poly.A;

public class TPC28 {
    public static void main(String[] args) {
        // Object is God!
        // 모든 클래스의 root 클래스 = 상속 관계에서 최상위 클래스
        // Object 클래스를 잘 활용하면 프로그램을 유연하게 만들 수 있다 => ex) toString()

        // public class A extends Object --생략된 개념!

        A a = new A();
        a.display();
        System.out.println(a);

        Object o = new A(); // upcasting -- Object를 부모역할로 사용할 수 있다는 것
        ((A)o).display();
        System.out.println(o.toString());
    }
}
