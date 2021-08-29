package part1.kr.tpc;
//
public class BooKVO
{  // 책(Object) => 제목, 가격, 출판사, 페이지 수 ...
    public String title;
    public int price;
    public String company;
    public int page;
    // default constructor method (생략)

    public BooKVO() {
        // 초기화 작업
        this.title="java";
        this.price=14000;
        this.company="icom";
        this.page=789;
    }

    //중복정의 = Overloading
    public BooKVO(String a, int b, String c, int d){
        this.title=a;
        this.price=b;
        this.company=c;
        this.page=d;
   }
}
