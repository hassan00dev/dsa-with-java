package lab2.q7;

public class Student<T> implements Person<T>{

    public T id;
    public String name;
    public double cgpa;

    public Student() {
        this.id = null;
        this.name = "unknown";
        this.cgpa = 0.0;
    }

    public Student(T id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }

    @Override
    public T work() {
        return null;
    }

    @Override
    public T sleep() {
        return null;
    }
}
