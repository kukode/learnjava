class VicePresident extends Manager{
    /**
     * untuk menggunakan atau memanggil constructor dari class parent
     * dapat menggunakan kta kunci super, apabila constructor pada
     * class parent memiliki parameter maka wajib constuctor tersebut di panggil
     * pada clss childnya, bila constructor pada class parent adalah constuctor default
     * atau tidak memiliki parameter maka tidak wajib di panggil pada class childnya
     * @param name
     */
    VicePresident(String name){
        super(name);
    }

    /**
     * Method overriding mendeklarasikan ulang method parent di  method child nya
     * ketika melakukan method overriding harus sama mulai dari nama method dan parameternya
     * @param name
     */
    void sayHello(String name){
        System.out.println("hi, " + name + " my name is vp " + this.name);
    }
}
