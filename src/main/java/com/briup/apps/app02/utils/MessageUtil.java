package com.briup.apps.app02.utils;
import java.util.Date;

public class MessageUtil {
    public static Message success(String msg){
        /**
         * 返回成功消息，一般用户增删改操作用到
         */
        Message message = new Message();
        message.setStatus(200);
        message.setMessage(msg);
        message.setTimestamp(new Date().getTime());
        return message;
    }
    public static Message success(String msg,Object data){
        /**
         * 返回成功消息，一般用户查询操作用到
         */
        Message message = new Message();
        message.setStatus(200);
        message.setMessage(msg);
        message.setData(data);
        message.setTimestamp(new Date().getTime());
        return message;
    }
    public static Message error(String msg){
        /**
         * 返回失败消息，一般用户增删改操作用到
         */
        Message message = new Message();
        message.setStatus(500);
        message.setMessage(msg);
        message.setTimestamp(new Date().getTime());
        return message;
    }
}
