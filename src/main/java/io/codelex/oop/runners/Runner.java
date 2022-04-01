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
        if (isAdvanced(time)) {
            return ADVANCED;
        } else if (isIntermediate(time)) {
            return INTERMEDIATE;
        } else {
            return BEGINNER;
        }
    }

    private static boolean isAdvanced(int time) {
        return time > ADVANCED.minimumRunningTime && time <= ADVANCED.maximumRunningTime;
    }

    private static boolean isIntermediate(int time) {
        return time > INTERMEDIATE.minimumRunningTime && time <= INTERMEDIATE.maximumRunningTime;
    }
}
