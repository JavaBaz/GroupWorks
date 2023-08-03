public class CharactorCount implements Runnable {
    private String sentences;
    private char c;

    int counter = 0;

    public CharactorCount(String sentences, char c) {
        this.sentences = sentences;
        this.c = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < sentences.length(); i++) {
            if (sentences.charAt(i) == c) {
                counter++;
            }
        }
        System.out.println("charactor count is : " + counter);
    }

    // initialize counter in method or out of method for part 3
}
