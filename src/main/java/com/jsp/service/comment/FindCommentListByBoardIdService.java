package com.jsp.service.comment;

import com.jsp.domain.comment.CommentDAO;
import com.jsp.domain.comment.CommentVO;
import com.jsp.domain.user.UserVO;
import com.jsp.service.user.FindUserByIdService;

import java.util.List;

public class FindCommentListByBoardIdService {
    private FindCommentListByBoardIdService(){}
    private static class FindBoardListServiceHelper{
        private static final FindCommentListByBoardIdService INSTANCE = new FindCommentListByBoardIdService();
    }
    public static FindCommentListByBoardIdService getInstance(){
        return FindCommentListByBoardIdService.FindBoardListServiceHelper.INSTANCE;
    }

    public List<CommentVO> run(CommentVO vo) {
        CommentDAO commentDAO = new CommentDAO();
        List<CommentVO> comments = commentDAO.findByBoardId(vo);

        for(CommentVO comment : comments){
            UserVO createCommentUser = FindUserByIdService.getInstance().run(comment.getUserId());
            comment.setUserName(createCommentUser.getName());
        }

        return comments;
    }
}
