package springboot.bookmanager.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import springboot.bookmanager.pojo.Appointment;

/**
 * @author xxx
 * @date 2019/7/24 15:27
 * @description
 */
@Mapper
@Repository
public interface AppointmentMapper {
    int insertAppointment(@Param("bookId") long bookId,@Param("studentId") long studentId);
    Appointment selectToAppoint(@Param("studentId") long studentId,@Param("bookId") long bookId);
}
