package ru.kory.runo.conccurency_java;

import static java.lang.Thread.currentThread;
import static java.util.stream.IntStream.range;

public class Thread_CREATE {

    public static void main(String... args) {
//        System.out.println(currentThread().getName());
//
//        // TODO 1-й способ создания потока
//        final Thread thread = new Thread() {
//          @Override
//          public void run() {
//              System.out.println(currentThread().getName());
//          }
//        };
//        thread.start();
//
//        // TODO 2-й способ создания потока (предпочтительный)
//        final Runnable task = () -> System.out.println(currentThread().getName());
//        final Thread thread1 = new Thread(task);
//        thread1.start();

        // TODO Пример создания потоков
        final Runnable taskDisplayingThreadName = () -> System.out.println(currentThread().getName());
        final Runnable taskCreatingThread = () ->
                range(0, 10).forEach(i -> startThread(taskDisplayingThreadName));
        startThread(taskCreatingThread);
    }

    private static void startThread(final Runnable runnable) {
        final Thread thread = new Thread(runnable);
        thread.start();
    }

}