package com.jsp.domain.like;

import com.jsp.domain.DomainVO;
import lombok.Data;

import java.util.Date;

@Data
public class LikeVO implements DomainVO {
    private Long id;
    private Long userId;
    private Long boardId;
    private Date likedDate;

    @Override
    public String[] getInsertValue() {
        String[] value = {""+this.userId, ""+this.boardId};
        return value;
    }

    @Override
    public String[] getUpdateValue() {
        String[] value = {};
        return value;
    }

    @Override
    public String[] getDeleteValue() {
        String[] value = {""+this.id};
        return value;
    }

    @Override
    public String[] getFindByIdValue() {
        String[] value = {""+this.id};
        return value;
    }

    public String[] getFindByUserIdAndBoardIdValue(){
        String[] value = {""+this.userId, ""+this.boardId};
        return value;
    }

    public String[] getFindByUserIdValue(){
        String[] value = {""+this.userId};
        return value;
    }
}
