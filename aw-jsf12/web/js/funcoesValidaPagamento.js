      function validaBanco(){
        var numero = document.getElementById("banco");
        var valor = parseInt(numero.value);
        if(isNaN(valor)){
          notificaErro("banco");
          return false;
        }else{
          retornaCor("banco");
          return true;
        }
      }
      function validaBandeira(){
        var numero = document.getElementById("bandeira");
        var valor = parseInt(numero.value);
        if(isNaN(valor)){
          notificaErro("bandeira");
          return false;
        }else{
          retornaCor("bandeira");
          return true;
        }
      }
      function validaNomeTitular(){
        var nome = document.getElementById("nomeTitular");
        if (nome.value.length < 5) {
          notificaErro("nomeTitular");
          return false;
        }else{
          retornaCor("nomeTitular");
          return true;
        }
      }
      function validaNumeroCartao(){
        var numero = document.getElementById("numeroCartao");
        var valor = parseInt(numero.value);
        if(isNaN(valor)){
          notificaErro("numeroCartao");
          return false;
        }else{
          retornaCor("numeroCartao");
          return true;
        }
      }
      function validaNumeroVerificacao(){
        var numero = document.getElementById("numeroVerificacao");
        var valor = parseInt(numero.value);
        if(isNaN(valor)){
          notificaErro("numeroVerificacao");
          return false;
        }else{
          retornaCor("numeroVerificacao");
          return true;
        }
      }
      function validaDataValidadeCartao(){
        var cep = document.getElementById("dataValidadeCartao");
        if (cep.value.length != 5) {
          notificaErro("dataValidadeCartao");
          return false;
        }else{
          retornaCor("dataValidadeCartao");
          return true;
        }
      }
