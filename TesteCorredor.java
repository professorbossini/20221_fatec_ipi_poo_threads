public class TesteCorredor {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Corredor(), "guloso");
        Thread thread2 = new Thread (new Corredor(), "pedrinho");
        Thread thread3 = new Thread(new Corredor(), "rafael santana");
        Thread thread4 = new Thread (new Corredor(), "jpfatec");
        Thread thread5 = new Thread(new Corredor(), "andre");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
