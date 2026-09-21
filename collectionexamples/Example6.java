// ToDo 1 : Wap to demonstrate LinkedList

package collectionexamples;

import java.util.LinkedList;

class College{
    private String code;
    private String name;
    private int pincode;
    private boolean isAutonomous;

    public College(String code, String name, int pincode, boolean isAutonomous) {
        this.code = code;
        this.name = name;
        this.pincode = pincode;
        this.isAutonomous = isAutonomous;
    }

    @Override
    public String toString() {
        return "College [code=" + code + ", name=" + name + ", pincode=" + pincode + ", isAutonomous=" + isAutonomous
                + "]";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public boolean isAutonomous() {
        return isAutonomous;
    }

    public void setAutonomous(boolean isAutonomous) {
        this.isAutonomous = isAutonomous;
    }
    
    
}
public class Example6 {
    public static void main(String[] args) {
        LinkedList <College> collegeList = new LinkedList<>();
        College c1 = new College("ECET", "Ellenki", 502307, true);
        College c2 = new College("XYZ", "SPIDERMAN Institute", 6969, false);

        collegeList.add(c1);
        collegeList.add(c2);

        System.out.println(collegeList);
    }
}
