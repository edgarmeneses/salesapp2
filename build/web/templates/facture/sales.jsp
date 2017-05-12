
<%@page import="com.salesapp.logic.entity.Product"%>
<%@page import="java.util.List"%>
<%-- 
    Document   : admin
    Created on : 28/03/2017, 01:59:53 PM
    Author     : EDGAR MENESES
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% List<Product> products = (List<Product>) session.getAttribute("products");%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, maximum-scale=1">

    <title>Dashboard</title>
    <link href="public/assets/css/beabdrum.css" rel="stylesheet">

    <link rel="icon" href="public/assets/img/favicon2.png" type="image/png">
    <link rel="shortcut icon" href="public/assets/img/favicon2.ico" type="img/x-icon">

    <link href='public/assets/fonts/fontmontserrat.css' rel='stylesheet' type='text/css'>
    <link href='public/assets/fonts/fonts.googleapis.css' rel='stylesheet' type='text/css'>


    <!-- Bootstrap core CSS     -->
    <link href="public/assets/css/bootstrap.min.css" rel="stylesheet" />

    <!-- Animation library for notifications   -->
    <link href="public/assets/css/animate.min.css" rel="stylesheet"/>

    <!--  Light Bootstrap Table core CSS    -->
    <link href="public/assets/css/light-bootstrap-dashboard.css" rel="stylesheet"/>


    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="public/assets/css/demo.css" rel="stylesheet" />


    <!--     Fonts and icons     -->
    <!--link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet"-->
    <link href="public/assets/css/font-awesome_1.css" rel="stylesheet">
     <link href="public/assets/css/font-awesome.min.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>
</head>
<body>

<div class="wrapper">
    <div class="sidebar" data-color="purple" data-image="public/assets/img/sidebar-6.jpg">

    <!--   you can change the color of the sidebar using: data-color="blue | azure | green | orange | red | purple" -->


    	<div class="sidebar-wrapper">
            <div class="logo">
                <a href="" class="simple-text">
                    Salesapp
                </a>
            </div>

            <ul class="nav">
               
                
                <li class="active">
                    <a>
                        <i class="fa fa-shopping-cart" aria-hidden="true"></i>
                        <p>Facturación</p>
                    </a>
                </li>
		<li class="active-pro">
                    <a href="">
                        <img src="public/assets/img/logo.png" alt="" height="10%" width="10%">
                    </a>
                </li>
            </ul>
    	</div>
    </div>

    <div class="main-panel">
        <nav class="navbar navbar-default navbar-fixed">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navigation-example-2">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="/">Facturación</a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-left">
                        <li>
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="fa fa-dashboard"></i>
                            </a>
                        </li>
                    </ul>

                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="#">
                                Log out
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        
        <div class="breadcrumb2">
            <div class="btn-group btn-breadcrumb btn-fill">
                <a href="" class="btn btn-info btn-fill""><i class="fa fa-home"></i></a>
                <!--a href="#" class="btn btn-primary btn-fill"">Snippets</a>
                <a href="#" class="btn btn-primary btn-fill"">Breadcrumbs</a>
                <a href="#" class="btn btn-info btn-fill">Success</a-->
            </div>
        </div>


        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="header">
                                 <h4 class="title">Cliente</h4>
                            </div>
                            <div class="content">
                                <form>
                                    <div class="row">
                                        
                                        <div class="col-md-12">
                                            <div class="form-group">
                                                <label>Cedula del cliente</label>
                                                <input type="text" class="form-control" placeholder="70357898" >

                                            </div>

                                            <button type="submit" class="btn btn-primary btn-fill pull-right">Buscar Cliente</button>
                                        </div>

                                        
                                    </div>

                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label>Nombre </label>
                                                <input type="text" class="form-control" placeholder="" value="">
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label>Apellido</label>
                                                <input type="text" class="form-control" placeholder="" value="">
                                            </div>
                                        </div>

                                         
                                    </div>

                                    <div class="row">

                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label>Telefono</label>
                                                <input type="text" class="form-control" placeholder="" value="">
                                            </div>
                                        </div>

                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label>Dirección</label>
                                                <input type="text" class="form-control" placeholder="" value="">
                                            </div>
                                        </div>

                                    </div>

                                    <h4 class="title">Productos</h4>
                                     
                                    <div class="col-md-12">
                                            <div class="form-group">
                                                
                                                
                                                <label>Nombre del producto</label>
                                                <select class="form-control" id="selectOptions">
                                                <option selected="selected" disabled> Seleccione un producto...</option>
                                                <% for (Product product : products) { %> 
                                                <option value="<%= product.getName() %>"> <%= product.getName() %>  </option>
                                                 <% } %> 
                                                </select>

                                            </div>

                                            <input id="add" type="button" class="btn btn-primary btn-fill pull-right" value="Agregar producto">
                                    </div>

                                    <div class="content">
                                         <table name="table" id="table" class="table table-hover table-striped">
                                            <thead>
                                                <tr>
                                                    <th>Nombre producto</th>
                                                    <th>Cantidad</th>
                                                    <th>Precio</th>
                                                </tr>
                                            </thead>
                                    
                                            <tbody>
                                        
                                            </tbody>
                                        </table>
                                
                                    </div>
                                    
                                     <button type="submit" class="btn btn-primary btn-fill pull-right">Facturar</button>
                                    
                                    <div class="clearfix"></div>
                                </form>
                            </div>
                        </div>
                    </div>
                    

                </div>
            </div>
        </div>


        <footer class="footer">
            <div class="container-fluid">
                <nav class="pull-left">
                    <ul>
                        <li>
                            <a href="">
                                Home
                            </a>
                        </li>
                        <li>
                            <a href="admin">
                                Dashboard
                            </a>
                        </li>
                    </ul>
                </nav>
                <p class="copyright pull-right">
                    &copy; <a href="http://www.creative-tim.com">Creative Tim and EMC</a>, All Rights Reserved
                </p>
            </div>
        </footer>

    </div>
</div>


</body>

    <!--   Core JS Files   -->
    <script src="public/assets/js/jquery-1.9.1.js" type="text/javascript"></script>
    <script src="public/assets/js/bootstrap.min.js" type="text/javascript"></script>

    <!--  Checkbox, Radio & Switch Plugins -->
    <script src="public/assets/js/bootstrap-checkbox-radio-switch.js"></script>

    <!--  Charts Plugin -->
    <script src="public/assets/js/chartist.min.js"></script>

    <!--  Notifications Plugin    -->
    <script src="public/assets/js/bootstrap-notify.js"></script>

    <!-- Light Bootstrap Table Core javascript and methods for Demo purpose -->
    <script src="public/assets/js/light-bootstrap-dashboard.js"></script>

    <!-- Light Bootstrap Table DEMO methods, don't include it in your project! -->
    <script src="public/assets/js/demo.js"></script>
    
    <script>
        $(document).ready(function (){
            $("#add").click(function (){
                var inputQuantity = '<input type="text" class="form-control" placeholder="Ingrese la cantidad..." value="">';
                var inputPrice = '<input type="text" class="form-control" placeholder="Ingrese el precio" value="">';
                var inputProduct = '<input type="text" class="form-control" placeholder="" value="'+ $("#selectOptions option:selected").text() +'" disabled>';
               $("#table").append(" <tr> "+
                                    "<th>"+ inputProduct+ "</th>"+
                                    "<th>"+ inputQuantity +"</th>"+
                                    "<th>"+inputPrice+"</th>"+
                                "</tr>") //$("#productoSelected").val()
            });
        })
    </script>
</html>