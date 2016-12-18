package one;

/**
 * Created by Administrator on 2016/12/18.
 */
public class Student {
    private String name;
    private int age;

    public Student() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        //return 0;//强制所有的hashCode都变为0
        return this.name.hashCode()+this.age*21;
        //为了防止数值加在一起重复，所以age乘以一个数
    }

    //重写equals方法
    @Override
    public boolean equals(Object obj) {
        System.out.println(obj);
    if (this==obj)
        return true;

    if (!(obj instanceof Student))
        return false;

    Student s = (Student)obj;//强制将对象转变为Student
    return this.name.equals(s.name)&&this.age==s.age;
    }
}
