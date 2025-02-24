package ru.kory.runo.conccurencyTask.java_tasks;

import java.util.stream.IntStream;

public class Thread_METHOD_JOIN {
    private static final int FROM_NUMBER_FIRST_THREAD = 1;
    private static final int TO_NUMBER_FIRST_THREAD = 500;

    private static final int FROM_NUMBER_SECOND_THREAD = 501;
    private static final int TO_NUMBER_SECOND_THREAD = 1000;

    private static final String TEMPLATE_MESSAGE_THREAD_AND_NUMBER = "%s : %d\n";

    public static void main(String... args) throws InterruptedException{
        final TaskSummaryNumbers firstTask = new TaskSummaryNumbers(FROM_NUMBER_FIRST_THREAD, TO_NUMBER_FIRST_THREAD);
        final Thread firstThread = new Thread(firstTask);
        firstThread.start();

        final TaskSummaryNumbers secondTask = new TaskSummaryNumbers(FROM_NUMBER_SECOND_THREAD, TO_NUMBER_SECOND_THREAD);
        final Thread secondThread = new Thread(secondTask);
        secondThread.start();

        waitForTasksFinished(firstThread, secondThread);

        final int resultNumber = firstTask.getResultNumber() + secondTask.getResultNumber();
        printThreadNameAndNumber(resultNumber);
    }

    // Печать результата сложения суммы чисел
    private static void printThreadNameAndNumber(final int number) {
        System.out.printf(TEMPLATE_MESSAGE_THREAD_AND_NUMBER, Thread.currentThread().getName(), number);
    }

    // Поток ждет выполнения другого потока
    private static void waitForTasksFinished(final Thread... threads) throws InterruptedException {
        for (Thread thread : threads) {
            thread.join();
        }
    }

    // Модель
    private static final class TaskSummaryNumbers implements Runnable {
        private static final int INITIAL_RESULT_NUMBER = 0;

        private final int fromNumber;
        private final int toNumber;
        private int resultNumber;

        public TaskSummaryNumbers(int fromNumber, int toNumber) {
            this.fromNumber = fromNumber;
            this.toNumber = toNumber;
            this.resultNumber = INITIAL_RESULT_NUMBER;
        }

        public int getResultNumber() {
            return resultNumber;
        }

        @Override
        public void run() {
            IntStream.rangeClosed(this.fromNumber, this.toNumber)
                    .forEach(i -> this.resultNumber += i);
            printThreadNameAndNumber(resultNumber);
        }

    }

}
