package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author laiming
 * @describ
 * @create 2020-06-11:27
 */
@Service
//@Scope("prototype")
public class AlphaService {
     @Autowired
      private AlphaDao alphaDao;
    @PostConstruct
    public void init(){
        System.out.println("初始化AlphaService");
    }

    public AlphaService(){
        System.out.println("实例化AlphaService");
    }
    public void destory(){
        System.out.println("销毁AlphaService");
    }
    public String find(){
        return alphaDao.select();
    }
}
