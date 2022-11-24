package models;

public class Students {
    String name;
    int roll_no;
    int grade;
    int borrowedBooks;

    public Students(String name, int roll_no, int grade, int borrowedBooks) {
        this.name = name;
        this.roll_no = roll_no;
        this.grade = grade;
        this.borrowedBooks = borrowedBooks;
    }

    public String getName() {
        return name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public int getGrade() {
        return grade;
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setBorrowedBooks(int borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void print_student() {

        System.out.println("The student is "+ this.name +  " of class "+this.grade+ " has borrowed " +this.borrowedBooks + " books" );

    }
}
