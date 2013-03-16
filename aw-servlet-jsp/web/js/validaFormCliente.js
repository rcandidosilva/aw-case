      function validaForm(thisform){
        for(var i=0; i<thisform.length; i++){
          var campo = thisform.elements[i];
          if(campo.type == "text"){
            if(campo.value == null || campo.value==""){
              notificaErro(campo.id);
              return false;
            }else{
              retornaCor(campo.id);
            }
          }
        }
        if (!validaTelefone()){
          return false;
        }else if (!validaEmail()){
          return false;
        }else if (!validaNumero()){
          return false;
        }else if (!validaCep()){
          return false;
        }else if (!validaEstado()){
          return false;
        }
        return true;
      }
