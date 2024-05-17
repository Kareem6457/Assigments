<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.example.prototype.Prototype" %>
<%@ page import="com.example.prototype.ConcretePrototype1" %>
<%@ page import="com.example.prototype.ConcretePrototype2" %>
<!DOCTYPE html>
<html>
<head>
    <title>Clone Result</title>
</head>
<body>
<h1>Cloned Prototype</h1>
<%
    Prototype prototype = (Prototype) request.getAttribute("prototype");
    if (prototype != null) {
        if (prototype instanceof ConcretePrototype1) {
            System.out.println("Cloned: " + ((ConcretePrototype1) prototype).getName());
        } else if (prototype instanceof ConcretePrototype2) {
            System.out.println("Cloned: " + ((ConcretePrototype2) prototype).getName());
        }
    } else {
        System.out.println("No prototype selected.");
    }
%>
</body>
</html>
