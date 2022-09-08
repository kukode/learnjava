public class PersonApp {
    public static void main(String[] args) {
        /**
         * cara membuat objek
         */
//        var person1 = new Person("lorem","jakarta");
//        person1.name = "lorem";
//        person1.address = "jl.lorem";
//        person1.country = "Tidak bisa di ubah karena final";
//        System.out.println(person1.name);
//        System.out.println(person1.address);
//        System.out.println(person1.country);
//
//
//        Person person2 = new Person("ipsum","bogor");
//        Person person3;
//        person3 = new Person("sumo","jambi");
//        person3.sayHello("sumo");
        var person1 = new Person("joko","jawa");
        var person2 = new Person("lorem");
        var person3 = new Person();
        person3.name = "ali";

        System.out.println(person1.name + " " + person1.address);
        System.out.println(person2.name);
        System.out.println(person3.name);
    }
}
