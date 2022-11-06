package com.datingapi.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.datingapi.entities.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, Integer> {
	
	@Query("from UserAccount where age=:age and city=:city and country=:country and id!=:id")
		
	List <UserAccount> findMatches(@Param("age") int age ,@Param("city") String city,@Param("country")String country, @Param("id")int id);

	@Query("select u from UserAccount u where u.userName=:n")
	List<UserAccount> findSpecificName(@Param ("n") String name);
	
	
}
