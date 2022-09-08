public class Continue {
    public static void main(String[] args) {
        for (var counter=1;counter<=100;counter++){
            //angka ganjil
//            if (counter % 2 == 0){
//                continue;
//            }
            //angka genap
            if (counter%2==1){
                continue;
            }
            System.out.println("perulangan ganjil " + counter);
        }
    }
}
