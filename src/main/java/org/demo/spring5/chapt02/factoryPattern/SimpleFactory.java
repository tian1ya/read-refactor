package org.demo.spring5.chapt02.factoryPattern;

interface I2Course {
    public void record();
}

class Java2Course implements I2Course {

    @Override
    public void record() {
        System.out.println("Java");
    }
}

class Python2Course implements I2Course {

    @Override
    public void record() {
        System.out.println("Python");
    }
}

class CourseFactory {
    public I2Course create(String name) {
        if ("Java".equals(name)) return new Java2Course();
        else if ("Python".equals(name)) return new Python2Course();
        return null;
    }

    public I2Course create(Class<? extends I2Course> clazz) {
        if (clazz != null) {
            try {
                return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
public class SimpleFactory {
}
