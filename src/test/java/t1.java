import springboot.bookmanager.mapper.BookMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import springboot.bookmanager.pojo.Book;

/**
 * @author xxx
 * @date 2019/7/24 0:16
 * @description
 */
public class t1 {
    @Autowired
    BookMapper bookMapper;
    @Test
    public void test(){
        Book b=bookMapper.findBookById(1);
        System.out.println(b);
    }
}
