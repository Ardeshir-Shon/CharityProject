<%@ page import="com.sbu.dao.model.IntroductionEntity" %>
<%@ page import="com.sbu.controller.DTO.GenericDTO" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>recommendation</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" type="text/css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js" type="text/javascript">
    </script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" type="text/javascript">
    </script>
    <script type="text/javascript" src="javascript.js">
    </script><!-- Load Bootstrap RTL theme from RawGit -->
    <link rel="stylesheet" href="https://cdn.rawgit.com/morteza/bootstrap-rtl/v3.3.4/dist/css/bootstrap-rtl.min.css" type="text/css">
    <script src='https://www.google.com/recaptcha/api.js'></script>
    <script src="https://use.fontawesome.com/5881fd899f.js"></script>
    <script>
        function hider(){
            if(document.getElementById("checkbox").checked ==false)
            {
                document.getElementById("stNumber").style.display = "none";
            }
            else{
                document.getElementById("stNumber").style.display = "block";
            }
        }
        function shower(){
            if (document.getElementById("selector").value == "سایر")
            {
                document.getElementById("other_faculty").style.display = "block";
            }
            else{
                document.getElementById("other_faculty").style.display = "none";
            }
        }
    </script>
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
    </style>
    <style>
        input.wrong::-webkit-input-placeholder { /* WebKit, Blink, Edge */
            color: #c73f3f;
        }
    </style>
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
<div class="container" style="font-family: Gulf;">
    <h4 style="margin-bottom: 15px;">فرم ارسال پیام </h4>
    <p id="demo"></p>

<div class="container" >
    <form:form class="form-horizontal" method="post" action="/recommendation/main">
        <div class="accordion">
        <div class="accordion-group col-sm-12">
            <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseOne" style="text-decoration: none; color: inherit;"><div class="accordion-heading col-sm-8">  اطلاعات معرف </div></a>
            <div style="min-height: 60px;"></div>
            <div id="collapseOne" class="accordion-body collapse in">
                <div class="accordion-inner">
                        <%
                            GenericDTO<IntroductionEntity> dto= (GenericDTO<IntroductionEntity>) request.getAttribute("dto");
                            if (dto!=null && dto.getState().equals(0))
                            {
                                if (dto.getFilled().getRecommenderName()==null){
                        %>
                        <div class="form-group">
                            <label class="control-label col-sm-2">نام معرف:</label>
                            <div class="col-sm-5">
                                <input type="text" name="succorFirstName" class="form-control wrong" placeholder="بایستی نام خود را وارد کنید!">
                            </div>
                        </div>
                        <%
                        }else {
                        %>
                        <div class="form-group">
                            <label class="control-label col-sm-2">نام معرف:</label>
                            <div class="col-sm-5">
                                <input type="text" name="succorFirstName" class="form-control" placeholder="نام خود را وارد کنید">
                            </div>
                        </div>
                        <%
                            }
                        }else{
                        %>
                        <div class="form-group">
                            <label class="control-label col-sm-2">نام معرف:</label>
                            <div class="col-sm-5">
                                <input type="text" name="succorFirstName" class="form-control" placeholder="نام خود را وارد کنید">
                            </div>
                        </div>
                        <%
                            }
                        %>


                        <%
                            if (dto!=null && dto.getState().equals(0))
                            {
                                if (dto.getFilled().getRecommenderFamily()==null){
                        %>
                        <div class="form-group">
                            <label class="control-label col-sm-2" >نام خانوادگی معرف:</label>
                            <div class="col-sm-5">
                                <input type="text" name="succorLastName" class="form-control wrong" placeholder="بایستی نام خانوادگی خود را وارد کنید!">
                            </div>
                        </div>
                        <%
                        }else {
                        %>
                        <div class="form-group">
                            <label class="control-label col-sm-2" >نام خانوادگی معرف:</label>
                            <div class="col-sm-5">
                                <input type="text" name="succorLastName" class="form-control" placeholder="نام خانوادگی خود را وارد کنید">
                            </div>
                        </div>
                        <%
                            }
                        }else{
                        %>
                        <div class="form-group">
                            <label class="control-label col-sm-2" >نام خانوادگی معرف:</label>
                            <div class="col-sm-5">
                                <input type="text" name="succorLastName" class="form-control" placeholder="نام خانوادگی خود را وارد کنید">
                            </div>
                        </div>
                        <%
                            }
                        %>

                    <%
                        if (dto!=null && dto.getState().equals(2))
                        {
                    %>
                    <div class="form-group">
                        <div class="control-label  col-sm-offset-2 col-sm-5" >
                            <div class="checkbox">
                                <div style="text-align: right; margin-right: 21px; margin-top: -5px;">
                                    <input type="checkbox" name="isStudent" checked value="on" id="checkbox" onchange="hider();">دانشجوی دانشگاه شهید بهشتی هستم</input>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="form-group" id="stNumber" style="display: block;">
                        <label class="control-label col-sm-2" >شماره‌ی دانشجویی معرف:</label>
                        <div class="col-sm-5">
                            <input type="text" name="succorStudentNumber" class="form-control wrong" placeholder="بایستی شماره‌ی دانشجویی خود را وارد کنید!">
                        </div>
                    </div>
                    <%
                    }else{
                    %>
                    <div class="form-group">
                        <div class="control-label  col-sm-offset-2 col-sm-5" >
                            <div class="checkbox">
                                <div style="text-align: right; margin-right: 21px; margin-top: -5px;">
                                    <input type="checkbox" name="isStudent" value="on" id="checkbox" onchange="hider();">دانشجوی دانشگاه شهید بهشتی هستم</input>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="form-group" id="stNumber" style="display: none;">
                        <label class="control-label col-sm-2" >شماره‌ی دانشجویی معرف:</label>
                        <div class="col-sm-5">
                            <input type="text" name="succorStudentNumber" class="form-control" placeholder="شماره‌ی دانشجویی خود را وارد کنید(به عدد)">
                        </div>
                    </div>
                    <%
                        }
                    %>


                    <%
                        if (dto!=null && dto.getState().equals(0))
                        {
                            if (dto.getFilled().getRecommenderPhoneNumber()==null){
                    %>
                    <div class="form-group">
                        <label class="control-label col-sm-2">شماره‌ی موبایل:</label>
                        <div class="col-sm-5">
                            <input type="text" name="succorPhoneNumber" class="form-control wrong" placeholder="بایستی شماره‌ی موبایل خود را وارد کنید!">
                        </div>
                    </div>
                    <%
                    }else {
                    %>
                    <div class="form-group">
                        <label class="control-label col-sm-2">شماره‌ی موبایل معرف:</label>
                        <div class="col-sm-5">
                            <input type="text" name="succorPhoneNumber" class="form-control" placeholder="۰۹۱۲۱۲۳۴۵۶۷" style="text-align: left; direction: ltr;">
                        </div>
                    </div>
                    <%
                        }
                    }else{
                    %>
                    <div class="form-group">
                        <label class="control-label col-sm-2">شماره‌ی موبایل معرف:</label>
                        <div class="col-sm-5">
                            <input type="text" name="succorPhoneNumber" class="form-control" placeholder="۰۹۱۲۱۲۳۴۵۶۷" style="text-align: left; direction: ltr;">
                        </div>
                    </div>
                    <%
                        }
                    %>
                    </div>
                </div>
            </div>
        </div>
        <div class="accordion-group col-sm-12">
            <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseTwo" style="text-decoration: none; color: inherit;">
                <div class="accordion-heading col-sm-8"> اطلاعات مددجو </div></a>
            <div style="min-height: 60px;"></div>
            <div id="collapseTwo" class="accordion-body collapse in">
                <div class="accordion-inner">
                    <h5 style="color: #c73f3f; margin-bottom: 18px;">ثبت تمامی موارد ذیل به جز نام و نام خانوادگی مددجو اختیاری است اما تکمیل کردن اطلاعات امر مدد رسانی را تسهیل می‌نماید.</h5>
                    <!--                     <form class="form-horizontal col-sm-offset-1"> -->

                    <%
                        if (dto!=null && dto.getState().equals(0))
                        {
                            if (dto.getFilled().getNeedyName()==null){
                    %>
                    <div class="form-group">
                        <label class="control-label col-sm-2">نام مددجو:</label>
                        <div class="col-sm-5">
                            <input type="text" name="needyFirstName" class="form-control wrong" placeholder="بایستی نام مددجو را وارد کنید!">
                        </div>
                    </div>
                    <%
                    }else {
                    %>
                    <div class="form-group">
                        <label class="control-label col-sm-2">نام مددجو:</label>
                        <div class="col-sm-5">
                            <input type="text" name="needyFirstName" class="form-control" placeholder="نام مددجو را وارد کنید">
                        </div>
                    </div>
                    <%
                        }
                    }else{
                    %>
                    <div class="form-group">
                        <label class="control-label col-sm-2">نام مددجو:</label>
                        <div class="col-sm-5">
                            <input type="text" name="needyFirstName" class="form-control" placeholder="نام مددجو را وارد کنید">
                        </div>
                    </div>
                    <%
                        }
                    %>


                    <%
                        if (dto!=null && dto.getState().equals(0))
                        {
                            if (dto.getFilled().getNeedyFamily()==null){
                    %>
                    <div class="form-group">
                        <label class="control-label col-sm-2" >نام خانوادگی مددجو:</label>
                        <div class="col-sm-5">
                            <input type="text" name="needyLastName" class="form-control wrong" placeholder="بایستی نام خانوادگی مددجو را وارد کنید!">
                        </div>
                    </div>
                    <%
                    }else {
                    %>
                    <div class="form-group">
                        <label class="control-label col-sm-2" >نام خانوادگی مددجو:</label>
                        <div class="col-sm-5">
                            <input type="text" name="needyLastName" class="form-control" placeholder="نام خانوادگی مددجو را وارد کنید">
                        </div>
                    </div>
                    <%
                        }
                    }else{
                    %>
                    <div class="form-group">
                        <label class="control-label col-sm-2" >نام خانوادگی مددجو:</label>
                        <div class="col-sm-5">
                            <input type="text" name="needyLastName" class="form-control" placeholder="نام خانوادگی مددجو را وارد کنید">
                        </div>
                    </div>
                    <%
                        }
                    %>

                    <div class="form-group">
                        <label class="control-label col-sm-2" >شماره‌ی دانشجویی مددجو:</label>
                        <div class="col-sm-5">
                            <input type="text" name="needyStudentNumber"class="form-control" placeholder="در صورت اطلاع شماره‌ی دانشجویی مددجو را وارد کنید">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">جنسیت:</label>
                        <select name="needyGender" class="form-control col-sm-2" style="margin-right: 13px;" selected="none" >
                            <option disabled selected value="">-- انتخاب کنید --</option>
                            <option value="خانم">خانم</option>
                            <option value="آقا">آقا</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">ورودی دانشگاه:</label>
                        <select name="needyEntryYear" class="form-control col-sm-2" style="margin-right: 13px;" selected="none" >
                            <option disabled selected value="" >-- انتخاب کنید --</option>
                            <option value="۹۶">۹۶</option>
                            <option value="۹۵">۹۵</option>
                            <option value="۹۴">۹۴</option>
                            <option value="۹۳">۹۳</option>
                            <option value="۹۲">۹۲</option>
                            <option value="۹۱">۹۱</option>
                            <option value="۹۰">۹۰</option>
                            <option value="۸۹">۸۹</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">دانشکده:</label>
                        <select name="needyFacultyName" class="form-control col-sm-2" style="margin-right: 13px;" selected="none" id="selector" onchange="shower();">
                            <option disabled selected value="">-- انتخاب کنید --</option>
                            <option value="مهندسی برق و کامپیوتر">مهندسی برق و کامپیوتر</option>
                            <option value="روانشناسی">روانشناسی</option>
                            <option value="حقوق">حقوق</option>
                            <option value="علوم زمین">علوم زمین</option>
                            <option value="مدیریت و حسابداری">مدیریت و حسابداری</option>
                            <option value="ادبیات">ادبیات</option>
                            <option value="الهیات و ادیان">الهیات و ادیان</option>
                            <option value="اقتصاد و علوم سیاسی">اقتصاد و علوم سیاسی</option>
                            <option value="معماری">معماری</option>
                            <option value="فیزیک">فیزیک</option>
                            <option value="شیمی">شیمی</option>
                            <option value="ریاضی و علوم کامپیوتر">ریاضی و علوم کامپیوتر</option>
                            <option value="تربیت بدنی">تربیت بدنی</option>
                            <option value="عمران و آب و فاضلاب">عمران و آب و فاضلاب</option>
                            <option value="مکانیک">مکانیک</option>
                            <option value="other">سایر</option>
                        </select>
                    </div>
                    <div class="form-group" id="other_faculty" style="display: none;">
                        <label class="control-label col-sm-2">نام دانشکده:</label>
                        <div class="col-sm-5">
                            <input type="text" name="otherFacultyName" class="form-control" placeholder="نام دانشکده را وارد کنید">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">نحوه‌ی اسکان:</label>
                        <div class="radio col-sm-3">
                            <label style="width: 100%"><input type="radio" value="true" name="isDormSettler">در خوابگاه ساکن است</label>
                        </div>
                        <div class="radio col-sm-3">
                            <label style="width: 100%"><input type="radio" value="true" name="isNotDormSettler" >در خوابگاه ساکن نیست</label>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2">توضیحات بیشتر درباره‌ی مددجو:</label>
                        <div class="col-sm-5">
                            <textarea name="moreInfo" class="form-control" rows="4" placeholder="در مورد سطح و نوع نیاز مددجو برای ما بنویسید..."></textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">نحوه‌ی اطلاع شما در مورد نیازمندی دانشجوی مددجو:</label>
                        <div class="col-sm-5">
                            <textarea name="awarenessInfo" class="form-control" rows="4" placeholder="در مورد سطح و نوع نیاز مددجو برای ما بنویسید..."></textarea>
                        </div>
                    </div>

                    <%
                        if((dto != null && dto.getState() != 1) || dto == null)
                        {
                    %>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="submit" class="btn btn-default" style="background-color: #f2f2f2; color: #777;">ثــبــت</button>
                            <!-- <div class="g-recaptcha" data-sitekey="6LdbBBsUAAAAAE2H11rzHeFOhrbkjnh9JIZG_HcY"></div> -->
                        </div>
                    </div>
                    <%
                    }else {
                    %>
                    <h5 class="col-sm-offset-2 col-sm-10" style="color: #41985c; margin-bottom: 18px;">اطلاعات شما با موفقیت ثبت گردیدند.</h5>
                    <%
                        }
                    %>

                </div>
            </div>
        </div>
    </form:form>
</div>

<div class="container">
    <div class="row" style="font-family:Gulf-semibold; background-color:#f2f2f2; margin-top: 15px; padding-top:10px; color: #777;">
        <div class="col-sm-4"></div>
        <div class="col-sm-4" style="text-align: center; font-size: 20px;">
            <span class="fa fa-envelope-o" aria-hidden="true" style="font-size: 25px; vertical-align: middle"></span><span style="vertical-align: middle"> &nbsp خبرنامه امید نو  </span>
            <div style="margin-top: 15px;">
                <form:form method="post" action="/recommendation/newsLetter">
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
</div>
</body>
</html>
