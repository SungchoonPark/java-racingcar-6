package racingcar.model;

import java.util.List;

public class Cars {
    private List<Car> carList;

    private Cars(List<Car> carList) {
        this.carList = carList;
    }

    public static Cars getInstance(List<Car> cars) {
        return new Cars(cars);
    }

    public void racingCar() {
        for (Car car : carList) {
            car.dashByRandNum();
        }
    }

    public String getRacingResult() {
        StringBuilder racingResult = new StringBuilder();
        for (Car car : carList) {
            racingResult.append(car.getRacingResult()).append("\n");
        }
        return racingResult.toString();
    }
}
