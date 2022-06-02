//É-UM
public class MinhaPrimeiraThread extends Thread{
    public void run(){
        System.out.printf("Método run: %s\n", Thread.currentThread().getName());
        System.out.println("Estou sendo executado por uma thread diferente da principal");
    }
}
