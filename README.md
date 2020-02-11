# Exercicio-sicredi
Parte t�cnica da sele��o da Sicredi
# Exerc�cio do Simulador  Sicredi
O principal objetivo deste projeto era realizar testes automatizados de acordo com os requisitos apresentados na documenta��o.
Para mais informa��es, ler o `Planejamento - Anderson A de Medeiros - QA.pdf`.
## Iniciando
Clicar com o bot�o direito no `\src\test\java\sicrediTests\sicrediCucumberRunner.java` e selecionar `Run`.
#### Pr�-requisitos
* Java
* IntelliJ IDEA
* Selenium WebDriver
* JUnit 
* Cucumber
* Postman

## Drivers
Esse projeto utiliza a vers�o mais atual do [Chromedriver](http://chromedriver.storage.googleapis.com/index.html) para poder realizar os testes no Google Chrome e a mais atualizada do [Geckodriver](https://github.com/mozilla/geckodriver/releases) para utilizar no Mozilla FireFox. 
Se voc� utiliza um SO diferente, favor seguir as instru��es abaixo:
* Fa�a o download da �ltima vers�o do [Chromedriver](http://chromedriver.storage.googleapis.com/index.html) para seu SO.
* Fa�a o download da �ltima vers�o do [Geckodriver](https://github.com/mozilla/geckodriver/releases) para seu SO.
* Copie o chromedriver e o geckodriver para a pasta raiz do seu projeto.
* Edite o caminho `src\main\java\SicrediTests\support\Web.java` e renomeie o arquivo.

## API
Utilizando o Postman, importe o arquivo json `Sicredi Teste - Anderson.postman_collection.json` e execute para realizar os testes
