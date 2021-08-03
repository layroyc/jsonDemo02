package com.hp.controller;

import com.alibaba.fastjson.JSON;
import com.hp.bean.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "StudentServlet2",urlPatterns = "/StudentServlet2")
public class StudentServlet2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //1.解决乱码
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("utf-8");

        //去自已 创建一个layui 后台的json格式
        List<Student> students=new ArrayList<>();
        Student s1=new Student();
        s1.setId(1);
        s1.setName("大乔");
        s1.setAge(20);
        s1.setClazz("20网络");
        students.add(s1);

        Student s2=new Student();
        s2.setId(2);
        s2.setName("张三");
        s2.setAge(15);
        s2.setClazz("15网络");
        students.add(s2);

        Student s3=new Student();
        s3.setId(3);
        s3.setName("李四");
        s3.setAge(18);
        s3.setClazz("18通信");
        students.add(s3);

        Student s4=new Student();
        s4.setId(4);
        s4.setName("赵四");
        s4.setAge(19);
        s4.setClazz("19网络");
        students.add(s4);

        Student s5=new Student();
        s5.setId(5);
        s5.setName("小乔");
        s5.setAge(17);
        s5.setClazz("17网络");
        students.add(s5);

        Student s6=new Student();
        s6.setId(6);
        s6.setName("张飞");
        s6.setAge(18);
        s6.setClazz("18技术");
        students.add(s6);

        Student s7=new Student();
        s7.setId(7);
        s7.setName("赵云");
        s7.setAge(20);
        s7.setClazz("20通信");
        students.add(s7);

        Student s8=new Student();
        s8.setId(8);
        s8.setName("马可");
        s8.setAge(15);
        s8.setClazz("15大数据");
        students.add(s8);

        Student s9=new Student();
        s9.setId(9);
        s9.setName("马云");
        s9.setAge(18);
        s9.setClazz("18技术");
        students.add(s9);

        Student s10=new Student();
        s10.setId(10);
        s10.setName("鲁班");
        s10.setAge(20);
        s10.setClazz("20通信");
        students.add(s10);

        Student s11=new Student();
        s11.setId(19);
        s11.setName("安琪拉");
        s11.setAge(20);
        s11.setClazz("20网络");
        students.add(s11);

        Student s12=new Student();
        s12.setId(12);
        s12.setName("王源");
        s12.setAge(15);
        s12.setClazz("15网络");
        students.add(s12);

        Student s13=new Student();
        s13.setId(13);
        s13.setName("陆正安");
        s13.setAge(18);
        s13.setClazz("18通信");
        students.add(s13);

        Student s14=new Student();
        s14.setId(14);
        s14.setName("白敬亭");
        s14.setAge(19);
        s14.setClazz("19网络");
        students.add(s14);

        Student s15=new Student();
        s15.setId(5);
        s15.setName("马云");
        s15.setAge(17);
        s15.setClazz("17网络");
        students.add(s15);

        Map map = new HashMap<>();
        map.put("code",0);
        map.put("msg","滴滴");
        map.put("count",15);
        map.put("data",students);


        String s = JSON.toJSONString(map);//使用fastjson 的转换
        PrintWriter writer = resp.getWriter();
        writer.println(s);
        writer.close();
    }
}
