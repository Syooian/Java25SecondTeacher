package lesson3;

public class Demo {
    
    public static void main(String[] args) {
        /*
        * 課堂練習
        * 請寫出一個MessagePrinter類別
        * 裡面的Method一率用printMessage命名
        * 輸入為 
        * 1. 一個String 
        * 2. 兩個double
        * 3. 兩個int 一個String
        * 最後通通印出來驗證
        */
        // MessagePrinter mp = new MessagePrinter();
        // mp.printMessage("print1");
        // mp.printMessage(11.1, 12.1);
        // mp.printMessage(1, 2, "print2");

        /*
         * 繼承
         */
        // 先呼叫父母類別查看
        Car car1 = new Car("car1:",100);
        car1.getMaxSpeed();
        car1.wiper();

        Sedan sedan1 = new Sedan("car2:",110);
        sedan1.getMaxSpeed(); 
        sedan1.back();
        sedan1.wiper();
        
        SedanV2 sedan2 = new SedanV2("car3:",110);
        sedan2.getMaxSpeed();
        sedan2.light();
        sedan2.wiper();

         /*
         * 覆寫範例()
         */
        SedanV3 sedanV3 = new SedanV3("car4", 110);
        sedanV3.getMaxSpeed();
        sedanV3.wiper();
        sedanV3.wiper("plus");

        /*
         * 課堂練習
         * 在SedanV3類別
         * 覆寫Car的getMaxSpeed()
         * 印出 "加價會有更大馬力的速度"
         */


        /*
        * 課間練習:
        * 三個類別: Person（人）→ Student（學生）→ CollegeStudent（大學生）
        * Person:
        *    private String name
        *    private int age
        *    public void introduce() {
        *        System.out.println("我是 xxx，今年 xxx 歲。");
        *    }
        * 
        * Student:
        *    private String school;
        * 
        *    @Override
        *    public void introduce() {
        *        System.out.println("我是學生 xxx，今年 xxx 歲，就讀於 xxx。");
        *    }
        * 
        * CollegeStudent:
        *    private String major;
        * 
        *    @Override
        *    public void introduce() {
        *        System.out.println("我是大學生 xxx，今年 xxx 歲，就讀於 xxx，主修 xxx。");
        *    }
        */   
    }
}

