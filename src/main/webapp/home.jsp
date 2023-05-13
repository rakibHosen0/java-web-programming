<%--
  Created by IntelliJ IDEA.
  User: Rakib
  Date: 5/13/2023
  Time: 12:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>eShoppers</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/vendor/bootstrap.min.css" />
</head>
<body style="padding-top: 70px">

<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top mb-5">
    <div class="container">
        <a class="navbar-brand" href="<c:url value="/home"/> ">eShoppers</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav ms-auto">
                <a class="nav-link active" aria-current="page" href=" <c:url value="/home"/> ">Home</a>
                <a class="nav-link" href="#">About</a>
            </div>
        </div>
    </div>
</nav>

<div class="container mt-5">
    <div class="alert alert-dark">
        <h1>Welcome to e-Shoppers</h1>
        <img src=" <c:url value="/img/cart.jpg"/> " style="height: 200px" alt="" />
    </div>

</div>

<div class="container">
    <div class="row">
        <c:forEach var="product" items="${products}">
            <div class="col-sm-4">
                <div class="card h-100 mb-4">
                    <div class="card-body">
                        <h5 class="card-title">
                            <c:out value="${product.name}"/>
                        </h5>
                        <p class="card-text">
                            <c:out value="${product.description}"/>
                        </p>
                        <p class="card-text">
                                 <c:out value="${product.price}"/>
                        </p>

                        <a href="#" class="card-link btn btn-outline-info"> Add to Cart</a>
                </div>
                     </div>
            </div>
        </c:forEach>
    </div>
</div>

<footer class="footer mt-auto py-3 fixed-bottom alert-dark">
    <div class="container text-center">
        <span class="text-muted">
            Copyright &copy; eshoppers.com 2023
        </span>
    </div>

</footer>


</body>
</html>
