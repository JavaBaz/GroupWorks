import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String sentences1 = "i love java multi-thread framework";
        String sentences2 = "i like high speed program";
        char c1 = 'a';
        char c2= 'i';
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        ExecutorService executorService = Executors.newFixedThreadPool(2,threadFactory) ;
        ThreadPoolExecutor ex = (ThreadPoolExecutor) executorService;

            ex.submit(new CharactorCount(sentences1, c1));
            ex.submit(new CharactorCount(sentences2, c2));
            ex.shutdown();
    }
    }
