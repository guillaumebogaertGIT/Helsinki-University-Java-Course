public class Book {
private String name;
private int pages;
private int year;

public Book (String bookName, int bookPages, int pubYear) {
    this.name = bookName;
    this.pages = bookPages;
    this.year = pubYear;

}

public String getName() {
    return this.name;
}

public int getPages() {
    return  this.pages;
}

public int getYear() {
    return this.year;
}

@Override
public String toString() {
    return this.name + ", " + this.pages + " pages, " + this.year;
}


}
