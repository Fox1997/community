package com.example.comm.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode{


    QUESTION_NOT_FOUND(2001,"你找的问题不在了，换一个试试"),
    TARGET_PARAM_NOT_FOUND(2002,"未选中任何问题或评论进行回复"),
    NO_LOGIN(2003,"未登录，当前操作不可进行"),
    SYS_ERROR(2004,"服务器冒烟了，请稍后再试"),
    COMMENT_NOT_FOUND(2006,"回复的评论不存在"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或者不存在");
    @Override
    public String getMessage(){
        return  message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    private Integer code;
    private String message;


    CustomizeErrorCode(Integer code,String message)
    {
        this.message=message;
        this.code=code;
    }


}
