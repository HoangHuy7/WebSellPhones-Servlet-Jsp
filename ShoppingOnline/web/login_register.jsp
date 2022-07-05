<%-- 
    Document   : login_register
    Created on : Jun 2, 2022, 1:01:16 AM
    Author     : LENOVO
--%>
<%@include file="common/taglib.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,300,600" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="<c:url value="/theme/login_register/style.css"/>">
    </head>

    <body class="bg-light">
        <%@include file="/common/web/header.jsp" %>

        <div class="container">


            <div class="login-wrap">
                <div class="login-html">
                    <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Sign
                        In</label>
                    <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Sign Up</label>

                    <div class="login-form">
                        <form action="<c:url value="/login"/>" method="post">
                            <div class="sign-in-htm">
                                <div class="group">
                                    <label for="user" class="label">Username</label>
                                    <input id="user" name="userName" type="text" class="input" placeholder="Type username">
                                </div>
                                <div class="group">
                                    <label for="pass" class="label">Password</label>
                                    <input id="pass" name="password" type="password" class="input" data-type="password">
                                </div>
                                <div class="group">
                                    <input id="check" type="checkbox" class="check" checked>
                                    <label for="check"><span class="icon"></span> Keep me Signed in</label>
                                </div>
                                <button type="submit" name="action" value="login" class="btn btn-primary" >Đăng nhập</button>
                                <div class="hr"></div>
                                <div class="foot-lnk">
                                    <a href="#forgot">Forgot Password?</a>
                                </div>
                            </div>
                        </form>
                        <form action="register" method="post">
                            <div class="sign-up-htm">
                                <div class="group">
                                    <label for="user" class="label">Username</label>
                                    <input id="user" type="text" class="input">
                                </div>
                                <div class="group">
                                    <label for="pass" class="label">Password</label>
                                    <input id="pass" type="password" class="input" data-type="password">
                                </div>
                                <div class="group">
                                    <label for="pass" class="label">Repeat Password</label>
                                    <input id="pass" type="password" class="input" data-type="password">
                                </div>
                                <div class="group">
                                    <label for="pass" class="label">Email Address</label>
                                    <input id="pass" type="text" class="input">
                                </div>
                                <div class="group">
                                    <input type="submit" class="button" value="Sign Up">
                                </div>
                                <div class="hr"></div>
                                <div class="foot-lnk">
                                    <label for="tab-1">Already Member?</a>
                                </div>
                            </div>
                        </form>


                    </div>
                </div>
            </div>
        </div>


        <!-- Footer -->
        <%@include file="/common/web/footer.jsp" %>
    </body>

</html>