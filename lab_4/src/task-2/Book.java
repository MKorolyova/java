public class Book {
    private String title;
    private String authorFirstName;
    private String authorLastName;
    private int publicationYear;
    private String publisher;
    private float price;

    public Book(String title, String authorFirstName, String authorLastName, int publicationYear, String publisher, float price) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorSecondName() {
        return authorLastName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format(" \n Title: %s \n Author first name: %s \n Author last name: %s \n Publication year: %d \n Price: %.2f", 
                title, authorFirstName, authorLastName, publicationYear, price);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;

        Book book = (Book) obj;

        return this.price == book.price &&
        this.publicationYear == book.publicationYear &&
        this.title.equals(book.title) &&
        this.authorFirstName.equals(book.authorFirstName) &&
        this.authorLastName.equals(book.authorLastName) &&
        this.publisher.equals(book.publisher);
    }
}



  