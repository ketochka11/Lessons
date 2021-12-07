public class PrivedenieTipov {
    public static void main(String[] args) {
        int x = 123;// 32 бита = 4 байта
        short z = 123; //16 бита = 2 байта
        byte v = 123; // от -128 до +127
        long b = 123; // 64 бита
        double n = 12.3; // 64 бита
        float m = 12.2f; // 32 бита

        float f = 123.2f;//возникает ошибка без f или F потому что
        //все числа дробные (вещественные) по умолчанию double
        float g = (float)125.4;

        long l =123123L;//по умолчанию любое число int, поэтому ставим L

        long x1 = x;//приведение из int в long НЕЯВНОЕ(мы его не видим)
        int a = (int)l;//ЯВНОЕ
        System.out.println(a);


        int q = 123;
        double w = q;
        System.out.println(w);

        double e = 123.5;
        int r = (int)e;//при преведении из  double в int просто отрезается число после .
        System.out.println("r = " + r);
         //если нам нужно округлить:

        long t = Math.round(e);
        System.out.println("t = " + t);

        byte y = (byte)128;//=>-128
        byte u = (byte)129;//=>-127


    }
}
