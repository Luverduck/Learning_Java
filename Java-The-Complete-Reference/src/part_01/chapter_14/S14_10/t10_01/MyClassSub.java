package part_01.chapter_14.S14_10.t10_01;

public class MyClassSub extends MyClassGeneric<String> {

    @Override
    String method(String param) {
        System.out.println("String param = " + param);
        return param;
    }

}
