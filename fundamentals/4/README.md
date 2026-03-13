
## 📚 Resumo por capítulo

---

### 🟦 Capítulo 4 – Definição das Características da Arquitetura

## 📌 **Ideia central**  
### Apresentar o que é características da Arquitetura
- Um característica atende a três critérios:
   - Especifica uma consideração de design fora do domínio:
   - Influencia algum aspecto estrutural de design
   - É essencial ou importante para o sucesso da aplicação
- Implícita x Explícita:
   - Implícita:
      - Raramente aparacem nos requisitos, embora sejam necessárias para o sucesso do projeto
   - Explícita:
      - Aparecem nos documentos de requisitos

## 🧠 **Pontos-chave**
### Tipos de características:
**Operacionais:**
   - **Disponibilidade:**
      - Por quanto o sistema precisa ficar disponível(24/7?)
   - **Continuidade:**
      - Capacidade de recuperação de desastres
   - **Desempenho:**
      - Teste de estresse, análise de picos, tempos de resposta
   - **Recuperabilidade:**
      - Requisitos para GCN. Estrátegia de backup, etc
   - **Confiabilidade/Segurança:**
      - Se o sistema falha qual o custo para empresa. Precisa ser à prova de falhas?
   - **Robustez:**
      - A capacidade de lidar com condições de erro e limites durante execução
   - **Escalabilidade:**
      - Capacidade de rodar e operar quando o número de usuários ou requisições aumenta    

**Estruturais:**
   - **Disponibilidade:**
      - Por quanto o sistema precisa ficar disponível(24/7?

### Acoplamento
- **Acoplamento aferente**: É o número de conexões de entrada para um artefato do código.
- **Acoplamento eferente**: É o número de conexões de saída para um artefato do código.

### Abstração:
- É a proporção de artefatos abstratos para artefatos concretos. Pode ser calculada através da fórmula:
- *A =  ∑m^a / ∑m^c*
- Onde: m^a = o número de elementos abstratos como interfaces ou classes abstratas, m^c = o número de elementos concretos

### Instabilidade:
- Determina a volatilidade de uma base de código. Altos graus de instabilidade indica que quando é alterado algo gera um impacto grande por conta do alto acomplamento. Seguindo a fórmula:
- *I = C^e / C^e + C^a*
- Onde: *C^e* é o número do acomplamento *eferente*, e *C^a* é o número do acomplamento *aferente*

### Distância da Sequência Principal:
- É uma métrica para definir o quão equilibrado é a classe. Seguindo a fórmula:
- *D = |A + I -1|*
- Onde: *A* é a abstração e *I* é a instabilidade

### Conascência
- *Dois componentes são conascentes se uma mudança~em um requer que outro seja modificado para manter a correção geral do sistema* - *Meilir Page-Jones*
- Conascência é divida em dois tipos:
  - **Estática:** É o acomplamento no nível do código-fonte
    - *Conascência de Nome (CoN)*: Múltiplos componentes devem concordar com o nome de uma entidade ou de um método.
    - *Conascência de Tipo (CoT)*: Múltiplos componentes devem concordar com o tipo de uma entidade ou de um atributo
    - *Conascência de Significado (CoM) ou Conascência de Convenção (CoC)*: Múltiplos componentes devem concordar com o significado de certos valores. Ex: *int True = 1; int False= 0;*
    - *Conascência de Posição (CoP)*: Múltiplos componentes devem concordar com o ordem dos valores
    - *Conascência de Algoritmo (CoA)*: Múltiplos componentes devem concordar com certo algoritmo. Ex: Algoritmo para geração de cpnj/cpf tem ser o mesmo em qualquer componente
  - **Dinâmica:** É o acomplamento durante a execução
    - *Conascência de Execução (CoE)*: A ordem da execução dos múltiplos componentes é importante
    - *Conascência de Tempo (CoT)*: O tempo de execução dos múltiplos componentes é importante
    - *Conascência de Valor (CoV)*: Ocorre quando diversos valores se relacionam e devem mudar juntos
    - *Conascência de Identidade (CoI)*: Ocorre quando vários componentes devem referenciar a mesma entidade

 **Propriedades**   
 - *Força*: A facilidade com a qual um desenvolvedor consegue refatorar esse tipo de acomplamento.
 - *Localização*: Mede a proximidade dos módulos entre si na base de código.
 - *Grau*: É relacionado ao tamanho do seu impacto

 **Escala de conascência**
 - 1: ⭐⭐⭐⭐⭐
    - Nome
 - 2: ⭐⭐⭐⭐
    - Tipo
 - 3: ⭐⭐⭐
    - Significado
 - 4: ⭐⭐☆
    - Algoritmo
 - 5: ⭐⭐☆☆
    - Posição
 - 6: ⭐☆☆
    - Execução
 - 7: ☆☆☆
    - Tempo
 - 8: ☆☆☆☆
    - Valor
 - 9: ☆☆☆☆☆
    - Identidade