package springboot.bookmanager.service;

import springboot.bookmanager.mapper.AppointmentMapper;
import springboot.bookmanager.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.bookmanager.pojo.Appointment;
import springboot.bookmanager.pojo.Book;

import java.util.List;

/**
 * @author xxx
 * @date 2019/7/24 0:24
 * @description
 */
@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;
    @Autowired
    AppointmentMapper appointmentMapper;
    @Override
    public Book findBookById(long bookId) {
        return bookMapper.findBookById(bookId);
    }

    @Override
    public List<Book> selectBookBylimit(int from, int num) {
        return bookMapper.selectBookBylimit(from,num);
    }

    @Override
    public int reducenumber(long bookId) {
        return bookMapper.reducenumber(bookId);
    }

    @Override
    public int insertAppointment(long studentId,long bookId) {
        return appointmentMapper.insertAppointment(bookId,studentId);
    }

    @Override
    public Appointment selectToAppoint(long bookId, long studentId) {
        return appointmentMapper.selectToAppoint(bookId,studentId);
    }

}
