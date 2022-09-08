public class MethodReturnValue {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = sum(a,b);
        System.out.println(c);
        System.out.println(sum(50,100));
        System.out.println(hitung(1,"-",5));
        System.out.println(hitung(10,"salah",5));
    }
    static int sum(int value1,int value2){
        var value = value1 + value2;
        return value;
    }

    static int hitung(int value1, String operasi,int value2){
        switch (operasi){
            case "+" :
                return value1 + value2;
            case "-" :
                return value1 - value2;
            default:
                return 0;

        }
    }
}
