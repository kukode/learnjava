class Shape {
    int getCorner(){
        return 0;
    }
}

class Rectangle extends Shape{
    /**
     * membuat ovveriding method class parent pada class child
     * @return
     */
    int getCorner() {
        return 4;
    }

    /**
     * untuk mengakses method pada class parent menggunakan kata kunci super.namamethod yang ada
     * di class parent
     * @return
     */
    int getParentCorner(){
        return super.getCorner();
    }
}