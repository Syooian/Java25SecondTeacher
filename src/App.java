
public class App {

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // int []A1={50,66,10,2,69};
        // 99乘法
        // for (int a = 2; a <= 9; a++) {
        //     for (int b = 1; b <= 9; b++) {
        //         System.out.print(a + "x" + b + "=" + a * b + "\t");
        //     }
        //     System.err.println("\r");
        // }
        //金字塔
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
            for (int b = 1; b <= 2*a+1; b++) {
                System.out.print("*");
            }

            //Dot += 2;

            System.out.println("\r");
        }
    }
}
