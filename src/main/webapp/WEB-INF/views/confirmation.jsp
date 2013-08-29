<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css"/>
    <script type="text/javascript" src="/resources/js/lib/jquery.min.js"></script>
    <script type="text/javascript" src="/resources/js/lib/json3.min.js"></script>
    <script type="text/javascript" src="/resources/js/lib/bootstrap-progressbar.min.js"></script>
    <script type="text/javascript" src="/resources/js/app/confirmation.js"></script>
    <style type="text/css">
        .progress {
            margin: auto;
            width: 500;
            margin-top: 100;
        }
        #congratulation {
            margin: auto;
            width: 600px;
            margin-top: 100;
        }
    </style>
</head>
<body>
    <div id="congratulation" style="display: none;">
    	<h2>Congratulations, your information has been submitted successfully.</h2>
    	<div>
    		<p>Here is the information you filled:</p>
            <div id="info"></div>
    	</div>

    </div>
    <div class="progress progress-striped">
        <div class="bar bar-success" aria-valuetransitiongoal="100"></div>
    </div>
</body>
</html>
