<%-- 
    Document   : header
    Created on : Mar 12, 2022, 3:50:38 PM
    Author     : haida
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>




    <head>
        <meta charset="UTF-8">
        <meta name="description" content="Ogani Template">
        <meta name="keywords" content="Ogani, unica, creative, html">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Ogani | Template</title>

        <!-- Google Font -->
        <link href="http://fonts.googleapis.com/css?family=Lato:100italic,100,300italic,300,400italic,400,700italic,700,900italic,900" rel="stylesheet" type="text/css">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <!-- Css Styles -->
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
        <link rel="stylesheet" href="css/nice-select.css" type="text/css">
        <link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css">
        <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
        <link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
        <link rel="stylesheet" href="css/style.css" type="text/css">
        <style>

        </style>
    </head>
        <body>
        
        <header class="header">
            <div class="header__top">
                <div class="container">
                    <div class="row">

                        <div class="col-lg-6 col-md-6">
                            <div class="header__top__right">
                            </div>
                        </div>
                    </div>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-lg-3">
                            <div class="header__logo">
                                <a href="HomeControllerl"><img src="img/logo.png" alt=""></a>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <nav class="header__menu">
                                <ul>
                                    <li class="active"><a href="SearchController?search=&action=Search#">Home</a></li>
                                    <li><a href="#">Pages</a>
                                        <ul class="header__menu__dropdown">
                                            <li><a href="MainController?action=Logout">Logout</a></li>
                                            <li><a href="MainController?action=ViewCart">Shoping Cart</a></li>
                                            <li><a href="./checkout.html">Check Out</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </nav>
                        </div>

                        <div class="col-lg-3">
                            <div class="header__cart">
                                <ul>
                                    <form action="MainController" method="POST">
                                        <li><button type="submit" name="action" value="Logout" class="btn btn-link"><i style="font-size: 20px; color: #3b3b3b" class="fa fa-sign-in"></i></button></li>
                                        <li><button type="submit" name="action" value="ViewCart" class="btn btn-link" ><i style="font-size: 20px; color: #7fad39" class="fa fa-shopping-cart"></i></button></li>
                                    </form>
                                    <c:set var="total" scope="request" value="${0}"/>
                                    <c:forEach items="${sessionScope.CART.getCart().values()}" varStatus="counter" var="o">
                                            <c:set var="total" scope="request" value="${total+o.price*o.quantity}"/>
                                            <c:set var="VAT" scope="request" value="${total*(1.5/100)}"/>
                                            <c:set var="FinalTotal" scope="request" value="${total+VAT}"/>
                                </c:forEach>
                                </ul>
                                    <c:if test="${sessionScope.CART.getCart().values() != null}">
                                <div class="header__cart__price">item: <span>$ ${FinalTotal}đ</span></div>
                                </c:if>
                                    <c:if test="${sessionScope.CART.getCart().values() == null}">
                                <div class="header__cart__price">item: <span>$ 0đ</span></div>
                                </c:if>
                            </div>
                        </div>
                    </div>
                    <div class="humberger__open">
                        <i class="fa fa-bars"></i>
                    </div>
                </div>
        </header>