public class TesteRunnable {
    public static void main(String[] args) throws Exception{
        MinhaPrimeiraAtividade atividade = new MinhaPrimeiraAtividade();
        for (int i = 0; i < 50 ; i++)
            new Thread(new MinhaPrimeiraAtividade()).start();
        int cont = 1;
        while (true){
            System.out.printf("%s: %d\n", Thread.currentThread().getName(), cont++);
            Thread.sleep(100);
        }
    }
}
