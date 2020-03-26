public class App {
    public static void main(String[] args) {
        Triangle tg = new Triangle();
        System.out.println(tg.toString());

        Triangle tg1 = new Triangle("red",true,1,2,3);
        System.out.println(tg1.toString());

        Triangle tg2 = new Triangle(2,2,2);
        System.out.println(tg2.toString());

    }
}
