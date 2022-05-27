# Conceitos de POO

> - Acoplamento
> - Coesão
> - Associação
> - Agregação
> - Composição

# Polimorfismo com interfaces
O polimorfismo pode ser praticado com herança e com interfaces
Com herança os métodos são herdados pela super Classe e tenho varias opções de como lidar com esses comportamentos herdados

> - Apenas aproveitar os comportamentos
> - Fazer completamente ao meu modo ao criar um mesmo comportamento mas com execução diferente
> - Sobrescrever o comportamento herdado para executar de 2 possíveis formas
>> - Aproveitando o comportamento herdado e fazer algum complemento
>> - Fazer completamente a minha maneira

Com interfaces será necessário criar um elemento do tipo interface no projeto e inserir apenas a declaração dos métodos sem a implementação 

A diferença é que as interfaces apenas listam os comportamentos e as classes que desejem ter esses comportamentos , serão responsáveis por implementar os detalhes.

# Detalhes

## Acoplamento
**Acoplamento fraco ou baixo acoplamento:** os componentes de um sistema são interconectados de modo que um dependa do outro o mínimo possível.

**Acoplamento forte ou alto acoplamento:** Os componentes são interconectados de uma forma tão dependente que é praticamente impossível alterar um deles sem causar efeitos colaterais em todo ou em grande parte do sistema.

**Classes fortemente acopladas:** contém um grande número de interações e dependências, enquanto que nas classes com acoplamento fraco, ocorre o oposto, em que as dependências entre as classes são resolvidas através de interfaces públicas bem definidas, reduzindo o máximo possível as dependências diretas.

É praticamente impossível desenvolver software sem acoplamento nenhum, mas é desejável que o acoplamento seja o mais fraco possível.


## Coesão
Coesão está ligado ao princípio da responsabilidade única, onde uma classe deve ter apenas uma única responsabilidade e realizá-la de maneira satisfatória, ou seja, uma classe não deve assumir responsabilidades que não são suas . 

Uma vez sendo ignorado este princípio, passamos a ter problemas, como dificuldades de manutenção e de reuso.


## Associação
Associação é a relação entre duas classes distintas que se estabelecem por meio de seus objetos. A associação pode ser um para um, um para muitos, muitos para um, muitos para muitos. 

## Agregação
É uma forma especial de associação onde:  

> - É uma associação unidirecional, ou seja, um relacionamento de mão única.
	Por exemplo, o departamento pode ter alunos, mas vice-versa não é possível e, portanto, de natureza unidirecional.
> - Na agregação, ambas as entradas podem sobreviver individualmente, o que significa

## Composição
Composição é uma forma restrita de agregação em que duas entidades são altamente dependentes uma da outra.  

> - Representa um relacionamento parcial .
> - Na composição, ambas as entidades são dependentes uma da outra.
> - Quando há uma composição entre duas entidades, o objeto composto não pode existir sem a outra entidade.

## Interfaces
Da merma forma que criamos Classes podemos criar Interfaces

Nas interfaces devemos apenas escrever declarações de métodos mas sem a implementação.

Se precisar adicionar atributos eles devem ser estáticos, pois não é possível instanciar objetos com interfaces, ou seja, os atributos serão compartilhados com todos que implementarem a interface