package Part2.kr.tpc;

public class JavaOracle implements DbConnect {

    @Override
    public void getConnection(String url, String user, String password) {
        System.out.println("오라클 DB가 접속 됩니다.");
    }
}
