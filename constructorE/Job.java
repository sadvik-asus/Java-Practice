// constructor and objects program for Naukri.com site

package constructorE;
import java.util.Arrays;
class Job{
    private String role;
    private String companyname;
    private float rating;
    private int reviewcount;
    private String imageurl;
    private String experience;
    private String location;
    private String elegibilitycriteria;
    private String skills[];

    //constructor
    public Job(String role,String companyname,float rating,int reviewcount,String imageurl,String experience,String location,String elegibilitycriteria,String... skills){
        this.role = role;
        this.companyname = companyname;
        this.rating = rating;
        this.reviewcount = reviewcount;
        this.imageurl = imageurl;
        this.experience = experience;
        this.location = location;
        this.elegibilitycriteria = elegibilitycriteria;
        this.skills = skills;
    }

    public String toString(){
        return "\nRole : "+this.role+
        "\nCompany name : "+this.companyname+
        "\nRating : "+this.rating+
        "\nReview Count : "+this.reviewcount+
        "\nImage URL : "+this.imageurl+
        "\nExperience : "+this.experience+
        "\nLocation : "+this.location+
        "\nElegibility Criteria : "+this.elegibilitycriteria+
        "\nSkills : "+Arrays.toString(this.skills)
        +"\n--------------------------------------";
    }

    public static void main(String args[]){
        
        Job job1 = new Job("Software Engineer", "TechCorp", 4.5F, 1200, "C:/Images/Job1", "0-2 years", "Bengaluru", "B.Tech in CS/IT","Java", "Spring Boot", "SQL");
        Job job2 = new Job("Backend Developer", "DevSolutions", 4.2F, 850, "C:/Images/Job2", "2-4 years", "Hyderabad", "B.E / MCA","Python", "Django", "React");
        Job job3 = new Job("Frontend Developer", "WebCraft", 4.0F, 430, "C:/Images/Job3", "1-3 years", "Remote", "Any Graduate","HTML", "CSS", "JavaScript");
        Job job4 = new Job("DevOps Engineer", "CloudOps", 4.7F, 2100, "C:/Images/Job4", "3-5 years", "Pune", "B.Tech","AWS", "Docker", "Kubernetes");
        
        System.out.print(job1);
        System.out.print(job2);
        System.out.print(job3);
        System.out.print(job4);
    }
}
