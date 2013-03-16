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
                alert("bandeira inválida");
                return false;
            }else if (!validaNumeroCartao()){
                alert("número do cartão inválido");
                return false;
            }else if (!validaNumeroVerificacao()){
                alert("número de verificação inválido");
                return false;
            }else if (!validaNomeTitular()){
                alert("nome inválido");
                return false;
            }else if (!validaDataValidadeCartao()){
                alert("data de validade inválida");
                return false;
            }
        }
        return true;
      }
