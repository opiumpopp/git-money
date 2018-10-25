<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>礼钱管理系统</title>
    <link rel="stylesheet" href="css/mmGrid.css" />
    <link rel="stylesheet" href="css/layer.css" />
    <!--分页样式-->
    <!--<link rel="stylesheet" href="css/mmPaginator.css" />-->
</head>
<body>
    <input type="button" id="add" value="新增" /><br/>
    姓名：<input type="text" id="name" value="" />
    <input type="button" id="select" value="查询" />

    <!-- mmgrid分页显示插件begin -->
    <div id="mmgrid_table" class="mmGrid" style="width: auto; height: auto;"></div>
    <!--<div id="page" style="text-align: right;" class="mmPaginator"></div>-->
    <!-- mmgrid分页显示插件end -->

    <script type="text/javascript" src="js/jquery-1.11.0.js"></script>
    <script type="text/javascript" src="js/mmGrid.js"></script>
    <!--分页js-->
    <!--<script type="text/javascript" src="js/mmPaginator.js"></script>-->
    <script type="text/javascript" src="js/layer.js"></script>
    <script type="text/javascript" src="js/git-money.js"></script>
</body>
</html>