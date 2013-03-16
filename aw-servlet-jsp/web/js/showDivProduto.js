    function showDiv (divId){  
        arrayDeDivs = document.getElementsByTagName('div');
        for (var i=0; i<arrayDeDivs.length; i++){
	    theDiv = arrayDeDivs[i];
            if(theDiv.id.search("divProduto") > -1){
                if (theDiv.id == divId){
                    theDiv.style.display = "inline"; 
                    theDiv.style.visibility = "visible"; 
                }else{
                    theDiv.style.display = "none"; 
                    theDiv.style.visibility = "hidden"; 
                }
            }
        }
        
    }
