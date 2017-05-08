<%-- 
    Document   : index
    Created on : 26/03/2017, 01:44:14 PM
    Author     : EDGAR MENESES
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! int numero = 23; %>
<%! int i; %>
<%-- 
    Document   : index
    Created on : 26/03/2017, 01:44:14 PM
    Author     : EDGAR MENESES
--%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, maximum-scale=1">

<title>Homepage</title>
<link rel="icon" href="public/assets/img/favicon2.png" type="image/png">
<link rel="shortcut icon" href="public/assets/img/favicon2.ico" type="img/x-icon">

<link href='public/assets/fonts/fontmontserrat.css' rel='stylesheet' type='text/css'>
<link href='public/assets/fonts/fonts.googleapis.css' rel='stylesheet' type='text/css'>

<!-- import css-->
<link href="public/assets/css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="public/assets/css/style.css" rel="stylesheet" type="text/css">
<link href="public/assets/css/font-awesome.css" rel="stylesheet" type="text/css">
<link href="public/assets/css/responsive.css" rel="stylesheet" type="text/css">
<link href="public/assets/css/animate.css" rel="stylesheet" type="text/css">



<!-- =======================================================
    Theme Name: Knight
    Theme URL: https://bootstrapmade.com/knight-free-bootstrap-theme/
    Author: BootstrapMade
    Author URL: https://bootstrapmade.com
======================================================= -->

</head>
<body>
<header class="header" id="header"><!--header-start-->
    <div class="container">
        <figure class="logo animated fadeInDown delay-07s">
            <a href="#"><img src="public/assets/img/logo.png" alt=""></a>   
        </figure>   
        <h1 class="animated fadeInDown delay-07s">Bienvenido a salesapp</h1>
        <ul class="we-create animated fadeInUp delay-1s">
            <li>Plataforma para la administracion de almacenes de cadena.</li>
        </ul>
            <a class="link animated fadeInUp delay-1s servicelink" href="#statistics">Estadísticas</a>
            <a class="link animated fadeInUp delay-1s servicelink" href="login">Ingresar</a>
    </div>
</header><!--header-end-->

<nav class="main-nav-outer" id="test"><!--main-nav-start-->
    <div class="container">
        <ul class="main-nav">
            <li><a href="#header">Home</a></li>
            <li class="small-logo"><a href="#header"><img src="public/assets/img/small-logo.png" height="10%" width="10%" alt=""></a></li>
            <li><a href="#service">Estadísticas</a></li>
        </ul>
        <a class="res-nav_click" href="#"><i class="fa-bars"></i></a>
    </div>
</nav><!--main-nav-end-->



<section class="main-section" id="statistics"><!--main-section-start-->
    <div class="container">
        <h2>Estadisticas</h2>
        <h6>En esta sección se encuentran las principales estadísticas que le permiten conocer la rentabilidad del negocio. </h6>
        <div class="row offset-1" style="padding-left: 5%">
            <div class="col-lg-3 col-md-6 wow fadeInLeft delay-05s ">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <div class="row">
                                <div class="col-xs-3">
                                    <i class="fa fa-comments fa-5x"></i>
                                </div>
                                <div class="col-xs-9 text-right">
                                    <div class="huge">26</div>
                                    <div>New Comments!</div>
                                </div>
                            </div>
                        </div>
                        <a>
                            <div class="panel-footer">
                                <span class="pull-left">View Details</span>
                                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                <div class="clearfix"></div>
                            </div>
                        </a>
                    </div>
                </div>

                <div class="col-lg-3 col-md-6 wow fadeInLeft delay-06s">
                    <div class="panel panel-green">
                        <div class="panel-heading">
                            <div class="row">
                                <div class="col-xs-3">
                                    <i class="fa fa-tasks fa-5x"></i>
                                </div>
                                <div class="col-xs-9 text-right">
                                    <div class="huge">12</div>
                                    <div>New Tasks!</div>
                                </div>
                            </div>
                        </div>
                        <a>
                            <div class="panel-footer">
                                <span class="pull-left">View Details</span>
                                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                <div class="clearfix"></div>
                            </div>
                        </a>
                    </div>
                </div>
                

                <div class="col-lg-3 col-md-6 wow fadeInLeft delay-07s">
                    <div class="panel panel-yellow">
                        <div class="panel-heading">
                            <div class="row">
                                <div class="col-xs-3">
                                    <i class="fa fa-shopping-cart fa-5x"></i>
                                </div>
                                <div class="col-xs-9 text-right">
                                    <div class="huge">124</div>
                                    <div>New Orders!</div>
                                </div>
                            </div>
                        </div>
                        <a >
                            <div class="panel-footer">
                                <span class="pull-left">View Details</span>
                                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                <div class="clearfix"></div>
                            </div>
                        </a>
                    </div>
                </div>

        </div>


    </div>
</section><!--main-section-end-->

<footer class="footer">
    <div class="container">
        <div class="footer-logo"><a href="#"><img src="public/assets/img/logo.png" alt=""></a></div>
        <span class="copyright">&copy; Knight Theme and EMC. All Rights Reserved</span>
        <div class="credits">
            <!-- 
                All the links in the footer should remain intact. 
                You can delete the links only if you purchased the pro version.
                Licensing information: https://bootstrapmade.com/license/
                Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/buy/?theme=Knight
            -->
            <a href="https://bootstrapmade.com/free-business-bootstrap-themes-website-templates/">Business Bootstrap Themes</a> by <a href="https://bootstrapmade.com/">BootstrapMade</a>
        </div>
    </div>
</footer>

<!-- import js -->
<script type="text/javascript" src="public/assets/js/jquery.1.8.3.min.js"></script>
<script type="text/javascript" src="public/assets/js/bootstrap.js"></script>
<script type="text/javascript" src="public/assets/js/jquery-scrolltofixed.js"></script>
<script type="text/javascript" src="public/assets/js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="public/assets/js/jquery.isotope.js"></script>
<script type="text/javascript" src="public/assets/js/wow.js"></script>
<script type="text/javascript" src="public/assets/js/classie.js"></script>

<script type="text/javascript">
    $(document).ready(function(e) {
        $('#test').scrollToFixed();
        $('.res-nav_click').click(function(){
            $('.main-nav').slideToggle();
            return false    
            
        });
        
    });
</script>

  <script>
    wow = new WOW(
      {
        animateClass: 'animated',
        offset:       100
      }
    );
    wow.init();
  </script>


<script type="text/javascript">
    $(window).load(function(){
        
        $('.main-nav li a, .servicelink').bind('click',function(event){
            var $anchor = $(this);
            
            $('html, body').stop().animate({
                scrollTop: $($anchor.attr('href')).offset().top - 102
            }, 1500,'easeInOutExpo');
            /*
            if you don't want to use the easing effects:
            $('html, body').stop().animate({
                scrollTop: $($anchor.attr('href')).offset().top
            }, 1000);
            */
            event.preventDefault();
        });
    })
</script>

<script type="text/javascript">

$(window).load(function(){
  
  
  var $container = $('.portfolioContainer'),
      $body = $('body'),
      colW = 375,
      columns = null;

  
  $container.isotope({
    // disable window resizing
    resizable: true,
    masonry: {
      columnWidth: colW
    }
  });
  
  $(window).smartresize(function(){
    // check if columns has changed
    var currentColumns = Math.floor( ( $body.width() -30 ) / colW );
    if ( currentColumns !== columns ) {
      // set new column count
      columns = currentColumns;
      // apply width to container manually, then trigger relayout
      $container.width( columns * colW )
        .isotope('reLayout');
    }
    
  }).smartresize(); // trigger resize to set container width
  $('.portfolioFilter a').click(function(){
        $('.portfolioFilter .current').removeClass('current');
        $(this).addClass('current');
 
        var selector = $(this).attr('data-filter');
        $container.isotope({
            
            filter: selector,
         });
         return false;
    });
  
});

</script>

</body>
</html>