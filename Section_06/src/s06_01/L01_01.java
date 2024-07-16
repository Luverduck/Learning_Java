package s06_01;

/**
 * 메소드 (Method)
 * 클래스 내부에 정의된 함수로서, 특정 작업을 수행하는 코드 블록
 * 반복적인 작업을 메소드로 정의한 후 이를 반복 호출함으로써 코드의 재사용성을 높인다.
 * - C/C++의 함수와 달리, Java의 메소드는 클래스 또는 객체에 귀속되어 있다. (독립적으로 존재 X)
 */

public class L01_01 {
    // ✅ 메소드의 정의
    // - 메소드의 선언부 (Method Declaration) : 메소드의 기본적인 정보를 정의한다. (반환형, 메소드명, 매개변수 리스트)
    static int func(int x, int y)
    // - 메소드의 구현부 (Method Implementation) : 메소드가 처리할 구체적인 작업을 정의한다.
    {
        return x + y;
    }
    // ⭐ C/C++과 달리 Java에서 메소드는 전방 선언할 필요가 없다.
    // JVM의 클래스 로더가 클래스 파일을 메모리에 로드할 때 클래스에 포함된 모든 메소드에 대한 정보를 메모리에 올려놓는다.
    // 프로그램 실행 중 해당 메소드가 호출되면 JVM은 메모리에 로드된 메소드 정보를 사용해 메소드를 실행한다.

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // ✅ 메소드의 호출
        // - 메소드는 식별자와 메소드 호출 연산자 ()를 통해 호출할 수 있다.
        int ret = func(a, b); // () 안의 값을 인수(Argument)라 한다.
    }
}