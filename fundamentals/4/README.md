
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
   - **Configuração:**
      - A capacidade dos usuários finais de mudar com facilidade os aspectos de configuração
   - **Extensão:**
      - Como é importante ligar as novas partes da funcionalidade
   - **Instabilidade:**
      - Facilidade de instalação do sistema em todas as plataformas necessárias    
   - **Aproveitamento/ reutilização:** 
      - Capacidade de aproveitar os componentes comuns em vários produtos. 
   - **Localização:** 
      - Suporte para vários idiomas nas telas de entrada/consulta nos campos de dados; nos relatórios, requisitos de caracteres multibytes e unidades de medidas ou moedas. 
   - **Manutenção:** 
      - Quão facilmente aplica as alterações e melhora o sistema? 
   - **Portabilidade:** 
      - O sistema precisa rodar em mais de uma plataforma? (Por exemplo, o front-end precisa rodar no Oracle e no banco de dados SAP?) 
   - **Suporte:** 
      - De qual nível de suporte técnico a aplicação precisa? Qual nível de registro e outras facilidades são requeridos para depurar os erros no sistema? 
   - **Atualização:** 
      - A capacidade de atualizar com facilidade/rapidez uma versão prévia dessa aplicação/solução para uma versão mais nova nos servidores e nos clientes. 

**Transversais:**
   - **Acessibilidade:** 
      - Acesso a todos os usuários, inclusive com deficiências, como daltonismo e perda auditiva. 
   - **Armazenamento:** 
      - Os dados precisarão ser armazenados ou excluídos após um período de tempo? (Por exemplo, as contas do cliente serão excluídas após três meses ou marcadas como obsoletas e armazenadas em um banco de dados secundário para futuro acesso.) 
   - **Autenticação:** 
      - Requisitos de segurança para assegurar que os usuários são quem dizem ser. 
   - **Autorização:**
      - Requisitos de segurança para assegurar que os usuários possam acessar apenas certas funções na aplicação (por caso de uso, subsistema,página web, regra comercial, nível do campo etc.). 
   - **Legalidade:** 
      - Com quais restrições legais o sistema opera (proteção de dados, Sarbanes Oxley, GDPR etc.)? Quais direitos de reserva a empresa requer? Alguma regulação no modo como a aplicação será criada ou implantada? 
   - **Privacidade:** 
      - A capacidade de ocultar as transações dos funcionários internos da empresa (transações criptografadas para que até os DBAs e os arquitetos de rede não possam vê-las). 
   - **Segurança:** 
      - Os dados precisam ser criptografados no banco de dados? Criptografados para a comunicação de rede entre os sistemas internos? Qual tipo de autenticação precisa existir para o acesso remoto do usuário?
   - **Suporte:** 
      - De qual nível de suporte técnico a aplicação precisa? Qual nível de registro e outras facilidades são necessários para depurar os erros no sistema? 
   - **Usabilidade/viabilidade:** 
      - O nível de treinamento requerido para os usuários atingirem seus objetivos com a aplicação/solução. Os requisitos de utilização precisam ser tratados com a mesma seriedade de qualquer outra questão arquitetural. Qualquer lista de características da arquitetura será necessariamente incompleta; qualquer software pode inventar características importantes com base em fatores únicos 
 
 ### Disponibilidade ou Desempenho? ###
 - Depende, escolha o menos pior. Para garantir segurança, haverá impacto no desempenho