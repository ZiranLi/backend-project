package com.challenge.demo.DAO;

import com.challenge.demo.Entity.Question;
import com.challenge.demo.Entity.Question_Given;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {

//	@Query(value = "SELECT q.* FROM questions q WHERE q.site_id = ?1", nativeQuery = true)
//	List<Question_Given> findSiteQuestions(Long siteId);

	boolean add(Question question);
	boolean remove(@Param("questionId") int questionId);
	List<Question> selectAll();
	List<Question> selectFromIdx(@Param("from") int from, @Param("num") int num);
	Question selectByQuestionId(@Param("questionId") int questionId);
	int updateQuestionText(@Param("questionId") int questionId, @Param("content")String text);
	List<Question> selectByType(@Param("type")int type);
}