public class MethodOverloading {
    //method overloading, membuat method dengan nama yang sama lebih dari sekali
    public static void main(String[] args) {
        sayHello();
        sayHello("joko");
        sayHello("lorem","ipsum");
    }

    static void sayHello(){
        System.out.println("hello");
    }
    static void sayHello(String name){
        System.out.println("hello " + name);
    }
    static void sayHello(String firstname,String lastName){
        System.out.println("hello " + firstname + " " + lastName);
    }
}
