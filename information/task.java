package information;

public enum task {
    DISHES("Do the dishes", 1000),
    SWEEP("Sweep the house", 3000),
    LAUNDRY("Do the laundry", 10000),
    RECYCLING("Take out the recycling", 4000),
    SANDWICH("Make a sammich", 7000),
    MOW("Mow the lawn", 20000),
    RAKE("Rake the leaves", 18000),
    DOG("Give the dog a bath", 14500),
    COOKIES("Bake some cookies", 8000),
    CAR("Wash the car", 20000);

    private String name;
    private int time;

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    task(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public static void completeTask(task task1) {
        int currentTime = robotInfo.getTime();
        int timeToComplete = task1.getTime();
        robotInfo.setTime(currentTime - timeToComplete);
    }

}
