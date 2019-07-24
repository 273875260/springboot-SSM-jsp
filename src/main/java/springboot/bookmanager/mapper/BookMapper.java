package springboot.bookmanager.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import springboot.bookmanager.pojo.Book;

import java.util.List;

/**
 * @author xxx
 * @date 2019/7/24 0:13
 * @description
 */
@Mapper
@Repository
public interface BookMapper {
     Book findBookById(long bookId);
     List<Book> selectBookBylimit(@Param("from") int from,@Param("num") int num);
     int reducenumber(long bookId);

}
