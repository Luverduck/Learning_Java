package s08_06.L06_01;

/**
 * final 키워드
 * 대상의 속성이 변하지 않음을 정의할 때 사용하는 제한자(Modifier)
 * final 키워드가 적용되는 대상에 따라 다음과 같이 동작한다.
 * ✅ 변수의 값 재할당 방지
 * - 메소드의 오버라이딩 방지
 * - 클래스의 상속 방지
 */

public class Main {
    public static void main(String[] args) {
        // final 키워드로 선언되지 않은 변수
        int a;
        a = 10;

        int b = 10;
        b = 20;

        // ✅ final 키워드로 선언된 변수
        // final 키워드로 선언된 변수 또는 필드는 초기화 이후 값을 재할당할 수 없다.
        final int c = 10;
        // c = 20; // Cannot assign a value to final variable 'c'
    }
}