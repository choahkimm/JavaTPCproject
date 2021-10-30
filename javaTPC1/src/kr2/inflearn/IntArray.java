package kr2.inflearn;

public class IntArray {
    private int count;
    private int[] arr;

    // 배열 생성 동작
    public IntArray() {
        this(10);
    }

    // 추가 동작
    public IntArray(int init) {
        arr = new int[init];
    }

    // 얻는 동작
    public void add(int data){
        arr[count++]=data;
    }

    // 배열 크기
    public int get(int index){
        return arr[index];
    }

    public int size(){
        return count;
    }
}
