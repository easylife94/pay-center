<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <form action="/login" method="post">
        账号：<input name="loginName" type="text"/><br/>
        密码：<input name="password" type="password"/><br/>
        <#if message??>
            ${message}
        </#if>
        <input type="submit" name="登陆"/>
    </form>
</body>
</html>