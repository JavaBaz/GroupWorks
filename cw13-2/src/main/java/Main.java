import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String sentences = "salaaam bacheha";
        char c = 'a';
        int mainCounter = 0;
        ExecutorService ex = Executors.newSingleThreadExecutor();
        try {
            ex.submit(new CharactorCount(sentences, c));
            ex.shutdown();
        } finally {
            if (!ex.isTerminated()) {
                System.err.println("cancel tasks");
            }
            ex.shutdownNow();
            System.out.println(" finished");
        }

    }

}
