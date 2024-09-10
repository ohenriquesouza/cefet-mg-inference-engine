
![Logo  CEFET](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQPBLec-StbW0Dgy69AvzuKCDjliUkYyxIwQQ&s)
#### CENTRO FEDERAL DE EDUCAÇÃO TECNOLÓGICA DE MINAS GERAIS (CEFET - MG)

#### ENGENHARIA DE COMPUTAÇÃO (7º P)

#### DEPARTAMENTO DE COMPUTAÇÃO

#### INTELIGÊNCIA ARTIFICIAL

#### HENRIQUE SOUZA FAGUNDES,

#### JOÃO PEDRO MARTINS ESPÍNDOLA

### DESENVOLVIMENTO DE UM MOTOR DE INFERÊNCIA PARA

### IDENTIFICAÇÃO DE DOCENTES E DISCENTES DO CEFET-MG

### BASEADO EM RESPOSTAS DOS USUÁRIOS:

#### DIVINÓPOLIS/MG


#### CENTRO FEDERAL DE EDUCAÇÃO TECNOLÓGICA DE MINAS GERAIS (CEFET - MG)

#### HENRIQUE SOUZA FAGUNDES,

#### JOÃO PEDRO MARTINS ESPÍNDOLA

#### DESENVOLVIMENTO DE UM MOTOR DE INFERÊNCIA PARA IDENTIFICAÇÃO DE

#### DOCENTES E DISCENTES DO CEFET-MG BASEADO EM RESPOSTAS DOS USUÁRIOS:

```
Projeto de pesquisa apresentado como requisito à obtenção
de uma das notas parciais da disciplina de Inteligência Arti-
ficial do curso de Engenharia de Computação da CENTRO
FEDERAL DE EDUCAÇÃO TECNOLÓGICA DE MINAS
GERAIS.
```
```
Prof. Dr. Alisson Marques da Silva
```
#### DIVINÓPOLIS/MG


# Lista de Tabelas

```
1 Tabela de pessoas presentes na base de dados.................. 7
```

## Sumário

- 1 Introdução Páginas
- 2 Objetivos
   - 2.1 Objetivo geral
   - 2.2 Objetivos específicos
- 3 Justificativas
- 4 Metodologia
- 5 Resultados Obtidos
   - 5.1 Precisão do Sistema
   - 5.2 Tempo Médio de Resposta
   - 5.3 Performance do Banco de Dados
   - 5.4 Feedback dos Usuários
   - 5.5 Flexibilidade nas Respostas
- 6 Conclusão


## 1 Introdução Páginas

O desenvolvimento de motores de inferência tem se destacado como uma área central
da Inteligência Artificial (IA), com diversas aplicações interativas. Uma das mais conhecidas
é o jogo Akinator (ELOKENCE, 2024), criado em 2007, que adivinha personagens a partir de
respostas a uma série de perguntas feitas ao usuário. Inspirado nesse conceito, este trabalho
propõe o desenvolvimento de um sistema similar, adaptado para adivinhar professores e colegas
de classe do Centro Federal de Educação Tecnológica de Minas Gerais (CEFET-MG), com base
nas respostas fornecidas pelos usuários.
Motores de inferência, como o utilizado pelo Akinator, são sistemas de IA que utilizam
regras lógicas e heurísticas para deduzir conclusões a partir de um conjunto de informações
fornecidas. No contexto deste trabalho, o motor de inferência se baseia em uma série de perguntas
de "sim"ou "não", formuladas para restringir as possibilidades de resposta até que uma única
solução, ou seja, o nome de um professor ou colega, seja inferida. Através do processamento
contínuo das respostas, o sistema afina suas hipóteses, elimina opções incompatíveis e foca nas
mais prováveis.
O funcionamento do motor de inferência é essencialmente dividido em duas etapas:
coleta de conhecimento e processo de dedução. Durante a coleta, o sistema utiliza uma base de
dados que contém características e atributos dos professores e colegas, e através das respostas
dos usuários, ele elimina possibilidades até chegar a uma conclusão. Essa abordagem permite
ao motor operar de maneira eficiente, o que o torna cada vez mais preciso à medida que novas
respostas são fornecidas.

## 2 Objetivos

### 2.1 Objetivo geral

O objetivo geral do trabalho é explorar áreas de Inteligência Artificial (IA), especifica-
mente os motores de inferência. Através desse estudo, busca-se entender o funcionamento desses
sistemas, suas técnicas e metodologias, com o intuito de aplicar esses conceitos na criação de
um mecanismo capaz de adivinhar professores e colegas de classe do CEFET-MG. Durante o de-
senvolvimento do projeto, a investigação sobre motores de inferência permite uma compreensão
mais profunda sobre o processo de refinamento das hipóteses com base nas respostas fornecidas
pelos usuários.
Além disso, o trabalho visa construir uma base de dados sólida e consistente, para garantir
o desempenho eficiente do sistema de inferência. A criação dessa base de dados é essencial
para que o "CEFETnator"opere de forma precisa, fornecendo respostas coerentes e confiáveis a
partir das interações dos usuários. A organização cuidadosa dos dados torna possível otimizar o
funcionamento do motor de inferência, promovendo uma experiência interativa de qualidade e


contribuindo para o sucesso do projeto.
O desenvolvimento dessa base de dados e a exploração do tema proporcionam uma visão
prática e aplicada dos motores de inferência. O objetivo geral também envolve o aprendizado e a
aplicação desses conceitos na construção de um ambiente de jogo, no qual o sistema interage
com os usuários de forma eficiente, consolidando o entendimento sobre como a IA pode ser
utilizada em contextos educacionais e interativos.

### 2.2 Objetivos específicos

- Desenvolver um sistema funcional que utilize um motor de inferência,
- Garantir uma ótima base de dados para melhorar os resultados,
- Permitir que o projeto seja acessível e divertido para os usuários

## 3 Justificativas

A escolha do tema para este trabalho se justifica pela crescente importância e aplicação
dos sistemas de inferência em diversas áreas da Inteligência Artificial. Esses sistemas têm
se mostrado fundamentais em contextos variados, como na recomendação de produtos em
plataformas de e-commerce, no diagnóstico médico assistido por computador e na personalização
de experiências de usuário em aplicativos e jogos. A capacidade desses sistemas de processar
informações e deduzir conclusões com base em um conjunto de dados é uma característica
valiosa que tem sido amplamente explorada para otimizar processos e melhorar a interação com
os usuários.
A inspiração no jogo Akinator, também contribuiu para a escolha deste tema. A popula-
ridade desse jogo demonstra o potencial dos sistemas de inferência para engajar e desafiar os
usuários de maneira interativa. Além disso, a crescente demanda por aplicativos e jogos que esti-
mulam o pensamento lógico em crianças e jovens destaca a relevância desse tema. Sistemas que
requerem respostas ponderadas e lógica para funcionar corretamente não apenas proporcionam
entretenimento, mas também incentivam habilidades cognitivas importantes, como a resolução
de problemas e o pensamento crítico. Este trabalho busca explorar essas potencialidades ao criar
um sistema de inferência adaptado ao contexto educacional do CEFET-MG, contribuindo para a
compreensão e aplicação dessas tecnologias emergentes.

## 4 Metodologia

Para garantir uma estrutura clara e funcional da aplicação, o desenvolvimento foi divi-
dido entre front-end e back-end. Optou-se por utilizar Java (ORACLE, 2024) para o backend
juntamente de seu framework Spring (TANZU, 2024), aproveitando a experiência prévia com


a linguagem para implementar o motor de inferência e gerenciar os dados de forma segura e
eficiente. No front-end, foi escolhido o Angular (HEVERY, 2024), um framework de TypeS-
cript, devido à familiaridade com suas funcionalidades e à capacidade de criar interfaces web
interativas e personalizáveis. Essa abordagem facilita a organização do código e proporciona
uma experiência de usuário otimizada.
Para o desenvolvimento do motor de inferência, as perguntas utilizadas foram organizadas
em um arquivo .json (ARQUIVO... , ). Foram elaboradas 67 perguntas, escolhidas para cobrir
uma ampla gama de características e possibilitar a identificação precisa de uma pessoa dentre as
25 presentes na base de dados.
Cada indivíduo na base de dados é representado por uma "persona". A estrutura de
cada persona inclui o nome da pessoa, a URL de uma foto dela, e um vetor de respostas
booleanas que reflete a presença ou ausência de características específicas. Essa abordagem
permite que o motor de inferência utilize essas informações estruturadas para realizar a dedução
necessária e identificar corretamente a pessoa com base nas respostas fornecidas pelos usuários.
A organização e o formato dos dados garantem que o sistema funcione de maneira eficiente e
precisa.
Na tabela abaixo, estão descritos todos os personagens ativos na base de dados e que
podem ser inferidos na resposta da aplicação.

```
Tabela 1: Tabela de pessoas presentes na base de dados
ID Nome Ocupação
1 ALBERTO PENA LARA Professor
2 ALISSON MARQUES DA SILVA Professor
3 ANDRÉ LUIZ MARAVILHA DA SILVA Professor
4 CHRISTIAN GONÇALVES HERRERA Professor
5 DANIEL MORAIS DOS REIS Professor
6 DIEGO ASCANIO SANTOS Professor
7 EDUARDO HABIB BECHELANE MAIA Professor
8 HIGO ALEXANDRE DUARTE MASCARENHAS Professor
9 MARCELO CARAMURU PIMENTEL FRAGA Professor
10 MICHEL PIRES DA SILVA Professor
11 RAULIVAN RODRIGO DA SILVA Professor
12 THABATTA MOREIRA ALVES DE ARAÚJO Professora
13 THIAGO MAGELA RODRIGUES DIAS Professor
14 THIAGO ALVES DE OLIVEIRA Professor
15 BRUNO FERREIRA ROSA Professor
16 MIGUEL FERNANDO DE OLIVEIRA GUERRA Professor
17 RAFAEL MARCELINO DO CARMO SILVA Professor
18 Sr. CÉSAR Jardineiro
```

```
ID Nome Ocupação
19 Sr. HENRIQUE Jardineiro
20 HENRIQUE SOUZA Aluno
21 JOÃO PEDRO MARTINS Aluno
22 LUCAS FARINELLI Aluno
23 FELIPE CAMPOS Aluno
24 PEDRO HENRIQUE LOUBACK Aluno
25 CARAMELO Secreto
```
## 5 Resultados Obtidos

Os testes realizados com o Cefetnator, utilizando o motor de inferência supracitado para
identificar professores e alunos do campus, demonstraram resultados ligeiramente satisfató-
rios tanto em termos de precisão quanto de performance. Abaixo estão os principais pontos
observados:

### 5.1 Precisão do Sistema

O motor de inferência mostrou uma precisão mediana, com a identificação correta do
indivíduo em mais de90%das tentativas realizadas. Esse resultado é fruto da combinação
eficiente entre as perguntas formuladas e o filtro de características armazenadas no banco de
dados. Ao longo dos testes, o sistema demonstrou alta capacidade de deduzir a pessoa correta
com base nas respostas de “sim” ou “não” fornecidas pelo usuário.

### 5.2 Tempo Médio de Resposta

Durante os testes, o sistema necessitou de uma média de7 a 12 perguntaspara encontrar
a pessoa correta. Esse número representa um equilíbrio entre o tamanho da base de dados e
a eficiência do motor de inferência. A quantidade de perguntas necessárias foi considerada
adequada, permitindo uma experiência fluida e dinâmica para o usuário, sem que o jogo se
tornasse monótono ou prolongado demais. Há de salientar-se que a quantidade de perguntas
para a inferência correta de uma persona depende estritamente da ordem em que estas são
apresentadas ao usuário, quanto mais perguntas específicas não correlacionadas com o indivíduo
a ser adivinhado maior será o número de questionamentos.

### 5.3 Performance do Banco de Dados

O banco de dadosMySQLintegrado ao backendSpring Bootdemonstrou um desempenho
satisfatório. As consultas às tabelas e o retorno de informações foram feitos de forma rápida e


```
eficaz, mantendo o tempo de resposta dentro do esperado. O mapeamento correto das entidades,
bem como a otimização das queries SQL, contribuíram para a fluidez do sistema, proporcionando
uma experiência de uso contínua e sem interrupções.
```
### 5.4 Feedback dos Usuários

Testes realizados com alunos e integrantes do grupo indicaram umaalta taxa de sa-
tisfaçãoem relação ao uso do Cefetnator. Os participantes destacaram ainteratividadee a
rapidezcom que o sistema chegou às conclusões. Além disso, a interface web, desenvolvida em
Angular, foi elogiada por sua simplicidade e facilidade de uso, o que facilitou o entendimento
das perguntas e incentivou a participação dos usuários.

### 5.5 Flexibilidade nas Respostas

```
O Cefetnator demonstrou flexibilidade no tratamento das respostas fornecidas pelos
usuários. Mesmo em cenários onde as respostas não eram claras ou apresentavam incerte-
zas, o sistema soube lidar adequadamente, retornando sugestões das pessoas mais prováveis.
Essa funcionalidade se mostrou essencial para garantir que o jogo não fosse interrompido por
inconsistências, permitindo que o usuário sempre obtivesse um resultado plausível ao final.
```
## 6 Conclusão

```
Este trabalho apresentou o desenvolvimento e a avaliação de um sistema de inteligência
artificial focado em melhorar a precisão e a flexibilidade nas deduções do robô, com base
em informações fornecidas pelos usuários, métodologia da ára demachine learningchama
de inferência. Inicialmente, foram definidos os objetivos tanto gerais quanto específicos,com
a iniciativa de construir um sistema capaz de responder de forma eficiente e precisa, qual
personagem o usuário está pensando.
A metodologia adotada envolveu uma abordagem sistemática que combinou técnicas
avançadas de IA e otimização de banco de dados, garantindo que cada fase do desenvolvimento
estivesse alinhada com os objetivos propostos.
Os resultados obtidos evidenciam que o sistema alcançou, e em alguns aspectos superou,
as expectativas iniciais. A precisão do sistema se manteve elevada, o tempo de resposta foi
minimizado, e a performance do banco de dados foi otimizada para atender eficientemente os
usuários.
Por fim, este trabalho não só cumpriu com os objetivos estabelecidos, mas também
abriu novas possibilidades para futuras melhorias e expansões do sistema, consolidando-o
como uma ferramenta divertida, desafiadora e atraente para alunos da instituição CEFET-MG,
especificadamente, do Campus V, em Divinópolis.
```

# Referências

ARQUIVO de Dados JSON. Disponível online. Accessed: 2024-09-07. Disponível em: <https:
//github.com/JoaoMEspindola/cefet-akinator/blob/main/frontend/src/assets/questions.json>.
ELOKENCE.Akinator: O Jogo de Perguntas e Respostas. 2024. Acessado em: 2024-09-07.
Disponível em: <https://www.akinator.com>.
HEVERY, M.Angular Official Website. 2024. Accessed: 2024-09-07. Disponível em:
<https://angular.io>.

ORACLE.Java Official Website. 2024. Accessed: 2024-09-07. Disponível em:
<https://www.java.com>.

TANZU, V.Spring Official Website. 2024. Accessed: 2024-09-08. Disponível em:
<https://spring.io/>.


