package springboot.bookmanager.pojo;

import java.util.Date;

/**
 * @author xxx
 * @date 2019/7/24 15:06
 * @description
 */
public class Appointment {
    private long bookId;
    private long studentId;
    private Date appointmentDate;
    private Book book;

    @Override
    public String toString() {
        return "Appointment{" +
                "bookId=" + bookId +
                ", studentId=" + studentId +
                ", appointmentDate=" + appointmentDate +
                ", book=" + book +
                '}';
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
