class Human
{
    private int age;
    private String name;
    public int getAge()
    {
        return age;
    }
    public void setAge(int a)
    {
        age=a;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }
}
class EncapsulationEx
{
    public static void main(String args[])
    {
        Human h = new Human();
        h.setAge(20);
        h.setName("Sitara");
        System.out.println(h.getName() +":"+h.getAge());
    }
}