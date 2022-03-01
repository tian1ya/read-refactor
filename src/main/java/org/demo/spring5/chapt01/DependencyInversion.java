package org.demo.spring5.chapt01;

/*
    依赖倒置：
    在设计代码结构的时候，高层模块不应该依赖底层模块，二者都应该其抽象，
    抽象不应该依赖细节，细节依赖抽象
    通过依赖倒置，减少类与类之间的耦合，提供系统稳定性，可读性和可维护性
    面向接口编程，先顶层细节，然后在细节设计代码结构
 */

class Tom {
    public void studyJavaCourse() {
        System.out.println("Tom 在学习Java 的课程");
    }

    public void studyPython() {
        System.out.println("Tom 在学习Python 课程");
    }
}

/*
    如果Tom 在学习Scala 呢？ 此时需要修改Tom 类，采用依赖导致，面向接口编程
 */

interface TomCourse {
    void study();
}

class TomJavaCourse implements TomCourse {

    @Override
    public void study() {
        System.out.println("学习Java");
    }
}
class TomPythonCourse implements TomCourse {

    @Override
    public void study() {
        System.out.println("学习Python");
    }
}

class TomAICourse implements TomCourse {

    @Override
    public void study() {
        System.out.println("学习 AI");
    }
}

class TomStudy  {
    private TomCourse course;

    public TomStudy() {
    }

    public TomStudy(TomCourse course) {
        this.course = course;
    }

    public void study(TomCourse course) {
        this.course = course;
        course.study();
    }

    public void study() {
        course.study();
    }

    public void setCourse(TomCourse course) {
        this.course = course;
    }
}
public class DependencyInversion {
    public static void main(String[] args) {
        Tom tom = new Tom();
        tom.studyJavaCourse();
        tom.studyPython();

        TomStudy study = new TomStudy();
        TomPythonCourse pythonCourse = new TomPythonCourse();
        study.study(pythonCourse);

        // 构造器注入

        // setter 注入
        study.setCourse(new TomJavaCourse());
        study.study();
    }
}
