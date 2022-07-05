<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-expand-md navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand" href="home">HuyZone</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault">
            <ul class="navbar-nav m-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                </li>

                <li class="nav-item">

                    <a class="nav-link" href="<c:url value="/product"><c:param name="action" value="loadAllProduct"/></c:url>" >Product</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="product.html">About</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="contact.html">Contact</a>
                    </li>
                </ul>

                <form class="form-inline my-2 my-lg-0">
                    <div class="input-group input-group-sm">
                        <input type="text" class="form-control" placeholder="Search...">
                        <div class="input-group-append">
                            <button type="button" class="btn btn-secondary btn-number">
                                <i class="fa fa-search"></i>
                            </button>
                        </div>
                    </div>
                <c:set var="user" scope="session" value="${user}"/>
                <a onclick="${user == null?"alertCart()":""}" class="btn btn-success btn-sm ml-3" href="${user != null?"cart?action=viewCart":"#"}">
                    
                    <i class="fa fa-shopping-cart" ></i> Cart
                    <span class="badge badge-light">3</span>

                </a>
                <a href="<c:url value="/login"><c:param name="action" value="login"/></c:url>" class="btn btn-primary btn-sm ml-3 text-white ${user == null? "":"d-none"}">
                        <i class="fa fa-shopping-cart"></i> Login
                    </a>
                    <a href="<c:url value="/logout"><c:param name="action" value="logout"/></c:url>" class="btn btn-danger btn-sm ml-3 text-white ${user == null? "d-none":""}">
                    <i class="fa fa-shopping-cart"></i> Logout
                </a>
            </form>
        </div>
    </div>
</nav>

<div style="margin-top: 50px"></div>
<script>
    function alertCart() {
        alert("Ban chua dang nhap");
    }

</script>