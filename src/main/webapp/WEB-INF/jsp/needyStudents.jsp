<%@ page import="com.sbu.dao.model.NeedyStudentEntity" %>
<%@ page import="com.sbu.controller.DTO.GenericDTO" %><%--
  Created by IntelliJ IDEA.
  User: HamidReza
  Date: 6/22/17
  Time: 2:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %><%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<!DOCTYPE html>
<html lang="en">
<head>
    <title>needy student</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/../resources/bootstrap-3.3.7-dist/css/bootstrap.css"
          type="text/css">
    <script src="/https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js" type="text/javascript">
    </script>
    <script src="${pageContext.request.contextPath}/../resources/bootstrap-3.3.7-dist/js/bootstrap.min.js"
            type="text/javascript">
    </script>
    <script type="text/javascript" src="javascript.js">
    </script><!-- Load Bootstrap RTL theme from RawGit -->
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/../resources/bootstrap-rtl-master/dist/css/bootstrap-rtl.css"
          type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/../resources/style.css" type="text/css">
    <script src='https://www.google.com/recaptcha/api.js'></script>
    <script src="https://use.fontawesome.com/5881fd899f.js"></script>
    <style>
        @font-face {
            font-family: Gulf;
            src: url(${pageContext.request.contextPath}/../resources/fonts/Gulf-regular.ttf);
        }

        @font-face {
            font-family: Gulf-semibold;
            src: url(${pageContext.request.contextPath}/../resources/fonts/Gulf-semibold.ttf);
        }
        input.wrong::-webkit-input-placeholder { /* WebKit, Blink, Edge */
            color: #c73f3f;
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
                <a class="navbar-brand" href="/home">خیریه امید نو</a>
            </div>

            <div class="collapse navbar-collapse" id="myNavbar">
                <ul class="nav navbar-nav">
                    <li><a href="/home">خانه</a></li>

                    <li class="dropdown active">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">همکاری
                            <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li class="active"><a href="/activeMembers">عضویت فعال</a></li>

                            <li><a href="/periodHelp">اعلام همکاری</a></li>

                            <li><a href="/discard">لفو همکاری</a></li>
                        </ul>
                    </li>
                    <li><a href="/inbox">ارسال پیام</a></li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">خدمات کانون
                            <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">دایره‌ی فعالیت‌ها</a></li>

                            <li><a href="/recommendation">معرفی دانشجوی‌ مددجو</a></li>

                            <li><a href="/needyStudents">درمیان‌گذاری نیازمندی با کانون</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="/suggestion">پیشنهادات</a>
                    </li>
                    <li>
                        <a href="/donate">کمک نقدی‌&nbspآنی</a>
                    </li>
                </ul>
                <form:form class="navbar-form navbar-right" >
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
</div>
<div class="container" style="font-family: Gulf;">
    <h4 style="margin-bottom: 15px;">فرم عضویت به عنوان دانشجوی تحت پوشش</h4>
    <h5 style="color: #c73f3f; margin-bottom: 18px;">تمامی اطلاعات دریافتی از سوی ما محرمانه در نظر گرفته شده و محفوظ اند.</h5>
    <form:form class="form-horizontal" method="post" action="/needyStudents/main">
        <%
            GenericDTO<NeedyStudentEntity> dto= (GenericDTO<NeedyStudentEntity>) request.getAttribute("dto");
            if (dto!=null && dto.getState().equals(0))
            {
                if (dto.getFilled().getName()==null){
        %>
        <div class="form-group">
            <label class="control-label col-sm-2" >نام:</label>
            <div class="col-sm-5">
                <input type="text" name="firstName" class="form-control wrong"  placeholder="بایستی نام خود را وارد کنید!">
            </div>
        </div>
        <%
        }else {
        %>
        <div class="form-group">
            <label class="control-label col-sm-2" >نام:</label>
            <div class="col-sm-5">
                <input type="text" name="firstName" class="form-control" placeholder="نام خود را وارد کنید">
            </div>
        </div>
        <%
            }
        }else{
        %>
        <div class="form-group">
            <label class="control-label col-sm-2" >نام:</label>
            <div class="col-sm-5">
                <input type="text" name="firstName" class="form-control" placeholder="نام خود را وارد کنید">
            </div>
        </div>
        <%
            }
        %>

        <%
            if (dto!=null && dto.getState().equals(0))
            {
                if (dto.getFilled().getFamily()==null){
        %>
        <div class="form-group">
            <label class="control-label col-sm-2" >نام خانوادگی:</label>
            <div class="col-sm-5">
                <input type="text" name="lastName" class="form-control wrong" placeholder="بایستی نام خانوادگی خود را وارد کنید!">
            </div>
        </div>
        <%
        }else {
        %>
        <div class="form-group">
            <label class="control-label col-sm-2" >نام خانوادگی:</label>
            <div class="col-sm-5">
                <input type="text" name="lastName" class="form-control" placeholder="نام خانوادگی خود را وارد کنید">
            </div>
        </div>
        <%
            }
        }else {
        %>
        <div class="form-group">
            <label class="control-label col-sm-2" >نام خانوادگی:</label>
            <div class="col-sm-5">
                <input type="text" name="lastName" class="form-control" placeholder="نام خانوادگی خود را وارد کنید">
            </div>
        </div>
        <%
            }
        %>

        <%
            if (dto!=null && dto.getState().equals(0))
            {
                if (dto.getFilled().getPhoneNumber()==null)
                {
        %>
        <div class="form-group">
            <label class="control-label col-sm-2">شماره‌ی موبایل:</label>
            <div class="col-sm-5">
                <input type="text" name="phoneNumber" class="form-control wrong" placeholder="بایستی شماره‌ی موبایل خود را وارد کنید!">
            </div>
        </div>
        <%
        }else if(dto.getState().equals(-1))
        {
        %>
        <div class="form-group">
            <label class="control-label col-sm-2">شماره‌ی موبایل:</label>
            <div class="col-sm-5">
                <input type="text" name="phoneNumber" class="form-control wrong" placeholder="این شمار‌ه‌ی موبایل پیش از این در سامانه ثبت شده است!">
            </div>
        </div>
        <%
            }
        } else{
        %>
        <div class="form-group">
            <label class="control-label col-sm-2">شماره‌ی موبایل:</label>
            <div class="col-sm-5">
                <input type="text" name="phoneNumber" class="form-control" placeholder="۰۹۱۲۱۲۳۴۵۶۷" style="text-align: left; direction: ltr;">
            </div>
        </div>
        <%
            }
        %>


        <%
            if (dto!=null && dto.getState().equals(0))
            {
                if (dto.getFilled().getStudentId()==null){
        %>
        <div class="form-group">
            <label class="control-label col-sm-2" >شماره‌ی دانشجویی:</label>
            <div class="col-sm-5">
                <input type="text" name="studentNumber" class="form-control wrong" placeholder="بایستی شماره‌ی دانشجویی خود را وارد کنید!">
            </div>
        </div>
        <%
        }else {
        %>
        <div class="form-group">
            <label class="control-label col-sm-2" >شماره‌ی دانشجویی:</label>
            <div class="col-sm-5">
                <input type="text" name="studentNumber" class="form-control" placeholder="شماره‌ی دانشجویی خود را وارد کنید(به عدد)">
            </div>
        </div>
        <%
            }
        }else{
        %>
        <div class="form-group">
            <label class="control-label col-sm-2" >شماره‌ی دانشجویی:</label>
            <div class="col-sm-5">
                <input type="text" name="studentNumber" class="form-control" placeholder="شماره‌ی دانشجویی خود را وارد کنید(به عدد)">
            </div>
        </div>
        <%
            }
        %>

        <div class="form-group">
            <label class="control-label col-sm-2">توضیحات:</label>
            <div class="col-sm-5">
                <textarea name="description" class="form-control" rows="6" placeholder="در مورد سطح و نوع نیاز خود برای ما بنویسید..."></textarea>
            </div>
        </div>

        <%
            if((dto != null && dto.getState() != 1) || dto == null)
            {
        %>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default" style="background-color: #f2f2f2; color: #777;">ثــبــت</button>
            </div>
        </div>
        <%
        }else {
        %>
        <h5 class="col-sm-offset-2 col-sm-10" style="color: #41985c; margin-bottom: 18px;">اطلاعات شما با موفقیت ثبت گردیدند، با شما در ارتباط خواهیم بود.</h5>
        <%
            }
        %>

    </form:form>
</div>
<div class="container">
    <div class="row" style="font-family:Gulf-semibold; background-color:#f2f2f2; margin-top: 15px; padding-top:10px; color: #777;">
        <div class="col-sm-4"></div>
        <div class="col-sm-4" style="text-align: center; font-size: 20px;">
            <span class="fa fa-envelope-o" aria-hidden="true" style="font-size: 25px; vertical-align: middle"></span><span style="vertical-align: middle"> &nbsp خبرنامه امید نو  </span>
            <div style="margin-top: 15px;">
                <form:form method="post" action="/needyStudents/newsLetter">
                    <div class="input-group">
                        <input type="text" name="newsLetterEmail" class="form-control" placeholder="ایمیل خود را وارد کنید" style="text-align: center; direction: ltr;">
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
</div>
</body>
</html>
