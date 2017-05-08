<%-- 
    Document   : login
    Created on : 27/03/2017, 08:06:36 PM
    Author     : EDGAR MENESES
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta name="viewport" content="width=device-width, maximum-scale=1">

    <title>Login</title>
    <link rel="icon" href="public/assets/img/favicon2.png" type="image/png">
    <link rel="shortcut icon" href="public/assets/img/favicon2.ico" type="img/x-icon">

    <link href='public/assets/fonts/fontmontserrat.css' rel='stylesheet' type='text/css'>
    <link href='public/assets/fonts/fonts.googleapis.css' rel='stylesheet' type='text/css'>

    <link href="public/assets/css/style.css" rel="stylesheet" type="text/css">
    <link href="public/assets/css/font-awesome.css" rel="stylesheet" type="text/css">
    <link href="public/assets/css/responsive.css" rel="stylesheet" type="text/css">
    <link href="public/assets/css/animate.css" rel="stylesheet" type="text/css">
    <link href="public/assets/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="public/assets/css/metisMenu.min.css" rel="stylesheet">
    <!--link href="../public/assets/css/sb-admin-2.css" rel="stylesheet"-->

    <!-- Custom Fonts -->
   

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Digite su usuario y contraseña.</h3>
                    </div>
                    <div class="panel-body">
                        <form role="form" method="POST" action="login">
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Usuario" name="user" type="text" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Contraseña" name="password" type="password" value="">
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <input name="remember" type="checkbox" value="Remember Me">Recordar me
                                    </label>
                                </div>
                                <!-- Change this to a button or input when using this as a form -->
                                <button  type="submit" class="btn btn-lg btn-success btn-block">Login</button>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- jQuery -->
    <script src="../public/assets/js/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../public/assets/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="../public/assets/js/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="../dist/js/sb-admin-2.js"></script>

</body>

</html>
