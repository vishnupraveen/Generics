package genclass;

public class GenericClassImpl {
    public static void main(String[] args) {

        Person<Employee> e1=new Person<>();
        Person<Contact> c1=new Person<>();

        Employee e=new Employee("John","Smith","12345");
        Contact c=new Contact("Mrs","Mary","Jane","123-456-7890");

        e1.setPerson(e);
        c1.setPerson(c);

        System.out.println(e1.getPerson());
        System.out.println(c1.getPerson());

    }
}
