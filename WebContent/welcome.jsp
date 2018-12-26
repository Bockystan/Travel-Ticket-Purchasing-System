<%@ page language="java" contentType="text/html; charset=utf-8"
    %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>购物页面</title>
<style>
    td{border:1px solid green;}
</style>
</head>
<body>
 <!--创建数据表 create table `goods` (id int not null auto_increament primary key,goods_name varchar(20), goodspic varchar(30),goods_name_en varchar(20)); -->
    <p>欢迎用户:
    
    
    
    
    <%out.print(request.getParameter("username"));%>
    </p>
    <p>请选购商品并填写所需要购买的数量</p>
    <form action="order.jsp" method="post">
        <table style="border:1px solid green;">
            <thead>
                <tr>
                    <th>编号</th>
                    <th>商品名</th>
                    <th>单价</th>
                    <th>生产日期</th>
                    <th>保质期</th>>
                    <th>购买数量</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td><img src="./images/apple.jpg"/>苹果</td>
                    <td>￥5.0</td>
                    <td>2017-9-10</td>
                    <td>6个月</td>
                    <td><input type="text" name="1" id="" placeholder="0"></td>
                </tr>
                <tr>
                    <td>2</td>
                    <td><img src="./images/orange.jpg"/>橘子</td>
                    <td>￥3.0</td>
                    <td>2017-9-10</td>
                    <td>6个月</td>             
                    <td><input type="text" name="2" id="" placeholder="0"></td>
                </tr>
                <tr>
                    <td>3</td>
                    <td><img src="./images/banana.jpg"/>香蕉</td>
                    <td>￥2.0</td>
                    <td>2017-9-10</td>
                    <td>6个月</td>
                    <td><input type="text" name="3" id="" placeholder="0"></td>
                </tr>
                <tr>
                    <td>4</td>
                    <td><img src="./images/youzi.jpg"/>柚子</td>
                    <td>￥4.5</td>
                    <td>2017-9-10</td>
                    <td>6个月</td>          
                    <td><input type="text" name="4" id="" placeholder="0"></td>
                </tr>
                <tr>
                    <td>5</td>
                    <td><img src="./images/peach.jpg"/>桃子</td>
                    <td>￥5.5</td>
                    <td>2017-9-10</td>
                    <td>6个月</td>      
                    <td><input type="text" name="5" id="" placeholder="0"></td>
                </tr>
           
        </table>
        <input type="submit" value="提交订单">
        <!-- <button type="submit">提交订单</button> -->
    </form>
</body>
</html>