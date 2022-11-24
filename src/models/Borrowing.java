package models;

public class Borrowing {
    int bookId;
    int studentId;
    int extraDays;
    int fineRate;

    public Borrowing(int bookId, int studentId, int extraDays, int fineRate) {
        this.bookId = bookId;
        this.studentId = studentId;
        this.extraDays = extraDays;
        this.fineRate = fineRate;
    }

    public int getBookId() {
        return bookId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getExtraDays() {
        return extraDays;
    }

    public int getFineRate() {
        return fineRate;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setExtraDays(int extraDays) {
        this.extraDays = extraDays;
    }

    public void setFineRate(int fineRate) {
        this.fineRate = fineRate;
    }
    public void fineRs() {

        double fine= this.fineRate*this.extraDays;
        System.out.println("The total fine for bookId " + this.bookId + " for" + this.extraDays + " days is Rs" + fineRate );
    }
}
