package springboot.bookmanager.service;

import springboot.bookmanager.pojo.Appointment;
import springboot.bookmanager.pojo.Book;

import java.util.List;

/**
 * @author xxx
 * @date 2019/7/24 0:23
 * @description
 */

public interface BookService {
    Book findBookById(long bookId);

    List<Book> selectBookBylimit(int from, int num);

    int reducenumber(long bookId);

    int insertAppointment(long studentId,long bookId);

    Appointment selectToAppoint(long studentId,long bookId);

}
