      function validaForm(thisform){
        var tipoPagamento = document.getElementById("tipoPagamento");
        if(tipoPagamento.value == 'Boleto'){
            if (!validaBanco()){
                return false;
            }
        }else if(tipoPagamento.value == 'Cartão de Crédito'){
            if (!validaBandeira()){
                return false;
            }else if (!validaNumeroCartao()){
                return false;
            }else if (!validaNumeroVerificacao()){
                return false;
            }else if (!validaNomeTitular()){
                return false;
            }else if (!validaDataValidadeCartao()){
                return false;
            }
        }
        return true;
      }
