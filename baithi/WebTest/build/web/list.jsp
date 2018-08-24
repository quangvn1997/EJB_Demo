<%-- 
    Document   : list
    Created on : Aug 24, 2018, 7:29:49 PM
    Author     : quang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <!-- Google Fonts -->
        <link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>
        <link href="css/main1.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container w-75"  style="background-color: #eee;">
            <div class="panel-heading">
                <div class="panel-title text-center">
                    <h1 class="title1" align="center">List</h1>
                    <hr />
                </div>
            </div>
            <div>
                <table class="table">
                    <thead class="thead-dark">
                        <tr>
                            <th scope="col">id</th>
                            <th scope="col">name</th>
                            <th scope="col">price</th>
                            <th scope="col">quantity</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${lists}" var="item">
                            <tr>
                                <th scope="row">${item.codeorder}</th>
                                <td>chuyển tiền</td>
                                <td>${item.moneyorder}</td>
                                <td>${item.feeorder}</td>
                                <td>@${item.dateorder}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
