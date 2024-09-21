public class Main
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
       Person p1 = new Person();
       System.out.println(p1);
       String s1 = "Andrzej";
       String s2 = s1;
       System.out.println(s1 == s2);
       s2 = "Bartek";
       System.out.println(s1);
       System.out.println(s2);
       Person p2 = p1.clone();
       System.out.println(p2);
    }
}