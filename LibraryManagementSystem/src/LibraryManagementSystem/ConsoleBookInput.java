package LibraryManagementSystem;

import java.util.Scanner;

public class ConsoleBookInput implements BookInput {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public Book readBook() throws InvalidBookException {
        return null;
    }
}
