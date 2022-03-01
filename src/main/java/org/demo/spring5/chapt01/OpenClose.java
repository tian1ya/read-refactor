package org.demo.spring5.chapt01;

/*
   简单来说就是对扩展开放，对修改关闭
   面向接口编程，抽象构建框架，实现扩展细节，提供软件的可复用性和可维护性
   例如公司实行的弹性工作制度：每天上班8小时是不可变的，但是怎么上着8个小时的班是可变的
 */
interface ICourse {
    Integer getId();
    String getName();
    Double getPrice();
}
class JavaCourse implements ICourse {

    private Integer id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}

/*
    加入要修改Java 课程的价格，那么如果直接修改 JavaCourse.getPrice 可能会影响到其他地方的调用
 */

class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }
    public Double getOriginalPrice() {
        return super.getPrice();
    }

    public Double getPrice() {
        return super.getPrice() * 0.5;
    }
}
public class OpenClose {
}
