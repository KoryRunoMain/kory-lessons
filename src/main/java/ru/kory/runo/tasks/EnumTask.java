package ru.kory.runo.tasks;

/*
Создайте enum TrafficLight с тремя значениями: RED, YELLOW, и GREEN.
Добавьте метод String getAction(), который будет возвращать строку
с рекомендацией действия (например, для RED "Stop", для YELLOW "Prepare to stop", для GREEN "Go")
В методе main напишите код, который выводит рекомендацию для каждого значения TrafficLight.
 */

enum TrafficLight {
    RED,
    YELLOW,
    GREEN
}

public class EnumTask {

    public String getAction(TrafficLight value) {
        String message = "";
        switch (value) {
            case RED -> message = "Stop";
            case YELLOW -> message = "Prepare to stop";
            case GREEN -> message = "Go";
        }
        return message;
    }

    public static void main(String[] args) {
        EnumTask enumTask = new EnumTask();

        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(enumTask.getAction(light));
        }

    }

}
