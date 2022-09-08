public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("anda lulus cukup baik");
                break;
            case "D":
                System.out.println("anda tidak lulus");
                break;
            default:
                System.out.println("mungkin anda salah jurusan");
        }

        // switch lambda -> {} = simbol lambda

        switch (nilai){
            case "A"-> System.out.println("anda lulus dengan baik");
            case "B","C" -> System.out.println("anda lulus cukup baik");
            case "D" -> System.out.println("anda tidak lulus");
            default -> {
                System.out.println("mungkin anda salah jurusan");
            }
        }

        //yield manual
        String ucapan;
        switch (nilai){
            case "A"-> ucapan = "anda lulus dengan baik";
            case "B","C" -> ucapan = "anda lulus cukup baik";
            case "D" -> ucapan = "anda tidak lulus";
            default -> {
                ucapan = "mungkin anda salah jurusan";
            }
        }

        ucapan = switch (nilai){
            case "A" :
                yield "anda lulus dengan baik";
            case "B","C":
                yield "anda lulus cukup baik";
            case "D":
                yield "anda tidak lulus";
            default:
                yield "mungkin anda salah jurusan";
        };
        System.out.println(ucapan);
    }
}
