package s02_06;

/**
 * 식별자 (Identifier)
 * 변수, 함수, 클래스 등의 프로그래밍 언어의 구성 요소의 이름
 */

public class L06_01 {
    public static void main(String[] args) {
        // 식별자의 명명 규칙 (rule)
        // 1. 식별자는 문자, 언더스코어 _, 달러 표시 $로 시작해야 한다.
        // ⭕ 가능
        int number;
        int _number;
        int $number;
        // ❌ 불가능
        //int 1number;
        //int #number;

        // 2. 식별자에 문자, 숫자, 언더스코어 _, 달러 표시 $만 포함할 수 있다.
        // ⭕ 가능
        char word;
        char word1;
        char word_;
        char word$;
        // 🔺 가능하지만 권장하지 않음
        char 단어;
        // ❌ 불가능
        //char word#; // 그 외 특수문자
        //char word ; // 공백
    }
}
