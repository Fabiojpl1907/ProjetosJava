**Projeto Banco Digital** 



1. Objetivo - Entender Conceitos basicos de Programação Orientada a Objeto  
1. Feito em Eclipse
1. Principiais conceitos aplicados 

**Abstração**

Habilidade de concentrar-se nos aspectos essenciais de um domínio, ignorando características menos importantes ou acidentais. Nesse contexto, objetos são abstrações de entidades existentes no domínio em questão.



**Encapsulamento**

Encapsular significa esconder a implementação dos objetos, criando assim interfaces de uso mais concisas e fáceis de usar/entender. O encapsulamento favorece principalmente dois aspectos de um sistema: a manutenção e a evolução.

Encapsular - definir uma interface de uso de forma coesa e simples. Não expor mais que o necessário, não externalizar tudo que tenho

Expor uso ->  set - permite alterar
nao expor uso ->    get - Permite somente obter a informação  



**Herança**

Permite que você defina uma classe filha que reutiliza (herda), estende ou modifica o comportamento de uma classe pai. A classe cujos membros são herdados é chamada de classe base. A classe que herda os membros da classe base é chamada de classe derivada.

DRY - Nunca repita voce mesmo - nunca repita um código 

Crio uma classe pai e a classe filha extensa classe pai herda tudo da classe pai

Exemplo :

Classe pai - Conta 

​		atributos da classe pai :  agencia , numero , saldo 

​		métodos da classe pai : sacar , transferir , depositar

Classe filha - Conta Corrente 

​	herda todos os atributos e métodos da classe pai. Falamos que a classe filha extende a clase pai 

​            public class ContaCorrente extends Conta { .... } 

**Interface**

É uma classe abstrata com todos os métodos abstratos  

Classe abstrata solicita alguma implementação que ela sozinha não consegue resolver . Delega a responsabilidade de implementação para a classe que estiver implementando ela .

Classe abstrata não pode ser instanciada. Só que pode instancia-la são as classes filhas . Logo posso tar uma classe como abstrata se não quiser que seja instanciada . Ex. : Não faz sentido ser  instanciada uma conta sem qualificação, precisa ser Conta Corrente ou Conta Poupança .  

Torna mais elegante , define um contrato para a solução . Definir o contrato de uso significa definir os atributos aceitos e mandatórios.  

Todo método em uma interface é publico, não é necessário explicitar como public. 

Faço com que a classe implemente interface criada ( implements ) . 
Exemplo *public abstract class Conta implements iConta { .... }* 

Uso da Interface não é obrigatório mas deixa mais claro as varias opções da entidade 
Exemplo :  No caso de Conta Bancária :  Sacar / Depositar / Transferir / etc .

 



**Polimorfismo**

Capacidade de um objeto poder ser referenciado de várias formas, ou seja, é capacidade de tratar objetos criados a partir das classes específicas como objetos de uma classe genérica. Cuidado, polimorfismo não quer dizer que o objeto fica se transformando, muito pelo contrário, um objeto nasce de um tipo e morre daquele tipo, o que pode mudar é a maneira como nos referimos a ele.



Manipular um objeto da forma mais conveniente a voce . Posso trata como conta ou conta corrente o que fizer mais lógica no momento . Se estou usando um método genérico que esta em conta ou algo especifico que esta em CC.  Conta conta = new Contacorrente()


Muda a forma de referenciar , *<u>não muda o objeto</u>* … 

Usar a hierarquia / diversidade de tipos a seu favor .



**Modificadores**
	public - geral. Todo projeto enxerga
	default - somente dentro do mesmo pacote 
	private - somente  a classe acessa 
	protected -  so que herda , enxerga 

