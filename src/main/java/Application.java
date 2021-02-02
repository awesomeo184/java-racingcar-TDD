import domain.Car;
import domain.CarFactory;
import domain.CarNames;
import domain.RandomDice;
import java.util.ArrayList;
import java.util.List;
import view.InputView;
import view.OutputView;

public class Application {

    public static void main(String[] args) {

        OutputView.printInputCarNameMessage();
        CarNames carNames = new CarNames(InputView.inputCarNames());
        List<Car> cars = CarFactory.makeCars(carNames);

        for (Car car : cars) {
            car.move(RandomDice.roll());
        }

    }
}
