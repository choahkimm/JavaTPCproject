package kr2.inflearn;

public class ObjectArray {
    // int --> Object
    // 핵심 : Object 배열이니까 모든 객체를 넣을 수 있는!

    private int count;
    private Object[] arr;

    // 배열 생성 동작
    public ObjectArray() {
        this(10);
    }

    // 추가 동작
    public ObjectArray(int init) {
        arr = new Object[init];
    }

    // 얻는 동작
    public void add(Object data){
        arr[count++]=data;
    }

    // 배열 크기
    public Object get(int index){
        return arr[index];
    }

    public int size(){
        return count;
    }
}
