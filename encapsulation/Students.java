package encapsulation;

class Students {
    private String rollnumber;
    private String name;
    private static String collegename = "Ellenki College of Engineering and Technology";
    private static String course = "JAVA";
    private static String trainer = "Mr.Chakri";
    private long number;
    private static final String countrycode = "+91";

    // constructor 
    public Students(String rollnumber,String name, long number){
        this.rollnumber = rollnumber;
        this.name = name;
        this.number = number;
    }
    public String toString(){
        return "\nRoll number  : "+this.rollnumber+
             "\nName         : "+this.name+
             "\nCollege Name : "+collegename+
             "\nCourse       : "+course+
             "\nTrainer      : "+trainer+
             "\nCountry code : "+countrycode+
             "\nPhone Number : "+this.number;
    }
    public void setRollnumber(String rollnumber){
        this.rollnumber = rollnumber;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNumber(long number){
        this.number = number;
    }
    public String getRollnumber(){
        return this.rollnumber;
    }
    public String getName(){
        return this.name;
    }
    public String getCollegename(){
        return collegename;
    }
    public String getCourse(){
        return course;
    }
    public String getTrainer(){
        return trainer;
    }
    public long getNumber(){
        return this.number;
    }
    public String getCountrycode(){
        return countrycode;
    }
    public static void main(String[] args) {
        Students student1 = new Students("23C71A6601","Sadvik Kumar", 8919597568L);
        System.out.println(student1);
        System.out.println("\n-----Accessing through object name------\n");
        System.out.println("Using getName() : "+student1.getName());
        System.out.println("Using Name : "+student1.name);
        System.out.println("Using getRollnumber() : "+student1.getRollnumber());
        System.out.println("Using rollnumber : "+student1.rollnumber);
        System.out.println("\n-----Accessing through class name-----\n");
        System.out.println(Students.collegename);
        System.out.println(Students.course);
        System.out.println(Students.trainer);
        System.out.println(Students.countrycode);
    }
}
