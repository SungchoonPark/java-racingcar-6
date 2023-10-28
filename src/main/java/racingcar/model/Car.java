package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private CarInform carInform;
    private Car(String carName) {
        carInform = CarInform.getInstance(carName);
    }

    public static Car getInstance(String carName) {
        return new Car(carName);
    }

    public void dashByRandNum() {
        if(getRandNum() > 3) carInform.plusDash();
    }

    public int getRandNum() {
        return Randoms.pickNumberInRange(0, 9);
    }

    public String getRacingResult() {
        return carInform.makeRacingResult();
    }

}
