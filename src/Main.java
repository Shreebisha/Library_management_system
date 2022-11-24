import models.Books;
import models.Borrowing;
import models.Students;

public class Main {
    public static void main(String[] args) {

        Students s1= new Students("Hira", 23012,10,1);
        Students s2= new Students("Rinchen", 23456, 11,4);
        Students s3= new Students("Ali", 23567, 12,3);
        s1.print_student();

        Books b1= new Books("Ikigai", " Hector Garcia",1234,2020);
        Books b2= new Books("Rich dad poor dad", "Robert Kiyosaki", 3456, 2015);
        Books b3= new Books("good life good vibes", "Vex King", 2345, 2019);
        b1.print_books();

        Borrowing bo1= new Borrowing(1,2013,12,200);
        Borrowing bo2= new Borrowing(2,2345, 14,100);
        Borrowing bo3= new Borrowing(3,1234,3,100);
        bo2.fineRs();


    }
}
