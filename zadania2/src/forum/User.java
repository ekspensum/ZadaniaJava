package forum;

public class User {
    private String name;
    private int age;
    private boolean sex;

    public User() {
        this.name = name;
        this.age = age;
        this.sex = sex;
        konstr();
    }
    public void konstr(){
        System.out.println("Działa konstruktor");
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getSex() {
        return sex;
    }
}
