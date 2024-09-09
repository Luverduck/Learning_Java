package s01.sub05;

/**
 * 예외 (Exception)
 * 런 타임 에러 중 적절한 조치를 통해 프로그램의 실행 종료를 방지할 수 있는 에러
 * 발생한 예외에 대하여 조치하는 것을 예외 처리(Exception Handling)이라 한다.
 */

public class ErrorHandling1 {
    public static void main(String[] args) {

        System.out.println("프로그램 시작");

        // 길이가 10인 배열 선언
        int arr[] = new int[10];
        // 배열의 10번째 요소 접근
        arr[10] = 100; // 💥 런타임 에러

        System.out.println("프로그램 종료");

    }
}
