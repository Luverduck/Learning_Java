package s07_01.L01_01;

/**
 * 클래스와 객체의 생성
 * 객체의 생성은 'new' 키워드와 클래스의 생성자 호출을 통해 이루어진다.
 * 클래스로부터 객체를 생성하는 과정을 클래스의 인스턴스화(instantiation)라고 하며
 * 클래스의 인스턴스화로 생성된 객체를 클래스의 인스턴스(instance)라 한다.
 */

public class Main {
    public static void main(String[] args) {
        // ✅ HYChicken 자료형의 객체 생성
        HYChicken hyChicken = new HYChicken();
        // 객체의 생성 과정은 다음과 같다.
        // 1. 클래스 로더가 클래스를 메모리에 로드한다.
        // 2. JVM이 힙 영역에 클래스의 필드에 해당하는 크기의 메모리를 할당한다.
        // 3. JVM이 생성자를 호출하여 할당한 메모리를 초기화한다.
        // 4. 힙 메모리에 할당된 메모리의 주소를 참조 변수에 저장한다.
    }
}