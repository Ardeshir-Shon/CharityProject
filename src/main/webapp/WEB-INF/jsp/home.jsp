<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>خانه</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/../resources/bootstrap-3.3.7-dist/css/bootstrap.css"
          type="text/css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js" type="text/javascript">
    </script>
    <script src="${pageContext.request.contextPath}/../resources/bootstrap-3.3.7-dist/js/bootstrap.min.js"
            type="text/javascript">
    </script>
    <!-- Load Bootstrap RTL theme from RawGit -->
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/../resources/bootstrap-rtl-master/dist/css/bootstrap-rtl.css"
          type="text/css">
    <script src="https://www.google.com/recaptcha/api.js"></script>
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

                            <li><a href="/needyStudent">درمیان‌گذاری نیازمندی با کانون</a></li>
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

<div class="container" style="font-family: Gulf; color: #777;">
    <div class="row">
        <div class="col-md-12">
            <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="item active">
                        <img src="${pageContext.request.contextPath}/../resources/images/~text.png" alt="First slide">
                        <div class="carousel-caption">
                            <h3>اسلاید اول</h3>

                            <p>توضیحات اسلاید اول</p>
                        </div>
                    </div>
                    <div class="item">
                        <img src="${pageContext.request.contextPath}/../resources/images/~text 2.png" alt="Second slide">
                        <div class="carousel-caption">
                            <h3>اسلاید دوم</h3>

                            <p>توضیحات اسلاید دوم</p>
                        </div>
                    </div>
                    <div class="item">
                        <img src="${pageContext.request.contextPath}/../resources/images/~text 3.png" alt="Third slide">
                        <div class="carousel-caption">
                            <h3>اسلاید سوم</h3>

                            <p>توضیحات اسلاید سوم</p>
                        </div>
                    </div>
                </div>
                <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left"></span></a><a class="right carousel-control"
                                                                                 href="#carousel-example-generic" data-slide="next"><span class="glyphicon glyphicon-chevron-right">
                        </span></a>
            </div>
        </div>
    </div>
</div>
<div class="container">
    <div class="row" style="font-family:Gulf; color: #777; text-align: justify">
        <div class="col-sm-4">
            <div><img src="${pageContext.request.contextPath}/../resources/img_chania.jpg" class="img-rounded" width="100%" style="margin: 20px 0px 10px 0px; background-color: gray;"></div>ستون اول<br>
            لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد. کتابهای زیادی در شصت و سه درصد گذشته، حال و آینده شناخت فراوان جامعه و متخصصان را می طلبد تا با نرم افزارها شناخت بیشتری را برای طراحان رایانه ای علی الخصوص طراحان خلاقی و فرهنگ پیشرو در زبان فارسی ایجاد کرد.
        </div>

        <div class="col-sm-4">
            <div><img src="${pageContext.request.contextPath}/../resources/img_chania.jpg" class="img-rounded" width="100%" style="margin: 20px 0px 10px 0px; background-color: gray;"></div>ستون دوم<br>
            لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد. کتابهای زیادی در شصت و سه درصد گذشته، حال و آینده شناخت فراوان جامعه و متخصصان را می طلبد تا با نرم افزارها شناخت بیشتری را برای طراحان رایانه ای علی الخصوص طراحان خلاقی و فرهنگ پیشرو در زبان فارسی ایجاد کرد.
        </div>

        <div class="col-sm-4">
            <div><img src="${pageContext.request.contextPath}/../resources/img_chania.jpg" class="img-rounded" width="100%" style="margin: 20px 0px 10px 0px; background-color: gray;"></div>ستون سوم<br>
            لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد. کتابهای زیادی در شصت و سه درصد گذشته، حال و آینده شناخت فراوان جامعه و متخصصان را می طلبد تا با نرم افزارها شناخت بیشتری را برای طراحان رایانه ای علی الخصوص طراحان خلاقی و فرهنگ پیشرو در زبان فارسی ایجاد کرد.
        </div>
    </div>
</div>
<div class="container" style="margin-top: 15px;">
    <div class="row" style="font-family: Gulf; color:#777;">
        <div class="col-sm-4">
            <p style="text-align: justify;">لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد. کتابهای زیادی در شصت و سه درصد گذشته، حال و آینده شناخت فراوان جامعه و متخصصان را می طلبد تا با نرم افزارها شناخت بیشتری را برای طراحان رایانه ای علی الخصوص طراحان خلاقی و فرهنگ پیشرو در زبان فارسی ایجاد کرد.</p>
        </div>

        <div class="col-sm-8">
            <div><img src="${pageContext.request.contextPath}/../resources/img_chania.jpg" class="img-rounded" width="100%" style="margin: 5px 5px 5px 5px; background-color: #1e9a88"></div>
        </div>
    </div>
</div>
<div class="container">
    <div class="row" style="font-family:Gulf; background-color:#f2f2f2; margin-top: 15px; padding-top:10px; color: #777;">
        <div class="col-sm-4"></div>
        <div class="col-sm-4" style="text-align: center; font-size: 20px;">
            <span class="fa fa-envelope-o" aria-hidden="true" style="font-size: 25px; vertical-align: middle"></span><span style="vertical-align: middle"> &nbsp خبرنامه امید نو  </span>
            <div style="margin-top: 15px;">
                <form:form method="post" action="/home/newsLetter">
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
            <p style="font-size: 16px;">درباره‌ی امید نو</p><p>لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است.</p>
        </div>
        <div class="col-sm-3">
            <p style="font-size: 16px;">ارتباط با ما</p>
            <a href="mailto:info@omidno.ir" target="_top" style="text-decoration: none; color: inherit;"><span class="fa fa-envelope" aria-hidden="true" style="font-size: 20px; vertical-align: middle; margin-bottom: 5px;"></span><span style="vertical-align: middle">&nbsp info@omidno.ir</span></a>



            <!-- <a href="mailto:someone@example.com?Subject=Hello%20again" target="_top">Send Mail</a> -->

            <br><a href="https://telegram.me/omidnocharity" target="_blank" style="text-decoration: none; color: inherit;"><span class="fa fa-telegram" aria-hidden="true" style=" font-size: 20px ;vertical-align: middle; margin-bottom: 5px;"></span><span style="vertical-align: middle;">&nbsp  omidno </span></a>

            <br><a href=inbox.html style="text-decoration: none; color: inherit;"><span class="fa fa-inbox" aria-hidden="true" style=" font-size: 20px ;vertical-align: middle; margin-bottom: 5px;"></span><span style="vertical-align: middle;">&nbsp ارسال پیام</span></a>

        </div>
        <div class="col-sm-3">
            <p style="font-size: 16px;">گزارش‌ها</p><p>لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است.</p>
        </div>
        <div class="col-sm-3">
            <p style="font-size: 16px;">حقوق قانونی وب‌سایت</p><p>لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است. لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است.</p>
        </div>

    </div>
</div>
</body>
</html>

