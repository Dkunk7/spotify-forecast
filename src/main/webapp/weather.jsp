<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Weather Dashboard</title>
</head>

<h1>Spotify Forecast</h1>

<h2>All Users</h2>
<c:forEach var="user" items="${users}">
    <p>User ID: ${user.id}</p>
    <p>Username: ${user.username}</p>
    <p>Email: ${user.email}</p>
    <hr>
</c:forEach>

<h2>All Weather</h2>
<c:forEach var="weather" items="${weatherReports}">
    <p>Weather ID: ${weather.id}</p>
    <p>Location Name: ${weather.locationName}:</p>
    <p>Latitude: ${weather.latitude}</p>
    <p>Longitude: ${weather.longitude}</p>
    <hr>
</c:forEach>

</html>
