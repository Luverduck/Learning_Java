package part_01.chapter_10.s10_04.t04_02;

import java.util.Scanner;

public class TryCatchFinally {

    // main 메소드
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("프로그램 시작");
        int input;
        while(true)
        {
            System.out.println("입력 (0을 입력하는 경우 종료) : ");
            input = sc.nextInt();
            if(input == 0) break;
            vMethod1();
        }
        System.out.println("프로그램 종료");
        sc.close();
    }

    // vMethod1 메소드
    static void vMethod1() {
        System.out.println("method1 호출");
        vMethod2();
        System.out.println("method1 종료");
    }

    // vMethod2 메소드
    static void vMethod2() {
        System.out.println("method2 호출");
        vMethod3();
        System.out.println("method2 종료");
    }

    // vMethod3 메소드
    static void vMethod3() {
        System.out.println("method3 호출");
        try {
            System.out.println("try 블록 실행");
            int x = 10;
            int y = 0;
            int ret = x / y;
        }
        catch(Exception e) {
            System.out.println("catch 블록 실행");
        }
        finally {
            System.out.println("finally 블록 실행");
        }
        System.out.println("method3 종료");
    }

}