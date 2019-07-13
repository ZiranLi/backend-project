package com.challenge.demo.DAO;

import com.challenge.demo.Entity.MatrixItemDetail;
import com.challenge.demo.Entity.MatrixQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MatrixItemDetailRepository extends JpaRepository<MatrixItemDetail, Long> {
    boolean add(@Param("detailId") int detailId, @Param("detailText") String detailText);
    boolean deleteByDetailId(@Param("detailId") int detailId);
    List<MatrixItemDetail> selectByMatrixId(int matrixId);
    boolean updateDetailTextById(@Param("matrixItemId")int matrixItemId, @Param("detailText")String detailText);
}
