package springboot.bookmanager.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot.bookmanager.pojo.Book;
import springboot.bookmanager.service.BookService;

import java.util.Iterator;
import java.util.List;

/**
 * @author xxx
 * @date 2019/7/24 0:26
 * @description
 */
@Controller
public class controller1 {

    Logger logger= LoggerFactory.getLogger(getClass());
    @Autowired
    BookService b1;
    @RequestMapping("/book/{bookId}")
    public String findbookbyid(@PathVariable("bookId") long bookId, Model model){
        Book b=b1.findBookById(bookId);
        System.out.println(b);
        model.addAttribute("booklist",b);
        logger.info("使用book.action");
        return "booklist";
    }
    @RequestMapping("/limit")
    public String findbookbyidlimit(Model model){
        List<Book> b=b1.selectBookBylimit(0,5);
        Iterator<Book> i=b.iterator();
        while(i.hasNext()){
            Book book=i.next();
            System.out.println(book.toString());
        }
        model.addAttribute("booklist",b);
        logger.info("使用limit.action");
        return "booklist";
    }
    @RequestMapping("/reduce")
    @ResponseBody
    public String reducenumber(Model model){
        Book book1=b1.findBookById(1);
        System.out.println(book1.toString());
        b1.reducenumber(1);
        Book book2=b1.findBookById(1);
        System.out.println(book2.toString());
        return "reduce";
    }

    @RequestMapping("/insert")
    @ResponseBody
    public String insertAppointment(Model model){
        System.out.println(b1.insertAppointment(1,3));
        return "insert";
    }

    @RequestMapping("/query")
    @ResponseBody
    public String selectToAppoint(Model model){

        System.out.println((b1.selectToAppoint(1,2).toString()));
        return "query";
    }
}
