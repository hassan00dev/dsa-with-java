package lab1.q1;

public class RunBookDescription {
    public static void main(String[] args) {
        BookDescription bookDescription = new BookDescription();
        System.out.println(bookDescription);
        BookDescription bookDescription2 = new BookDescription("test", "test", "test", 2);
        bookDescription2.setPublisher("p test");
        System.out.println(bookDescription2);
    }
}
