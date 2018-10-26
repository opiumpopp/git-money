<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>礼钱管理系统</title>
</head>
<body>
    <input type="hidden" id="queryId" value="${gitMoney.id!''}">
    姓名：<input type="text" id="updateName" value="${gitMoney.name!''}"><br/>
    礼钱：<input type="text" id="updateMoney" value="${gitMoney.money!''}">
    <script type="text/javascript" src="js/jquery-1.11.0.js"></script>
    <script type="text/javascript" src="js/git-update-git-money.js"></script>
</body>
</html>