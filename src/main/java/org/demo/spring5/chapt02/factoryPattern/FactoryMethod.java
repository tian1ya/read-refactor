package org.demo.spring5.chapt02.factoryPattern;

interface ICourseFactory {
    I2Course create();
}

class JavaClassFactory implements ICourseFactory {

    @Override
    public I2Course create() {
        return new Java2Course();
    }
}

class PythonClassFactory implements ICourseFactory {

    @Override
    public I2Course create() {
        return new Python2Course();
    }
}
public class FactoryMethod {
}
