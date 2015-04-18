<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Product Management</title>
</head>
<body>
<h1>Список продуктов</h1>
<form:form action="product.do" method="POST" commandName="product">
    <table>
        <tr>
            <td>Product ID</td>
            <td><form:input path="productId" /></td>
        </tr>
        <tr>
            <td>название продукта</td>
            <td><form:input path="productName" /></td>
        </tr>
        <tr>
            <td>стоимость продукта</td>
            <td><form:input path="productCost" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" name="action" value="Add" />
                <input type="submit" name="action" value="Edit" />
                <input type="submit" name="action" value="Delete" />
                <input type="submit" name="action" value="Search" />
            </td>
        </tr>
    </table>
</form:form>
<br>
<table border="1">
    <th>ID</th>
    <th>Product name</th>
    <th>Product cost</th>
    <c:forEach items="${productList}" var="product">
        <tr>
            <td>${product.productId}</td>
            <td>${product.productName}</td>
            <td>${product.productCost}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>