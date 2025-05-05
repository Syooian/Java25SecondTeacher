package MyTest;

public class MessagePrinter {

    public void PrintMessage() {
        System.out.println("PrintMessage");
    }

    public void PrintMessage(String Msg) {
        System.out.println("PrintMessage Msg : " + Msg);
    }

    public void PrintMessage(Double D1, Double D2) {
        System.out.println("PrintMessage D1 : " + D1 + " D2 : " + D2);
    }

    public void PrintMessage(int I1, int I2, String Msg) {
        System.out.println("PrintMessage I1 : " + I1 + " I2 : " + I2 + " Msg : " + Msg);
    }
}
