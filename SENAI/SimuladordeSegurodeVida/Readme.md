## SA2 - Atividade 2 

O **App Simulador de Seguro de Vida** é uma aplicação em **Java Web** que deverá ser executada na **IDE Eclipse**. Esta aplicação irá simular valores de mensalidade de seguro de vida para alguns perfis de clientes.

A aplicação possui em sua **regra de negócio** valores diferentes, por exemplo: idade, sexo, salário e profissão. A partir desses valores são realizados **cálculos aritméticos** que informam o valor a ser pago.

**implemente** o método "**CalcularSeguro()**" na **classe** Java "**Segurado"** com as regras de negócios descritas abaixo, utilizando a **IDE Eclipse.**



**Atributos:** nome, nascimento, fumante, sexo, profissão, salário, idade, mensalidade, cobertura.

**Método:** CalcularSeguro();

**
**

**Regras de negócios:**



- Idade entre 18 e 65 anos.



**Não pertencer ao seguinte grupo de profissionais:**



- Motoboy;
- Mergulhador.



**Fórmula de cálculo do pagamento do valor mensal do seguro de vida:**



- 5% do salário atual;
- Fumante: acréscimo de 2% sobre o salário.



**Sexo masculino:**



- Idade entre 18 e 25: sem acréscimo;
- Idade entre 26 e 45: acréscimo de 2% sobre o salário;
- Idade entre 46 e 65: acréscimo de 3% sobre o salário.



**Sexo feminino:**



- Idade entre 18 e 25: sem acréscimo;
- Idade entre 26 e 45: acréscimo de 1% sobre o salário;
- Idade entre 46 e 65: acréscimo de 2% sobre o salário.



**Valor de cobertura:**



- Salário até 1.500,00: 150.000,00;
- Salário maior 1.500,00 e até 3.000,00: 250.000,00.
- Salário maior 3.000,00 e até 5.000,00: 350.000,00;
- Salário maior 5.000,00: 500.000,00.



**Profissões:**



1. Analista de Sistemas;
2. Auxiliar Administrativo;
3. Designer Gráfico;
4. Engenheiro;
5. Médico;
6. Mergulhador;
7. Motoboy;
8. Programador de Computador.