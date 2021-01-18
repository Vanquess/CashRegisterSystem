<%--
  Created by IntelliJ IDEA.
  User: 10431
  Date: 2021/1/3
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cash Register System</title>
    <!-- CSS only -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
          crossorigin="anonymous">
    <!-- JS, Popper.js, and jQuery -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
            crossorigin="anonymous"></script>
</head>
<body style="margin: 0;">
<div class="full-body" style="background-image: url(login.jpg);">
    <div class="login-module">
        <div class="login-module-title">
            <div style="font-size: 2.2em; font-weight: 500;">Cash Register System</div>
        </div>
        <div style="height: 15px"></div>
        <form action="/checkVerify" method="get">
            <div class="login-module-input">
                <input type="text" class="form-control" placeholder="账号" />
            </div>
            <div style="height: 5px;"></div>
            <div class="login-module-input">
                <input type="password" class="form-control" placeholder="密码" />
            </div>
            <div style="height: 5px;"></div>
<%--            <div class="login-module-input" style="width: 200px;">--%>
<%--                <input type="text" class="form-control" placeholder="验证码" />--%>
<%--                <div class="code-img">--%>
<%--                    <a href="javascript:void(0);" title="点击更换验证码">--%>
<%--                        <img id="imgVerify" src="" alt="更换验证码" height="50px" width="134px" onclick="getVerify(this);">--%>
<%--                    </a>--%>
<%--                </div>--%>
<%--            </div>--%>
            <div style="height: 15px;"></div>
            <button type="button" class="btn btn-primary" style="width: 350px;">登录</button>
        </form>
    </div>
</div>
</body>
<script>
    // function getVerify(obj) {
    //     obj.src = "/getVerify?" + Math.random();
    // }
</script>
<style>
    .full-body {
        position: fixed;
        width: 100%;
        height: 100%;
        background-size: cover;
        background-repeat: no-repeat;
        justify-content: space-around;
        align-items: center;
    }

    .login-module {
        width: 350px;
        height: 100%;
        margin: auto;
        position: relative; /*脱离文档流*/
        top: 50%; /*偏移*/
        margin-top: -200px;
    }

    .login-module-title {
        width: 350px;
        height: 50px;
        display: flex;
        align-items: center;
        margin-top: 10px;
    }

    .login-module-input {
        width: 350px;
        height: 50px;
        display: flex;
        align-items: center;
        margin-top: 10px;
        color: #5d5d5d;
        font-size: 14px;
        position: relative;
        border-radius: 4px;
        background: rgba(255, 255, 255, .2);
    }

    .login-module-input input {
        border: 0;
        width: 100%;
        height: 100%;
        outline: none;
        background: rgba(0, 0, 0, 0) !important;
    }

    .code-img {
        width: 134px;
        height: 50px;
        cursor: pointer;
        position: absolute;
        left: 215px;
        top: 0;
        border-radius: 4px;
        overflow: hidden;
    }

    .code-img img {
        width: 100%;
        height: 100%;
    }
</style>
</html>
