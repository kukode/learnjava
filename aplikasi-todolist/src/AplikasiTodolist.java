import java.util.Scanner;

public class AplikasiTodolist {
    public static String[] model = new String[10];
    public static java.util.Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        viewShowTodoLisr();

    }



    /**
     * Menampilkan todo list
     */
    public static void showTodoList(){
        System.out.println("TODOLIST");
        for (var i=0;i < model.length;i++){
            var todo = model[i];
            var no = 1 + i;
            if (todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }

    /**
     * Membuat test utuk menampilkan list
     */
    public static void testShowTodoList(){
        model[0] = "joko";
        model[1] = "lorem";
        showTodoList();
    }

    /**
     * Menambahkan todo ke list
     */
    public static void addTodoList(String todo){
        //cek apakah model penuh
        var isFull = true;
        for (var i=0;i < model.length;i++){
            if (model[i] == null){
                isFull = false;
                break;
            }
        }

        //jika penuh, kita resize ukuran array 2x
        if (isFull){
            var temp = model;
            model = new String[model.length * 2];
            for (var i=0;i < temp.length;i++){
                model[i] = temp[i];
            }
        }

        //tambahkan ke posisi array yang null
        for (var i=0;i < model.length;i++){
            if (model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }
    public static void testAddTodoList(){
        for (var i=0;i < 25;i++){
            addTodoList("Contoh add todo ke. " + i);
        }
        showTodoList();
    }

    /**
     * Menghapus todo dari list
     */
    public static boolean deleteTodoList(Integer number){
        if ((number - 1) >= model.length){
            return false;
        }else if (model[number - 1] == null){
            return false;
        }else {
            for (var i = (number - 1);i < model.length;i++){
                if(i == (model.length - 1)){
                    model[i] = null;
                }else{
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");


        var result = deleteTodoList(30);
        System.out.println(result);

//        result = deleteTodoList(4);
//        System.out.println(result);

        result = deleteTodoList(2);
        System.out.println(result);

        showTodoList();
    }

    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput(){
        var nama = input("Nama");
        System.out.println("Hi " + nama);
    }

    /**
     * Menampilkan view todo list
     */
    public static void viewShowTodoLisr(){
        while (true){
            showTodoList();
            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");
            if (input.equals("1")){
                viewAddTodoList();
            }else if (input.equals("2")){
                viewDeleteTodoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak ditemukan");
            }
        }
    }

    public static void testViewShowTodoList(){
        addTodoList("1");
        addTodoList("2");
        addTodoList("3");
        addTodoList("4");
        addTodoList("5");

        viewShowTodoLisr();
    }

    /**
     *
     */
    public static void viewAddTodoList(){
        System.out.println("Menambah TODOLIST");
        var todo = input("Todo (x Jika Batal)");
        if (todo.equals("x")){

        }else {
            addTodoList(todo);
        }
    }

    public static void testViewAddTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        viewAddTodoList();
        showTodoList();
    }

    public static void viewDeleteTodoList(){
        System.out.println("MENGHAPUS TODOLIST");
        var number = input("Nomor yang dihapus (x Jika Batal)");
        if (number.equals("x")){
            //batal
        }else{
            boolean success = deleteTodoList(Integer.valueOf(number));
            if (!success){
                System.out.println("gagal menghapus data " + number);
            }
        }
    }

    public static void testViewDeleteTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        showTodoList();
        viewDeleteTodoList();
        showTodoList();
    }

}
