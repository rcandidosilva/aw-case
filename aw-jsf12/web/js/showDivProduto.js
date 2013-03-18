    function showDiv (divId){  
        arrayDeDivs = document.getElementsByTagName('div');
        for (var i=0; i<arrayDeDivs.length; i++){
	    theDiv = arrayDeDivs[i];
            if(theDiv.id.search("divProduto") > -1){
                tipoProduto = theDiv.name.slice(10);
                alert(tipoProduto);
                theForm = document.getElementById("formProduto");
                if (theDiv.id == divId){
                    theDiv.style.display = "inline"; 
                    theDiv.style.visibility = "visible"; 
                    theForm.innerHTML = '<html:form method="post" action="SalvarProduto"+tipoProduto+".do">'; 
                }else{
                    theDiv.style.display = "none"; 
                    theDiv.style.visibility = "hidden"; 
                }
            }
        }
        
    }
