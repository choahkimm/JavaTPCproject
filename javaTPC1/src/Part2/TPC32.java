package Part2;

import Part2.kr.tpc.DbConnect;
import Part2.kr.tpc.JavaMySQL;
import Part2.kr.tpc.JavaOracle;

public class TPC32 {
    public static void main(String[] args) {
        // 인터페이스 : 추상 클래스를 구현시키는 자식 클래스가 있어야 인터페이스 동작 가능

        // Oracle, MySql... => Driver class 필요

        DbConnect conn = new JavaOracle();
        conn.getConnection("url", "bit", "12345");

        conn = new JavaMySQL();
        conn.getConnection("url","root","ABCDE");
    }
}
