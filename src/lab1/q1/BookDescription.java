package lab1.q1;

public class BookDescription {
    private String title;
    private String author;
    private String publisher;
    private int copiesSold;

    public BookDescription() {
        this.title = "unknown";
        this.author = "unknown";
        this.publisher = "unknown";
        this.copiesSold = 0;
    }

    public BookDescription(String title, String author, String publisher, int copiesSold) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copiesSold = copiesSold;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getCopiesSold() {
        return copiesSold;
    }

    public void setCopiesSold(int copiesSold) {
        this.copiesSold = copiesSold;
    }

    @Override
    public String toString() {
        return "BookDescription{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", copiesSold=" + copiesSold +
                '}';
    }

    public void display(){
        System.out.println(this);
    }
}
