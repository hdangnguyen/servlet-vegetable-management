    <!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta name="viewport" content="width=1,initial-scale=1,user-scalable=1" />
	<title>Login Pages</title>
	
	<link href="http://fonts.googleapis.com/css?family=Lato:100italic,100,300italic,300,400italic,400,700italic,700,900italic,900" rel="stylesheet" type="text/css">
	<link rel="stylesheet" type="text/css" href="assets/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/login-styles.css" type="text/css">
	
</head>
<body>

	<section class="container">
			<section class="login-form">
				<form method="post" action="MainController" role="login">
					<h1>Login</h1>
					<p>Input your infomation to login</p>
					<div class="form-group">
	    				<div class="input-group">
		      				<div class="input-group-addon"><span class="text-primary glyphicon glyphicon-user"></span></div>
							<input type="text" name="userID" placeholder="User ID" required class="form-control" />
						</div>
					</div>
					<div class="form-group">
	    				<div class="input-group">
		      				<div class="input-group-addon"><span class="text-primary glyphicon glyphicon-lock"></span></div>
							<input type="password" name="password" placeholder="Password" required class="form-control" />
						</div>
					</div>
                                        <button type="submit" name="action" value="Login" class="btn btn-block btn-success">Sign in</button>
					<a href="#" class="btn btn-block btn-default">Create an account</a>
				</form>
			</section>
	</section>
</body>
</html>