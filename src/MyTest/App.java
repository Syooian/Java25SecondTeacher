package MyTest;

public class App {

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // int []A1={50,66,10,2,69};
        //========================================99乘法
        // for (int a = 2; a <= 9; a++) {
        //     for (int b = 1; b <= 9; b++) {
        //         System.out.print(a + "x" + b + "=" + a * b + "\t");
        //     }
        //     System.err.println("\r");
        // }
        //
        //========================================金字塔
        /*
         *     *
         *    ***
         *   *****
         * 
         */
        //int Space = 0;
        //int Dot = 1;
        int Limit = 4;
        for (int a = 0; a < Limit; a++) {
            //Space = Limit - a - 1;

            //印出空白
            for (int b = 0; b < Limit - a - 1; b++) {
                System.out.print(" ");
            }
            //印出*
            for (int b = 1; b <= 2 * a + 1; b++) {
                System.out.print("*");
            }

            //Dot += 2;
            System.out.println("\r");
        }
        //
        //========================================
        /*從1~100中
         * 15的倍數輸出"FizzBuzz"
         * 5的倍數輸出"Buzz"
         * 3的倍數輸出"Fizz"
         * 其他數字輸出該數字
         */
        for (int a = 1; a <= 100; a++) {
            if (a % 15 == 0) {
                System.out.print("FizzBuzz");
            } else if (a % 5 == 0) {
                System.out.print("Buzz");
            } else if (a % 3 == 0) {
                System.out.print("Fizz");
            } else {
                System.out.print(a);
            }

            System.out.print("\t");
        }

        //========================================找出最大數
        int[] Ary = {10, 55, 69, 10, 47, 56, 88, 64, 15};
        int Max = 0;
        for (int a = 0; a < Ary.length; a++) {
            if (Ary[a] > Max) {
                Max = Ary[a];
            }
        }
        System.out.println("Max : " + Max);

        //========================================
        for (int a = 0; a < 10; a++) {
            var C = new Cloth();
            C.Color = "Color" + a;
            C.Logo = "Logo" + a;
            C.Size = "Size" + a;

            System.out.println(a + " Color : " + C.Color + ", Logo : " + C.Logo + ", Size : " + C.Size);
        }

        System.out.println("==========================");
    }
}
