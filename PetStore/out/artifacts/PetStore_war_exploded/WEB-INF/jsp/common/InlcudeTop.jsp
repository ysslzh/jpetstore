<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/10/11
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <link rel="StyleSheet" href="../../../static/css/jpetstore.css" type="text/css"
          media="screen" />

    <meta name="generator"
          content="HTML Tidy for Linux/x86 (vers 1st November 2002), see www.w3.org" />
    <title>MyPetStore</title>
    <meta content="text/html; charset=windows-1252"
          http-equiv="Content-Type" />
    <meta http-equiv="Cache-Control" content="max-age=0" />
    <meta http-equiv="Cache-Control" content="no-cache" />
    <meta http-equiv="expires" content="0" />
    <meta http-equiv="Expires" content="Tue, 01 Jan 1980 1:00:00 GMT" />
    <meta http-equiv="Pragma" content="no-cache" />
</head>

<body>

<div id="Header">

<div id="Logo">
    <div id="LogoContent">
        <a href="main"><img src="../../../static/images/logo-topbar.gif" /></a>
    </div>
</div>

<div id="Menu">
    <div id="MenuContent">
        <a href="viewCart">
            <img align="middle" name="img_cart" src="../../../static/images/cart.gif" />
        </a>
        <img align="middle" src="../../../static/images/separator.gif" />
        <a href="/loginform">Sign In</a>
        <a href="#">Sign Out</a>
        <img align="middle" src="../../../static/images/separator.gif" />
        <a href="#">My Account</a>
        <img align="middle" src="../../../static/images/separator.gif" />
        <a href="../help.html">?</a>
    </div>
</div>

<div id="Search">
    <div id="SearchContent">
        <form action="search" method="post">
            <input type="text" name="keyword" size="14" />
            <input type="submit" name="searchProducts" value="Search" />
        </form>
    </div>
</div>

<div id="QuickLinks">

    <a href="category?categoryId=FISH">
        <img src="../../../static/images/sm_fish.gif" />
    </a>
    <img src="../../../static/images/separator.gif" />
    <a href="category?categoryId=DOGS">
        <img src="../../../static/images/sm_dogs.gif" />
    </a>
    <img src="../../../static/images/separator.gif" />
    <a href="category?categoryId=REPTILES">
        <img src="../../../static/images/sm_reptiles.gif" />
    </a>
    <img src="../../../static/images/separator.gif" />
    <a href="category?categoryId=CATS">
        <img src="../../../static/images/sm_cats.gif" />
    </a>
    <img src="../../../static/images/separator.gif" />
    <a href="category?categoryId=BIRDS">
        <img src="../../../static/images/sm_birds.gif" />
    </a>
</div>

</div>

<div>