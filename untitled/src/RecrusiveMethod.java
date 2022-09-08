public class RecrusiveMethod {
    //method recrusive, memanggil method dirinya sendiri
    public static void main(String[] args) {
//        System.out.println(factorialLoop(5));
//        System.out.println(factorialRecrusive(15));
        loop(100);
    }

    static int factorialLoop(int value){
        var result = 1;
        for (var counter=1;counter <= value;counter++){
            result *= counter;
        }
        return result;
    }

    static int factorialRecrusive(int value){
        if (value == 1){
            return 1;
        }else {
            return value * factorialRecrusive(value - 1);
        }
    }

    static void loop(int value){
        if (value == 0){
            System.out.println("selesai");
        }else{
            System.out.println("loop - " + value);
            loop(value - 1);
        }
    }
}
