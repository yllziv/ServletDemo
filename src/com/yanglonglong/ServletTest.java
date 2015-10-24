package com.yanglonglong;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletTest extends javax.servlet.http.HttpServlet {
    //��ʼ��
    public void init() throws ServletException {
        System.out.println("����init()�������������г�ʼ������");
    }
    //����GET����
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("GB2312");
        response.setContentType("text/plain;charset=GB2312");
        int a = new Integer(request.getParameter("a"));
        int b = new Integer(request.getParameter("b"));
        PrintWriter out = response.getWriter();// ��������out
        out.println(a + b);
        out.flush(); // ��ˢ������
        out.close(); // �ر����
    }
    //����POST����
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
    //����ʵ��
    public void destroy() {
        super.destroy();
        System.out.println("����destroy()������������������ʵ���Ĺ���");
    }
}