public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80,70,80,70,80};
        sayCongrats("joko",values);

        sayCongrats("lorem",90,90,90,60,80);
    }

    static void sayCongrats(String name,int... values){
        var total = 0;
        for (var value : values){
            total += value;
        }

        var finalValues = total / values.length;
        if (finalValues >= 75){
            System.out.println("selamat " + name + ", anda lulus");
        }else {
            System.out.println("maaf " + name + ", anda tidak lulus");
        }
    }
}
