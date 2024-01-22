package pack1;

        /* 클래스 하나 더 만들어서 Student
        그 클래스를 Person 클래스처럼 시리얼라이즈를 상속 받아서 하나의 클래스를 만들기
        그 클래스의 멤버변수로 Person ArrayList가 들어가
        private int age;
        private String name;
        등등
        ArrayList로 묶어서
        새로만들 클래스 객체를 append 할수 있는 멤버로 들어가서
        그 객체를 생성해서
        kang, park yoo 처럼 파일도 만들어보고
        그대로 저장 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Person kang = new Person("강호동", 30, "3학년", "수학");
        Person yoo = new Person("유재석", 25, "2학년", "국어");
        Person son = new Person("손흥민", 22, "1학년", "과학");
        Person park = new Person("박명수", 32, "3학년", "영어");
        Person ho = new Person("박찬호", 40, "2학년", "사회");

        ArrayList<Person> list = new ArrayList<>();
        list.add(kang);
        list.add(yoo);
        list.add(son);
        list.add(park);
        list.add(ho);

        StringBuilder sb = new StringBuilder();
        // sb.append(kang);
        // sb.append(yoo);
        // sb.append(son);
        sb.append(list);

        TextIO.write("person.txt", sb.toString());

        for (Person person : list) {
            System.out.println(person);
        }

        // list.forEach(System.out::println);

    }
}
