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
                            <h2>Checkout</h2>
                            <div class="breadcrumb__option">
                                <a href="./index.html">Home</a>
                                <span>Checkout</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Breadcrumb Section End -->

        <!-- Checkout Section Begin -->
        <section class="checkout spad">
            <div class="container">
                <div class="row">
                </div>
                <div class="checkout__order" style="width:50%; margin: auto">
                    <form action="MainController" method="get">
                        <h4>Your Order</h4>
                        <div class="checkout__order__products">Products <span>Quantity</span> <span style="margin-right: 40px">Total</span></div>

                    <c:set var="total" scope="request" value="${0}"/>
                    <c:forEach items="${sessionScope.CART.getCart().values()}" varStatus="counter" var="o">
                        <ul>
                            <li>${o.productName}  <span>$ ${o.price}</span> <span style="font-size: 15px; margin-right: 60px;">${o.quantity}Kg</span></li>
                        </ul>
                        <c:set var="total" scope="request" value="${total+o.price*o.quantity}"/>
                        <c:set var="VAT" scope="request" value="${total*(1.5/100)}"/>
                        <c:set var="FinalTotal" scope="request" value="${total+VAT}"/>
                    </c:forEach>

                    <div class="checkout__order__subtotal">VAT 1.5% <span>${VAT}$</span></div>
                    <div class="checkout__order__total">Total <span>${FinalTotal}$</span></div>

                    <p>Check cart items before submitting purchase. When you submit purchase, you can not undo the action.</p>
                    <button type="submit" name="action" value="SubmitCheckout" class="site-btn">PLACE ORDER</button>
                    <button type="submit" name="action" value="ViewCart" class="btn">Back to cart</button>
                </form>
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
            </div>
        </div>
    </div>
</section>
<jsp:include page="footer.jsp"></jsp:include>
</body>

</html>
<!-- Checkout Section End -->