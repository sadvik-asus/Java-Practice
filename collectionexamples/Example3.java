package collectionexamples;

class Example<T> {
    void swap(T x, T y) {
        T temp = x;
        x = y;
        y = temp;
        
        System.out.println("--- Inside Swap Method ---");
        System.out.println(x);
        System.out.println(y);
    }
}

class Contact {
    private String name;
    private Long phone;
    private String email;
    private String imageUrl;

    public Contact(String name, Long phone, String email, String imageUrl) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.imageUrl = imageUrl;
    }

    // Getters and Setters grouped together for readability
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Long getPhone() { return phone; }
    public void setPhone(Long phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    @Override
    public String toString() {
        return "Name: " + this.name + 
               " | Phone: " + this.phone + 
               " | Email: " + this.email + 
               " | Image URL: " + this.imageUrl;
    }
}

public class Example3 {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Sadvik", 8919597568L, "vadlasadvik99@gmail.com", "sadvik.jpg");
        Contact contact2 = new Contact("Spiderman", 9876543210L, "peter@dailybugle.com", "spidey.jpg");

        Example<Contact> obj1 = new Example<>();
        obj1.swap(contact1, contact2);
    }
}