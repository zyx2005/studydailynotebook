package 学习;

// public class A {
//     /*
//      * 公共的
//      * 受保护的
//      * 私人的
//      * 四个类
//      */
//     int  gread1=new A(gxread1, gread2, gread4)
//     public int gread1 = 1;
//     protected int gread2 = 200;
//     int gread4 = 300;

//     public int getGread4() {
//         return gread4;
//     }

//     public void setGread4(int gread4) {
//         this.gread4 = gread4;
//     }

//     public int getGread4() {
//         return gread4;
//     }

//     public void setGread4(int gread4) {
//         this.gread4 = gread4;
//     }

//     public A(int gread1, int gread2, int gread4) {
//         this.gread1 = gread1;
//         this.gread2 = gread2;
//         this.gread4 = gread4;
//     }

//     int gread4 = 300;

//     public void test100() {

//     }

//     public void test200() {

//     }

// }pubilic

public class someone {
    public String name;
    protected float power;

    /*
     * 实例方法通过对象就可以调用
     * 有对象就可以调用
     */
    public void die() {
        power = 0;
    }

    public static void battleWin() {
        System.out.print("someone is win!!");
    }

    public static void main(String[] args) {
        someone halen = new someone();
        halen.name = "halen";
        halen.die();
        // 必须有一个对象才能调用

        someone teemo = new someone();
        teemo.name = "teemo";
        // 无需对象，直接通过类名调用

        someone.battleWin();

    }

    // public class Item(){
    // String name;
    // float price;

    // public static void main(String[] args)
    // {

    // Item Xueping=new Item();
    // Item caoxie=new Item();
    // Item changjian=new Item();

    // Xueping.name="血瓶"；
    // Xueping.price=50.0;
    // caoxie.name="草鞋"；
    // caoxie.price=300.0;
    // changjian.name="长剑"
    // changjian.price=350.0;

    // }

    // public class Hero(){
    // String name;
    // int power;

    // void Legendary(){
    // System.out.print("you'er
    // legendary");
    // }

    // void

    // int getpower() {
    // return power;
    // }

    // void recovery(int power) {
    // System.out.print(name + "get" + power + "");
    // }
    // }

    // }

    // public class HelloWorld {
    // //
    // public void method1(final int j) {
    // j = 5; // 这个能否执行？
    // }
    // }

}
