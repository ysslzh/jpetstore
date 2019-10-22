<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/10/11
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="../common/InlcudeTop.jsp"%>


<div id="Content">

    <div id="Welcome">
        <div id="WelcomeContent">
            Welcome to MyPetStore!
        </div>
    </div>

    <div id="Main">
        <div id="Sidebar">
            <div id="SidebarContent">
    <c:forEach var="item" items="${sessionScope.categoryList}">
        <a href="/productlist?categoryId=${item.getCategoryId()}">${item.getName()}</a>
        <br/>简介： ${item.getDescription()} <br/>
    </c:forEach>
            </div>
        </div>
        <div id="MainImage">
        <div id="MainImageContent">
            <map name="estoremap">
<%--                <c:forEach var="item" items="${sessionScope.categoryList}">--%>
<%--                    <area alt="${item.getName()}" coords="72,2,280,250" href="/productlist?categoryId=${item.getCategoryId()}" shape="rect" />--%>
<%--                </c:forEach>--%>
                <area alt="Birds" coords="72,2,280,250" href="Category.html" shape="rect" />
                <area alt="Fish" coords="2,180,72,250" href="Category.html" shape="rect" />
                <area alt="Dogs" coords="60,250,130,320" href="Category.html" shape="rect" />
                <area alt="Reptiles" coords="140,270,210,340" href="Category.html" shape="rect" />
                <area alt="Cats" coords="225,240,295,310" href="Category.html" shape="rect" />
                <area alt="Birds" coords="280,180,350,250" href="Category.html" shape="rect" />
            </map>
            <img height="355" src="../../../static/images/splash.gif" align="middle" usemap="#estoremap" width="350" />
        </div>
        </div>
        <div id="Separator">&nbsp;</div>
    </div>


</div>

<%@include file="../common/IncludeBottom.jsp"%>
