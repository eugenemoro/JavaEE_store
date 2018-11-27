<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <link rel="stylesheet" href="style.css">
    <title>Contacts</title>
</head>
<body>
    <div class="container">
        <%@include file="/WEB-INF/jspf/menu.jspf"%>
	    <div class="main">
            <h1>Contact us!</h1>
            <form action="URL" >
                <fieldset class="contact_form">
                    <legend><b>Fill me!</b></legend>
                    Name <input type = "text" placeholder = "Name"><br>
                    Email <input type = "email" placeholder = "Email"><br>
                    Subject <input type = "text" placeholder = "Subject"><br><br>
                    Message<br>
                    <textarea name="Message" id="msg" cols="30" rows="10"></textarea><br>
                    <input type = "submit" value = "Send">
                    <input type = "reset" value = "Clear"><br>
                </fieldset>
            </form><br>
            Мы на карте:<br>
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2245.6794302781186!2d37.62433041553919!3d55.74669869993073!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x46b54af8c2291b63%3A0x133c556714b6d639!2sGoogle+Moscow!5e0!3m2!1sru!2sru!4v1521478735982" style="border:0" allowfullscreen></iframe>
        </div>
        <%@include file="/WEB-INF/jspf/footer.jspf"%>
    </div>    
</body>
</html>