package FitTrack;
public class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    @Override
    public int calculateCalories() {
        caloriesBurned = duration * 8; // higher burn
        return caloriesBurned;
    }
}
