package MyTest;

public class Test2 extends Test1 {

    public Test2() {
        super(); // 呼叫父類別的建構子
        AAA = "ASD2"; // 重新賦值AAA
    }

    @Override
    public void Call() {
        System.out.println("AAA : " + AAA);
    }

}
