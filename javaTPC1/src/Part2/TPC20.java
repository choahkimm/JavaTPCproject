package Part2;


import Part2.kr.Animal;
import Part2.kr.Cat;
import Part2.kr.Dog;

public class TPC20 {
    public static void main(String[] args) {
        // Override (재정의) : 동적 바인딩(호출될 메서드가 '실행'시점에서 결정되는 바인딩)
        //   -> 프로그램 속도 저하의 원인이 되지만 이점이 더 크기 때문에 사용
        // 오버라이드를 통해 하위 클래스에 접근할 수 있다!

        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();
        c.night();

        Animal ani = new Dog(); //-> 자동 형변환 (Upcasting)
        // animal 타입만 있으면 dog 사용 가능
        ani.eat(); // ?-> 강아지가 먹다

        ((Cat)ani).night(); // 밤에 야옹하고 운다  ---> 강제 형변환 (다운 캐스팅)
    }
}
