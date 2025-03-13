package Lab4;
class Books {

    private String author;
    private String[] chapterName = new String[100];

    public Books() {
        author = "Sufyan Afzal";
        chapterName[0] = "1st Chap";
        chapterName[1] = "2nd Chap";
    }

    public Books(String author, String[] chapterName) {
        this.author = author;
        this.chapterName = chapterName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String[] getChapterName() {
        return chapterName;
    }

    public void setChapterName(String[] chapterName) {
        this.chapterName = chapterName;
    }

    public boolean compareBooks(Books B) {
        if (this.author.equals(B.author)) {
            System.out.println("Both Books have the same Author: " + B.author);
            return true;
        } else {
            System.out.println("Both Books have different Authors.");
            return false;
        }
    }

    public boolean compareChapterNames(Books B) {
        int count1 = 0, count2 = 0;

        for (String chapter : this.chapterName) {
            if (chapter != null) count1++;
        }
        for (String chapter : B.chapterName) {
            if (chapter != null) count2++;
        }

        if (count1 > count2) {
            System.out.println(this.author + " has more chapters.");
            return true;
        } else {
            System.out.println(B.author + " has more chapters.");
            return false;
        }
    }
}

public class LabTask2 {
    public static void main(String[] args) {
        Books book1 = new Books();
        book1.setAuthor("Sufyan Afzal");
        book1.setChapterName(new String[]{"Chap1", "Chap2"});

        Books book2 = new Books("Sufyan Malik", new String[]{"Chap1", "Chap2", "Chap3"});

        book1.compareBooks(book2);

        book1.compareChapterNames(book2);
    }
}