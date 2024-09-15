package org.example.task_1.Book;

public class Main {
    public static void main(String[] args) {
        Book book_1 = new Book();
        book_1.setTitle("Ветер сулит бурю");
        book_1.setAuthor("Уолтер Мэккин");
        book_1.setYear(2024);

        book_1.getTitle();
        book_1.getAuthor();
        book_1.getYear();

        book_1.display();
    }
}
