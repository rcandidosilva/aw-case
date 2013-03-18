      //var backgroundColor;
        var color;
      
      function notificaErro(idElemento){
        var oElemento = document.getElementById(idElemento);
        alert("Campo "+idElemento+" inválido.");
        //backgroundColor = oElemento.style.backgroundColor;
        color = oElemento.style.color;
        //oElemento.style.backgroundColor = "#FFFFCC"; //"#F0E8FF"
        oElemento.style.color = "#FF0000";
        oElemento.focus();
      }
      function retornaCor(idElemento){
        var oElemento = document.getElementById(idElemento);
        //oElemento.style.backgroundColor = backgroundColor; // "#FFFFFF";
        oElemento.style.color = color; //"#858495";
      }