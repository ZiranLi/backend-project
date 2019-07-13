package com.challenge.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MatrixItemDetail {
/*- matrix_item_id      integer
   - detail_id     integer
   - detail_text      varchar
   - is_active     boolean
*/

    private Integer matrixItemId;

    @Id
    @GeneratedValue
    private Integer detailId;

    private String detailText;

    private boolean isActive;

    public MatrixItemDetail() {
    }

    public Integer getMatrixItemId() {
        return matrixItemId;
    }

    public void setMatrixItemId(Integer matrixItemId) {
        this.matrixItemId = matrixItemId;
    }

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public String getDetailText() {
        return detailText;
    }

    public void setDetailText(String detailText) {
        this.detailText = detailText;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
