public class ForLoop {
    public static void main(String[] args) {

        //init statement;kondisi;post statement adalah opsional
//        for (;;){
//            System.out.println("Perulangan tanpa henti");
//        }
        //perulangan dengan kondisi
//        for (;counter <= 10;){
//            System.out.println("perulangan ke " + counter);
//            counter++;
//        }
        //perulangan dengan init statement
//        for (var counter = 1; counter <= 10;){
//            System.out.println("perulangan ke " + counter);
//            counter++;
//        }
        //perulangan dengan post statement(post statement selalu dieksekusi terakhir)
        for (var counter = 1;counter <= 10;counter++){
            System.out.println("perulangan ke " + counter);
        }
    }
}
