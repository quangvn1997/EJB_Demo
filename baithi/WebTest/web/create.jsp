<%-- 
    Document   : create
    Created on : Aug 24, 2018, 7:29:10 PM
    Author     : quang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>add Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
        <!-- Google Fonts -->
        <link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>
        <link href="css/main.css" rel="stylesheet" type="text/css"/>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    </head>
    <body>
        <div class="container">
            <div class="row main">
                <div class="panel-heading">
                    <div class="panel-title text-center">
                        <h1 class="title">Add Product</h1>
                        <hr />
                    </div>
                </div> 
                <div class="main-login main-center">
                    <form class="form-horizontal" method="POST" action="/WebTest/addProduct">
                        <div class="form-group">
                            <label for="id" class="cols-sm-2 control-label">ID</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                    <input type="text" class="form-control" name="id"  placeholder="Enter id Product"/>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="name" class="cols-sm-2 control-label">Name</label>
                            <div class="cols-sm-10">        
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fab fa-jedi-order" aria-hidden="true"></i></span>
                                         <input type="text" class="form-control" name="name"  placeholder="Enter name Product"/>
                                
                                </div>
                            </div>
                        </div>                          
                        <div class="form-group">
                            <label for="price" class="cols-sm-2 control-label">price Product</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fas fa-money-check-alt" aria-hidden="true"></i></span>
                                    <input type="text" class="form-control" name="price" value="${price}"  placeholder="Enter Price Product"/>
                                </div>
                            </div>
                        </div>        

                        <div class="form-group" >
                            <label for="quantity" class="cols-sm-2 control-label">Quantity</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
                                    <input type="text" class="form-control" name="quantity"  placeholder="Enter quantity"/>
                                </div>
                            </div>
                        </div>
                        <div class="form-group ">
                            <input type="submit" class="btn btn-primary btn-lg btn-block login-button" value="add Product"/>
                        </div>
                        <div class="login-register">
                            <a href="index.jsp">Back to home</a>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
