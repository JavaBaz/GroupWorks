import java.util.concurrent.Callable;

public class CharactorCount implements Callable {
    private String sentences;
    private char c;

    int counter=0;

    public CharactorCount(String sentences , char c){
        this.sentences=sentences;
        this.c=c;
    }
    @Override
    public Object call(){
        for (int i = 0; i < sentences.length(); i++) {
            if (sentences.charAt(i)==c){
                counter++;
            }
        }
        System.out.printf("charactor count of char %c in sentences { %s } is %d \n" , c , sentences , counter);
        return null;
    }

    // initialize counter in method or out of method for part 3
}
