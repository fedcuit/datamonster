<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
    <title>Suncorp - Funeral Plan</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/resources/css/main.css"/>
    <script type="text/javascript" src="/resources/js/jquery.min.js"></script>
    <script type="text/javascript" src="/resources/js/json3.min.js"></script>
    <script type="text/javascript" src="/resources/js/bootstrap-progressbar.min.js"></script>
    <script type="text/javascript" src="/resources/js/confirmation.js"></script>
</head>
<body>
    <div class="container">
        <div id="congratulation">
            <img src="/resources/img/suncorp-logo.png">
            <h1>Application for Funeral Insurance</h1>
            <img src="/resources/img/step2.png">
            <div id="info">
                
                <table>
                    <thead>
                    <tr>
                        <td>Date of Birth</td>
                        <td>Gender</td>
                        <td>Product</td>
                        <td>Cover Amount</td>
                        <td>Monthly Premium</td>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>2013-08-08</td>
                        <td>Male</td>
                        <td>Fortnightly</td>
                        <td>$6,000,000</td>
                        <td>$11.51</td>
                    </tr>
                    </tbody>
                </table> 
                <h2 class="info-title">Application Summary:</h2>  
                <h3 class="summary">Your monthly premium amount is: <span class="number">$11.51</span> </h3> 
            </div>
            <h2>Congratulations, your information has been submitted successfully as above.</h2>
        </div>
        <div class="progress progress-striped">
            <div class="bar bar-success" aria-valuetransitiongoal="100"></div>
        </div>
    
    </div>


</body>
</html>
