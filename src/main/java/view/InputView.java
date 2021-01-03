package view;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static String inputCarNames() {
        return getInput();
    }

    private static String getInput() {
        return scanner.nextLine().trim();
    }

}
