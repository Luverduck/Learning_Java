package part_01.chapter_13.s13_06.t06_03;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreamClose {
    public static void main(String[] args) {

        // 입력으로 읽기 할 파일의 경로
        String filePathRead = "Java-The-Complete-Reference\\src\\part_01\\chapter_13\\s13_06\\input.txt";
        // 출력으로 쓰기 할 파일의 경로
        String filePathWrite = "Java-The-Complete-Reference\\src\\part_01\\chapter_13\\s13_06\\output.txt";

        // 문자 입력 스트림 초기화
        FileReader fr = null;
        // 문자 출력 스트림 초기화
        FileWriter fw = null;

        try {
            // 문자 입력 스트림 초기화
            fr = new FileReader(filePathRead);
            // 문자 출력 스트림 초기화
            fw = new FileWriter(filePathWrite);

            // 문자 입력 스트림의 입력 버퍼에 저장된 데이터를 문자 단위로 읽기
            int readByte;
            while( (readByte = fr.read()) != -1 ) {
                // 읽은 데이터를 문자 출력 스트림의 출력 버퍼에 쓰기
                fw.write(readByte);
                // 출력 버퍼 비우기
                fw.flush();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                // 바이트 입력 스트림 닫기
                fr.close();
                // 바이트 출력 스트림 닫기
                fw.close();
            }
            catch(Exception eClose) {
                // close() 메소드에서 발생하는 예외에 대한 처리
                eClose.printStackTrace();
            }
        }

    }
}