public class Exhibit {

    Author author;
    String title;
    String date;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Exhibit{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
