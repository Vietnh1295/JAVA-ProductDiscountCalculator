<%--
  Created by IntelliJ IDEA.
  User: vietnh
  Date: 09/07/2019
  Time: 08:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <style type="text/css">
        #content {
            width: 450px;
            margin: 0 auto;
            padding: 0px 20px 20px;
            background: white;
            border: 2px solid navy;
        }

        h2 {
            color: navy;
        }

        label {
            width: 10em;
            padding-right: 1em;
            float: left;
        }

        #Product input {
            float: left;
            width: 15em;
            margin-bottom: .5em;
        }

        #buttons input {
            float: left;
            margin-bottom: .5em;
        }

        br {
            clear: left;
        }
    </style>
</head>
<body>
<div id="content">


    <h2>Ứng dụng Product Discount Calculator </h2>
    <form method="post" action="/Calculate">
        <label>Product Description</label>
        <div id="Product">
            <input type="text" name="Product" size="30" placeholder="Product"></br>
            <label>List Price</label>
            <input type="text" name="Price" size="30" placeholder="Price"> </br>
            <label>Discount Percent</label>
            <input type="text" name="Discount" size="30" placeholder="Discount"></br>
        </div>
        <div id="buttons">
            <label>&nbsp;</label>
            <input type="submit" value="Calculate Discount">
        </div>
    </form>


</div>
</body>
</html>
