import domain.Car;
import domain.CarNames;
import java.util.ArrayList;
import java.util.List;
import view.InputView;
import view.OutputView;

public class Application {

    public static void main(String[] args) {

        OutputView.printInputCarNameMessage();
        CarNames carNames = new CarNames(InputView.inputCarNames());
        List<String> names = carNames.getNames();


    }
}
