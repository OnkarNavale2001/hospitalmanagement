package in.sp.main.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.sp.main.beans.Appointment;

@Repository
public interface Appointmentrepositry extends JpaRepository<Appointment, Integer>{
	  @Query("SELECT u FROM Appointment u WHERE u.userid =:userid")
	    List<Appointment> findByidd(@Param("userid") String userid);
	  @Query("SELECT u FROM Appointment u WHERE u.doctorid =:doctorid")
	    List<Appointment> findByid(@Param("doctorid") int doctorid);
	

}
