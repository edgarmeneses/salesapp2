<%-- 
    Document   : admin
    Created on : 28/03/2017, 01:59:53 PM
    Author     : EDGAR MENESES
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.salesapp.logic.entity.Branch"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% ArrayList<Branch> branches = (ArrayList<Branch>) session.getAttribute("branches");%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, maximum-scale=1">

    <title>Sucursales</title>
    <link rel="icon" href="public/assets/img/favicon2.png" type="image/png">
    <link rel="shortcut icon" href="public/assets/img/favicon2.ico" type="img/x-icon">
    <link href="public/assets/css/beabdrum.css" rel="stylesheet">

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
                <a class="simple-text">
                    Salesapp
                </a>
            </div>

            <ul class="nav">
                <li>
                    <a href="admin">
                        <i class="fa fa-dashboard"></i>
                        <p>Dashboard</p>
                    </a>
                </li>
                <li>
                    <a href="places">
                        <i class="fa fa-globe"></i>
                        <p>Lugares</p>
                    </a>
                </li>
                <li class="active">
                    <a>
                        <i class="fa fa-building-o"></i>
                        <p>Sucursales</p>
                    </a>
                </li>
                <li>
                    <a href="suppliers">
                        <i class="fa fa fa-truck"></i>
                        <p>Proveedores</p>
                    </a>
                </li>
                <li>
                    <a href="users">
                        <i class="fa fa-users"></i>
                        <p>Usuarios</p>
                    </a>
                </li>
                <li>
                    <a href="categories">
                        <i class="fa fa-sitemap"></i>
                        <p>Categorias</p>
                    </a>
                </li>
                <li>
                    <a href="products">
                        <i class="fa fa-shopping-cart"></i>
                        <p>Productos</p>
                    </a>
                </li>
		          <li class="active-pro">
                    <a>
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
                    <a class="navbar-brand">Sucursales</a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-left">
                        <li>
                            <a class="dropdown-toggle" data-toggle="dropdown">
                                <i class="fa fa-building-o"></i>
                            </a>
                        </li>
                    </ul>

                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="/">
                                Log out
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>


        <div class="breadcrumb2">
            <div class="btn-group btn-breadcrumb btn-fill">
                <a href="admin" class="btn btn-primary btn-fill"><i class="fa fa-home"></i></a>
                <a class="btn btn-info btn-fill">Sucursales</a>
                <!--a href="#" class="btn btn-primary btn-fill"">Breadcrumbs</a>
                <a href="#" class="btn btn-info btn-fill">Success</a-->
            </div>
        </div>


        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="header">
                                <h4 class="title">Cargar sucursales</h4>
                            </div>
                            <div class="content">
                                
                                
                                 <form method="POST" action="branches" enctype="multipart/form-data">
                                     <div class="row">
                                         <div class="col-md-5 col-md-offset-0">
                                             <div class="form-group">
                                                 <label>Archivo lugares (csv)</label>
                                                 <input type="file" id="file" name="file" class="form-control" />
                                             </div>
                                         </div>
                                     </div>
                                    <button type="submit" class="btn btn-primary btn-fill pull-right">Enviar</button>
                                    <div class="clearfix"></div>
                                </form>
                            </div>
                        </div>

                        <div class="card">
                            <div class="header">
                                <h4 class="title">Lista sucursales</h4>
                            </div>
                            <div class="content">
                               
                                <table name="table" id="table" class="table table-hover table-striped">
                                    <thead>
                                      <tr>
                                        <th>NIT</th>
                                        <th>Nombre</th>
                                        <th>Dirección</th>
                                        <th>Telefono</th>
                                        <th>Ubicación</th>
                                        <th>Estado</th>
                                      </tr>
                                    </thead>
                                    
                                    <tbody>
                                        <% for ( int i=0; i < branches.size(); i++){
                                        %>
                                        <tr>
                                            <td> <%= branches.get(i).getNit() %> </td>
                                            <td> <%= branches.get(i).getName().toUpperCase() %> </td>
                                            <td> <%= branches.get(i).getAddress().toUpperCase() %> </td>
                                            <td> <%= branches.get(i).getPhone() %> </td>
                                            <td> <%= branches.get(i).getLocationName() %> </td>
                                            <td> <%= branches.get(i).status()%> </td>
                                           

                                        </tr>
                                        <% } %>
                                    </tbody>
                                </table>
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
                                home
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

</html>