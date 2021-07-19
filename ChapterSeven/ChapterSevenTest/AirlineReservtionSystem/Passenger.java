package ChapterSevenTest.AirlineReservtionSystem;

import static ChapterSevenTest.AirlineReservtionSystem.SeatsClass.ECONOMYCLASS;
import static ChapterSevenTest.AirlineReservtionSystem.SeatsClass.FIRSTCLASS;

public class Passenger {
    SeatsClass seatsClass;
    public SeatsClass selection() {
        int userSelection = 0;
        if (userSelection == 1){
            return FIRSTCLASS;
        }else if (userSelection == 2){
            return ECONOMYCLASS;
        }
        return seatsClass;
    }
}
