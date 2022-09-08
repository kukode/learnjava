public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("joko");
        manager.sayHello("lorem");

        var vp = new VicePresident("ipsum");
        vp.sayHello("rello");

        System.out.println(manager);
        System.out.println(vp);
    }
}
