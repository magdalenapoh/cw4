<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<h1 style="background-color:green">
Pogoda dla wybranego miasta
</h1>
<style>

body {
    background-color: lightgrey;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>API Pogodynka</title>
</head>
<body>

<jsp:useBean id="apiService" class="services.PogodaApiService" scope="session" />
<jsp:setProperty name="apiService" property="nazwaMiasta" />

	
	<form action="index.jsp" method="post">
		<select name="nazwaMiasta">
			<option value="Warszawa">Warszawa</option>
			<option value="Gdansk">Gdańsk</option>
			<option value="Krakow">Kraków</option>
			<option value="Wroclaw">Wrocław</option>
			<option value="Poznan">Poznań</option>
			<option value="Lodz">Łódź</option>
			<option value="Katowice">Katowice</option>
		</select>
		<p><input type="submit" value="wybierz"></p>
	</form>
		
       
        
	<p>Informacje dla miasta: ${apiService.getAll().name}</p>
	<p>Poziom zachmurzenia: ${apiService.getAll().clouds.all}%</p>
	<p>Temperatura [C]: ${apiService.getAll().main.temp} °C</p>
	<p>Ciśnienie: ${apiService.getAll().main.pressure} hPa</p>
	<p>Prędkość wiatru: ${apiService.getAll().wind.speed} m/s</p>
	
</body>
</html>