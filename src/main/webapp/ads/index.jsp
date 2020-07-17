<%--
  Created by IntelliJ IDEA.
  User: andrewbrought
  Date: 7/17/20
  Time: 9:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
   <jsp:include page="/partials/head.jsp">
       <jsp:param name="title" value="Ads Lister"/>
   </jsp:include>
</head>
<body>
    <jsp:include page="/partials/navbar.jsp" />
    <div class="container">
        <h1>Welcome to AdLister!</h1>
        <C:forEach items="${ads}" var="ad" >
            <div col-md-5>
                <h3>${ad.title}</h3>
                <p>${ad.description}</p>
            </div>
        </C:forEach>
    </div>

</body>
</html>
