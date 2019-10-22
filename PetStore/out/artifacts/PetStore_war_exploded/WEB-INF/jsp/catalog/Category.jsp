<%@ include file="../common/InlcudeTop.jsp"%>

<script>
    function warning() {
        document.getElementsByTagName("img")[0].innerText="123312312321321321321321";
    }
</script>

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
            <td><button align="middle" name="img_cart" img="../../../static/images/cart.gif" action="warning"></button></td>
        </tr>
    </c:forEach>
</table>

<%@ include file="../common/IncludeBottom.jsp"%>