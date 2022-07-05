
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
        <link href="<c:url value="/theme/web/css/info_order.css" />" rel="stylesheet" type="text/css">
    </head>
    <body>

        <%@include file="/common/web/header.jsp" %>
        <div class="container-fluid">
            <div style="margin-top: 50px"></div>
            <div class="row">
                <div class="col">
                    <div class="card">
                        <div class="title">Thông tin đơn hàng</div>

                        <div class="info">
                            <div class="row-5">
                                <div class="col">
                                    <span id="heading">Mã đơn hàng</span><br>
                                    <span id="details">012j1gvs356c</span>
                                </div>
                            </div>
                            <div class="row-5 mt-4">
                                <div class="col">
                                    <div class="form-outline">
                                        <textarea class="form-control" id="textAreaExample2" rows="8">Trân huy &#13;&#10;0982738308 &#13;&#10;176 - nguyễn thị thập &#13;&#10;Bình thuận - quận 7 &#13;&#10;tp hcm &#13;&#10;Phương thức thanh toán&#13;&#10;Thanh toán khi giao hàng (COD) </textarea>

                                    </div>
                                </div>
                            </div>


                        </div>





                    </div>
                </div>
                <div class="col">
                    <div class="card">
                        <div class="title">Chi tiết đơn hàng</div>
                        <div class="info">
                            <div class="row">
                                <div class="col-7">
                                    <span id="heading">Ngày đặt</span><br>
                                    <span id="details">10 October 2018</span>
                                </div>
                                <div class="col-5 pull-right">
                                    <span id="heading">Mã đơn hàng</span><br>
                                    <span id="details">012j1gvs356c</span>
                                </div>
                            </div>
                        </div>
                        <div class="pricing">

                            <div class="row">
                                <div class="col">
                                    <span id="name" class="text-danger">Iphone 11</span>
                                </div>
                                <div class="col">

                                    <img src="https://product.hstatic.net/1000026716/product/laptop-msi-modern-14-b11mou-1028vn_1a6c3972f3de4fbc9070eca8914ffa55_small.jpg"
                                         alt="">

                                </div>
                                <div class="col">
                                    <span id="price">&pound;299.99</span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col">
                                    <span id="name">Shipping</span>
                                </div>
                                <div class="col-4">
                                    <span id="price">&pound;33.00</span>
                                </div>
                            </div>
                        </div>
                        <div class="total">
                            <div class="row">
                                <div class="col"></div>
                                <div class="col-4"><big>&pound;262.99</big></div>
                            </div>
                        </div>
                        <div class="tracking">
                            <div class="title">Quá trình vận chuyển</div>
                        </div>
                        <div class="progress-track">
                            <ul id="progressbar">
                                <li class="step0 active " id="step1">Ordered</li>
                                <li class="step0 active text-center" id="step2">Shipped</li>
                                <li class="step0 active text-right" id="step3">On the way</li>
                                <li class="step0 text-right" id="step4">Delivered</li>
                            </ul>
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
