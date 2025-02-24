package ru.kory.runo.conccurency_java;

public class Thread_STATES {

    private static final String MESSAGE_TEMPLATE_THREAD_STATE = "%s, %s\n";

    public static void main(String... args) {
        final Thread thread = new Thread(() -> printThreadState(Thread.currentThread()));
        printThreadState(thread);
        thread.start();
    }

    private static void printThreadState(final Thread thread) {
        System.out.printf(MESSAGE_TEMPLATE_THREAD_STATE, thread.getName(), thread.getState());
    }
}