
<%@include file="/common/taglib.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Dashboard - SB Admin</title>
        <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
        <link href="<c:url value="/theme/admin/css/styles.css" />" rel="stylesheet" />
        <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    </head>
    <body class="sb-nav-fixed">
        <nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
            <!-- Navbar Brand-->
            <a class="navbar-brand ps-3" href="admin">Home</a>
            <!-- Sidebar Toggle-->
            <button class="btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0" id="sidebarToggle" href="#!"><i class="fas fa-bars"></i></button>
            <!-- Navbar Search-->
            <form class="d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0">
                <div class="input-group">
                    <input class="form-control" type="text" placeholder="Search for..." aria-label="Search for..." aria-describedby="btnNavbarSearch" />
                    <button class="btn btn-primary" id="btnNavbarSearch" type="button"><i class="fas fa-search"></i></button>
                </div>
            </form>
            <!-- Navbar-->
            <ul class="navbar-nav ms-auto ms-md-0 me-3 me-lg-4">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false"><i class="fas fa-user fa-fw"></i></a>
                    <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="#!">Settings</a></li>
                        <li><a class="dropdown-item" href="#!">Activity Log</a></li>
                        <li><hr class="dropdown-divider" /></li>
                        <li><a class="dropdown-item" href="logout">Logout</a></li>
                    </ul>
                </li>
            </ul>
        </nav>
        <div id="layoutSidenav">
            <div id="layoutSidenav_nav">
                <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
                    <div class="sb-sidenav-menu">
                        <div class="nav">
                            <div class="sb-sidenav-menu-heading">Sản phẩm</div>
                            <a class="nav-link" href="admin">
                                <div class="sb-nav-link-icon"><i class="fas fa-tachometer-alt"></i></div>
                                Danh sách sản phẩm
                            </a>
                            <a class="nav-link" href="admin">
                                <div class="sb-nav-link-icon"><i class="fas fa-tachometer-alt"></i></div>
                                Category
                            </a>
                            <a class="nav-link" href="admin">
                                <div class="sb-nav-link-icon"><i class="fas fa-tachometer-alt"></i></div>
                                Nhà cung cấp
                            </a>
                            <a class="nav-link" href="admin">
                                <div class="sb-nav-link-icon"><i class="fas fa-tachometer-alt"></i></div>
                                Thương hiệu
                            </a>

                            <div class="sb-sidenav-menu-heading">Doanh thu, Order </div>
                            <a class="nav-link" href="admin">
                                <div class="sb-nav-link-icon"><i class="fas fa-tachometer-alt"></i></div>
                                Doanh thu
                            </a>
                            <a class="nav-link" href="admin">
                                <div class="sb-nav-link-icon"><i class="fas fa-tachometer-alt"></i></div>
                                Tình trạng đơn hàng
                            </a>
                            <a class="nav-link" href="admin">
                                <div class="sb-nav-link-icon"><i class="fas fa-tachometer-alt"></i></div>
                                Lịch sử đơn hàng
                            </a>



                        </div>
                    </div>
                    <div class="sb-sidenav-footer">
                        <div class="small">Logged in as:</div>
                        Start Bootstrap
                    </div>
                </nav>
            </div>

            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid px-4">
                        <h1 class="mt-4">Dashboard</h1>



                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-table me-1"></i>
                                List Product
                            </div>
                            <div class="card-title col-3 mb-2 mt-4 ml-2">
                                <div class="btn-group">
                                    <button type="button" class="btn btn-danger">Action</button>
                                    <button type="button" class="btn btn-danger dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        <span class="sr-only">Toggle Dropdown</span>
                                    </button>
                                    <div class="dropdown-menu">
                                        <a class="dropdown-item" href="#">Action</a>
                                        <a class="dropdown-item" href="#">Another action</a>
                                        <a class="dropdown-item" href="#">Something else here</a>
                                        <div class="dropdown-divider"></div>
                                        <a class="dropdown-item" href="#">Separated link</a>
                                    </div>
                                </div>
                                <div class="btn-group">
                                    <button type="button" class="btn btn-danger">Action</button>
                                    <button type="button" class="btn btn-danger dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        <span class="sr-only">Toggle Dropdown</span>
                                    </button>
                                    <div class="dropdown-menu">
                                        <a class="dropdown-item" href="#">Action</a>
                                        <a class="dropdown-item" href="#">Another action</a>
                                        <a class="dropdown-item" href="#">Something else here</a>
                                        <div class="dropdown-divider"></div>
                                        <a class="dropdown-item" href="#">Separated link</a>
                                    </div>
                                </div>
                            </div>

                            <a class="text-white card-title mb-2 mt-2 ml-4 btn btn-primary col-3" href="" data-toggle="modal" data-target="#AddProduct">
                                <i class="fas fa-table me-1"></i> Thêm sản phẩm</a>

                            <div class="card-body">

                                <table id="datatablesSimple" >
                                    <thead>
                                        <tr class="text-center">
                                            <th>ID</th>
                                            <th >Name</th>
                                            <th>Image</th>
                                            <th>price</th>  
                                            <th>Quantity</th>
                                            <th>Status</th>
                                            <th class="text-danger">Delete</th>
                                            <th class="text-primary">Update</th>
                                            <th>check</th>
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>                                         
                                            <th>ID</th>
                                            <th>Name</th>
                                            <th>Image</th>
                                            <th>price</th>
                                            <th>Quantity</th>
                                            <th>Status</th>
                                            <th>Supplier</th>
                                            <th>Delete</th>
                                            <th>Update</th>
                                        </tr>
                                    </tfoot>

                                    <tbody class="text-center">

                                        <c:forEach var="p" items="${listProductA}">
                                            <tr >
                                                <td>${p.productId}</td>
                                                <td class="text-left">${p.name}</td>
                                                <td><img src="<c:url value="${p.image}"/>" width="40" height="40"/></td>
                                                <td>${p.price}</td>
                                                <td>${p.quantity}</td>
                                                <td class="text-uppercase text-danger">${p.status == 1?"Còn hàng":"Hết hàng"}</td>
                                                <td><button class="btn btn-sm btn-danger"><i class="fa fa-trash"></i> </button></td>
                                                <td><button class="btn btn-sm btn-primary"><i class="fa fa-wrench"></i> </button></td>
                                                <td><input type="checkbox" value="" style="transform: scale(1.5);"></td>
                                            </tr>   
                                        </c:forEach>


                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </main>
                <footer class="py-4 bg-light mt-auto">
                    <div class="container-fluid px-4">
                        <div class="d-flex align-items-center justify-content-between small">
                            <div class="text-muted">Copyright &copy; Your Website 2022</div>
                            <div>
                                <a href="#">Privacy Policy</a>
                                &middot;
                                <a href="#">Terms &amp; Conditions</a>
                            </div>
                        </div>
                    </div>
                </footer>
            </div>
        </div>

        <!-- Modal image -->
        <div class="modal fade" id="AddProduct" tabindex="-1" role="dialog" aria-labelledby="productModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="productModalLabel">Product</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <form id="myForm" class="ml-3" method="post" action="admin">
                        <input type="hidden" value="addProduct" name="action">
                        <div class="form-group row ">
                            <label for="inputNameProduct" class="col-sm-2 col-form-label">Name</label>
                            <div class="col-sm-8">
                                <input type="text" name="nameP" class="form-control" id="inputNameProduct" placeholder="Type name">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="inputPriceProduct" class="col-sm-2 col-form-label">Price</label>
                            <div class="col-sm-8">
                                <input type="text" name="priceP" class="form-control" id="inputPriceProduct" placeholder="Type price">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="inputInventoryProduct" class="col-sm-2 col-form-label">Inventory</label>
                            <div class="col-sm-8">
                                <input type="text" name="inventoryP" class="form-control" id="inputInventoryProduct"  placeholder="Type inventory">
                            </div>
                        </div>
                        <div class="form-group row  ">
                            <label for="inputDescriptionsProduct" class="col-sm-2 col-form-label">Descriptions</label>
                            <div class="col-sm-8">
                                <textarea class="form-control" name="descriptionP" id="inputDescriptionsProduct" placeholder="Type Descpritions" rows="3"></textarea>
                            </div>

                        </div>
                        <div class="form-group row  ">
                            <label for="inputDetailProduct" class="col-sm-2 col-form-label">Detail</label>
                            <div class="col-sm-8">
                                <textarea class="form-control" name="detailP" id="inputDetailProduct" rows="3" placeholder="Type Detail"></textarea>
                            </div>

                        </div>

                        <div class="form-group row  ">
                            <label class="col-sm-2 col-form-label" for="inlineFormCustomSelect">Category</label>
                            <div class="col-sm-3">
                                <select class="custom-select mr-sm-2" id="inlineFormCustomSelect" name="categoryP">
                                    <c:if test="${listCateA != null}">
                                        <option value="-1" selected="">Chọn Loại hàng</option>
                                        <c:set var="noo" scope="session" value="${noo = -1}"/>
                                        <c:forEach var="data" items="${listCateA}">
                                            <option value="${noo = noo +1}" >${data.name}</option>
                                        </c:forEach>
                                    </c:if>
                                </select>
                            </div>
                        </div>
                        <div class="form-group row  ">
                            <label class="col-sm-2 col-form-label" for="inlineFormCustomSelect">Brand</label>
                            <div class="col-sm-3">
                                <select class="custom-select mr-sm-2" id="inlineFormCustomSelect" name="brandP">
                                    <c:if test="${listBrandA != null}">
                                        <option value="-1" selected="">Chọn nhà thương hiệu</option>
                                        <c:set var="noo" scope="session" value="${noo = -1}"/>
                                        <c:forEach var="data" items="${listBrandA}">
                                            <option value="${noo = noo +1}" >${data.name}</option>
                                        </c:forEach>
                                    </c:if>
                                </select>
                            </div>

                        </div>
                        <div class="form-group row  ">
                            <label class="col-sm-2 col-form-label" for="inlineFormCustomSelect">Supplier</label>
                            <div class="col-sm-3">
                                <select class="custom-select mr-sm-2" id="inlineFormCustomSelect" name="supplierP">

                                    <c:if test="${listSupplierA != null}">
                                        <option value="-1" selected="">Chọn nhà cung cấp</option>
                                        <c:set var="noo" scope="session" value="${noo = -1}"/>
                                        <c:forEach var="data" items="${listSupplierA}">
                                            <option value="${noo = noo +1}" >${data.name}</option>
                                        </c:forEach>
                                    </c:if>

                                </select>
                            </div>

                        </div>

                        <div class="form-group row  ">
                            <label for="inputInventoryProduct" class="col-sm-2 col-form-label">Image</label>
                            <div class="col-sm-3">
                                <input type="file" class="form-control-file" id="exampleFormControlFile1">
                            </div>
                        </div>
                        <div class="d-flex justify-content-center form-group ">
                            <div class="row col-3">  
                                <div class="col-3">
                                    <button id="submit" type="submit" class="btn btn-primary">Add</button>
                                </div>
                                <div class="col-3 ml-4">
                                    <button  type="submit" class="btn btn-danger">Cancel</button>
                                </div>
                            </div>
                        </div>
                    </form>

                </div>
            </div>
        </div>


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="<c:url value="/theme/admin/js/scripts.js" />"></script>
        <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
        <script src="<c:url value="/theme/admin/js/datatables-simple-demo.js" />"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
    </body>
</html>
