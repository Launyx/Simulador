Este projeto foi feito em JavaFX com o propósito de simular a atividade de uma Unidade de controle de uma Unidade Central de Processamento, que passa valores da memória principal para os registradores e para a Unidade Lógica e Aritmética que faz cálculos com esses valores e os retorna para os registradores e por fim volta para um espaço vazio na memória principal.

COISAS NECESSÁRIAS:
1. Ter java instalado no computador.
    Para verificar se sua máquina tem java, digite "cmd" na barra de pesquisa do windows e selecione "prompt de comando"  
    ![Getting Started](/Imagens/CMD.png)  

    Com o prompt aberto, digite "java -version" e confirme  
    ![Getting Started](/Imagens/Java1.png)  

    Caso não tenha o java instalado, você pode baixa-lo por este link: https://www.oracle.com/br/java/technologies/downloads/  

2. Ter o pacote JavaFX no computador e no projeto  
    Para isso, basta acessar este link: https://gluonhq.com/products/javafx/, selecionar o seu sistema operacional, a arquitetura do mesmo e selecionar "SDK" em type  
    ![Getting Started](/Imagens/JAVAFX.png)  

    extraia o arquivo em um local desejado.  

    Baixe a extenção "Extension pack for Java" no VSCode  
    ![Getting Started](/Imagens/extension.png)  

    no explorador abra a aba "JAVA PROJECTS" e clique no símbolo de + ao lado de "Referenced Libraries"  
    ![Getting Started](/Imagens/PACOTE.png)  

    Selecione todos os arquivos dentro da pasta lib da pasta do javafx que você acabou de extrair  
    ![Getting Started](/Imagens/pastaJAVAFX.png)  
    ![Getting Started](/Imagens/arquivosJAVAFX.png)  

COMO EXECUTAR O PROJETO:  
1.Clique no botão verde e selecione a opção "Download ZIP":  
    ![Getting Started](/Imagens/Download.png)  

2.Coloque o arquivo ZIP no local desejado e extraia:  
    ![Getting Started](/Imagens/Extrair.png)  

3.Abra o VSCode, clique em arquivo e selecione abrir pasta:  
    ![Getting Started](/Imagens/Abrir.png)  

4.Selecione a pasta que você acabou de extrair:  
    ![Getting Started](/Imagens/Pasta.png)  

5.Ainda no VSCode, abra o arquivo launch.json que se contra dentro da pasta .vscode  
    ![Getting Started](/Imagens/launch.png)  

Na mesma linha do "vmArgs" coloque o diretório em que se encontram os arquivos do javafx  
"vmArgs": "--module-path \"C:\Program Files\Java\javafx-sdk-17.0.7\lib\" --add-modules javafx.controls,javafx.fxml"  
deixando os \" antes e depois do diretório     
    ![Getting Started](/Imagens/diretorio.png)  

6.No explorador, clique na pasta "src" e selecione o arquivo UnidadeControle.java e aperte F5  
    ![Getting Started](/Imagens/UNIDADE.png)  