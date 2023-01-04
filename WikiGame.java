import java.util.ArrayList;

public class WikiGame {

    private int maxDepth;
    private ArrayList<String> path = new ArrayList<>();

    public static void main(String[] args) {
        WikiGame w = new WikiGame();
    }

    public WikiGame() {

        String startLink = "";  // beginning link, where the program will start
        String endLink = "";    // ending link, where the program is trying to get to
        maxDepth = 1;           // start this at 1 or 2, and if you get it going fast, increase

    }

    // recursion method, you'll probably want to rename it
    // you may want this method to return something or take additional parameters
    public void recurse(String startLink, String endLink, int depth) {

    }
  
}
