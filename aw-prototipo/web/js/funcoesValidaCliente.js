      function validaTelefone(){
        var telefone = document.getElementById("telefone");
        if (telefone.value.length < 9) {
          notificaErro("telefone");
          return false;
        }else{
          retornaCor("telefone");
          return true;
        }
      }
      function validaEmail(){
        var email = document.getElementById("email");
        posicaoArroba=email.value.indexOf("@");
        posicaoPonto=email.value.lastIndexOf(".");
        // Se a arroba estiver na primeira posicao e
        // o ponto nao esteja presente ou grudado no arroba, o e-mail é inválido
        if (posicaoArroba < 1 || posicaoPonto-posicaoArroba < 2) {
          notificaErro("email");
          return false;
        }else{
          retornaCor("email");
          return true;
        }
      }
      function validaNumero(){
        var numero = document.getElementById("enderecoNumero");
        var valor = parseInt(numero.value);
        if(isNaN(valor)){
          notificaErro("enderecoNumero");
          return false;
        }else{
          retornaCor("enderecoNumero");
          return true;
        }
      }
      function validaCep(){
        var cep = document.getElementById("enderecoCep");
        if (cep.value.length != 9) {
          notificaErro("enderecoCep");
          return false;
        }else{
          retornaCor("enderecoCep");
          return true;
        }
      }
      function validaEstado(){
        var estado = document.getElementById("enderecoEstado");
        var estadoDigitado = estado.value;
        if (estadoDigitado.length != 2){
          notificaErro("enderecoEstado");
          return false;
        }else{
          retornaCor("enderecoEstado");
          return true;
        }
      }
