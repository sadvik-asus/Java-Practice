public class Employee implements Cloneable{
    private int id;
    private String name;
    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString(){
        return "Id : "+this.id+"\tName : "+this.name;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Available methods in Object-class : ");
        System.out.println("getClass()\tequals()\tclone()\ttoString()\tfinalize()\n");
        System.out.println("notify()\tnotifyAll()\twait(long)\twait(long,int)\twait()\n");
        Employee employee1 = new Employee(1, "Sadvik");
        Employee employee2 = new Employee(2, "Spider man");
        System.out.println("Hash code of employee1 using hashcode() : "+employee1.hashCode());
        System.out.println("Hash code of employee1 using hashcode() : "+employee2.hashCode());
        System.out.println("class name of employee1 using getClass() : "+employee1.getClass());
        System.out.println("class name of employee2 using getClass() : "+employee2.getClass());
        System.out.println("using equal method on emp1 and emp2 : "+employee1.equals(employee2));
        Employee employee3 = employee2;
        System.out.println("Using equal method on emp2 and emp3 : "+employee2.equals(employee3));
        Employee employee4 = (Employee) employee1.clone();
        System.out.println(employee1);
        System.out.println(employee4);
        System.out.println("equal() on emp1 and emp4 (created using clone()) : "+employee1.equals(employee4));
        Employee employee5 = new Employee(5, "Tony");
        Employee employee6 = new Employee(6, "Iron man");
        employee5 = null;
        employee6 = null;
        System.out.println(employee5+" " +employee6);
        System.gc();
    }
}