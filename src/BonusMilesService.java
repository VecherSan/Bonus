public class BonusMilesService {


    public int calculate(int price) {
        int miles;
        int amount = 20;
        miles = price / amount;

        return miles;
    }
}
