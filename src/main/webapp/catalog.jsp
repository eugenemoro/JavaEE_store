<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <link rel="stylesheet" href="style.css">
    <title>Catalog</title>
</head>
<body>
    <div class="container">
        <%@include file="/WEB-INF/jspf/menu.jspf"%>
        <div class="main">
            <h1>Catalog</h1>
            <div class="showcase">
                <jsp:useBean id = "productList" class="ru.morozov.onlinestore.business.ProductList" scope="request" />
                <c:forEach items="${productList.products}" var="product">
                    <div class="product">
                        ${product}
                    </div>
                </c:forEach>
            </div>
        </div>
        <%@include file="/WEB-INF/jspf/footer.jspf"%>
    </div>    
</body>
</html>