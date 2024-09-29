# SafeLibUpdater

SafeLibUpdater é um plugin Gradle desenvolvido em Kotlin que ajuda a manter as dependências do seu projeto atualizadas e livres de vulnerabilidades. Ele verifica as bibliotecas utilizadas no projeto e sugere atualizações para versões seguras e compatíveis.

## Funcionalidades

- **Verificação de Vulnerabilidades:** O plugin verifica se as versões das dependências possuem vulnerabilidades conhecidas e sugere versões seguras.
- **Compatibilidade de Dependências:** Se a versão segura não for compatível com outras bibliotecas do projeto, o plugin sugere atualizações para todas as dependências afetadas, garantindo a compatibilidade.
- **Documentação das Mudanças:** O plugin informa sobre as mudanças na utilização das dependências atualizadas e fornece links para a documentação oficial.

## Como Usar

1. Adicione o plugin ao seu projeto Gradle:

    ```kotlin
 
    ```

2. Execute as tasks do plugin:

    - Para verificar atualizações de dependências:
        ```sh
        ./gradlew checkForUpdates
        ```

    - Para sugerir atualizações seguras e compatíveis:
        ```sh
        ./gradlew suggestUpdates
        ```

## Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

### Diretrizes para Pull Requests

- As PRs devem ter como destino a branch develop.
- A branch develop é a branch que deve ser utilizada como base para novas branchs.
- As pull requests (PRs) devem estar vinculadas às issues de origem.
- Cada PR deve conter uma descrição clara do que foi realizado.
- Novas issues são aceitas, mas precisam ser aprovadas antes de serem liberadas para desenvolvimento.
- As issues aprovadas estão com a tag liberado.
- A PR só será mergeada após minha aprovação.

### Commits

Os commits devem seguir o padrão Conventional Commits. Isso ajuda a manter um histórico de commits claro e facilita a geração de changelogs.

#### Prefixos de Commits

| Prefixo    | Descrição                                                                             |
|------------|---------------------------------------------------------------------------------------|
| `feat`     | Adição de uma nova funcionalidade                                                     |
| `fix`      | Correção de um bug                                                                    |
| `docs`     | Mudanças na documentação                                                              |
| `style`    | Mudanças que não afetam o significado do código (espaços em branco, formatação, etc.) |
| `refactor` | Mudança de código que não corrige um bug nem adiciona uma funcionalidade              |
| `perf`     | Mudança de código que melhora a performance                                           |
| `test`     | Adição ou correção de testes                                                          |
| `build`    | Mudanças que afetam o sistema de build ou dependências externas (ex: gradle, npm)     |
| `ci`       | Mudanças em arquivos de configuração de CI/CD                                         |
| `chore`    | Outras mudanças que não modificam arquivos de origem ou testes                        |
| `revert`   | Reversão de um commit anterior                                                        |


## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.
