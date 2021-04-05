package com.example.dao;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.MemberInfo;

@Repository
public interface MemberInfoDao extends JpaRepository<MemberInfo, Long>{
	
	@Query(value = "Select member_info.id, movie.movie_name FROM movie Left JOIN member_info  ON  movie.member_id =  member_info.id", nativeQuery = true)
    List<Map<Long, Object>> findAllAttachAndAttachMapping();

}
