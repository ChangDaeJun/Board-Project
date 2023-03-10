package com.jsp.domain.comment;

import com.jsp.domain.DomainVO;
import lombok.Data;

import java.util.Date;

@Data
public class CommentVO implements DomainVO {
    private Long id;
    private Long boardId;
    private Long userId;
    private String userName;
    private String text;
    private Date createdDate;

    @Override
    public String[] getInsertValue() {
        String[] value = {""+this.userId, ""+this.boardId, this.text};
        return value;
    }

    @Override
    public String[] getUpdateValue() {
        String[] value = {this.text};
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

    public String[] getFindByBoardIdValue(){
        String[] value = {""+this.boardId};
        return value;
    }

    public String[] getFindByUserIdValue(){
        String[] value = {""+this.userId};
        return value;
    }
}
