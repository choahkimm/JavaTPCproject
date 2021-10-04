package Part2.kr;

public class Dog  extends Animal{
    public void eat() {
        System.out.println("개가 먹는다");
    }

    public Dog(){ // 생성자
        super(); // super : new Animal(); 역할과 비슷.  부모에 있는 생성자 호출 역할 하니까 Animal 부터 실행
    }
}
