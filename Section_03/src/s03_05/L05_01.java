package s03_05;

/**
 * 다차원 배열 (Multidimensional Array)
 * 다차원 배열도 특정한 자료형의 메모리가 연속적으로 나열된 형태의 자료 구조이다.
 * 다차원 배열의 요소에 저장되는 값의 자료형은 다른 배열의 주소, 즉, 참조형이다.
 * 즉, 다차원 배열은 다른 배열의 주소를 저장하는 1차원 배열이다.
 */

public class L05_01 {
    public static void main(String[] args) {
        // 2차원 배열의 선언
        // 배열의 요소가 될 1차원 배열의 자료형 사이에 `[]`를 붙인 `자료형[][]` 형태로 선언된다.
        // 해당 자료형은 메모리 주소를 저장하는 참조형(Reference type)이다.
        // 배열 변수의 메모리는 스택(Stack) 영역에 할당된다.
        byte[][] arr2dByte;
    }
}
