package information;

import java.util.ArrayList;
import java.util.Random;

public class taskList {
    public static ArrayList<task> tasks;
    private static final int numOfTasks = 10;

    public static void makeList() {
        tasks = new ArrayList<>(numOfTasks);
        tasks.add(task.DISHES);
        tasks.add(task.SWEEP);
        tasks.add(task.LAUNDRY);
        tasks.add(task.RECYCLING);
        tasks.add(task.SANDWICH);
        tasks.add(task.MOW);
        tasks.add(task.RAKE);
        tasks.add(task.DOG);
        tasks.add(task.COOKIES);
        tasks.add(task.CAR);
    }

    public static task[] getTasks() {
        Random r = new Random();
        int rNum;
        task[] taskArray = new task[5];
        makeList();
        for (int i = 0; i < taskArray.length; i++) {
            rNum = r.nextInt(10);
            taskArray[i] = tasks.get(rNum);
        }
        return taskArray;
    }



}
