package part1;

import part1.kr.tpc.BooKVO;

public class TPC11
{
    public static void main(String[] args)
    {
        // 책 1권을 저장하기 위해 객채를 생성 하시오

        BooKVO b = new BooKVO();
        b.title="bookname";
        b.price=15000;
        b.company="gm";
        b.page=700;

        System.out.println(b.title + "\t" + b.price+ "\t"+ b.company + "\t"+ b.page);
    }
}
