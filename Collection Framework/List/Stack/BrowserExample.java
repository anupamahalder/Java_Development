import java.util.Stack;

class Browser {
    private Stack<String> history = new Stack<>();

    // Visit a new page
    public void visit(String url) {
        System.out.println("Visiting: " + url);
        history.push(url); // Push to the stack
    }

    // Go back to previous page
    public void goBack() {
        if (!history.isEmpty()) {
            String lastPage = history.pop(); // Remove the top
            System.out.println("Going back from: " + lastPage);
            if (!history.isEmpty()) {
                System.out.println("Now on: " + history.peek()); // Peek at new top
            } else {
                System.out.println("No pages left in history.");
            }
        } else {
            System.out.println("No history to go back.");
        }
    }

    // Show current page
    public void currentPage() {
        if (!history.isEmpty()) {
            System.out.println("Current page: " + history.peek());
        } else {
            System.out.println("No page currently open.");
        }
    }

    // Search a page in history
    public void searchPage(String url) {
        int pos = history.search(url); // 1-based position
        if (pos != -1) {
            System.out.println(url + " is at position " + pos + " in the history stack.");
        } else {
            System.out.println(url + " not found in history.");
        }
    }

    // Check if history is empty
    public boolean isHistoryEmpty() {
        return history.isEmpty();
    }
}

public class BrowserExample {
   
    public static void main(String[] args) {
        Browser browser = new Browser();

        browser.visit("https://google.com");
        browser.visit("https://github.com");
        browser.visit("https://openai.com");

        browser.currentPage(); // openai.com

        browser.searchPage("https://github.com");

        browser.goBack(); // back to github
        browser.goBack(); // back to google

        browser.currentPage();

        browser.goBack(); // empty history
        browser.goBack(); // no history to go back
    }
}

/*
OUTPUT:
-------
Visiting: https://google.com
Visiting: https://github.com
Visiting: https://openai.com
Current page: https://openai.com
https://github.com is at position 2 in the history stack.
Going back from: https://openai.com
Now on: https://github.com
Going back from: https://github.com
Now on: https://google.com
Current page: https://google.com
Going back from: https://google.com
No pages left in history.
No history to go back.
*/
