<h1>Engenharia de Software</h1>
<h2>Texto - Engenharia de Software do Google</h2>

<p>"Nós vemos três diferenças críticas entre programação e engenharia de software: tempo, escala e os trade-offs em jogo. Em um projeto de engenharia de software, os engenheiros precisam estar mais preocupados com a passagem do tempo e a eventual necessidade de mudança. organização de engenharia de software, precisamos estar mais preocupados com escala e eficiência, tanto para o software que produzimos quanto para a organização que o está produzindo. resultados, muitas vezes com base em estimativas imprecisas de tempo e crescimento. No Google, às vezes dizemos: "A engenharia de software é a programação integrada ao longo do tempo". A programação é certamente uma parte significativa da engenharia de software: afinal, programação é como você gera um novo software em primeiro lugar. Se você aceitar essa distinção, também fica claro que podemos precisar delinear entre tarefas de programação (desenvolvimento) e tarefas de engenharia de software (desenvolvimento, modificação, manutenção). A adição de tempo adiciona uma nova dimensão importante à programação. Cubos não são quadrados, distância não é velocidade. Engenharia de software não é programação."</p>
<p>Titus Winters, engenharia de software do Google</p>


<h4>Comentário: Ivan Germano Rosendo de Oliveira Duarte</h4>

Das diferenças que são notáveis entre engenharia de software e programação fica claro que estão interligadas em um jogo de qualidade versus quantidade, de maneira que tempo, escala e trade-offs tenham um peso significativo para o projeto. É possivel se dizer que a programação está para a engenharia de software como o conjunto dos numeros naturais está para o conjunto dos numeros inteiros, onde um processo é englobado pelo outro em uma estrutura hierarquica que fica mais clara após o desenvolvimento de um determinado projeto utilizando uma metodologia que facilite a visualicação das tarefas ao longo do Dead_Line para entrega do produto final.

Frameworks como o SCRUM, por exemplo, permite que a equipe possa, ao longo do desenvolvimento do projeto, visualizar as principais dificuldades e calcular novas estimativas de prazos. Na engenharia de Software o proprio autos nos diz que: "A engenharia de software é a programação integrada ao longo do tempo". Ou seja, a ação de idealizar, prototipar e testar um programa passa necessariamente pelo processo de elaboração de algoritmos, que nada mais são do que instruções que vão ser interpretadas pelo sistema operacional para resolver um determinado problema. Afinal tudo se resume a isso, resolver problemas. Desenvolvemos codigos para auxiliar nas tarefas do cotidiano, a engenharia de software é o caminho para solucionar os problemas de quem soluciona problemas.

---

<h5>Complemento pós discussão em sala</h5>

<p>Após o explicação em sala de aula, pude entender melhor o conceito de "tempo", anteriormente achava que estava relacionado a prazo para entregar o produto, mas depois da explanação pude entender que se trata do tempo em termos de tecnologia, ou seja, como aquele projeto que em que estou trabalhando vai "envelhecer" tecnológicamente. Ele vai ficar obsoleto muito rapidamente ? Se sim, como evitar que isso aconteça ? Esses são alguns dos desafios da engenharia de Software.</p>

<h5>Dentro do conceito de Trade-Off, pensando nos projetos de API</h5>

<p>Quando analisamos o Trade-Off, precisamos entender que nenhum tipo de software é perfeito, isento de falhas ou limitações. Qualquer Software que diga o contrário estaria mentindo.</p>
<p>Tendo isso em mente, no API alguns requisitos são colocados obrigatóriamente, como a linguagem de programação. Outros são opcionais ou desejaveis, como a escolha do banco de dados. É justamente nessa flexibilização que vai garantir a individualidade de cada projeto independente do numero de equipes, pois com essa flexibilização, o grupo pode analizar as vantagens e desvantagens de se utilizar determinada ferramenta ou software, e assim, ter as informações necessarias para tomar as decisões mais adequadas para o desenvolvimento do projeto.</p>

---


<h2><p>📋 Tarefa Requisitos</p>
  SISCOFIS (Sistema Controle Físico)</h2>
  <h3>Requisitos Funcionais (Story Cards)</h3>

<li>Administrador cadastra Usuários com o nome e uma senha e a seção em que trabalha.</li>
<li>Administrador cadastra objetos com um código único de 8 (oito) carácteres gerado aleatoriamente, data de aquisição, local que será empregado e características físicas do objeto (cor, modelo, tipo).</li>
<li>Administrador edita usuários excluindo o perfil ou alterando as permissões.</li>
<li>Administrador edita objetos alterando somente o local em que está sendo empregado ou excluindo o objeto da relação cadastrada.</li>
<li>Administrador imprime relação de materiais mostrando o perfil responsável pela impressão, o locar empregado a data de aquisição o código único e as características físicas do objeto (cor, modelo, tipo).</li>
<li>Usuário cadastra objetos com um código único de 8 (oito) carácteres gerado aleatoriamente, data de aquisição, local que será empregado e características físicas do objeto (cor, modelo, tipo).</li>
<li>Usuário edita objetos alterando somente o local em que está sendo empregado ou excluindo o objeto da relação cadastrada.</li>
<li>Usuário imprime relação de materiais mostrando o perfil responsável pela impressão, locar empregado a data de aquisição o código único e as características físicas do objeto (cor, modelo, tipo).</li>


  <h3>Requisitos Não Funcionais</h3>

<li>Interface objetiva, de fácil interação com o usuário.</li>
<li>Compatibilidade com servidor integrado a intranet da instituição para poder ser acessado de diferentes terminais.</li>
  
---

<h2>Diagram de Entidade de Relacionamento DER</h2>
<img src="https://github.com/Ivan-Duarte/Bertotti/blob/main/Banco%20de%20Dados/Banco-SISCOFIS.png" width=70% height=400>

---

<h2>Diagrama de Caso de Uso</h2>

<img src="https://github.com/Ivan-Duarte/Bertotti/blob/main/Diagrama%20de%20Caso%20de%20Uso/Diagrama%20de%20Caso%20de%20Uso.PNG?raw=true" width=70% height=400>

---

<h2>Diagrama de Classes UML</h2>

<h3>Package Model.Bean</h3>
<img src="https://github.com/Ivan-Duarte/Bertotti/blob/main/Diagramas%20de%20Entidades/Diagrama%20de%20Classe%20UML%20-%20ModelBean.PNG?raw=true" width=90% height=400>
<h3>Package Connection</h3>
<img src="https://github.com/Ivan-Duarte/Bertotti/blob/main/Diagramas%20de%20Entidades/Diagrama%20de%20Classe%20UML%20-%20connection.PNG?raw=true" width=90% height=400>
<h3>Package ModelDAO</h3>
<img src="https://github.com/Ivan-Duarte/Bertotti/blob/main/Diagramas%20de%20Entidades/Diagrama%20de%20Classe%20UML%20-%20ModelDAO.PNG?raw=true" width=90% height=400>

---
