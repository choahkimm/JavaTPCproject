package part1;

import com.google.gson.Gson;
import part1.kr.MyUtil;
import part1.kr.tpc.BooKVO;

public class TPC18 {
    public static void main(String[] args) {

        // 1. java에서 제공해주는 class들.. = API
        // 문자열 (String)
        String str = new String("APPLE");
        System.out.println(str.toLowerCase()); // apple

        // 2. 직접 만들어서 사용하는 class (DTO, DAO, Utility.. 이런 API)
        MyUtil my = new MyUtil();
        int sum= my.hap();
        System.out.println(sum);

        // 3. 다른 회사에서 만들어 놓은 class들
        // Gson => Json 데이터 포맷 만들 때   / mvnrepository.com 가서 Gson jar 파일 다운
        Gson g = new Gson();
        BooKVO vo = new BooKVO("자바", 13000, "영진", 300);
        String json = g.toJson(vo);
        System.out.println(json);
    }
}
