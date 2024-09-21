public class Person implements Cloneable
{
    private String name;
    private String surname;
    private int age;

    public Person()
    {
        this.name = "";
        this.surname = "";
        this.age = 0;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public Person clone() throws CloneNotSupportedException
    {
        return (Person) super.clone();
    }
}