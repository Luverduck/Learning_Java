package s03_04;

/**
 * 배열의 초기화
 * 배열은 초기화 과정을 통해 배열 요소에 해당하는 메모리를 할당받는다.
 * 배열은 다음의 2가지 방식으로 초기화될 수 있다.
 * 1) new 키워드를 이용한 초기화
 * 2) 배열 리터럴을 이용한 초기화
 */

public class L04_03 {
    public static void main(String[] args) {
        // 배열 리터럴을 이용한 초기화
        // 배열 리터럴(Array Literal)은 중괄호 '{}'안에 여러 리터럴을 콤마 ','로 구분한 표현식을 의미한다.
        // 배열 리터럴을 통해 배열 변수를 초기화할 수 있다.
        long[]      arrLong     = { 1L, 2L, 3L };

        // 배열 리터럴로 배열 변수를 초기화하는 과정은 다음과 같다.
        // 1. 배열 요소가 될 자료형 크기의 메모리를 배열 리터럴 안의 리터럴 수만큼 동적으로 할당한다.
        // 2. 동적으로 할당된 메모리를 앞에서부터 순서대로 배열 리터럴 안의 리터럴로 초기화한다.
        // 3. 초기화가 끝나면 해당 메모리의 시작 주소를 배열 변수에 저장한다.
    }
}
