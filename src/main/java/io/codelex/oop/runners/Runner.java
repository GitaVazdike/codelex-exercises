package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(275, 340),
    INTERMEDIATE(210, 270),
    ADVANCED(170, 200);

    private final int minimumRunningTime;
    private final int maximumRunningTime;

    Runner(int minimumRunningTime, int maximumRunningTime) {
        this.minimumRunningTime = minimumRunningTime;
        this.maximumRunningTime = maximumRunningTime;
    }

    public static Runner getFitnessLevel(int time) {
        if (time > ADVANCED.minimumRunningTime && time <= ADVANCED.maximumRunningTime) {
            return ADVANCED;
        } else if (time > INTERMEDIATE.minimumRunningTime && time <= INTERMEDIATE.maximumRunningTime) {
            return INTERMEDIATE;
        } else {
            return BEGINNER;
        }
    }
}
