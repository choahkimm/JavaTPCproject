package Part2;

import part1.kr.tpc.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class TPC38 {
    public static void main(String[] args) {
        // 크기에 상관없이 객체를 저장 : ArrayList
        // 우리가 만든 ObjectArray api는 길이 제한이 있었다!

        List<BookDTO> list = new ArrayList<BookDTO>(1);  // Object[] --> BookDTO[] // 제네릭
        list.add(new BookDTO("자바", 12000, "이지스", 600));
        list.add(new BookDTO("C언어", 16000, "제이수스", 400));
        list.add(new BookDTO("파이썬", 17000, "에이콘", 800));

        for(int i=0; i<list.size();i++){
            // Object o = list.get(i);
            BookDTO vo = (BookDTO) list.get(i);
            System.out.println(vo.title + vo.price + vo.company + vo.page);
        }
    }
}
