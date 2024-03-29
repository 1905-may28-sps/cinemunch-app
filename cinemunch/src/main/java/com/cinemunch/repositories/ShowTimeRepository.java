package com.cinemunch.repositories;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cinemunch.beans.Movie;
import com.cinemunch.beans.ShowTime;

@Transactional
@Repository
public interface ShowTimeRepository extends JpaRepository<ShowTime, Integer>{
	
//	ShowTime s = new ShowTime();
    List<ShowTime> getShowTimeByMovie(Movie m);
   
//    List<ShowTime> findSeatIdByShowTime(ShowTime s);
    

}


