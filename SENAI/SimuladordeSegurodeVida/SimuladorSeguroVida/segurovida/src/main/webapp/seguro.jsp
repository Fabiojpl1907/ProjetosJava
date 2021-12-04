<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.text.DecimalFormat"%>
<%@ page import="segurovida.Segurado"%>
<%
DecimalFormat df = new DecimalFormat("#,##0.00");
Segurado s = new Segurado();
s.idade = Integer.parseInt(request.getParameter("idade"));
s.nome = request.getParameter("nome");
s.nascimento = request.getParameter("nasc");
// formata data de AAAA-MM-DD para DD/MM/AAAA
//                 0123456789
String dnasc = s.nascimento.substring(8, 10) + "/" +
				s.nascimento.substring(5, 7) + "/" +
				s.nascimento.substring(0, 4);
s.profissao = Integer.parseInt(request.getParameter("prof"));
s.sexo = request.getParameter("sexo");
s.fumante = Boolean.parseBoolean(request.getParameter("fuma"));
String sx = request.getParameter("salario");
//converte string salario para float
String srx = "";
srx = sx.replace(".",""); // elimina pontos de milhar
srx = srx.replace(",","."); // troca vírgula decimal por ponto
float sr = Float.parseFloat(srx);
s.salario = sr;
String fmx="";
if(s.fumante)
	fmx = "Sim";
else
	fmx = "Não";
s.CalcularSeguro();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simulador Cálculo de Seguro de Vida</title>
<link rel="stylesheet" type="text/css" href="estilos.css" />
</head>
<body>
<div>Simulador Cálculo de Seguro de Vida</div> <br>
<table>
<tr><td>Nome</td><td><%=s.nome%></td></tr>
<tr><td>Nascimento</td><td style="text-align:right;"><%=dnasc%></td></tr>
<tr><td>Idade</td><td style="text-align:right;"><%=s.idade%></td></tr>
<tr><td>Sexo</td><td style="text-align:right;"><%=s.sexo%></td></tr>
<tr><td>Fumante</td><td style="text-align:right;"><%=fmx%></td></tr>
<tr><td>Salário</td><td style="text-align:right;"><%=sx%></td></tr>
<tr><th colspan=2>Resultado</th></tr>
<tr><td>Mensalidade</td><td style="text-align:right;"><%=df.format(s.mensalidade)%></td></tr>
<tr><td>Cobertura</td><td style="text-align:right;"><%=df.format(s.cobertura)%></td></tr>
</table>
<form action="index.jsp" method="get">
<input type="submit" value="Voltar">
</form>
</body>
</html>