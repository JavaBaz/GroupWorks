import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String sentences = "salaaam bacheha";
        char c = 'a';
        //Thread thread = new Thread(new CharactorCount(sentences,c));
        //  thread.start();
        int mainCounter=0;
        ExecutorService ex = Executors.newSingleThreadExecutor();
        try {
            ex.submit(new CharactorCount(sentences, c));
            ex.shutdown();
            ex.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.err.println(e);
        } finally {
            if (!ex.isTerminated()) {
                System.err.println("cancel tasks");
            }
            ex.shutdownNow();
            System.out.println(" finished");
        }

    }

}

