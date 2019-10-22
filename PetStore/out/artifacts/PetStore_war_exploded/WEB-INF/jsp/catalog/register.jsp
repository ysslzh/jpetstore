<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/10/18
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/InlcudeTop.jsp"%>

<div>
    <form action="/register" method="post">
        <table>
            <tr>
                <td>用户名：</td>
                <td><input type="text" name="username" id="username"/> </td>
            </tr>
            <tr>
                <td>
                    <%
                    String messgae=(String)session.getAttribute("message");
                    if (messgae!=null){
                        out.println(messgae);
                    }
                    %>
                </td>

            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="password" id="password"/> </td>
            </tr>
            <tr>
                <td>确认密码：</td>
                <td><input type="password" name="pwd" id="pwd"/> </td>
            </tr>
            <tr>
                <td>手机号：</td>
                <td><input type="text" name="phone" id="phone"/> </td>
            </tr>
            <tr>
                <td>email：</td>
                <td><input type="text" name="email" id="email"/> </td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="提交"/> </td>
            </tr>
        </table>
    </form>
</div>

<%@include file="../common/IncludeBottom.jsp"%>