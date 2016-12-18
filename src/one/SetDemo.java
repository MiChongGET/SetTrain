package one;

import java.util.HashSet;

/**
 * Created by Administrator on 2016/12/16.
 * HashSet存储字符串并遍历
 */

public class SetDemo {

    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<Student>();

        Student s1 = new Student("MiChong",12);
        Student s2 = new Student("MiChong",12);

        System.out.println("s1.hashCode():"+s1.hashCode());
        System.out.println("s2.hashCode():"+s2.hashCode());
    }

}
