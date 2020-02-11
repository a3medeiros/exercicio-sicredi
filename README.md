# Exercicio-sicredi
Parte técnica da seleção da Sicredi
# Exercício do Simulador  Sicredi
O principal objetivo deste projeto era realizar testes automatizados de acordo com os requisitos apresentados na documentação.
Para mais informações, ler o `Planejamento - Anderson A de Medeiros - QA.pdf`.
## Iniciando
Clicar com o botão direito no `\src\test\java\sicrediTests\sicrediCucumberRunner.java` e selecionar `Run`.
#### Pré-requisitos
* Java
* IntelliJ IDEA
* Selenium WebDriver
* JUnit 
* Cucumber
* Postman

## Drivers
Esse projeto utiliza a versão mais atual do [Chromedriver](http://chromedriver.storage.googleapis.com/index.html) para poder realizar os testes no Google Chrome e a mais atualizada do [Geckodriver](https://github.com/mozilla/geckodriver/releases) para utilizar no Mozilla FireFox. 
Se você utiliza um SO diferente, favor seguir as instruções abaixo:
* Faça o download da última versão do [Chromedriver](http://chromedriver.storage.googleapis.com/index.html) para seu SO.
* Faça o download da última versão do [Geckodriver](https://github.com/mozilla/geckodriver/releases) para seu SO.
* Copie o chromedriver e o geckodriver para a pasta raiz do seu projeto.
* Edite o caminho `src\main\java\SicrediTests\support\Web.java` e renomeie o arquivo.

## API
Utilizando o Postman, importe o arquivo json `Sicredi Teste - Anderson.postman_collection.json` e execute para realizar os testes
