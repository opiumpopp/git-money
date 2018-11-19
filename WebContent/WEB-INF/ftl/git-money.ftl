<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>礼钱管理系统</title>
    <link rel="stylesheet" href="css/mmGrid.css" />
    <link rel="stylesheet" href="css/layer.css" />
    <!--分页样式-->
    <link rel="stylesheet" href="css/mmPaginator.css" />
    <!--页面样式-->
    <link rel="stylesheet" href="css/bbyStyle.css" />
    <link rel="stylesheet" href="css/select2.min.css" />
    <link rel="stylesheet" href="css/jquery.autocomplete.css" />
    <link rel="stylesheet" href="css/style-bby.css" />
    <link rel="stylesheet" href="css/reset.css" />
    <link rel="stylesheet" href="css/yg-cds-style.css" />
    <link rel="stylesheet" href="css/font-awesome.min.css" />
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <link rel="stylesheet" href="css/uniform.default.css" />
    <link rel="stylesheet" href="css/bootstrap-select.min.css" />
    <link rel="stylesheet" href="css/jquery.jerichotab.css" />
    <link rel="stylesheet" href="css/WdatePicker.css" />
</head>
<body class="only-body-page-content">
    <div class="bg-color-gray0 area_btn0">
        <a class="btn btn-qing btn-add" id="addBtn" href="javascript:;">新增</a>
    </div>
    <div class="blank15"></div>
    <div class="search-content-wrap">
        <ul class="c-h-ul search-ul query-ul">
            <li>
                <label class="c-h-ul-li-title" for="name">姓名：</label>
                <input type="text" name="name" id="name" class="form-control input-small">
            </li>
            <li>
                <label class="c-h-ul-li-title"></label>
                <a class="btn btn-qing" id="searchBtn" href="javascript:;">查询</a>
                <a id="reset-button" class="btn btn-white" href="javascript:;">重置</a>
            </li>
        </ul>
    </div>
    <div class="blank15"></div>
    <!-- mmgrid分页显示插件begin -->
    <div id="mmgrid_table" class="mmGrid" style="width: auto; height: auto;"></div>
    <div id="page" style="text-align: right;" class="mmPaginator"></div>
    <!-- mmgrid分页显示插件end -->

    <script type="text/javascript" src="js/jquery-1.11.0.js"></script>
    <script type="text/javascript" src="js/mmGrid.js"></script>
    <!--分页js-->
    <script type="text/javascript" src="js/mmPaginator.js"></script>
    <script type="text/javascript" src="js/layer.js"></script>
    <script type="text/javascript" src="js/git-money.js"></script>
</body>
</html>