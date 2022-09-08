class Person {
    /**
     * membuat field
     */
    String name;
    String address;
    final String country = "indonesia";

    /**
     * Contsructor Overloding
     * @param name
     * @param address
     */
    Person(String name, String address){
        /**
         * penggunaan keyword this untuk mengakses objek saat ini dan
         * juga untuk mengatasi masalah variable shadowing
         */
        this.name = name;
        this.address = address;
    }

    Person(String paramName){
        //name = paramName;
        /**
         * cara memanggil konstruktor lain
         * menggnakan this
         */
        this(paramName,null);
    }

    Person(){

    }


    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My name is " + this.name);
    }
}
