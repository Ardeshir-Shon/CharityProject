<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>periodic help</title>
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
    <script>
        function hider(){
            if(document.getElementById("checkbox").checked ==false)
            {
                document.getElementById("divselector").style.display = "none";
            }
            else{
                document.getElementById("divselector").style.display = "block";
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
        function radioHider(){
            if(document.getElementById("radioid").value =="استاد شهید بهشتی هستم")
            {
                document.getElementById("divselector2").style.display = "block";
            }
            else{
                document.getElementById("divselector2").style.display = "none";
            }
        }
    </script>
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
                <a class="navbar-brand" href="home.html">خیریه امید نو</a>
            </div>

            <div class="collapse navbar-collapse" id="myNavbar">
                <ul class="nav navbar-nav">
                    <li><a href="home.html">خانه</a></li>

                    <li class="dropdown active">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">همکاری
                            <span class="caret"></span></a>
                        <ul class="dropdown-menu active">
                            <li><a href="active_members.html">عضویت فعال</a></li>

                            <li class="active"><a href="periodic_help.html">اعلام همکاری</a></li>

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
                    <li>
                        <a href="donate.html">کمک نقدی‌&nbspآنی</a>
                    </li>
                </ul>
                <form class="navbar-form navbar-right">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="جستجو" >
                        <div class="input-group-btn">
                            <button class="btn btn-default" type="submit">
                                <i class="glyphicon glyphicon-search"></i>
                            </button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </nav>
</div>		<div class="container" style="font-family: Gulf;">
    <h4 style="margin-bottom: 15px;">فرم کمک‌‌های ثابت</h4>
    <p id="demo"></p>


    <div class="container" >
        <div class="accordion">
            <div class="accordion-group col-sm-12">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseOne" style="text-decoration: none; color: inherit;"><div class="accordion-heading col-sm-8">کمک‌ نقدی</div></a>
                <div style="min-height: 60px;"></div>
                <div id="collapseOne" class="accordion-body collapse in">
                    <div class="accordion-inner">
                        <form:form class="form-horizontal col-sm-offset-1" method="post" action="/periodHelp/cash">
                            <div class="form-group">
                                <label class="control-label col-sm-2">نام:</label>
                                <div class="col-sm-5">
                                    <input type="text" name="firstName" class="form-control" placeholder="نام خود را وارد کنید">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" >نام خانوادگی:</label>
                                <div class="col-sm-5">
                                    <input type="text" name="lastName" class="form-control" placeholder="نام خانوادگی خود را وارد کنید">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" >شغل:</label>
                                <div class="col-sm-5">
                                    <input type="text" name="occupation" class="form-control" placeholder="شغل خود را وارد کنید">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="control-label  col-sm-offset-2 col-sm-5" >
                                    <div class="checkbox">
                                        <div style="text-align: right; margin-right: 21px; margin-top: -5px;">
                                            <input name="isProfessor" type="checkbox" value="on" id="checkbox" onchange="hider();">استاد دانشگاه شهید بهشتی هستم</input>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2">دانشکده:</label>
                                <select name="facultyName" class="form-control col-sm-2" style="margin-right: 13px;" selected="none" id="selector" onchange="shower();">
                                    <option disabled value="">-- انتخاب کنید --</option>
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
                                <label class="control-label col-sm-2">شماره‌ی موبایل:</label>
                                <div class="col-sm-5">
                                    <input type="text" name="phoneNumber" class="form-control" placeholder="۰۹۱۲۱۲۳۴۵۶۷" style="text-align: left; direction: ltr;">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" >ایمیل (اختیاری):</label>
                                <div class="col-sm-5">
                                    <input type="text" name="email" class="form-control" placeholder="someone@example.com" style="text-align: left; direction: ltr;">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2">تعهد پرداخت به صورت:</label>
                                <select name="timePeriod" class="form-control col-sm-2" style="margin-right: 13px;" selected="none" >
                                    <option disabled value="">-- انتخاب کنید --</option>
                                    <option value="هفتگی">هفتگی</option>
                                    <option value="ماهانه">ماهانه</option>
                                    <option value="فصلی">فصلی</option>
                                    <option value="سالانه">سالانه</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2">مبلغ مورد تعهد:</label>
                                <div class="col-sm-5">
                                    <input name="costOfPay" type="text" class="form-control"  placeholder="عدد | تومان" style="text-align: left; direction: ltr;">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" >رمز عبور:</label>
                                <div class="col-sm-5">
                                    <input name="password" type="password" class="form-control" placeholder="" style="text-align: left; direction: ltr;">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" >تکرار رمز عبور:</label>
                                <div class="col-sm-5">
                                    <input name="passwordRepeat" type="password" class="form-control" placeholder="" style="text-align: left; direction: ltr;">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-offset-2 col-sm-10">
                                    <button type="submit" class="btn btn-default" style="background-color: #f2f2f2; color: #777;">ثــبــت</button>
                                    <!-- <div class="g-recaptcha" data-sitekey="6LdbBBsUAAAAAE2H11rzHeFOhrbkjnh9JIZG_HcY"></div> -->
                                </div>
                            </div>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
        <div class="accordion-group col-sm-12">
            <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseTwo" style="text-decoration: none; color: inherit;"><div class="accordion-heading col-sm-8">کمک غیرنقدی</div></a>
            <div style="min-height: 60px;"></div>
            <div id="collapseTwo" class="accordion-body collapse">
                <div class="accordion-inner">
                    <form:form class="form-horizontal col-sm-offset-1" method="post" action="/periodHelp/nonCash">
                        <div class="form-group">
                            <label class="control-label col-sm-2">نام:</label>
                            <div class="col-sm-5">
                                <input type="text" name="firstName" class="form-control" placeholder="نام خود را وارد کنید">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" >نام خانوادگی:</label>
                            <div class="col-sm-5">
                                <input type="text" name="lastName" class="form-control" placeholder="نام خانوادگی خود را وارد کنید">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" >شغل:</label>
                            <div class="col-sm-5">
                                <input type="text" name="occupation" class="form-control" placeholder="شغل خود را وارد کنید">
                            </div>
                        </div>
                        <%--<div class="form-group">--%>
                            <%--<div class="radio col-sm-offset-2 col-sm-4" id="radioid" onclick="radioHider();">--%>
                                <%--<label style="width: 100%"><input name="isProfessor" type="radio">استاد دانشگاه شهید بهشتی هستم</label>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                        <%--<div class="form-group">--%>
                            <%--<div class="radio col-sm-offset-2 col-sm-4" onclick="radioHider();">--%>
                                <%--<label style="width: 100%"><input name="isStudent" type="radio">دانشجو دانشگاه شهید بهشتی هستم</label>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                        <div class="form-group">
                            <label class="control-label col-sm-2">دانشکده:</label>
                            <select name="facultyName" class="form-control col-sm-2" style="margin-right: 13px;" selected="none" id="selector2" onchange="shower();">
                                <option disabled value="">-- انتخاب کنید --</option>
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
                            <label class="control-label col-sm-2">شماره‌ی موبایل:</label>
                            <div class="col-sm-5">
                                <input type="text" name="phoneNumber" class="form-control" placeholder="۰۹۱۲۱۲۳۴۵۶۷" style="text-align: left; direction: ltr;">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" >ایمیل (اختیاری):</label>
                            <div class="col-sm-5">
                                <input type="text" name="email" class="form-control" placeholder="someone@example.com" style="text-align: left; direction: ltr;">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2">توضیحات بیشتر درباره‌ی حوزه‌ی تخصص و علاقه‌:</label>
                            <div class="col-sm-5">
                                <textarea name="expertiseInfo" class="form-control" rows="4" placeholder="در مورد حوزه‌ی تخصص و علاقه‌ خود برای ما بنویسید..."></textarea>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" >رمز عبور:</label>
                            <div class="col-sm-5">
                                <input type="password" name="password" class="form-control" placeholder="" style="text-align: left; direction: ltr;">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" >تکرار رمز عبور:</label>
                            <div class="col-sm-5">
                                <input type="password" name="passwordRepeat" class="form-control" placeholder="" style="text-align: left; direction: ltr;">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-default" style="background-color: #f2f2f2; color: #777;">ثــبــت</button>
                                <!-- <div class="g-recaptcha" data-sitekey="6LdbBBsUAAAAAE2H11rzHeFOhrbkjnh9JIZG_HcY"></div> -->
                            </div>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
        <div class="accordion-group col-sm-12">
            <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseThree" style="text-decoration: none; color: inherit;"><div class="accordion-heading col-sm-8">کمک‌ نقدی و غیرنقدی</div></a>
            <div style="min-height: 60px;"></div>
            <div id="collapseThree" class="accordion-body collapse">
                <div class="accordion-inner">
                        <form:form class="form-horizontal col-sm-offset-1" method="post" action="/periodHelp/cashAndNonCash">
                            <div class="form-group">
                                <label class="control-label col-sm-2">نام:</label>
                                <div class="col-sm-5">
                                    <input type="text" name="firstName" class="form-control" placeholder="نام خود را وارد کنید">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" >نام خانوادگی:</label>
                                <div class="col-sm-5">
                                    <input type="text" name="lastName" class="form-control" placeholder="نام خانوادگی خود را وارد کنید">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" >شغل:</label>
                                <div class="col-sm-5">
                                    <input type="text" name="occupation" class="form-control" placeholder="شغل خود را وارد کنید">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="radio col-sm-offset-2 col-sm-4" id="radioid" onclick="radioHider();">
                                    <label style="width: 100%"><input name="isProfessor" type="radio">استاد دانشگاه شهید بهشتی هستم</label>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="radio col-sm-offset-2 col-sm-4" onclick="radioHider();">
                                    <label style="width: 100%"><input name="isStudent" type="radio">دانشجو دانشگاه شهید بهشتی هستم</label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2">دانشکده:</label>
                                <select name="facultyName" class="form-control col-sm-2" style="margin-right: 13px;" selected="none" id="selector" onchange="shower();">
                                    <option disabled value="">-- انتخاب کنید --</option>
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
                                <label class="control-label col-sm-2">شماره‌ی موبایل:</label>
                                <div class="col-sm-5">
                                    <input type="text" name="phoneNumber" class="form-control" placeholder="۰۹۱۲۱۲۳۴۵۶۷" style="text-align: left; direction: ltr;">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" >ایمیل (اختیاری):</label>
                                <div class="col-sm-5">
                                    <input type="text" name="email" class="form-control" placeholder="someone@example.com" style="text-align: left; direction: ltr;">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2">تعهد پرداخت به صورت:</label>
                                <select name="timePeriod" class="form-control col-sm-2" style="margin-right: 13px;" selected="none" >
                                    <option disabled value="">-- انتخاب کنید --</option>
                                    <option value="هفتگی">هفتگی</option>
                                    <option value="ماهانه">ماهانه</option>
                                    <option value="فصلی">فصلی</option>
                                    <option value="سالانه">سالانه</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2">مبلغ مورد تعهد:</label>
                                <div class="col-sm-5">
                                    <input name="costOfPay" type="text" class="form-control"  placeholder="عدد | تومان" style="text-align: left; direction: ltr;">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2">توضیحات بیشتر درباره‌ی حوزه‌ی تخصص و علاقه‌:</label>
                                <div class="col-sm-5">
                                    <textarea name="expertiseInfo" class="form-control" rows="4" placeholder="در مورد حوزه‌ی تخصص و علاقه‌ خود برای ما بنویسید..."></textarea>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" >رمز عبور:</label>
                                <div class="col-sm-5">
                                    <input type="password" name="password" class="form-control" placeholder="" style="text-align: left; direction: ltr;">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" >تکرار رمز عبور:</label>
                                <div class="col-sm-5">
                                    <input type="password" name="passwordRepeat" class="form-control" placeholder="" style="text-align: left; direction: ltr;">
                                </div>
                            </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-default" style="background-color: #f2f2f2; color: #777;">ثــبــت</button>
                                <!-- <div class="g-recaptcha" data-sitekey="6LdbBBsUAAAAAE2H11rzHeFOhrbkjnh9JIZG_HcY"></div> -->
                            </div>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-5" style="min-height: 20px;"></div>
    </div>
</div>

<div class="container">
    <div class="row" style="font-family:Gulf-semibold; background-color:#f2f2f2; margin-top: 15px; padding-top:10px; color: #777;">
        <div class="col-sm-4"></div>
        <div class="col-sm-4" style="text-align: center; font-size: 20px;">
            <span class="fa fa-envelope-o" aria-hidden="true" style="font-size: 25px; vertical-align: middle"></span><span style="vertical-align: middle"> &nbsp خبرنامه امید نو  </span>
            <div style="margin-top: 15px;">
                <form:form method="post" action="/periodicHelp/newsLetter">
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

</div>>
</body>
</html>