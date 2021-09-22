package part1;

import part1.kr.tpc.Inflearn;

import java.sql.SQLOutput;

public class TPC31
{
    /*

[private 생성자 메서드(Constructor)]

- 객체 생성에 관여하는 생성자 메서드가 private 접근제어를 가지면 객체를 생성할 수 없다는 뜻
- 그러므로 객체를 생성하지 않고도 사용가능 해야 된다. (모든 클래스의 멤버가 static 멤버가 되어야 한다)

1. non- static 멤버인 경우 (인스턴스 메서드)
객체생성 후 접근 가능

Inflearn inf = new Inflearn();

2. static 멤버인 경우 (클래스 메서드)
객체 생성 없이 접근 가능 (클래스 이름으로 접근)

Inflearn.java();

  */
    public static void main(String[] args)
    {
//어떤 객체에 생성자 메서드가 private이면   -- new (X)
//모든 멤버는 static 붙은 멤버가 되어야 한다 !

//static 키워드가 붙어있는 애들은 메모리에(static zone) 로딩이 자동으로 올라가기 때문에
//자주 사용하는 개체나 동작은 static 멤버로 만든다 .
        //Inflearn inf = new Inflearn();
        //inf.tpc();
        //inf.java();

        Inflearn.tpc();
        Inflearn.java();

        // Java API 생성자 private
        System.out.println("print");
        // Math m = new Math();
        int v = Math.max(10,20);
        System.out.println(v);
        
    }
}
