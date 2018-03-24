import java.util.Date;

public class Person implements Cloneable {

    private String name;
    private Date dob;

    public Person(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

//    public Person clone() {
//        Person pDeepClone = new Person(this.name, this.dob);
//        pDeepClone.name = this.name;
//        pDeepClone.dob = this.dob;
//        return pDeepClone;
//    }

//    public Person clone() {
//        try {
//            return (Person) super.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//            throw new RuntimeException();
//        }
//    }

    public static void main(String[] args) {
        Date date = new Date();
        Date date1 = new Date();
        Person p = new Person("Sam", date);
        System.out.println(p.getName() + " " + p.getDob());
        try {
            Person pClone = (Person) p.clone();
            System.out.println(pClone.getName() + " " + pClone.getDob());
            System.out.println("p: " + p + "  pClone: " + pClone);
            date1.setMonth(0);
            p.setName("Samuel");
            p.setDob(date1);
            System.out.println(p.getName() + " " + p.getDob());
            System.out.println(pClone.getName() + " " + pClone.getDob());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

//        Person pClone = p.clone();
//        System.out.println(pClone.getName() + " " + pClone.getDob());
//        System.out.println("p: " + p + "  pClone: " + pClone);
//        date1.setMonth(0);
//        p.setName("Samuel");
//        p.setDob(date1);
//        System.out.println(p.getName() + " " + p.getDob());
//        System.out.println(pClone.getName() + " " + pClone.getDob());

    }
}
