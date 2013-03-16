      function validaForm(thisform){
        var boleto = document.getElementById("pagamentoBoleto");
        var cartao = document.getElementById("pagamentoCartao");
        if (!validaEmail()){
          return false;
        }else if (!validaTelefone()){
          return false;
        }else if (!validaNumero()){
          return false;
        }else if (!validaCep()){
          return false;
        }else if (!validaEstado()){
          return false;
        }else if(boleto.checked){
            if (!validaBanco()){
                return false;
            }
        }else if(cartao.checked){
            alert("cartao "+cartao.checked);
            if (!validaBandeira()){
                alert("bandeira inv�lida");
                return false;
            }else if (!validaNumeroCartao()){
                alert("n�mero do cart�o inv�lido");
                return false;
            }else if (!validaNumeroVerificacao()){
                alert("n�mero de verifica��o inv�lido");
                return false;
            }else if (!validaNomeTitular()){
                alert("nome inv�lido");
                return false;
            }else if (!validaDataValidadeCartao()){
                alert("data de validade inv�lida");
                return false;
            }
        }
        return true;
      }
