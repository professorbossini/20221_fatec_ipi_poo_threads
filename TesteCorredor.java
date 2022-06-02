public class TesteCorredor {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        Thread thread1 = new Thread(new Corredor(t), "guloso");
        Thread thread2 = new Thread (new Corredor(t), "pedrinho");
        Thread thread3 = new Thread(new Corredor(t), "rafael santana");
        Thread thread4 = new Thread (new Corredor(t), "jpfatec");
        Thread thread5 = new Thread(new Corredor(t), "andre");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        System.out.println("Começou");
        
        
        //resolver o problema "acabou"
        System.out.println("Acabou");
    }
}
