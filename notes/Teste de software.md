John C.Maxwell

Como aplicar teste de sistema no tema escolhido 

cada tópico descobrir como testar 

tabela do jogo tem que ter o atributo gênero

plano  de teste

1.       O velho e bom Javadoc como utilizar?

### O que é javadoc?

Javadoc é uma ferramenta de documentação que faz parte do kit de desenvolvimento Java (JDK). Seu principal objetivo é gerar documentação em formato HTML a partir de comentários inseridos no código-fonte Java. Através do uso de tags específicas, os desenvolvedores podem criar uma documentação clara e acessível, que facilita a compreensão do funcionamento das classes, métodos e pacotes de um projeto.

O javadoc é amplamente usado para documentações de projeto java, tendo em sua forma regras e controle para uma boa documentação por exemplo:

``` java
/**
 * Esta classe representa um usuário.
 * @author Nome do Autor
 * @version 1.0
 */
public class Usuario {  /**
   * O nome do usuário.
   */
  private String nome;
  /**
   * Obtém o nome do usuário.
   * @return O nome do usuário.
   */
  public String getNome() {
    return nome;  }  /**   * Define o nome do usuário.
   * @param nome O novo nome do usuário.
   */
  public void setNome(String nome) {
    this.nome = nome;  }}
```

Nesse exemplo temos a classe os comentários dentro dessa classe e métodos, para manter um entendimento do código e ajudar nas futuras manutenções.

### Gerando a documentação com Javadoc

Para gerar a documentação utilizando o Javadoc, o desenvolvedor deve executar um comando no terminal, especificando o caminho do arquivo fonte e as opções desejadas. Por exemplo, o comando `javadoc -d docs src/*.java` gera a documentação dos arquivos Java localizados na pasta `src` e a salva na pasta `docs`. É possível personalizar a saída, incluindo a definição de estilos e formatos.


2.       Documentar uma API – apresente sobre o Swagger e SpringDoc

Assim como é extremamente importante documentar os códigos um projeto, documentar uma api é uma obrigação moral de qualquer dev, por isso que utilizamos o swagger.

O swagger é um software para testar e documentar os post de http de um projeto que você esteja fazendo.
Primo mais no do SpringDoc o swagger vem para substituir um software antigo proprietário para um software novo de código aberto


3.       Apresente sobre JWT na documentação

### O que é JWT?

JWT(Json web token) é um padrão para autenticação e troca de informações.
Nele é possível armazenar de forma segura e compacta no objetos JSON, este token é um código Base64 e pose ser assinado usando um segredo ou par de chaves privadas/públicas.

### Onde pode ser usado o JWT?

O JWT é muito usado em um cenário de autorização. Depois que o usuário estiver conectado, é  observar cada solicitação e verificar .

### Como surgiu o JWT?

Ele faz parte de uma família de especificações: a família JOSE.

JOSE significa JSON _Object Signing and Encryption_, em português **Assinatura e criptografia de objetos JSON**. O JWT faz parte dessa família de especificações e representa o token. Abaixo, você confere outras especificações desta família:

- JWT (JSON Web Tokens): representa o token propriamente dito;
- JWS (JSON Web Signature): representa a assinatura do token;
- JWE (JSON Web Encryption): representa a assinatura para criptografia do token;
- JWK (JSON Web Keys): representa as chaves para a assinatura;
- JWA (JSON Web Algorithms): representa os algoritmos para assinatura do token.