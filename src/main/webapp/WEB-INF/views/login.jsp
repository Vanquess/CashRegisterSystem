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
    <title>Login</title>
    <!-- 引入样式 -->
    <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
    <!-- import Vue before Element -->
    <script src="https://unpkg.com/vue/dist/vue.js"></script>
    <!-- 引入组件库 -->
    <script src="https://unpkg.com/element-ui/lib/index.js"></script>
</head>
<body>
<div id="app">

    <div style="width: 500px; height: 100%; float: right; margin-top: 200px">
        <div style="width: 350px; height: 50px; display: flex; align-items: center; margin-top: 10px;">
            <h1>Cashier System</h1>
        </div>
        <div class="box-info">
            <el-input v-model="dataForm.username" placeholder="账号"></el-input>
        </div>
        <div style="height: 5px"></div>
        <div class="box-info">
            <el-input v-model="dataForm.password" placeholder="密码" type="password"></el-input>
        </div>
        <div style="height: 5px"></div>
        <div class="box-info">
            <el-input v-model="dataForm.captcha" placeholder="验证码"></el-input>
        </div>
        <div style="height: 15px"></div>
        <el-button @click="login" type="primary" style="width: 350px">登录</el-button>
    </div>

</div>
</body>
<script>
    new Vue({
        el: '#app',
        data: function() {
            return {
                visible: false,
                dataForm: {
                    username: '',
                    password: '',
                    captcha: ''
                }
            }
        },
        methods: {
            login() {

            }
        }
    })
</script>
<style>
    .box-info {
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
</style>
</html>
