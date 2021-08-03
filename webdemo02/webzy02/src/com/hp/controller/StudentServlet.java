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
import java.util.*;

@WebServlet(name = "StudentServlet",urlPatterns = "/StudentServlet")
public class StudentServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.解决乱码
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("utf-8");

        //去自已 创建一个layui 后台的json格式
        List<Student> students=new ArrayList<>();
        for (int i = 1; i <16 ; i++) {
            Student student = new Student();
            Random random = new Random();
            student.setId(i);
            student.setName(random.nextInt(40)+"软件");
            student.setAge(random.nextInt(100));
            student.setClazz("软件技术"+random.nextInt(10)+"班");
            students.add(student);
        }
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
