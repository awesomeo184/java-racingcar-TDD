import domain.CarNames;
import view.InputView;
import view.OutputView;

public class Application {

    public static void main(String[] args) {

        OutputView.printInputCarNameMessage();
        String names = InputView.inputCarNames();
        CarNames carNames = new CarNames(names);
    }

}
