<%-- 
    Document   : user
    Created on : March 9, 2022, 4:40:26 PM
    Author     : haida
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="zxx">


        <jsp:include page="header.jsp"></jsp:include>
        <!-- Header Section Begin -->
        
        <!-- Header Section End -->

        <!-- Hero Section Begin -->
        <section class="hero">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="hero__search  row p-3">
                            <div class="hero__search__form col-lg-12">
                                <form action="#">
                                    <div class="hero__search__categories">
                                        Search All Product
                                    </div>
                                    <form action="MainController" method="POST">
                                        <input type="text" name="search" autocomplete="off" placeholder="What do you need?">
                                        <button type="submit" name="action" value="Search" class="site-btn">SEARCH</button>
                                    </form>

                                </form>
                            </div>
                        </div>
                        <div class="hero__item set-bg" data-setbg="img/hero/banner.jpg">
                            <div class="hero__text">

                                <c:if test="${sessionScope.Login_User != null}">
                                    <span>Welcome</span>
                                    <h3 style="font-weight: bold; font-size: 35px;">${sessionScope.Login_User.fullname}</h3>
                                    <p>to Fruit and Vegetable Shop</p>
                                    <a href="ViewCartController" class="primary-btn">VIEW CART</a>
                                </c:if>
                                <c:if test="${sessionScope.Login_User == null}">
                                    <span>Welcome</span>
                                    <h3 style="font-weight: bold; font-size: 35px;">You haven't login yet</h3>
                                    <p>Please login to shopping</p>
                                    <a href="LoginController" class="primary-btn">LOGIN</a>
                                </c:if>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Hero Section End -->
        <!-- Categories Section End -->

        <!-- Featured Section Begin -->
        <section class="featured p-4">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="section-title">
                            <h2 >Featured Product</h2>
                            <!-- Featured ALERT Begin -->
                            <c:if test="${requestScope.MESSAGE != null}">
                                <div class="alert alert-success " style = " position: fixed;
                                     bottom: 10px;
                                     right: 30%; z-index: 10;height:40px;padding-bottom:10px;width:40%;">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">
                                        ×</button>
                                    <span class="glyphicon glyphicon-ok"></span> 
                                    <span style="font-size: 15px; text-align: center"> ${requestScope.MESSAGE} </span>
                                </div>   
                            </c:if>
                            <!-- Featured ALERT end -->
                           
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-3">
                        <div class="hero__categories">
                            <div class="hero__categories__all">
                                <i class="fa fa-bars"></i>
                                <span>All departments</span>
                            </div>
                            <ul>
                                <li><a href="SearchController?search=&action=Search#">All</a></li>
                                    <c:forEach items="${List_Category}" var="o">
                                    <li><a href="Category?categoryID=${o.categoryID}">${o.categoryName}</a></li>
                                    </c:forEach>
                            </ul>
                        </div>
                    </div>
                    <div class="featured__filter col-lg-9">
                        <div class="row mix oranges fresh-meat">
                            <c:forEach items="${List_Product}" var="o">
                                <div class="featured__item col-lg-4 col-md-4 col-sm-6">
                                    <div class="featured__item__pic set-bg" data-setbg="${o.image}">
                                        <ul class="featured__item__pic__hover">
                                            <li><a style="width:40px; height: 40px;border-radius: 0px; font-weight: bold; box-shadow: rgba(149, 157, 165, 0.2) 0px 8px 24px;">${o.quantity}</i></a></li>
                                            <li><a style="width: 100px; border-radius: 0px;box-shadow: rgba(149, 157, 165, 0.2) 0px 8px 24px;" href="AddController?productID=${o.productID}"><i class="fa fa-shopping-cart"></i></a></li>
                                        </ul>
                                    </div>
                                    <div class="featured__item__text">
                                        <h6>${o.productName}</h6>
                                        <h5>${o.price}đ</h5>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                </div>


            </div>
            
        </section>
        <!-- Featured Section End -->

        <!-- Banner Begin -->
        <div class="banner">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 col-md-6 col-sm-6">
                        <div class="banner__pic">
                            <img src="img/banner/banner-1.jpeg" alt="">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-6">
                        <div class="banner__pic">
                            <img src="img/banner/banner-2.jpeg" alt="">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Banner End -->

        <jsp:include page="footer.jsp"></jsp:include>
            </body>
</html>