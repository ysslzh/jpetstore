<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/10/15
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../common/InlcudeTop.jsp"%>

<div align="center">
    <form action="/login" method="post">
        <table align="center">
            <tr>
                <td colspan="2" align="center">欢迎登录</td>
            </tr>
            <tr>
                <td>用户名：</td>
                <td><input type="text" name="username"/></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="password"/></td>
            </tr>
            <tr>
                <td style="color: red" colspan="2">
                    <%
                        String message = (String)session.getAttribute("message");
                        if(message!=null){
                            out.println(message);
                        }
                    %>
                </td>
            </tr>
            <tr>
                <td><input type="submit" value="登录" align="center"></td>
                <td><a href="/registerPage">注册</a></td>
            </tr>
        </table>
    </form>
</div>

<%@ include file="../common/IncludeBottom.jsp"%>