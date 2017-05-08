<%-- 
    Document   : prevData
    Created on : 8/04/2017, 12:50:12 PM
    Author     : EDGAR MENESES
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% ArrayList<String []> data = (ArrayList<String []>) session.getAttribute("datos");%>
<!DOCTYPE html>
<html>
     <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, maximum-scale=1">

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
                <li class="active">
                    <a href="places">
                        <i class="fa fa-globe"></i>
                        <p>Lugares</p>
                    </a>
                </li>
                <li>
                    <a href="branches">
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
                    <a class="navbar-brand" href="#">Datos cargado</a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-left">
                        <li>
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="fa fa-file-archive-o"></i>
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
                <a href="categories" class="btn btn-primary btn-fill">Categorias</a>
                <a class="btn btn-info btn-fill">Datos cargados</a>
                <!--a href="#" class="btn btn-info btn-fill">Success</a-->
            </div>
        </div>


        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="header">
                                <h4 class="title">Cartegorias cargadas en el archivo</h4>
                            </div>
                            <div class="content">
                                
                                
                                
                                
                                <table name="table" id="table" class="table table-hover table-striped">
                                    <thead>
                                      <tr>
                                        <th>Categoria Padre</th>
                                        <th>Nombre</th>
                                        <th>Estado</th>
                                        <!--th>Estado</th-->
                                      </tr>
                                    </thead>
                                    
                                    <tbody>
                                        <% for ( int i=0; i < data.size(); i++){
                                        %>
                                        <tr name="lugares">
                                            <td id="sub"><input name="" id="subcategory" type="text" value="<%= data.get(i)[0] %>" class="form-control" > </td>
                                            <td><input name="" id="names" type="text" value="<%= data.get(i)[1] %>" class="form-control" > </td>
                                            <td><input name="" id="status" type="text" value="<%= data.get(i)[2] %>" class="form-control"> </td>

                                        </tr>
                                        <% } %>
                                    </tbody>
                                </table>
                                <button id="send" type="button" class="btn btn-primary btn-fill pull-right" >Enviar</button>
                                <div class="clearfix"></div>
                                
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
<script>
    $(document).ready(function(){
        
        var sendData = function(subcategory, names, status){
            $("#table").hide();
            $.post('savecategories', {
                subcategory:subcategory,
                names:names,
                status:status
            }, function(response){
                $("#response").html(response);
            })
        }
       
        $("#send").click(function (){
            
            var subcategory = "";
            var names = "";
            var status = "";

            $('tr #subcategory').each(function(indice, elemento){
               
                subcategory = subcategory + $(elemento).val() +";"
            });

            $('tr #names').each(function(indice, elemento){
                
                names = names + $(elemento).val() +";"
            });

            $('tr #status').each(function(indice, elemento){
                
                status = status + $(elemento).val() +";"
            });

            
            sendData(subcategory, names, status);
        }); 
    });
</script>
</html>
