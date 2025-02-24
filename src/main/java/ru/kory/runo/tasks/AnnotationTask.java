package ru.kory.runo.tasks;

/*
Создайте пользовательскую аннотацию @Version, которая будет хранить номер версии метода.
Аннотируйте три метода в классе MyClass, задав разным методам разные версии (например, "1.0", "2.0" и "3.0").
В основном классе вызовите каждый из этих методов, чтобы показать, что они работают корректно.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Version {

    String version() default "";

}

class MyClass {

    @Version(version = "1.0")
    public void first() {
    }

    @Version(version = "2.0")
    public void second() {
    }

    @Version(version = "3.0")
    public void third() {
    }

}

public class AnnotationTask {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        myClass.first();
        myClass.second();
        myClass.third();

    }

}
