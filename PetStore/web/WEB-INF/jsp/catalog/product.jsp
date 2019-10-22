<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/10/18
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/InlcudeTop.jsp"%>

<div>
    <h1>${sessionScope.product.name}</h1>
    <div>
        <table>
            <tr>
                <td>ID</td>
                <td>${sessionScope.product.getProductId()}</td>
            </tr>
            <tr>
                <td>种类</td>
                <td></td>
            </tr>
            <tr>
                <td>名字</td>
                <td>${sessionScope.product.getName()}</td>
            </tr>
        </table>
    </div>

</div>

<%@include file="../common/IncludeBottom.jsp"%>