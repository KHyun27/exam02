package pack1;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private int age;
    private String grade;
    private String fClass;

    public Person() {
        name = "";
        age = 0;
        grade = "";
        fClass = "";
    }

    public Person(String name, int age, String grade, String fClass) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.fClass = fClass;
    }

    @Override
    public String toString() {
        return "Info [" +
                "이름 : '" + name + '\'' +
                ", 나이 : " + age +
                ", 학년 : " + grade +
                ", 좋아하는 과목 : '" + fClass + '\'' +
                "]\n";
    }
}
