package org.demo.spring5.chapt02.factoryPattern;

interface INote {
    void edit();
}
interface IVideo {
    void record();
}

class JavaNote implements INote {

    @Override
    public void edit() {
        System.out.println("edit");
    }
}

class JavaVideo implements IVideo {

    @Override
    public void record() {
        System.out.println("record");
    }
}

class PythonNode implements INote {

    @Override
    public void edit() {
        System.out.println("edit");
    }
}

class PythonVideo implements IVideo {

    @Override
    public void record() {
        System.out.println("video");
    }
}
interface I3CourseFactory {
    INote createNode();
    IVideo createVideo();
}


class Java3CourseFactory implements I3CourseFactory {

    @Override
    public INote createNode() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}

class Python3CourseFactory implements I3CourseFactory {

    @Override
    public INote createNode() {
        return new PythonNode();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}

public class AbstractFactory {
}
