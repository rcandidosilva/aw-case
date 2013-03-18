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
        // are regular expressions supported?
        var supported = 0;
        if (window.RegExp) {
            var tempStr = "a";
            var tempReg = new RegExp(tempStr);
            if (tempReg.test(tempStr)) 
                supported = 1;
        }
        if (!supported){ 
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
        }else{
            var r1 = new RegExp("(@.*@)|(\\.\\.)|(@\\.)|(^\\.)");
            var r2 = new RegExp("^.+\\@(\\[?)[a-zA-Z0-9\\-\\.]+\\.([a-zA-Z]{2,3}|[0-9]{1,3})(\\]?)$");
            var result = (!r1.test(email.value) && r2.test(email.value));
            //alert("e-mail válido: resultado="+result);
            return result;
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
