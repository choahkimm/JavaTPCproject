package part1;

import part1.kr.tpc.MemberVO;

// 잘 설계된 클래스

// 정보 은닉 : 다른 객체로부터 접근을 막는 것 (private)
// VO, DTO 설계할 때 setter, getter 메서드를 이용해서 설계
public class TPC15
{
    public static void main(String[] args)
    {
        MemberVO m = new MemberVO();
        //m.name= "홍길동"; //private이라 접근 불가 (정보 은닉)

        m.setName("김지하");
        m.setAge(50);
        m.setTel("000-0000-0000");
        m.setAddr("서울");

        System.out.println(m.getName());
    }

}

