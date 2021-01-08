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
    <!-- 引入样式 -->
    <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
    <!-- 引入vue -->
    <script src="https://unpkg.com/vue/dist/vue.js"></script>
    <!-- 引入element-ui组件库 -->
    <script src="https://unpkg.com/element-ui/lib/index.js"></script>
</head>
<body style="margin: 0;">
<div id="app" class="container" style="background-image: url(login.jpg);">

    <div style="width: 600px; height: 100%; float: right; margin-top: 300px">
        <div style="width: 350px; height: 50px; display: flex; align-items: center; margin-top: 10px;">
            <h1>Cash Register System</h1>
        </div>
        <div style="height: 25px"></div>
        <div class="box-info">
            <el-input v-model="dataForm.username" placeholder="账号" @keyup.enter="dataFormSubmit"></el-input>
        </div>
        <div style="height: 5px"></div>
        <div class="box-info">
            <el-input v-model="dataForm.password" placeholder="密码" type="password" @keyup.enter="dataFormSubmit"></el-input>
        </div>
        <div style="height: 5px"></div>
        <div class="box-info" style="width: 200px;">
            <el-input v-model="dataForm.captcha" placeholder="验证码" style="width:200px" @keyup.enter="dataFormSubmit"></el-input>
            <div class="code-img">
                <img :src="captchaPath" @click="getCaptcha()" alt="">
            </div>
        </div>
        <div style="height: 15px"></div>
        <el-button @click="login" type="primary" style="width: 350px" @click="dataFormSubmit">登录</el-button>
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
                },
                captchaPath: ''
            }
        },
        created() {
            this.getCaptcha()
        },
        methods: {
            // 提交表单
            dataFormSubmit: throttle(function(query) {
                if (!this.dataForm.userName) {
                    this.$message({
                        message: '请输入账号',
                        type: 'warning'
                    })
                } else if (!this.dataForm.password) {
                    this.$message({
                        message: '请输入密码',
                        type: 'warning'
                    })
                } else if (!this.dataForm.captcha) {
                    this.$message({
                        message: '请输入验证码',
                        type: 'warning'
                    })
                } else {
                    this.onSubmit = true
                    this.$http({
                        url: this.$http.adornUrl('/sys/login'),
                        method: 'post',
                        data: this.$http.adornData({
                            'username': this.dataForm.userName,
                            'password': this.dataForm.password,
                            'uuid': this.dataForm.uuid,
                            'captcha': this.dataForm.captcha
                        })
                    }).then(({
                                 data
                             }) => {
                        if (data && data.code === 0) {
                            this.$cookie.set('token', data.token)
                            this.$router.replace({
                                name: 'home'
                            })
                            this.onSubmit = false
                        } else {
                            this.getCaptcha()
                            this.onSubmit = false
                        }
                        this.onSubmit = false
                    }).catch((errer) => {
                        this.getCaptcha()
                        this.onSubmit = false
                    })
                }
            }, 2000),
            // 获取验证码
            getCaptcha() {
                this.dataForm.uuid = getUUID()
                this.captchaPath = this.$http.adornUrl(`/captcha?uuid=${this.dataForm.uuid}`)
                console.info(this.captchaPath)
            }
        }
    })

    function throttle(func, delay) {
        let prev = Date.now()
        return function() {
            let context = this
            let args = arguments
            let now = Date.now()
            if (now - prev >= delay) {
                func.apply(context, args)
                prev = Date.now()
            }
        }
    }
</script>
<style>
    .container {
        position: fixed;
        width: 100%;
        height: 100%;
        background-size: cover;
        background-repeat: no-repeat;
        justify-content: space-around;
        align-items: center;
    }
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
    .box-info input {
        border: 0;
        width: 100%;
        height: 100%;
        outline: none;
        background: rgba(0, 0, 0, 0) !important;
        color: #FFF;
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
