
public class Information {

    Exhibit exhibit;

    public Information(Exhibit exhibit) {
        this.exhibit = exhibit;
        showInformation();
    }

    void showInformation() {
        System.out.println("Author: " + exhibit.getAuthor().getName() + "\nTitle: " + exhibit.getTitle() + "\nDate: " + exhibit.getDate());
    }
}
