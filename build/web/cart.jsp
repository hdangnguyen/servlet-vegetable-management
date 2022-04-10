<%-- 
    Document   : cart
    Created on : Mar 11, 2022, 4:46:34 PM
    Author     : haida
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">
    <jsp:include page="header.jsp"></jsp:include>
        <!-- Breadcrumb Section Begin -->
        <section class="breadcrumb-section set-bg" data-setbg="img/breadcrumb.jpg">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <div class="breadcrumb__text">
                            <h2>Shopping Cart</h2>
                            <div class="breadcrumb__option">
                                <a href="./index.html">Home</a>
                                <span>Shopping Cart</span>
                            <c:if test="${requestScope.MESSAGE != null}">
                                <div class="alert alert-danger" style =  "position: fixed;
                                     bottom: 10px;
                                     right: 30%; z-index: 10;height:40px;padding-bottom:10px;width:30%;">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">
                                        ×</button>
                                    <span style="font-size: 15px; color: #D62D2D" class="glyphicon glyphicon-remove"></span> 
                                    <span style="font-size: 15px; color: #D62D2D"> ${requestScope.MESSAGE} </span>
                                </div>   
                            </c:if>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Breadcrumb Section End -->

    <!-- Shoping Cart Section Begin -->
    <section class="shoping-cart spad">
        <div class="container">

            <!-- Featured ALERT end -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="shoping__cart__table">
                        <table>
                            <thead>
                                <tr>
                                    <th class="shoping__product">Products</th>
                                    <th>Price</th>
                                    <th>Quantity</th>
                                    <th>Total</th>

                                </tr>
                            </thead>
                            <tbody>

                                <c:set var="total" scope="request" value="${0}"/>
                                <c:forEach items="${sessionScope.CART.getCart().values()}" varStatus="counter" var="o">
                                <form action="MainController" method="get">
                                    <tr>
                                        <td class="shoping__cart__item">
                                            <img class="img-responsive" width="90" height="90" src="${o.image}" alt="">
                                            <h5>${o.productName}</h5>
                                            <input type="hidden" name="productID" value="${o.productID}"/>
                                        </td>
                                        <td class="shoping__cart__price">
                                            ${o.price}đ
                                        </td>
                                        <td class="shoping__cart__quantity">
                                            <div class="quantity">
                                                <div class="pro-qty">
                                                    <input name="quantity" value="${o.quantity}">
                                                </div>
                                            </div>
                                        </td>
                                        <td class="shoping__cart__total">
                                            ${o.quantity*o.price}đ
                                        </td>
                                        <c:set var="total" scope="request" value="${total+o.price*o.quantity}"/>
                                        <c:set var="VAT" scope="request" value="${total*(1.5/100)}"/>
                                        <c:set var="FinalTotal" scope="request" value="${total+VAT}"/>
                                        <td class="shoping__cart__item__close">
                                            <span><button style="padding: 7px 15px; font-size: 20px; margin-right: 10px" type="submit" name="action" value="Edit" class="icon_loading btn btn-dark"></span>
                                        </td>
                                        <td class="shoping__cart__item__close">
                                            <span><button style="padding: 7px 15px; font-size: 20px;" type="submit" name="action" value="Remove" class="icon_close btn btn-warning"></span>
                                        </td>
                                    </tr>
                                </form>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <div class="shoping__cart__btns">
                        <a href="HomeController" class="primary-btn cart-btn btn btn-light">CONTINUE SHOPPING</a>
                    </div>
                </div>
                <div class="col-lg-6"></div>

                <div class="col-lg-6">
                    <div class="shoping__checkout">
                        <h5>Cart Total</h5>
                        <ul>
                            <li>VAT 1.5% <span>${VAT}$</span></li>
                            <li>Total <span>${FinalTotal}$</span></li>
                        </ul>
                        <a href="MainController?action=Purchase" class="primary-btn">PROCEED TO CHECKOUT</a>
                    </div>
                </div>
            </div>
            <!-- Featured ALERT Begin -->

        </div>
    </section>
    <!-- Shoping Cart Section End -->

    <jsp:include page="footer.jsp"></jsp:include>
</body>

</html>
