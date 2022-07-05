
<%@include file="/common/taglib.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
    <head>
        <!-- Site meta -->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Site meta -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Free Bootstrap 4 Ecommerce Template</title>
        <!-- CSS -->
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,300,600" rel="stylesheet" type="text/css">
        <link href="<c:url value="/theme/web/css/style.css" />" rel="stylesheet" type="text/css">
    </head>
    <body>

        <%@include file="/common/web/header.jsp" %>
        <section class="jumbotron text-center">
            <div class="container">
                <h1 class="jumbotron-heading text-danger">Giỏ Hàng</h1>
            </div>
        </section>
        <div class="container mb-4">
            <div class="row">
                <div class="col-12">
                    <div class="table-responsive">
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th scope="col"> </th>
                                    <th scope="col">Product</th>
                                    <th scope="col">Available</th>
                                    <th scope="col" class="text-left">Quantity</th>
                                    <th scope="col" class="text-left">Price</th>
                                    <th> </th>
                                </tr>
                            </thead>
                            <tbody>
                                <!--                        <tr>
                                                            <td><img src="https://dummyimage.com/50x50/55595c/fff" /> </td>
                                                            <td>Product Name Dada</td>
                                                            <td>In stock</td>
                                                           
                                                            <td><input class="form-control col-md-6 text-center" type="number" min="1" max="1000" value="1"/></td>
                                                            <td class="text-left">124,90 €</td>
                                                            <td class="text-right"><button class="btn btn-sm btn-danger"><i class="fa fa-trash"></i> </button> </td>
                                                        </tr>-->

                                <c:set var="crt" scope="session" value="${cart}"/>
                                <c:if test="${crt != null}">
                                    <c:forEach var="shop" items="${crt}">
                                        <tr>
                                            <td><img src="<c:url value="${shop.value.product.image}"/>" width="65" height="65"/> </td>
                                            <td>${shop.value.product.name}</td>
                                            <td>In stock</td>

                                            <td><input class="form-control col-md-6 text-center" type="number" min="1" max="1000" value="${shop.value.quantity}"/></td>
                                            <td class="text-left">${shop.value.product.price} đ</td>
                                            <td class="text-right"><button class="btn btn-sm btn-danger"><i class="fa fa-trash"></i> </button> </td>
                                        </tr>
                                    </c:forEach>
                                </c:if>


                                <tr>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td>Sub-Total</td>
                                    <td class="text-right">255,90 €</td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td>Shipping</td>
                                    <td class="text-right">6,90 €</td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td><strong>Total</strong></td>
                                    <td class="text-right"><strong>346,90 €</strong></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div class="col mb-2">
                    <div class="row">
                        <div class="col-sm-12  col-md-6">
                            <a class="btn btn-lg btn-block btn-danger text-white" href="<c:url  value="/product"><c:param name="action" value="loadAllProduct"/></c:url>">Continue Shopping</a>
                        </div>
                        <div class="col-sm-12 col-md-6 text-right">
                            <form method="post" action="checkout">
                                <button name="action" value="checkout" type="submit" class="btn btn-lg btn-block btn-success text-uppercase">Checkout</button>
                            </form>
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <!-- Footer -->
        <%@include file="/common/web/footer.jsp" %>



        <!-- JS -->


        <!-- JS -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" type="text/javascript"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" type="text/javascript"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" type="text/javascript"></script>

    </body>
</html>
