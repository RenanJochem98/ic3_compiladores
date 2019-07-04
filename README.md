# ic3_compiladores
Não esqueçam de fazer uma nova branch pra mexer nesta merda.

**Comando para compilar o .jj para java**
> javacc parser/langX++.jj

**Após compilar .jj, é necessário passá-lo para o diretório "parser"**
> mv \*.java parser

**E então compilar os arquivos .java**
> javac parser/\*.java

**Comando para rodar o compilador:**
> java parser/langX -debug_AS -print_tree exemplos/ex1.x
