public class MethodParameter {
    public static void main(String[] args) {
        sayHello("lorem","ipsum");
        sayHello("joko","jono");
    }

    static void sayHello(String firstName,String lastName){
        System.out.println("hello " + firstName + " " + lastName);
    }
}
