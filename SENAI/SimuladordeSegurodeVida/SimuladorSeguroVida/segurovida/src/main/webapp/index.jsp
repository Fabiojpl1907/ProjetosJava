<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Simulador Cálculo de Seguro de Vida</title>
<link rel="stylesheet" type="text/css" href="estilos.css" />
<script src="funcoes.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.maskedinput/1.4.1/jquery.maskedinput.min.js"></script>
<script src = "https://cdnjs.cloudflare.com/ajax/libs/jquery-maskmoney/3.0.2/jquery.maskMoney.min.js"></script>
<!--Construção de máscaras pelo JQUERY-->
<script type="text/javascript">  
  // a  Representa caracteres alfabéticos (letras) (A-Z,a-z)
  // a  Porém 'a' não permite acentuação nem ç 
  // 9  Representa caracteres numéricos (números) (0-9)
  // *  Representa caracteres alfanuméricos (letras e números) (A-Z,a-z,0-9)
  $(function() {
  $('.mask-real').maskMoney({showSymbol:true,symbol:'R$ ', 
  decimal:',', thousands:'.', allowZero:true}); // valor monetário
  });
</script>
</head>
<body>
<div>Simulador Cálculo de Seguro de Vida</div> <br>
<form action="seguro.jsp" method="post">
<input type="hidden" id="idade" name="idade">
<table>
<tr><td>Nome</td>
<td><input type="text" name="nome" required></td></tr>
<tr><td>Nascimento</td>
<td><input type="date" id="nasc" name="nasc" required></td></tr>
<tr><td>Profissão</td>
<td><select id="prof" name="prof" required>
<option value="">--- Escolha uma profissão ---</option>
<option value="1">1 - Analista de Sistemas</option>
<option value="2">2 - Auxilir Administrativo</option>
<option value="3">3 - Designer Gráfico</option>
<option value="4">4 - Engenheiro</option>
<option value="5">5 - Médico</option>
<option value="6">6 - Mergulhador</option>
<option value="7">7 - Motoboy</option>
<option value="8">8 - Programador de Computador</option>
</select>
</td></tr>
<tr><td>Sexo</td>
<td><input type="radio" name="sexo" value="F" checked>Feminino
<input type="radio" name="sexo" value="M">Masculino
</td></tr>
<tr><td>Fumante</td>
<td><input type="radio" name="fuma" value="false" checked>Não
<input type="radio" name="fuma" value="true">Sim
</td></tr>
<tr><td>Salário</td>
<td><input type="text" id="salario" name="salario" required
class="mask-real" style="text-align: right;"></td></tr>
<tr><th colspan=2>
<input type="button" id="verifica" name="verifica" onclick="VerificarIdadeProf()" value="Verificar Restrições">
<input type="submit" id="envia" name="envia" disabled value="Enviar"></th></tr>
</table>
</form>
</body>
</html>