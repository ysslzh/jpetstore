<%@ include file="../common/InlcudeTop.jsp"%>


<div id="BackLink">
    <a href="/main">返回首页</a>
</div>

<h2>
    ${sessionScope.category.getName()}
</h2>

<table>
    <tr>
        <td>Product ID</td>
        <td>Name</td>
    </tr>
    <c:forEach var="product" items="${sessionScope.productList}">
        <tr>
            <td>${product.productId}</td>
            <td><a href="/product?productId=${product.productId}">${product.name}</a></td>
            <td></td>
        </tr>
    </c:forEach>
</table>

<%@ include file="../common/IncludeBottom.jsp"%>