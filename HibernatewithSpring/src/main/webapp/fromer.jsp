<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
*{
margin:0px;
padding:0px;
}
.header{
height:100px;
width:100%;
background-color:blue;
color:white;
}
.leftside{
height:500px;
width:49%;
background-color:whi;
float:left;

}
.rightside{
height:500px;
width:49%;
background-color:white;
float:left;
}

p{
font-size:50px;
margin-left:40%;
}

p2{
font-size:30px;
margin-top:300px;
margin-left:100px;
}

</style>
<script>
function loadDoc() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
      var data = this.response;
      var obj= JSON.parse(data);
      document.getElementById("demo").innerHTML= obj.name+ obj.roll;
      console.log(obj.name);
    }
  };
  xhttp.open("GET", "locations", true);
  xhttp.send();
}
</script>
</head>
<body>
<div class="maindiv">
<div class="header">
<p> Welcome </p>
</div>
<form action="hellore" method="get">
<div class="leftside">
<p2> Enter the roll no </p2>
<br>
<br>
<p2> Enter the name </p2>

</div>
<div class="rightside">
<p2><input type="text" name="rollno" > </p2>
<br>
<br>
<br>
<p2><input type="text" name="Name" > </p2>
<br>
<br>
<p2> <input type="submit" name="Add details"></p2>
</div>
</form>
<div>
<div id="demo"><h2>somendra here</h2>
<button type="button" onclick="loadDoc()">Change Content</button>
</div>
 </div>
</body>
</html>