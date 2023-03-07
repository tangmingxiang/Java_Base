public class HelloWorld {
    public static void main(String[] args) {
        int a = 2;
        System.out.println(a);
        int String = 22;
        char b = '2';
        long c = 44444422222224L;
        float f = 293.0f;
        double db = 3242252;
        char ch = '2';
        int fl = 0;
        int[] ii = new int[2];
        System.out.println(ii[1]);
        int[][] i2 = new int[3][4];
        int[][] test1 = new int[2][5];
        System.out.println(test1[1][4]);

        System.out.println(i2[2].length); // 4
        i2[2] = new int[9];
        for (int i = 0; i < i2.length; i++) {
            System.out.println(i2[i].length); // 4 4 9
        }
        switch (ch) {
            case '3':
                System.out.println("2d");
            default:
                System.out.println('d');
        }
        System.out.println((char) 2000);
        System.out.println(ch + 1);
        a = (int) Math.pow(2, 31);
        System.out.println(-8 << 2);
        System.out.println(-8 >> 2);
        System.out.println(011);
        System.out.println(1 == 2 != false);
        System.out.println(10 == 10.0);
        System.out.println(a);
        System.out.println(0.3 % 0.2);
        System.out.println("Hello World！");
        System.out.println(5 + 6);
        System.out.println(5 / 6.0);
        System.out.println(Math.pow(2, 4));
    }
}