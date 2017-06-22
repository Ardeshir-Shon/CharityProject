<%--
  Created by IntelliJ IDEA.
  User: HamidReza
  Date: 6/22/17
  Time: 11:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>inbox</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/../resources/bootstrap-3.3.7-dist/css/bootstrap.css" type="text/css">
    <script src="/https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js" type="text/javascript">
    </script>
    <script src="${pageContext.request.contextPath}/../resources/bootstrap-3.3.7-dist/js/bootstrap.min.js" type="text/javascript">
    </script>
    <script type="text/javascript" src="javascript.js">
    </script><!-- Load Bootstrap RTL theme from RawGit -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/../resources/bootstrap-rtl-master/dist/css/bootstrap-rtl.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/../resources/style.css" type="text/css">
    <script src='https://www.google.com/recaptcha/api.js'></script>
    <script src="https://use.fontawesome.com/5881fd899f.js"></script>
    <style>
        .accordion-heading {
            background-color: #f2f2f2;
            min-height: 40px;
            border-radius: 4px;
            padding: 10px;
            margin-bottom: 15px;
            font-family: Gulf-semibold;
            font-size: 17px;
        }
        @font-face {
            font-family: Gulf;
            src: url(${pageContext.request.contextPath}/../resources/fonts/Gulf-regular.ttf);
        }
        @font-face {
            font-family: Gulf-semibold;
            src: url(${pageContext.request.contextPath}/../resources/fonts/Gulf-semibold.ttf);
        }
    </style>
</head>
<body>
<div class="container" style="min-height: 10px">
</div>
<div class="container" style="padding: 0px">
    <nav class="navbar navbar-inverse" style="font-family: Gulf;">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="home.html">خیریه امید نو</a>
            </div>
            <div class="collapse navbar-collapse" id="myNavbar">
                <ul class="nav navbar-nav">
                    <li><a href="home.html">خانه</a></li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">همکاری
                            <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="active_members.html">عضویت فعال</a></li>
                            <li><a href="periodic_help.html">اعلام همکاری</a></li>
                            <li><a href="discard.html">لفو همکاری</a></li>
                        </ul>
                    </li>
                    <li><a href="inbox.html">ارسال پیام</a></li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">خدمات کانون
                            <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">دایره‌ی فعالیت‌ها</a></li>
                            <li><a href="recommendation.html">معرفی دانشجوی‌ مددجو</a></li>
                            <li><a href="needy_students.html">درمیان‌گذاری نیازمندی با کانون</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="suggestion.html">پیشنهادات</a>
                    </li>
                    <li class="active">
                        <a href="donate.html">کمک نقدی</a>
                    </li>
                </ul>
                <form:form class="navbar-form navbar-right" method="post">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="جستجو" >
                        <div class="input-group-btn">
                            <button class="btn btn-default" type="submit">
                                <i class="glyphicon glyphicon-search"></i>
                            </button>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
    </nav>
</div>	    <div class="container" style="font-family: Gulf;">
    <h4 style="margin-bottom: 15px;">کمک نقدی</h4>
    <p id="demo"></p>
    <div class="container" >
        <div class="accordion">
            <div class="accordion-group col-sm-12">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseOne" style="text-decoration: none; color: inherit;"><div class="accordion-heading col-sm-8">پرداخت به حساب</div></a>
                <div style="min-height: 60px;"></div>
                <div id="collapseOne" class="accordion-body collapse in">
                    <div class="accordion-inner">
                        <form::form class="form-horizontal col-sm-offset-1" method="post">
                            <div class="form-group">
                                <label class="control-label col-sm-2">مبلغ اهدایی(تومان):</label>
                                <div class="radio col-sm-1">
                                    <label><input type="radio" name="optradio">۱۰۰۰</label>
                                </div>
                                <div class="radio col-sm-1">
                                    <label><input type="radio" name="optradio" >۱۰,۰۰۰</label>
                                </div>
                                <div class="radio col-sm-1">
                                    <label><input type="radio" name="optradio" >۲۰,۰۰۰</label>
                                </div>
                                <div class="radio col-sm-1">
                                    <label><input type="radio" name="optradio" >۵۰,۰۰۰</label>
                                </div>
                                <div class="radio col-sm-1">
                                    <label><input type="radio" name="optradio" >۱۰۰,۰۰۰</label>
                                </div>
                            </div>
                            <div class="form-group" id="other_faculty">
                                <label class="control-label col-sm-2" for="n" >مبالغ دیگر:</label>
                                <div class="col-sm-5">
                                    <input type="text" class="form-control" placeholder="مبلغ را وارد کنید(تومان)">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-offset-2 col-sm-10">
                                    <button type="submit" class="btn btn-default" style="background-color: #f2f2f2; color: #777;">پرداخت</button>
                                    <!-- <div class="g-recaptcha" data-sitekey="6LdbBBsUAAAAAE2H11rzHeFOhrbkjnh9JIZG_HcY"></div> -->
                                </div>
                            </div>
                        </form::form>
                    </div>
                </div>
            </div>
        </div>
        <div class="accordion-group col-sm-12">
            <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseTwo" style="text-decoration: none; color: inherit;"><div class="accordion-heading col-sm-8">شارژ حساب تغذیه</div></a>
            <div style="min-height: 60px;"></div>
            <div id="collapseTwo" class="accordion-body collapse in">
                <div class="accordion-inner">
                    <form:form class="form-horizontal col-sm-offset-1" method="post">
                        <div class="form-group">
                            <label class="control-label col-sm-5" style="text-align: right;"><a href="#" style="text-decoration: none; color: inherit;">ورود به صفحه‌ی شارژ حساب تغذیه‌ی کانون</a></label>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="container">
    <div class="row" style="font-family:Gulf-semibold; background-color:#f2f2f2; margin-top: 15px; padding-top:10px; color: #777;">
        <div class="col-sm-4"></div>
        <div class="col-sm-4" style="text-align: center; font-size: 20px;">
            <span class="fa fa-envelope-o" aria-hidden="true" style="font-size: 25px; vertical-align: middle"></span><span style="vertical-align: middle"> &nbsp خبرنامه امید نو  </span>
            <div style="margin-top: 15px;">
                <form:form method="post">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="ایمیل خود را وارد کنید" style="text-align: center; direction: ltr;">
                        <div class="input-group-btn">
                            <button class="btn btn-default" type="submit">
                                <i class="fa fa-check-square-o" aria-hidden="true" style="font-size:18px ;color:#777; vertical-align: middle;"></i>
                            </button>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
        <div class="col-sm-4"></div>
    </div>
    <div class="row" style="font-family:Gulf; min-height: 150px; background-color:#f2f2f2; padding-top:20px; color: #777;">
        <div class="col-sm-3">
            <p style="font-size: 16px; font-family: Gulf-semibold;">درباره‌ی امید نو</p><p>لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است.</p>
        </div>
        <div class="col-sm-3">
            <p style="font-size: 16px; font-family: Gulf-semibold;">ارتباط با ما</p>
            <a href="mailto:info@omidno.ir" target="_top" style="text-decoration: none; color: inherit;"><span class="fa fa-envelope" aria-hidden="true" style="font-size: 20px; vertical-align: middle; margin-bottom: 5px;"></span><span style="vertical-align: middle">&nbsp info@omidno.ir</span></a>
            <br><a href="https://telegram.me/omidnocharity" target="_blank" style="text-decoration: none; color: inherit;"><span class="fa fa-telegram" aria-hidden="true" style=" font-size: 20px ;vertical-align: middle; margin-bottom: 5px;"></span><span style="vertical-align: middle;">&nbsp  omidno </span></a>
            <br><a href=inbox.html style="text-decoration: none; color: inherit;"><span class="fa fa-inbox" aria-hidden="true" style=" font-size: 20px ;vertical-align: middle; margin-bottom: 5px;"></span><span style="vertical-align: middle;">&nbsp ارسال پیام</span></a>
        </div>
        <div class="col-sm-3">
            <p style="font-size: 16px; font-family: Gulf-semibold;">گزارش‌ها</p><p>لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است.</p>
        </div>
        <div class="col-sm-3">
            <p style="font-size: 16px; font-family: Gulf-semibold;">حقوق قانونی وب‌سایت</p><p>لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است. لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است.</p>
        </div>
    </div>
</body>
</html>