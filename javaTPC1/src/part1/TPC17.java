package part1;

import part1.kr.tpc.MovieVO;

public class TPC17 {
    // 배열 vs 클래스 관계
    // 데이터를 담는 방법
    //   배열 : 동일한 데이터 구조
    //   클래스 : 서로 다른 데이터 구조
    public static void main(String[] args) {
        int[] a= new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;

        int[] b = {10,20,30,40,50};

        int[] c =  new int[] {10,20,30,40,50};
        for(int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }
        System.out.println("=========================");

        // 서로 이질적인 데이터는 클래스에 객체 정의해서 사용하기
        // 영화(제목, 가격, 주인공, 등급, 시간)
        MovieVO mv = new MovieVO("겨울왕국", 12000, "크리스틴벨", 12, 2.1f);
        System.out.println(mv.toString());
        System.out.println("=========================");

        // 영화 3편을 저장 -> 객체 배열
        MovieVO[] marr = new MovieVO[3];
        marr[0] = new MovieVO("겨울왕국1", 12000, "크리스틴벨", 12, 2.1f);
        marr[1] = new MovieVO("겨울왕국2", 13000, "크리스틴벨", 12, 1.9f);
        marr[2] = new MovieVO("겨울왕국3", 14000, "크리스틴벨", 14, 2.0f);

        for(MovieVO m:marr){
            System.out.println(m);
        }
    }
}
