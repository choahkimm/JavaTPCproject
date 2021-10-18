package Part2.kr.poly;

public class A extends Object{
    // extends Object 와 아래 생성자는 원래 생략된 부분
    public A() {
        super();
    }

    public void display(){
        System.out.println("나는 A이다.");
    }

    //toSting 재정의 가능
    @Override
    public String toString() {
        return "재정의 메서드 입니다.";
    }
}
