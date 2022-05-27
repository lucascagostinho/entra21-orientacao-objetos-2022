# Conceitos de POO

> - Acoplamento
> - Coes�o
> - Associa��o
> - Agrega��o
> - Composi��o

# Polimorfismo com interfaces
O polimorfismo pode ser praticado com heran�a e com interfaces
Com heran�a os m�todos s�o herdados pela super Classe e tenho varias op��es de como lidar com esses comportamentos herdados

> - Apenas aproveitar os comportamentos
> - Fazer completamente ao meu modo ao criar um mesmo comportamento mas com execu��o diferente
> - Sobrescrever o comportamento herdado para executar de 2 poss�veis formas
>> - Aproveitando o comportamento herdado e fazer algum complemento
>> - Fazer completamente a minha maneira

Com interfaces ser� necess�rio criar um elemento do tipo interface no projeto e inserir apenas a declara��o dos m�todos sem a implementa��o 

A diferen�a � que as interfaces apenas listam os comportamentos e as classes que desejem ter esses comportamentos , ser�o respons�veis por implementar os detalhes.

# Detalhes

## Acoplamento
**Acoplamento fraco ou baixo acoplamento:** os componentes de um sistema s�o interconectados de modo que um dependa do outro o m�nimo poss�vel.

**Acoplamento forte ou alto acoplamento:** Os componentes s�o interconectados de uma forma t�o dependente que � praticamente imposs�vel alterar um deles sem causar efeitos colaterais em todo ou em grande parte do sistema.

**Classes fortemente acopladas:** cont�m um grande n�mero de intera��es e depend�ncias, enquanto que nas classes com acoplamento fraco, ocorre o oposto, em que as depend�ncias entre as classes s�o resolvidas atrav�s de interfaces p�blicas bem definidas, reduzindo o m�ximo poss�vel as depend�ncias diretas.

� praticamente imposs�vel desenvolver software sem acoplamento nenhum, mas � desej�vel que o acoplamento seja o mais fraco poss�vel.


## Coes�o
Coes�o est� ligado ao princ�pio da responsabilidade �nica, onde uma classe deve ter apenas uma �nica responsabilidade e realiz�-la de maneira satisfat�ria, ou seja, uma classe n�o deve assumir responsabilidades que n�o s�o suas . 

Uma vez sendo ignorado este princ�pio, passamos a ter problemas, como dificuldades de manuten��o e de reuso.


## Associa��o
Associa��o � a rela��o entre duas classes distintas que se estabelecem por meio de seus objetos. A associa��o pode ser um para um, um para muitos, muitos para um, muitos para muitos. 

## Agrega��o
� uma forma especial de associa��o onde:  

> - � uma associa��o unidirecional, ou seja, um relacionamento de m�o �nica.
	Por exemplo, o departamento pode ter alunos, mas vice-versa n�o � poss�vel e, portanto, de natureza unidirecional.
> - Na agrega��o, ambas as entradas podem sobreviver individualmente, o que significa

## Composi��o
Composi��o � uma forma restrita de agrega��o em que duas entidades s�o altamente dependentes uma da outra.  

> - Representa um relacionamento parcial .
> - Na composi��o, ambas as entidades s�o dependentes uma da outra.
> - Quando h� uma composi��o entre duas entidades, o objeto composto n�o pode existir sem a outra entidade.

## Interfaces
Da merma forma que criamos Classes podemos criar Interfaces

Nas interfaces devemos apenas escrever declara��es de m�todos mas sem a implementa��o.

Se precisar adicionar atributos eles devem ser est�ticos, pois n�o � poss�vel instanciar objetos com interfaces, ou seja, os atributos ser�o compartilhados com todos que implementarem a interface