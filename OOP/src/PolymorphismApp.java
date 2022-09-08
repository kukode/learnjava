public class PolymorphismApp {
    public static void main(String[] args) {
        /**
         * polymorphism perubahan dari satu bentuk ke bentuk lainnya dan polymorphism
         * erat juga dengan pewarisan
         */
        Employee employee = new Employee("joko");
        employee.sayHello("lorem");

        employee = new Manager("joko");
        employee.sayHello("lorem");

        employee = new VicePresident("joko");
        employee.sayHello("lorem");

        sayHello(new Employee("joko"));
        sayHello(new Manager("jono"));
        sayHello(new VicePresident("lucas"));
    }

    static void sayHello(Employee employee){
        System.out.println("Hello, " + employee.name);
    }
}
