import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String sentences1 = "i love java multi-thread framework";
        String sentences2 = "i like high speed program";
        char c1 = 'a';
        char c2= 'i';
        ExecutorService ex1 = Executors.newSingleThreadExecutor();
        ExecutorService ex2 = Executors.newSingleThreadExecutor();
        try {
            ex1.submit(new CharactorCount(sentences1, c1));
            ex1.shutdown();
            ex1.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.err.println(e);
        } finally {
            if (!ex1.isTerminated()) {
                System.err.println("cancel tasks");
            }
            ex1.shutdownNow();
            System.out.println(" finished");
        }

        try {
            ex2.submit(new CharactorCount(sentences2, c2));
            ex2.shutdown();
            ex2.awaitTermination(50, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.err.println(e);
        } finally {
            if (!ex2.isTerminated()) {
                System.err.println("cancel tasks");
            }
            ex1.shutdownNow();
            System.out.println(" finished");
        }

    }

}
